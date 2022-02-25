package com.toby.study.part01.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker {
	int count = 0;
	private ConnectionMaker realConnectionMaker;
	
	public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
		this.realConnectionMaker = realConnectionMaker;
	}
	
	public Connection makeNewConnection()  throws ClassNotFoundException, SQLException {
		this.count++;
		return this.realConnectionMaker.makeNewConnection();
	}
	
	public int getCounter() {
		return this.count;
	}
}
