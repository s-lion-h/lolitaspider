package com.slionh.lolitaspider.entity;

import java.util.Date;

public class Productimage {
    private Integer id;

    private Integer productid;

    private Date createtime;

    private Integer shopperid;

    private Date updatetime;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}