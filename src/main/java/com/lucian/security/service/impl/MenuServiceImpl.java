package com.lucian.security.service.impl;

import com.lucian.security.entity.Menu;
import com.lucian.security.mapper.MenuMapper;
import com.lucian.security.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
