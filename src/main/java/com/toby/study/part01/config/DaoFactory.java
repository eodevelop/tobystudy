package com.toby.study.part01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.toby.study.part01.connection.ConnectionMaker;
import com.toby.study.part01.connection.DConnectionMaker;
import com.toby.study.part01.dao.UserDao;

@Configuration
public class DaoFactory {
	@Bean
	public UserDao userDao() {
		UserDao userDao = new UserDao(connectionMaker());
		return userDao;
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
