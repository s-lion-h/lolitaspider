package com.slionh.lolitaspider.entity;

import java.util.Date;

public class Brands {
    private Integer id;

    private String name;

    private Date createtime;

    private String image;

    private String other;

    private String createrid;

    private String creatername;

    private String createrip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getCreaterid() {
        return createrid;
    }

    public void setCreaterid(String createrid) {
        this.createrid = createrid == null ? null : createrid.trim();
    }

    public String getCreatername() {
        return creatername;
    }

    public void setCreatername(String creatername) {
        this.creatername = creatername == null ? null : creatername.trim();
    }

    public String getCreaterip() {
        return createrip;
    }

    public void setCreaterip(String createrip) {
        this.createrip = createrip == null ? null : createrip.trim();
    }
}