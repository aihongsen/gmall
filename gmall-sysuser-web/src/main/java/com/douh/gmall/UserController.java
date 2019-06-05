package com.douh.gmall;

import com.alibaba.dubbo.config.annotation.Reference;
import com.douh.gmall.sysuser.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    SysUserService sysUserService;

    @RequestMapping("/sysuser")
    public String getSysUser(){
        return sysUserService.getSysUser(1).toString();
    }
}
