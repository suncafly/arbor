package com.arbor.security.controller;

import com.arbor.security.browser.BrowserUserDetails;
import com.arbor.security.modle.Student;
import com.arbor.security.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by apple on 2018/3/15.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRespository studentRespository;

    @GetMapping("/findAll")
    public List<Student> findAll(@AuthenticationPrincipal BrowserUserDetails user){
        System.out.println(user.toString());
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
        return studentRespository.findAll();
    }

}
