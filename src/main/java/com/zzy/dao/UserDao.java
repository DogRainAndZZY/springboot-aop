package com.zzy.dao;

import com.zzy.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
