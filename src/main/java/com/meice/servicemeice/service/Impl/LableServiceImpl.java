package com.meice.servicemeice.service.Impl;

import com.meice.servicemeice.dao.LableMapper;
import com.meice.servicemeice.entity.Lable;
import com.meice.servicemeice.entity.LableExample;
import com.meice.servicemeice.service.LableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LableServiceImpl implements LableService {

    @Autowired
    LableMapper lableMapper;

    @Override
    public int countByExample(LableExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(LableExample example) {
        return 0;
    }

    @Override
    public int insert(Lable record) {
        return 0;
    }

    @Override
    public int insertSelective(Lable record) {
        return 0;
    }

    @Override
    public List<Lable> selectByExample(LableExample example) {
        return lableMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(Lable record, LableExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Lable record, LableExample example) {
        return 0;
    }
}
