package com.tathao.shop.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class DataProvider {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		return MySQLConnector.getConnection();
	}

}
