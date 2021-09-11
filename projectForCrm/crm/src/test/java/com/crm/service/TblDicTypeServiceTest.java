package com.crm.service;

import com.bjpowernode.crm.settings.domain.TblDicType;
import com.bjpowernode.crm.settings.mapper.TblDicTypeMapper;
import com.bjpowernode.crm.settings.service.TblDicTypeService;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 周伦杰
 * 2021/9/3
 */
public class TblDicTypeServiceTest extends BaseTest {

    @Autowired
    TblDicTypeService tblDicTypeService;

    @Test
    public void select(){
        List<TblDicType> dicTypes = tblDicTypeService.select();
        System.out.println(dicTypes);
    }

    @Test
    public void insert(){
        TblDicType tblDicType = new TblDicType();
        tblDicType.setCode("111");
        tblDicType.setName("zhangsan");
        tblDicType.setDescription("sjfajga");
        int temp = tblDicTypeService.saveTblDicTypeMapper(tblDicType);
        System.out.println(temp);
    }
}
