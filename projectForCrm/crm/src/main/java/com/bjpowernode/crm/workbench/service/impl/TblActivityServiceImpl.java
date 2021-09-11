package com.bjpowernode.crm.workbench.service.impl;

import com.bjpowernode.crm.workbench.domain.TblActivity;
import com.bjpowernode.crm.workbench.mapper.TblActivityMapper;
import com.bjpowernode.crm.workbench.service.TblActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 周伦杰
 * 2021/9/1
 */
@Service
public class TblActivityServiceImpl implements TblActivityService {

    @Autowired
    TblActivityMapper tblActivityMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return tblActivityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TblActivity record) {
        return tblActivityMapper.insert(record);
    }

    @Override
    public int insertSelective(TblActivity record) {
        return tblActivityMapper.insertSelective(record);
    }

    @Override
    public TblActivity selectByPrimaryKey(String id) {
        return tblActivityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TblActivity record) {
        return tblActivityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TblActivity record) {
        return tblActivityMapper.updateByPrimaryKey(record);
    }
}
