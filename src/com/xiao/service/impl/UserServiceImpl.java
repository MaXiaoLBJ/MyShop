package com.xiao.service.impl;

import com.xiao.base.BaseDao;
import com.xiao.base.BaseServiceImpl;
import com.xiao.mapper.UserMapper;
import com.xiao.po.User;
import com.xiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseDao<User> getBaseDao() {
        return userMapper;
    }
}
