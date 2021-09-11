package com.bjpowernode.crm.workbench.service.impl;

import com.bjpowernode.crm.workbench.domain.TblActivityRemark;
import com.bjpowernode.crm.workbench.service.TblActivityRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 周伦杰
 * 2021/9/1
 */
@Service
public class TblActivityRemarkServiceImpl implements TblActivityRemarkService {

    @Autowired
    TblActivityRemarkService tblActivityRemarkService;

    @Override
    public int deleteByPrimaryKey(String id) {
        return tblActivityRemarkService.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TblActivityRemark record) {
        return tblActivityRemarkService.insert(record);
    }

    @Override
    public int insertSelective(TblActivityRemark record) {
        return tblActivityRemarkService.insertSelective(record);
    }

    @Override
    public TblActivityRemark selectByPrimaryKey(String id) {
        return tblActivityRemarkService.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TblActivityRemark record) {
        return tblActivityRemarkService.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TblActivityRemark record) {
        return tblActivityRemarkService.updateByPrimaryKey(record);
    }
}
