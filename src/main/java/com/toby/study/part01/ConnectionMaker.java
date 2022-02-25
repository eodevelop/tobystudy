package com.toby.study.part01;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	public Connection makeNewConnection()  throws ClassNotFoundException, SQLException;
}
