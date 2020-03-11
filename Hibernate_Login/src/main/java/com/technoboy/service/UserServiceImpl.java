package com.technoboy.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoboy.entity.User;
import com.technoboy.model.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	@Transactional
	public boolean login(User user) throws SQLException {
		return userDao.Login(user);
	}
}