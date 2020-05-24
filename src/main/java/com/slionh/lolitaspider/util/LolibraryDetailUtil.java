package com.slionh.lolitaspider.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.slionh.lolitaspider.configuration.Config.RETRY_TIME;

@Service
public class LolibraryDetailUtil {
    public Document getDetailDocument(String baseUrl){
        Document document = null;
        int times = 0;

        //第一步进行document整个html爬取
        do {
            try {
                document = Jsoup.connect(baseUrl).timeout(10000).get();
                System.out.println("getting url : "+baseUrl);
                break;
            } catch (IOException e) {
                e.printStackTrace();
                times++;
                System.out.println("请求:lolibrary detail失败"+baseUrl);
                if (times < RETRY_TIME) {
                    System.out.println("请求超时，进行第" + times + "次重连!!");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e2) {
                        continue;
                    }
                }
            }
        } while (times < RETRY_TIME);

        return document;
    }
}
