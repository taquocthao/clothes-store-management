package com.tathao.shop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostname = Constant.Data.hostname;
		String databaseName = Constant.Data.databaseName;
		String username = Constant.Data.username;
		String password = Constant.Data.password;
		
		return getConnection(hostname, databaseName, username, password);
	}
	
	private static Connection getConnection(String hostname, String databaseName,
			String username, String password) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String connectURL = "jdbc:mysql://" + hostname + ":3306/" + databaseName + 
				"?useUnicode=yes&characterEncoding=UTF-8";
		Connection conn = DriverManager.getConnection(connectURL, username, password);
		return conn;
	}
	
}
