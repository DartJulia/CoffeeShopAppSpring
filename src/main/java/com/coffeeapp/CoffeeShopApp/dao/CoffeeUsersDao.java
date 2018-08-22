package com.coffeeapp.CoffeeShopApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeapp.CoffeeShopApp.entity.Items;

@Repository
public class CoffeeUsersDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Items> showItems() {
		
		return jdbcTemplate.query("SELECT * FROM Items", new BeanPropertyRowMapper<Items>(Items.class));
	}

	public int insertUser(String firstName, String lastName, String email, String phoneNum, String password,
			boolean news) {
		String insertQuery = "INSERT INTO Users(FirstName, LastName, Email, PhoneNum, Password, Newsletter)"
				+ " values(?,?,?,?,?,?)";
		return jdbcTemplate.update(insertQuery, firstName, lastName, email, phoneNum, password, news);
	}

}
