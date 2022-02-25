package com.toby.study.part01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.toby.study.part01.connection.ConnectionMaker;
import com.toby.study.part01.connection.CountingConnectionMaker;
import com.toby.study.part01.connection.DConnectionMaker;
import com.toby.study.part01.dao.UserDao;

@Configuration
public class CountingDaoFactory {
	@Bean
	public UserDao userDao() {
		UserDao userDao = new UserDao(connectionMaker());
		return userDao;
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new CountingConnectionMaker(realConnectionMaker());
	}
	
	@Bean
	public ConnectionMaker realConnectionMaker() {
		return new DConnectionMaker();
	}
}
