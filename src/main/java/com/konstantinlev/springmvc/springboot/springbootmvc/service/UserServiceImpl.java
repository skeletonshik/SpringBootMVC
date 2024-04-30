package com.konstantinlev.springmvc.springboot.springbootmvc.service;


import com.konstantinlev.springmvc.springboot.springbootmvc.dao.UserDAO;
import com.konstantinlev.springmvc.springboot.springbootmvc.models.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void saveUSer(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User getUser(long id) {
        return userDAO.getUser(id);
    }

    @Override
    public void deleteUser(long id) {
        userDAO.deleteUser( id);
    }
}
