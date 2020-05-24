package com.slionh.lolitaspider.service.impl;

import com.slionh.lolitaspider.entity.*;
import com.slionh.lolitaspider.mapper.ProductMapper;
import com.slionh.lolitaspider.mapper.ProductdetailMapper;
import com.slionh.lolitaspider.mapper.ProductimageMapper;
import com.slionh.lolitaspider.service.ProductService;
import com.slionh.lolitaspider.spider.ItemDetailSpider;
import com.slionh.lolitaspider.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

import static com.slionh.lolitaspider.configuration.Config.*;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Resource
    private ProductimageMapper productimageMapper;
    @Resource
    private ProductdetailMapper productdetailMapper;
    @Autowired
    private ItemDetailSpider itemDetailSpider;


    @Override
    public void analysisIndexItemList(HashMap hashMap,HashMap nameLinkMap) {
        String itemRecentBaseUrl="https://lolibrary.nyc3.cdn.digitaloceanspaces.com/images";

        //首先以brandname为主键，检查名字是否存在，存在则不做任何事情，不存在则把brand存入数据库，并且吧img存入对应的路径
        Iterator iterator=hashMap.entrySet().iterator();
        List<String> addItemImageList=new ArrayList<>();
        HashMap idUrlMap=new HashMap();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            if (isItemNameExist(entry.getKey().toString())){
                //包含，所以什么都不做
            }else{
                //这里需要新建两个，一个是product，一个是productimage
                //product
                Product product=new Product();
                product.setProductname(entry.getKey().toString());
                product.setUpdatetime(new Date());
                product.setShopperid(BASE_SHOPPER_ID);
                productMapper.insert(product);

                //productimage
                Productimage productimage=new Productimage();
                productimage.setProductid(product.getProductid());
                productimage.setShopperid(BASE_SHOPPER_ID);
                productimage.setUpdatetime(new Date());
                productimage.setUrl(entry.getValue().toString().replace(itemRecentBaseUrl,PRODUCT_IMAGE_DIR_NAME));
                productimageMapper.insert(productimage);

                //图片urllist
                addItemImageList.add((entry.getValue().toString()));

                idUrlMap.put(nameLinkMap.get(entry.getKey().toString()),product.getProductid());
            }
        }
        //插入数据库后保存图片到本地
        ImageUtil.Download(addItemImageList, PRODUCT_IMAGE_PATH);

//        完成基础的两部保存后，进行detail页面的爬取与插入productdetail
        Iterator iteratorDetail=idUrlMap.entrySet().iterator();

        while (iteratorDetail.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            itemDetailSpider.getProductDetailByUrl(entry.getKey().toString(),Integer.parseInt(entry.getValue().toString()));

        }
//        itemDetailSpider.getProductDetailByUrl("https://lolibrary.org/items/indie-belladonna-celestial-cutie-jsk",51);

    }

    @Override
    public boolean isItemNameExist(String name) {
        ProductExample example=new ProductExample();
        example.createCriteria().andProductnameEqualTo(name);
        return productMapper.selectByExample(example).size()>0?true:false;
    }

    @Override
    public int insertProductDetail(Productdetail productdetail) {
        return productdetailMapper.insert(productdetail);
    }
}
