package com.tathao.shop.utils;

public class Constant {

	public static class Label {
//		public static final String uName = "Username";
//		public static final String username = "aaa";
	}
	
	public static class Data {
		public static final String hostname = "localhost";
		public static final String username = "root";
		public static final String password = "";
		public static final String databaseName = "clothes_shop_management";
		
		public static class Product {
			public static final String SQL_SELECT_PRODUCTS = "select * from product";
			public static final String SQL_SELECT_PRODUCT_BY_ID = "select * from product "
					+ "where id = ?";
			public static final String SQL_SELECT_PRODUCT_BY_CATEGORY = "select * from product "
					+ "where categoryId = ?";
		}
		
	}
	
}
