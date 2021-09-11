package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.settings.domain.TblDicType;

import java.util.List;

public interface TblDicTypeMapper {
    int deleteByPrimaryKey(String code);

    int insert(TblDicType record);

    int insertSelective(TblDicType record);

    TblDicType selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(TblDicType record);

    int updateByPrimaryKey(TblDicType record);

    List<TblDicType> select();
}