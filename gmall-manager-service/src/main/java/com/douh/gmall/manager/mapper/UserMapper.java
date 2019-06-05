package com.douh.gmall.manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.douh.gmall.manager.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

    public User getUserById(User user);
}
