package com.crm.dao;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.mapper.TblUserMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 周伦杰
 * 2021/8/31
 */
public class TblUserDaoTest extends BaseTest {

    @Autowired
    private TblUserMapper tblUserMapper;

    @Test
    public void testSelectUserById(){
        TblUser tblUser = tblUserMapper.selectByPrimaryKey("06f5fc056eac41558a964f96daa7f27c");
        System.out.println(tblUser.getName());
    }
}
