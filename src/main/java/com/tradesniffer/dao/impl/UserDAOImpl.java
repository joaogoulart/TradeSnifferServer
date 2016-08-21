package com.tradesniffer.dao.impl;

import com.tradesniffer.dao.UserDAO;
import com.tradesniffer.entity.User;

/**
 * Created by Headtrap on 20-Aug-16.
 */
public class UserDAOImpl extends GenericDAOImpl<User, Long> implements UserDAO{

    public UserDAOImpl(){
        super(User.class);
    }

}
