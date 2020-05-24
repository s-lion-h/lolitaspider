package com.slionh.lolitaspider.spider;

import com.slionh.lolitaspider.service.BrandService;
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
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

import static com.slionh.lolitaspider.configuration.Config.RETRY_TIME;

@Service
public class BrandSpider {
    @Autowired
    private BrandService service;
    @Autowired
    private LolibraryIndexUtil indexUtil;

    @Scheduled(fixedRate = 600000)
    public void getIndexBrand() throws ParseException {
        Document document ;
        document=indexUtil.getIndexDocument();

        //第二步解析lolita网站内容，封装字典
        Elements scrollBoxs = document.select(".container .scrollbox");
        Element brandBox=scrollBoxs.get(0);
        Elements brandNames=brandBox.select(".scrollbox-text p");
        Elements brandImages=brandBox.select(".scrollbox-img img");

        HashMap hashMap=new HashMap();
        int index = 0;
        for (Element brandName : brandNames) {
            String name = brandName.text();
            String img = brandImages.get(index).attr("src");
            hashMap.put(name,img);
            System.out.println(name+img);

            index++;
        }

        service.analysisBrand(hashMap);
    }
}
