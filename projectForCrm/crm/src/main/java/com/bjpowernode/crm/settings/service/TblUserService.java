package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.TblUser;

/**
 * 周伦杰
 * 2021/8/31
 */
public interface TblUserService {
    /**
     * 按id获取use对象
     * @return
     */
    public TblUser selectUserById(String id);
}
