package com.zzy.service.impl;

import com.zzy.dao.UserDao;
import com.zzy.entity.User;
import com.zzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAll() {
        List<User> userList = userDao.selectAll();
        return userList;
    }
}
