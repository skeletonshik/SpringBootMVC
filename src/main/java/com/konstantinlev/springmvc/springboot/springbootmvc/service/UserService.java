package com.konstantinlev.springmvc.springboot.springbootmvc.service;


import com.konstantinlev.springmvc.springboot.springbootmvc.models.User;

import java.util.List;

public interface UserService {

     List<User> getUsers();
     void saveUSer(User user);
     User getUser(long id);
     void deleteUser(long id);
}
