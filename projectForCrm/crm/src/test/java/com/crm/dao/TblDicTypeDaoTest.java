package com.crm.dao;

import com.bjpowernode.crm.settings.domain.TblDicType;
import com.bjpowernode.crm.settings.mapper.TblDicTypeMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 周伦杰
 * 2021/9/3
 */
public class TblDicTypeDaoTest extends BaseTest {

    @Autowired
    TblDicTypeMapper tblDicTypeMapper;

    @Test
    public void select(){
        List<TblDicType> dicTypes = tblDicTypeMapper.select();
        System.out.println(dicTypes);
    }

    @Test
    public void insert(){
        TblDicType tblDicType = new TblDicType();
        tblDicType.setCode("1111");
        tblDicType.setName("zhangsan");
        tblDicType.setDescription("sjfajga");
        int temp = tblDicTypeMapper.insert(tblDicType);
        System.out.println(temp);
    }
}
