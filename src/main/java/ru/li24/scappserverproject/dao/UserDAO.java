/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.li24.scappserverproject.dao;

import java.util.List;
import ru.li24.scappserverproject.entity.User;


public interface UserDAO {
    
    public void addUser(User user);
    
    public User getUserById(Long id);
    
    public List<User> getUserList();
    
    public void removeUser(User user);
    
    public void removeUserById(Long id);
}
