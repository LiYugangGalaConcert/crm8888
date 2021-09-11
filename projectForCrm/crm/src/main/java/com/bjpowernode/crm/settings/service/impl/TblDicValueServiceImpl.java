package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.domain.TblDicValue;
import com.bjpowernode.crm.settings.mapper.TblDicValueMapper;
import com.bjpowernode.crm.settings.service.TblDicValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 周伦杰
 * 2021/9/3
 */
@Service
public class TblDicValueServiceImpl implements TblDicValueService {

    @Autowired
    TblDicValueMapper tblDicValueMapper;

    @Override
    public int deleteByPrimaryKey(String code) {
        return tblDicValueMapper.deleteByPrimaryKey(code);
    }

    @Override
    public int insert(TblDicValue record) {
        return tblDicValueMapper.insert(record);
    }

    @Override
    public int insertSelective(TblDicValue record) {
        return tblDicValueMapper.insertSelective(record);
    }

    @Override
    public TblDicValue selectByPrimaryKey(String code) {
        return tblDicValueMapper.selectByPrimaryKey(code);
    }

    @Override
    public int updateByPrimaryKeySelective(TblDicValue record) {
        return tblDicValueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TblDicValue record) {
        return updateByPrimaryKey(record);
    }
}
