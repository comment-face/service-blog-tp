package com.meice.servicemeice.entity.From;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleFrom extends  CommenFrom implements Serializable {
    private static final long serialVersionUID = -736329614090499126L;
    private String articleid;

    private String title;

    private String createname;

    private String lablename;


}
