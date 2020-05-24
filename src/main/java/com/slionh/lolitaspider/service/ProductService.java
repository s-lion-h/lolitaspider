package com.slionh.lolitaspider.service;

import com.slionh.lolitaspider.entity.Productdetail;

import java.util.HashMap;

public interface ProductService {
    void analysisIndexItemList(HashMap hashMap,HashMap nameLinkMap);
    boolean isItemNameExist(String name);
    int insertProductDetail(Productdetail productdetail);
}
