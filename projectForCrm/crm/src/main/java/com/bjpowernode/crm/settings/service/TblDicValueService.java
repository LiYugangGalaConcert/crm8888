package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.TblDicValue;

public interface TblDicValueService {
    int deleteByPrimaryKey(String id);

    int insert(TblDicValue record);

    int insertSelective(TblDicValue record);

    TblDicValue selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblDicValue record);

    int updateByPrimaryKey(TblDicValue record);
}