package com.lucian.security.mapper;

import com.lucian.security.entity.Role;
import com.lucian.security.entity.User;

import java.util.List;

public interface UserMapper {

    User loadUserByUsername(String userName);

    List<Role> getRolesById(Integer id);
}
