package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.settings.domain.TblUser;

public interface TblUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(TblUser record);

    int insertSelective(TblUser record);

    TblUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblUser record);

    int updateByPrimaryKey(TblUser record);
}