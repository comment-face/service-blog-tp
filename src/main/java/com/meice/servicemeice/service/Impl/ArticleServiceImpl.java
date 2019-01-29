package com.meice.servicemeice.service.Impl;

import com.meice.servicemeice.dao.ArticleMapper;
import com.meice.servicemeice.entity.Article;
import com.meice.servicemeice.entity.ArticleExample;
import com.meice.servicemeice.entity.VO.ArticleVo;
import com.meice.servicemeice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public int countByExample(ArticleExample example) {
        return articleMapper.countByExample(example);
    }


    @Override
    public int deleteByExample(ArticleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String articleid) {
        return 0;
    }

    @Override
    public int insert(Article record) {
        return 0;
    }

    @Override
    public int insertSelective(Article record) {
        return 0;
    }

    @Override
    public List<Article> selectByExample(ArticleExample example) {
        return articleMapper.selectByExample(example);
    }

    @Override
    public ArticleVo selectByPrimaryKey(String articleid) {
        return articleMapper.selectByPrimaryKey(articleid);
    }

    @Override
    public int updateByExampleSelective(Article record, ArticleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Article record, ArticleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        return 0;
    }

    @Override
    public List<ArticleVo> selectArticleInnerLable(ArticleExample exampl) {

        return articleMapper.selectArticleInnerLable(exampl);
    }
}
