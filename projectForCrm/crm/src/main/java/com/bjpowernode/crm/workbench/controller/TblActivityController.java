package com.bjpowernode.crm.workbench.controller;

import com.bjpowernode.crm.workbench.service.TblActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 周伦杰
 * 2021/9/1
 */
@Controller
public class TblActivityController {

    @Autowired
    TblActivityService tblActivityService;

    @RequestMapping("/workbench/activity/saveCreateActivity.do")
    public String WorkbenchMain() {

        return null;
    }
}
