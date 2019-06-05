package com.douh.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagerController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
