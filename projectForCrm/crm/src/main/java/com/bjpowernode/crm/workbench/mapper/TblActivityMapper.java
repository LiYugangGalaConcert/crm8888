package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.TblActivity;

public interface TblActivityMapper {
    int deleteByPrimaryKey(String id);

    int insert(TblActivity record);

    int insertSelective(TblActivity record);

    TblActivity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblActivity record);

    int updateByPrimaryKey(TblActivity record);
}