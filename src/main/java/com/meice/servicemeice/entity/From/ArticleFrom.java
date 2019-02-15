package com.meice.servicemeice.entity.From;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class ArticleFrom extends  CommenFrom implements Serializable {
    private static final long serialVersionUID = -736329614090499126L;
    @NotNull
    @ApiModelProperty(value = "文章ID")
    private String articleid;

    @NotNull
    @ApiModelProperty(value = "文章内容")
    private String title;


    private String createname;

    @NotNull
    @ApiModelProperty(value = "文章分类名称")
    private String lablename;


}
