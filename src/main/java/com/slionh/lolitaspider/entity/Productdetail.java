package com.slionh.lolitaspider.entity;

import java.util.Date;

public class Productdetail {
    private Integer id;

    private Integer productid;

    private Date createtime;

    private Integer operid;

    private Date operdate;

    private String productname;

    private String productothername;

    private Date releasedate;

    private String brand;

    private String productnumber;

    private String issueprice;

    private String productlength;

    private String productshoulderwidth;

    private String sleevelength;

    private String productnotes;

    private String productcategory;

    private String productlabel;

    private String productcolor;

    private String productmaterial;

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

    public Integer getOperid() {
        return operid;
    }

    public void setOperid(Integer operid) {
        this.operid = operid;
    }

    public Date getOperdate() {
        return operdate;
    }

    public void setOperdate(Date operdate) {
        this.operdate = operdate;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductothername() {
        return productothername;
    }

    public void setProductothername(String productothername) {
        this.productothername = productothername == null ? null : productothername.trim();
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(String productnumber) {
        this.productnumber = productnumber == null ? null : productnumber.trim();
    }

    public String getIssueprice() {
        return issueprice;
    }

    public void setIssueprice(String issueprice) {
        this.issueprice = issueprice == null ? null : issueprice.trim();
    }

    public String getProductlength() {
        return productlength;
    }

    public void setProductlength(String productlength) {
        this.productlength = productlength == null ? null : productlength.trim();
    }

    public String getProductshoulderwidth() {
        return productshoulderwidth;
    }

    public void setProductshoulderwidth(String productshoulderwidth) {
        this.productshoulderwidth = productshoulderwidth == null ? null : productshoulderwidth.trim();
    }

    public String getSleevelength() {
        return sleevelength;
    }

    public void setSleevelength(String sleevelength) {
        this.sleevelength = sleevelength == null ? null : sleevelength.trim();
    }

    public String getProductnotes() {
        return productnotes;
    }

    public void setProductnotes(String productnotes) {
        this.productnotes = productnotes == null ? null : productnotes.trim();
    }

    public String getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory == null ? null : productcategory.trim();
    }

    public String getProductlabel() {
        return productlabel;
    }

    public void setProductlabel(String productlabel) {
        this.productlabel = productlabel == null ? null : productlabel.trim();
    }

    public String getProductcolor() {
        return productcolor;
    }

    public void setProductcolor(String productcolor) {
        this.productcolor = productcolor == null ? null : productcolor.trim();
    }

    public String getProductmaterial() {
        return productmaterial;
    }

    public void setProductmaterial(String productmaterial) {
        this.productmaterial = productmaterial == null ? null : productmaterial.trim();
    }
}