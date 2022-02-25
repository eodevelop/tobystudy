package com.toby.study.part01;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.toby.study.part01.config.DaoFactory;
import com.toby.study.part01.dao.UserDao;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao = context.getBean("userDao", UserDao.class);
		
//		User user = new User();
//		user.setId("whiteship");
//		user.setName("백기선");
//		user.setPassword("married");
//		
//		dao.add(user);
//		
//		System.out.println(user.getId() + " 등록 성공");
//		
//		User user2 = dao.get(user.getId());
//		System.out.println(user2.getName());
//		System.out.println(user2.getPassword());
//		System.out.println(user2.getId() + " 조회 성공");

		DaoFactory daoFactory = new DaoFactory();
		UserDao dao1 = daoFactory.userDao();
		UserDao dao2 = daoFactory.userDao();
		
		System.out.println(dao1);
		System.out.println(dao2);
		
		UserDao dao3 = context.getBean("userDao", UserDao.class);
		UserDao dao4 = context.getBean("userDao", UserDao.class);
		
		System.out.println(dao3);
		System.out.println(dao4);
		
//		CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
//		System.out.println("Connection Counting : " + ccm.getCounter());
	}
}
