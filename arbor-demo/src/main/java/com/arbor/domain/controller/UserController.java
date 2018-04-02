package com.arbor.domain.controller;

import com.arbor.domain.modle.User;
import com.arbor.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public Map<String, String> register(){
        User user = new User();
        user.setName("Suncafly");
        user.setEmail("974538690@qq.com");
        userService.register(user);
        Map<String, String> result = new HashMap<>();
        result.put("result","success");
        return result;
    }

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

    @RequestMapping("/advice1")
    public String advice1(@ModelAttribute("author") String author) {
        System.out.println(author);
        return "success";
    }
}
