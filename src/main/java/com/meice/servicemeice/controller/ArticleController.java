package com.meice.servicemeice.controller;

import com.ikuijia.webmvc.support.builder.JsonResultBuilder;
import com.ikuijia.webmvc.support.result.PageJsonResult;
import com.ikuijia.webmvc.support.result.Result;
import com.meice.servicemeice.entity.Article;
import com.meice.servicemeice.entity.ArticleExample;
import com.meice.servicemeice.entity.From.ArticleFrom;
import com.meice.servicemeice.entity.VO.ArticleVo;
import com.meice.servicemeice.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ArticleController")
@Api(description = "文章接口")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/queryArticle")
    @ApiOperation(value="分页查询文章",notes = "分页查询文章")
    public PageJsonResult<List<ArticleVo>> queryPage(@RequestBody @Valid ArticleFrom articleFrom){
        ArticleExample articleExample =new ArticleExample();
        articleExample.createCriteria();
        articleExample.setLimit(articleFrom.getPageSize());
        articleExample.setOffset(articleFrom.start());
        List<ArticleVo> articleVos = articleService.selectArticleInnerLable(articleExample);
        //pageSize每条页数   page当前页   totalSize 总页数
        return JsonResultBuilder.pageSucc(articleVos,articleFrom.start(),articleFrom.getPageSize(),articleService.countByExample(articleExample));
    }

    @PostMapping("/queryArticleById")
    @ApiOperation(value="根据ID查询文章",notes = "根据ID查询文章")
    public Result<ArticleVo> queryArticleById(@RequestBody @Valid String articleId){
        return  JsonResultBuilder.pageSucc(articleService.selectByPrimaryKey(articleId));
    }


    @PostMapping("/updateArticle")
    @ApiOperation(value="修改文章",notes = "修改文章")
    public Boolean updateArticle(@RequestBody @Valid Article article){
        return  articleService.updateByPrimaryKey(article)>0;
    }


    @PostMapping("/addArticle")
    @ApiOperation(value="新增文章",notes = "新增文章")
    public List<Article> addArticle(@RequestBody @Valid ArticleFrom articleFrom){
        ArticleExample articleExample =new ArticleExample();
        articleExample.createCriteria();
        List<Article> articleList = articleService.selectByExample(articleExample);
        return  articleList;
    }

    @PostMapping("/deleteArticle")
    @ApiOperation(value="删除文章",notes = "删除文章")
    public Boolean deleteArticle(@RequestBody @Valid String articleId){
        ArticleExample articleExample =new ArticleExample();
        articleExample.createCriteria().andArticleidEqualTo(articleId);
        return  articleService.deleteByExample(articleExample)>0;
    }

}
