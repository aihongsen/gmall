package com.douh.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.douh.gmall.sysuser.SysUserService;
import com.douh.gmall.sysuser.Sysuser;
@Service
public class SysUserServiceimpl implements SysUserService {

    @Override
    public Sysuser getSysUser(Integer userId) {
        return new Sysuser();
    }
}
