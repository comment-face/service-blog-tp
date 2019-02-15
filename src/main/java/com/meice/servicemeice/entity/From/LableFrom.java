package com.meice.servicemeice.entity.From;

import io.swagger.annotations.ApiModelProperty;

/**
 * Lable请求类
 */
public class LableFrom {
    @ApiModelProperty("标签分类ID")
    String lableId;

    @ApiModelProperty("标签名称")
    String lableName;

    @ApiModelProperty("文章名称")
    String articleName;

    @ApiModelProperty("文章ID")
    String articleId;
}
