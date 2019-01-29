package com.meice.servicemeice.entity.VO;


import java.sql.Date;

public class ArticleVo {
    private String articleid;

    private String title;

    private Date time;

    private String createname;

    private String lableid;

    private String context;

    private Integer articletype;

    private String lablename;

    private Date cteatetime;


    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public String getLableid() {
        return lableid;
    }

    public void setLableid(String lableid) {
        this.lableid = lableid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getArticletype() {
        return articletype;
    }

    public void setArticletype(Integer articletype) {
        this.articletype = articletype;
    }

    public String getLablename() {
        return lablename;
    }

    public void setLablename(String lablename) {
        this.lablename = lablename;
    }

    public Date getCteatetime() {
        return cteatetime;
    }

    public void setCteatetime(Date cteatetime) {
        this.cteatetime = cteatetime;
    }
}
