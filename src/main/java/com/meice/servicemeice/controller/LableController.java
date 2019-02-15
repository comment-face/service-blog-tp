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
    @ApiOperation(value="根据ID查询Lable",notes = "根据ID查询Lable")
    public Result<List<Lable>> queryLable(Integer lableId){
        LableExample lableExample =new LableExample();
        lableExample.createCriteria().andLableidEqualTo(lableId);
        return JsonResultBuilder.simpleSucc(lableService.selectByExample(lableExample));
    }

    @PostMapping("/deleteLable")
    @ApiOperation(value="根据ID删除Lable",notes = "根据ID删除Lable，入参主键ID")
    public Result<List<Lable>> deleteLable(Integer lableId){
        LableExample lableExample =new LableExample();
        lableExample.createCriteria().andLableidEqualTo(lableId);
        return JsonResultBuilder.simpleSucc(lableService.deleteByExample(lableExample));
    }

    @PostMapping("/updateLable")
    @ApiOperation(value="修改Lable",notes = "修改Lable，入参Lable类")
    public Result<List<Lable>> updateLable(Integer lableId){
        LableExample lableExample =new LableExample();
        lableExample.createCriteria().andLableidEqualTo(lableId);
        return JsonResultBuilder.simpleSucc(lableService.selectByExample(lableExample));
    }

    @PostMapping("/addLable")
    @ApiOperation(value="根据ID查询Lable",notes = "根据ID查询Lable")
    public Result<List<Lable>> addLable(Integer lableId){
        LableExample lableExample =new LableExample();
        lableExample.createCriteria().andLableidEqualTo(lableId);
        return JsonResultBuilder.simpleSucc(lableService.selectByExample(lableExample));
    }



}
