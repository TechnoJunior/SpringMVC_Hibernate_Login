package com.technoboy.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoboy.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public boolean Login(User user) throws SQLException {
		String query = "select * from details where name=? and password=?";
		PreparedStatement statement = dataSource.getConnection().prepareStatement(query);
		statement.setString(1, user.getName());
		statement.setString(2, user.getPassword());
		ResultSet resultSet = statement.executeQuery();
		if(resultSet.next()) {
			return (resultSet.getInt(1)>1);
		}
		else {
			return false;
		}
	}
}