package com.technoboy.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.technoboy.entity.User;
import com.technoboy.model.UserDAO;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public boolean login(User user) throws SQLException {
		return userDao.Login(user);
	}
}