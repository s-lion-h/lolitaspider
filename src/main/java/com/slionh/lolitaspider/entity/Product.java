package com.slionh.lolitaspider.entity;

import java.util.Date;

public class Product {
    private Integer productid;

    private String productname;

    private Date createtime;

    private Integer shopperid;

    private Date updatetime;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getShopperid() {
        return shopperid;
    }

    public void setShopperid(Integer shopperid) {
        this.shopperid = shopperid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}