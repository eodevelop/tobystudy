package com.toby.study.part01;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NUserDao nDao = new NUserDao();
		DUserDao dDao = new DUserDao();
		
		User nUser = new User();
		nUser.setId("whiteship");
		nUser.setName("백기선");
		nUser.setPassword("married");
		
		nDao.add(nUser);
		
		System.out.println(nUser.getId() + " 등록 성공");
		
		User nUser2 = nDao.get(nUser.getId());
		System.out.println(nUser2.getName());
		System.out.println(nUser2.getPassword());
		System.out.println(nUser2.getId() + " 조회 성공");
		
		User dUser = new User();
		dUser.setId("whiteship1");
		dUser.setName("백기선1");
		dUser.setPassword("married1");
		
		dDao.add(dUser);
		
		System.out.println(dUser.getId() + " 등록 성공");
		
		User dUser2 = dDao.get(dUser.getId());
		System.out.println(dUser2.getName());
		System.out.println(dUser2.getPassword());
		System.out.println(dUser2.getId() + " 조회 성공");
	}
}
