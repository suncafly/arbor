package com.arbor.domain.controller;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 03/04/2018.
 */
@Controller
@RequestMapping("/user")
@Api(description = "The User controller", name = "User services")
public class UserController {


    @ApiMethod
    @ResponseBody
    @RequestMapping("/advice")
    public  Map<String, String> advice(ModelMap modelMap){
        Object obj = modelMap.get("author");
        System.out.println(obj);
        Map<String, String> result = new HashMap<>();
        result.put("result","success");
        return result;
    }


    //或者 通过@ModelAttribute获取
    @ApiMethod
    @RequestMapping("/advice1")
    public String advice1(@ModelAttribute("author") String author) {
        System.out.println(author);
        return "success";
    }
}
