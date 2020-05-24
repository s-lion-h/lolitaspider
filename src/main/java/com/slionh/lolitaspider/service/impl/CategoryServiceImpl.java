package com.slionh.lolitaspider.service.impl;

import com.slionh.lolitaspider.entity.Categories;
import com.slionh.lolitaspider.entity.CategoriesExample;
import com.slionh.lolitaspider.mapper.CategoriesMapper;
import com.slionh.lolitaspider.service.CategoryService;
import com.slionh.lolitaspider.util.ImageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

import static com.slionh.lolitaspider.configuration.Config.*;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoriesMapper mapper;

    @Override
    public void analysisCategory(HashMap hashMap) {
        String categoryHeadUrl = "https://lolibrary.nyc3.cdn.digitaloceanspaces.com/categories";

        //首先以brandname为主键，检查名字是否存在，存在则不做任何事情，不存在则把brand存入数据库，并且吧img存入对应的路径
        Iterator iterator=hashMap.entrySet().iterator();
        List<String> addImageList=new ArrayList<>();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            if (isCategoryNameContain(entry.getKey().toString())){
                //包含，所以什么都不做
            }else{
                Categories categories=new Categories();
                categories.setCreaterid(BASE_SHOPPER_ID);
                categories.setCreatername("autoSpider");
                categories.setName(entry.getKey().toString());
                categories.setOther(entry.getKey().toString());
                categories.setImage(entry.getValue().toString().replace(categoryHeadUrl,CATEGORY_IMAGE_DIR_NAME));
                mapper.insert(categories);
                addImageList.add((entry.getValue().toString()));
            }
        }
        //插入数据库后保存图片到本地
        ImageUtil.Download(addImageList, CATEGORY_IMAGE_PATH);
    }

    @Override
    public boolean isCategoryNameContain(String name) {
        CategoriesExample example=new CategoriesExample();
        example.createCriteria().andNameEqualTo(name);

        return mapper.selectByExample(example).size()>0?true:false;
    }

    @Override
    public Integer getCategoryIdByName(String name) {
        CategoriesExample example=new CategoriesExample();
        example.createCriteria().andNameEqualTo(name);

        List<Categories> list = mapper.selectByExample(example);
        if (list.size()<=0)
            return 0;
        return list.get(0).getId();
    }
}
