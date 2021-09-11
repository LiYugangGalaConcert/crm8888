package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.domain.TblDicType;
import com.bjpowernode.crm.settings.mapper.TblDicTypeMapper;
import com.bjpowernode.crm.settings.service.TblDicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周伦杰
 * 2021/9/3
 */
@Service
public class TblDicTypeServiceImpl implements TblDicTypeService {

    @Autowired
    TblDicTypeMapper tblDicTypeMapper;

    @Override
    public int deleteByPrimaryKey(String code) {
        return tblDicTypeMapper.deleteByPrimaryKey(code);
    }

    @Override
    public int saveTblDicTypeMapper(TblDicType record) {
        return tblDicTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(TblDicType record) {
        return tblDicTypeMapper.insertSelective(record);
    }

    @Override
    public TblDicType selectByPrimaryKey(String code) {
        return tblDicTypeMapper.selectByPrimaryKey(code);
    }

    @Override
    public int updateByPrimaryKeySelective(TblDicType record) {
        return tblDicTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TblDicType record) {
        return tblDicTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TblDicType> select() {
        return tblDicTypeMapper.select();
    }
}
