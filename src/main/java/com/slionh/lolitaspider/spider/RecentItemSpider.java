package com.slionh.lolitaspider.spider;

import com.slionh.lolitaspider.entity.Product;
import com.slionh.lolitaspider.service.ProductService;
import com.slionh.lolitaspider.util.LolibraryIndexUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class RecentItemSpider {
    @Autowired
    private LolibraryIndexUtil indexUtil;
    @Autowired
    private ProductService productService;

    @Scheduled(fixedRate = 600000)
    public void getIndexRecentItem(){
        Document document ;
        document=indexUtil.getIndexDocument();

        //第二步解析lolita网站内容，封装字典
        Elements scrollBoxs = document.select(".container .scrollbox");
        Element recentItemBox=scrollBoxs.get(2);
        Elements titleNames=recentItemBox.select(".card-body p").select(".mb-0");
        Elements imageUrls=recentItemBox.select(".card-body img");
        Elements itemDetailUrls=recentItemBox.select(".text-center a");

        HashMap hashMap=new HashMap();
        HashMap nameLinkMap=new HashMap();
        int index = 0;
        for (Element titleName : titleNames) {
            String name = titleName.text();
            String img = imageUrls.get(index).attr("src");
            String link = itemDetailUrls.get(index).attr("href");
            hashMap.put(name,img);
            nameLinkMap.put(name,link);
            System.out.println(name+img);

            index++;
        }
        productService.analysisIndexItemList(hashMap,nameLinkMap);
    }
}
