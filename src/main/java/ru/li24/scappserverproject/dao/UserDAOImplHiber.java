/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.li24.scappserverproject.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.li24.scappserverproject.entity.User;

/**
 *
 * @author Just for Coders
 */
@Repository
public class UserDAOImplHiber implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUserById(Long id) {
        return (User) sessionFactory.getCurrentSession().load(User.class, id);
    }

    @Override
    public List<User> getUserList() {
              return sessionFactory.getCurrentSession().createQuery("select from USERS").list();
    }

    @Override
    public void removeUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public void removeUserById(Long id) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, id);
        if(user != null){
            sessionFactory.getCurrentSession().delete(user);
        }
    }
    
}
