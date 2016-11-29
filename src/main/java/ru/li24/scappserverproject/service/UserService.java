/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.li24.scappserverproject.service;

import java.util.List;
import ru.li24.scappserverproject.entity.User;


public interface UserService {
    public User getUser(Long id);
    public void removeUser(User user);
    public void removeUser(Long id);
    public List<User> getUserList();
    
}
