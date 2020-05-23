package com.slionh.lolitaspider.spider;

import com.slionh.lolitaspider.service.BrandService;
import com.slionh.lolitaspider.service.CategoryService;
import com.slionh.lolitaspider.util.LolibraryIndexUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

import static com.slionh.lolitaspider.configuration.Config.RETRY_TIME;

@Service
public class CategorySpider {
    @Autowired
    private CategoryService service;
    @Autowired
    private LolibraryIndexUtil indexUtil;

//    @Scheduled(fixedRate = 600000)
    public void getIndexCategory() throws ParseException {
        Document document ;
        document=indexUtil.getIndexDocument();

        //第二步解析lolita网站内容，封装字典
        Elements scrollBoxs = document.select(".container .scrollbox");
        Element categoryBox=scrollBoxs.get(1);
        Elements categoryNames=categoryBox.select(".scrollbox-text p");
        Elements categoryImages=categoryBox.select(".scrollbox-img img");

        HashMap hashMap=new HashMap();
        int index = 0;
        for (Element categoryName : categoryNames) {
            String name = categoryName.text();
            String img = categoryImages.get(index).attr("src");
            hashMap.put(name,img);
            System.out.println(name+img);

            index++;
        }

        service.analysisCategory(hashMap);
    }
}
