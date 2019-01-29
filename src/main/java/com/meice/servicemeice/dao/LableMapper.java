package com.meice.servicemeice.dao;

import com.meice.servicemeice.entity.Lable;
import com.meice.servicemeice.entity.LableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LableMapper {
    int countByExample(LableExample example);

    int deleteByExample(LableExample example);

    int insert(Lable record);

    int insertSelective(Lable record);

    List<Lable> selectByExample(LableExample example);

    int updateByExampleSelective(@Param("record") Lable record, @Param("example") LableExample example);

    int updateByExample(@Param("record") Lable record, @Param("example") LableExample example);
}