package com.crm.service;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.service.TblUserService;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 周伦杰
 * 2021/8/31
 */
public class TblUserServiceTest extends BaseTest {

    @Autowired
    private TblUserService userService;

    @Test
    public void testSelectUserById() {
        TblUser tblUser=userService.selectUserById("06f5fc056eac41558a964f96daa7f27c");
        System.out.println(tblUser.getName());
    }
}
