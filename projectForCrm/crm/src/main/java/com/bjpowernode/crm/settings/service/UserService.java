package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 周伦杰
 * 2021/9/1
 */
public interface UserService {
    /**
     * 根据用户名和密码查询用户
     * @param map
     * @return
     */
    User selectUserByLoginActAndPwd(Map<String, Object> map);
    /**
     * 查询所有的用户
     */
    List<User> selectAllUsers();
}
