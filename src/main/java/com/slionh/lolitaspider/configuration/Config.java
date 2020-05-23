package com.slionh.lolitaspider.configuration;

public interface Config {
    int RETRY_TIME = 2;

    //    默认图片上传、存储、访问路径
//    String IMAGE_PATH="C:\\Users\\s lion h\\Desktop\\lolitaforum\\src\\main\\resources\\image\\head\\";
//    String IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\image\\";
//    String IMAGE_PATH="C:\\lolitaImage\\lolitaImage\\image\\";
    String  IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\";
//    String IMAGE_PATH="/root/community/";

    //    头像图片上传储存、访问路径
//    String HEAD_IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\head\\";
    String HEAD_IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\head\\";
    String PRODUCT_IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\image\\";
    String CATEGORY_IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\category\\";
    String BRAND_IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\brand\\";
    String CAROUSEL_IMAGE_PATH="C:\\Users\\Administrator\\Desktop\\lolitaImage\\carousel\\";

    String PRODUCT_IMAGE_DIR_NAME="image";
    String CATEGORY_IMAGE_DIR_NAME="category";
    String HEAD_IMAGE_DIR_NAME="head";
    String BRAND_IMAGE_DIR_NAME="brand";
    String CAROUSEL_IMAGE_DIR_NAME="carousel";
}
