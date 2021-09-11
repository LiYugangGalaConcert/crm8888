package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.mapper.TblUserMapper;
import com.bjpowernode.crm.settings.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 周伦杰
 * 2021/8/31
 */
@Service
public class TBLUserServiceImpl implements TblUserService {

    @Autowired
    TblUserMapper tblUserMapper;

    @Override
    public TblUser selectUserById(String id) {
        return tblUserMapper.selectByPrimaryKey(id);
    }
}
