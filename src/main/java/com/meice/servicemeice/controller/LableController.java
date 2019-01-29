package com.meice.servicemeice.controller;

import com.ikuijia.webmvc.support.builder.JsonResultBuilder;
import com.ikuijia.webmvc.support.result.Result;
import com.meice.servicemeice.entity.Lable;
import com.meice.servicemeice.entity.LableExample;
import com.meice.servicemeice.service.LableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/LebleController")
@Api(description = "标签接口")
public class LableController {

    @Autowired
    LableService lableService;

    @PostMapping("/queryLable")
    @ApiOperation(value="根据ID查询文章",notes = "根据ID查询文章")
    public Result<List<Lable>> queryArticleById(){
        LableExample lableExample =new LableExample();
        lableExample.createCriteria();
        return JsonResultBuilder.simpleSucc(lableService.selectByExample(lableExample));
    }


}
