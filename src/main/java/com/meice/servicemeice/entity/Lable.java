package com.meice.servicemeice.entity;

import java.util.Date;

public class Lable {
    private Integer lableid;

    private String lablename;

    private String title;

    private Date cteatetime;

    public Integer getLableid() {
        return lableid;
    }

    public void setLableid(Integer lableid) {
        this.lableid = lableid;
    }

    public String getLablename() {
        return lablename;
    }

    public void setLablename(String lablename) {
        this.lablename = lablename == null ? null : lablename.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCteatetime() {
        return cteatetime;
    }

    public void setCteatetime(Date cteatetime) {
        this.cteatetime = cteatetime;
    }
}