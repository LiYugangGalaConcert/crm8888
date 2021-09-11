package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.TblDicType;

import java.util.List;

public interface TblDicTypeService {
    int deleteByPrimaryKey(String code);

    int saveTblDicTypeMapper(TblDicType record);

    int insertSelective(TblDicType record);

    TblDicType selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(TblDicType record);

    int updateByPrimaryKey(TblDicType record);

    List<TblDicType> select();
}