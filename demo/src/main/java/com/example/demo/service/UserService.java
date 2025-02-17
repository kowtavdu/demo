package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Integer userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Integer userId);
}
