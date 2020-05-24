package com.slionh.lolitaspider.spider;

import com.slionh.lolitaspider.entity.Productdetail;
import com.slionh.lolitaspider.service.BrandService;
import com.slionh.lolitaspider.service.CategoryService;
import com.slionh.lolitaspider.service.ProductService;
import com.slionh.lolitaspider.util.LolibraryDetailUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.slionh.lolitaspider.configuration.Config.BASE_SHOPPER_ID;

@Service
public class ItemDetailSpider {
    @Autowired
    private LolibraryDetailUtil lolibraryDetailUtil;
    @Autowired
    private BrandService brandService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;


    public void getProductDetailByUrl(String url,Integer productId){
        Document document;

        document=lolibraryDetailUtil.getDetailDocument(url);

        //第二步解析lolita网站内容，封装字典
        Element titleName = document.selectFirst(".container .mb-3 h1");
        Element titleOtherName = document.selectFirst(".container .mb-3 h4");
        Element brandName = document.selectFirst(".container .row .row a");
        Element price=document.select(".container .row .text-muted span").get(1);
        Elements notes=document.select(".container .row .p-2 div");
        Element categoryName = document.select(".container .row .row a").get(1);


//        Element categoryBox=scrollBoxs.get(1);
//        Elements categoryNames=categoryBox.select(".scrollbox-text p");
//        Elements categoryImages=categoryBox.select(".scrollbox-img img");

        Productdetail productdetail=new Productdetail();
        productdetail.setProductid(productId);
        productdetail.setProductname(titleName.text());
        productdetail.setProductothername(titleOtherName.text());
        productdetail.setOperid(BASE_SHOPPER_ID);
        productdetail.setOperdate(new Date());
        productdetail.setIssueprice(price.text());
        productdetail.setProductnotes(notes.text());
        productdetail.setBrand(""+brandService.getBrandIdByName(brandName.text()));
        productdetail.setBrand(""+categoryService.getCategoryIdByName(categoryName.text()));

        productdetail.setReleasedate(new Date());

        int res = productService.insertProductDetail(productdetail);

        return;
    }
}
