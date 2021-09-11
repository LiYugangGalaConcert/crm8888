package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.workbench.domain.TblActivityRemark;

public interface TblActivityRemarkService {
    int deleteByPrimaryKey(String id);

    int insert(TblActivityRemark record);

    int insertSelective(TblActivityRemark record);

    TblActivityRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblActivityRemark record);

    int updateByPrimaryKey(TblActivityRemark record);
}