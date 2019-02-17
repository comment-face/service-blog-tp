package com.meice.servicemeice.entity.From;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleFrom extends  CommenFrom implements Serializable {
    private static final long serialVersionUID = -736329614090499126L;
    @ApiModelProperty(value = "文章ID")
    private String articleid;

    @ApiModelProperty(value = "文章内容")
    private String title;


    private String createname;

    @ApiModelProperty(value = "文章分类名称")
    private String lablename;

    @ApiModelProperty(value = "文章分类ID")
    private String lableID;



}
