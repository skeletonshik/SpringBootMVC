package com.konstantinlev.springmvc.springboot.springbootmvc.dao;

import com.konstantinlev.springmvc.springboot.springbootmvc.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    void saveUser(User user);

    void updateUser(User user);

    User getUser(long id);
    void deleteUser(long id);
}
