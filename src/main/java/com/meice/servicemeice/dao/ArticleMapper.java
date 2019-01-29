package com.meice.servicemeice.dao;

import com.meice.servicemeice.entity.Article;
import com.meice.servicemeice.entity.ArticleExample;
import com.meice.servicemeice.entity.VO.ArticleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    int countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(String articleid);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    ArticleVo selectByPrimaryKey(String articleid);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<ArticleVo> selectArticleInnerLable(ArticleExample exampl);
}