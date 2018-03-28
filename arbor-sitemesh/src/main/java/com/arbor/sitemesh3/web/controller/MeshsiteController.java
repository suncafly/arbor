package com.arbor.sitemesh3.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sitemesh")
public class MeshsiteController {

    @RequestMapping("")
    public String home() {
        return "index";
    }
}
