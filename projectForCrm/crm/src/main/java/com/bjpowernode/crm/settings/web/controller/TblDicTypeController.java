package com.bjpowernode.crm.settings.web.controller;

import com.bjpowernode.crm.commons.Contants;
import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.settings.domain.TblDicType;
import com.bjpowernode.crm.settings.service.TblDicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 周伦杰
 * 2021/9/3
 */
@Controller
public class TblDicTypeController {

    @Autowired
    TblDicTypeService tblDicTypeService;

    @RequestMapping("/settings/dictionary/type/index.do")
    public String DicType(HttpServletRequest request){

        List<TblDicType> dicTypeList ;
        dicTypeList = tblDicTypeService.select();
        request.setAttribute("dicTypeList", dicTypeList);
        return "settings/distionary/type/index";
    }

    @RequestMapping("/settings/dictionary/type/toSave.do")
    public String DicTypeToSave(){
        return "settings/distionary/type/save";
    }

    /*@RequestMapping("/settings/dictionary/type/checkCode.do")
    @ResponseBody
    public Object DicTypeCheckCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        TblDicType tblDicType = null;
        tblDicType = tblDicTypeService.selectByPrimaryKey(code);
        Map<String, String> map = new HashMap<>();
        if (tblDicType != null){
            map.put("code", "0");
            map.put("message", "编码已经存在");
            return map;
        } else {
            map.put("code", "1");
            return map;
        }
    }*/

    @RequestMapping("/settings/dictionary/type/checkCode.do")
    @ResponseBody
    public Object checkCode(String code){
        //调用service层方法，查询数据字典类型
        TblDicType tblDicType=tblDicTypeService.selectByPrimaryKey(code);
        //根据查询结果，生成响应信息
        ReturnObject returnObject=new ReturnObject();
        if(tblDicType==null){
            //不重复，code可用
            returnObject.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);
        }else{
            //重复，code不可用
            returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
            returnObject.setMessage("编码已存在");
        }
        return returnObject;
    }

    /*@RequestMapping("/settings/dictionary/type/saveCreateDicType.do")
    public Object DicTypeSaveCreate(HttpServletRequest request){
        Map<String, String> map = new HashMap<>();
        TblDicType tblDicType = new TblDicType();
        tblDicType.setCode(request.getParameter("code"));
        tblDicType.setName(request.getParameter("name"));
        tblDicType.setDescription(request.getParameter("description"));
        tblDicTypeService.saveTblDicTypeMapper(tblDicType);
        map.put("code", "1");
        return map;
    }*/

    @RequestMapping("/settings/dictionary/type/saveCreateDicType.do")
    @ResponseBody
    public Object saveCreateDicType(TblDicType tblDicType){
        ReturnObject returnObject=new ReturnObject();
        try {
            //调用service层方法，保存数据字典类型
            int ret = tblDicTypeService.saveTblDicTypeMapper(tblDicType);

            if(ret>0){
                //保存成功
                returnObject.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);
            }else{
                //保存失败
                returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
                returnObject.setMessage("保存失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            //保存失败
            returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
            returnObject.setMessage("保存失败");
        }
        return returnObject;
    }

    @RequestMapping("/settings/dictionary/type/editDicType.do")
    public String editDicType(String code , Model model){
        //调用service层方法，查询数据字典类型
        TblDicType tblDicType=tblDicTypeService.selectByPrimaryKey(code);
        //把数据保存到reuquest中
        model.addAttribute("tblDicType",tblDicType);
        //请求转发
        return "settings/distionary/type/edit";
    }

    @RequestMapping("/settings/dictionary/type/saveEditDicType.do")
    @ResponseBody
    public Object saveEditDicType(TblDicType tblDicType){
        ReturnObject returnObject=new ReturnObject();
        try {
            int ret = tblDicTypeService.updateByPrimaryKey(tblDicType);

            if(ret>0){
                //更新成功
                returnObject.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);
            }else{
                //更新失败
                returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
                returnObject.setMessage("更新失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            //更新失败
            returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
            returnObject.setMessage("更新失败");
        }
        return returnObject;
    }

    //settings/dictionary/type/deleteDicTypeByCodes.do



    @RequestMapping("/settings/dictionary/value/index.do")
    public String DicValue(){
        return "settings/distionary/value/index";
    }

    @RequestMapping("/settings/dictionary/index.do")
    public String Dic(){
        return "settings/distionary/index";
    }

    @RequestMapping("/settings/index.do")
    public String System(){
        return "settings/index";
    }
}
