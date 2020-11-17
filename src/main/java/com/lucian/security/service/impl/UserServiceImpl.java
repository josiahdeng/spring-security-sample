package com.lucian.security.service.impl;

import com.lucian.security.entity.User;
import com.lucian.security.mapper.UserMapper;
import com.lucian.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(userName);
        if (user == null) throw new UsernameNotFoundException("用户不存在");
        user.setRoles(userMapper.getRolesById(user.getId()));
        return user;
    }
}
