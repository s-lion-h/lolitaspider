package com.slionh.lolitaspider.service.impl;

import com.slionh.lolitaspider.entity.Brands;
import com.slionh.lolitaspider.entity.BrandsExample;
import com.slionh.lolitaspider.mapper.BrandsMapper;
import com.slionh.lolitaspider.service.BrandService;
import com.slionh.lolitaspider.util.ImageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

import static com.slionh.lolitaspider.configuration.Config.BRAND_IMAGE_PATH;

@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandsMapper mapper;

    @Override
    public void analysisBrand(HashMap hashMap) {
        String brandHeadUrl = "https://lolibrary.nyc3.cdn.digitaloceanspaces.com/brands";

        //首先以brandname为主键，检查名字是否存在，存在则不做任何事情，不存在则把brand存入数据库，并且吧img存入对应的路径
        Iterator iterator=hashMap.entrySet().iterator();
        List<String> addImageList=new ArrayList<>();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            if (isBrandNameContain(entry.getKey().toString())){
                //包含，所以什么都不做
            }else{
                Brands brands=new Brands();
                brands.setCreaterid("autoSpider");
                brands.setCreatername("autoSpider");
                brands.setName(entry.getKey().toString());
                brands.setOther(entry.getKey().toString());
                brands.setImage(entry.getValue().toString().replace(brandHeadUrl,"brand"));
                mapper.insert(brands);
                addImageList.add((entry.getValue().toString()));
            }
        }
        //插入数据库后保存图片到本地
        ImageUtil.Download(addImageList, BRAND_IMAGE_PATH);

    }

    @Override
    public boolean isBrandNameContain(String name) {
        BrandsExample example=new BrandsExample();
        example.createCriteria().andNameEqualTo(name);
        return mapper.selectByExample(example).size()>0?true:false;
    }
}
