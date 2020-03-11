package com.technoboy.service;

import java.sql.SQLException;

import com.technoboy.entity.User;

public interface UserService {
	public boolean login(User user) throws SQLException;
}