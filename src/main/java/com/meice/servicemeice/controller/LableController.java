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
import org.springframework.web.bind.annotation.RequestBody;
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
        if(null != lableId){
            lableExample.createCriteria().andLableidEqualTo(lableId);
        }else {
            lableExample.createCriteria();
        }
        return JsonResultBuilder.simpleSucc(lableService.selectByExample(lableExample));
    }

    @PostMapping("/deleteLable")
    @ApiOperation(value="根据ID删除Lable",notes = "根据ID删除Lable，入参主键ID")
    public Result<Boolean> deleteLable(@RequestBody  Integer lableId){
        LableExample lableExample =new LableExample();
        lableExample.createCriteria().andLableidEqualTo(lableId);
        return lableService.deleteByExample(lableExample)>0?
                JsonResultBuilder.simpleFail("200","删除成功！"):
                JsonResultBuilder.simpleFail("500","删除失败！");
    }

    @PostMapping("/updateLable")
    @ApiOperation(value="修改Lable",notes = "修改Lable，入参Lable类")
    public Result<Boolean> updateLable(@RequestBody Integer lableId){
        LableExample lableExample =new LableExample();
//        lableService.updateByExample()
        return null;
    }

    @PostMapping("/addLable")
    @ApiOperation(value="新增Lable",notes = "新增Lable")
    public Result<List<Lable>> addLable(@RequestBody Lable lable){
        return lableService.insert(lable)>0?
                JsonResultBuilder.simpleFail("200","删除成功！"):
                JsonResultBuilder.simpleFail("500","删除失败！");
    }



}
