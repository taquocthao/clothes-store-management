package com.tathao.shop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostname = Constant.Data.HOSTNAME;
		String databaseName = Constant.Data.DATABASE_NAME;
		String username = Constant.Data.USERNAME;
		String password = Constant.Data.PASSWORD;
		
		return getConnection(hostname, databaseName, username, password);
	}
	
	private static Connection getConnection(String hostname, String databaseName,
			String username, String password) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
//		
		String connectURL = "jdbc:mysql://" + hostname + ":3306/" + databaseName + 
				"?useUnicode=yes&characterEncoding=UTF-8";
		Connection conn = DriverManager.getConnection(connectURL, username, password);
		return conn;
	}
	
}
