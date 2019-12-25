package com.example.demo.mapper;

import com.example.demo.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(Integer id);
}
