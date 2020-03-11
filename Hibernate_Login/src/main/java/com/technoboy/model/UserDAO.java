package com.technoboy.model;

import java.sql.SQLException;

import com.technoboy.entity.User;

public interface UserDAO {
	public boolean Login(User user) throws SQLException;
}