package com.douh.gmall.manager;

import com.douh.gmall.manager.mapper.SysUserMapper;
import com.douh.gmall.manager.mapper.UserMapper;
import com.douh.gmall.sysuser.Sysuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManagerServiceApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    public void testsysuser(){
        for (Sysuser sysUser : sysUserMapper.selectList(null)) {
            System.out.println("sysUser = " + sysUser);
        }

    }


    @Test
    public void contextLoads() {
        for (User user : userMapper.selectList(null)) {
            System.out.println("user = " + user);
        }

    }


    @Test
    public void delete(){
        int id = userMapper.deleteById(2);
        System.out.println("删除id = " + id);

        for (User user : userMapper.selectList(null)) {
            System.out.println("user = " + user);
        }

    }

}
