/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.li24.scappserverproject.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import ru.li24.scappserverproject.dao.UserDAO;
import ru.li24.scappserverproject.entity.User;


public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    
    @Transactional
    @Override
    public User getUser(Long id) {
        return userDAO.getUserById(id);
    }

    @Transactional
    @Override
    public void removeUser(User user) {
        userDAO.removeUser(user);
    }

    @Transactional
    @Override
    public void removeUser(Long id) {
        userDAO.removeUserById(id);
    }

    @Transactional
    @Override
    public List<User> getUserList() {
        return userDAO.getUserList();
    }
    
}
