package com.crm.service;

import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * 周伦杰
 * 2021/9/1
 */
public class UserSeviceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectUserByNameAndPassword(){
        HashMap map=new HashMap();
        map.put("loginAct","ls");
        map.put("loginPwd","44ba5ca65651b4f36f1927576dd35436");
        User user = userService.selectUserByLoginActAndPwd(map);
        System.out.println(user.getName());
    }

    @Test
    public void testAllUser(){
        List<User> users = userService.selectAllUsers();
        System.out.println(users.size());
    }
}
