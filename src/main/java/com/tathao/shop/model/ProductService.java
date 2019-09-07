package com.tathao.shop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tathao.shop.bean.Product;
import com.tathao.shop.interfaces.IProduct;
import com.tathao.shop.utils.DataProvider;

public class ProductService implements IProduct {

	private Connection connect;
	
	public ProductService() {
		try {
			this.connect = DataProvider.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Get connection from Product has been error");
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Product> getProducts(int productParentsId, int start, int limit) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * ");
		sql.append("FROM product ");
		sql.append("WHERE productParentsId = ? ");
		sql.append("LIMIT ?, ?");
		try {
			PreparedStatement ptm = this.connect.prepareStatement(sql.toString());
			ptm.setInt(1, productParentsId);
			ptm.setInt(2, start);
			ptm.setInt(3, limit);
			
			ResultSet result = ptm.executeQuery();
			List<Product> listProducts = new ArrayList<Product>();
			
			while(result.next()) {
				String id = result.getString(1);
				int productParentId = result.getInt(2);
				String name = result.getString(3);
				double price = result.getDouble(4);
				String image = result.getString(5);
				String description = result.getString(6);
				listProducts.add(new Product(id, productParentId, name, price, image, description));
			}
			return listProducts;
		} catch (SQLException e) {
			System.out.println("Get products has been error at : " + e.getMessage());
			return null;
		}
	}

	@Override
	public Product getProductById(int productId) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * " );
		sql.append("from product "); 
		sql.append("where id = ?");
		Product product = null;
		try {
			PreparedStatement ptm = this.connect.prepareStatement(sql.toString());
			ptm.setInt(1, productId);
			ResultSet result = ptm.executeQuery();
			while(result.next()) {
				String id = result.getString(1);
				int productParentId = result.getInt(2);
				String name = result.getString(3);
				double price = result.getDouble(4);
				String image = result.getString(5);
				String description = result.getString(6);
				product = new Product(id, productParentId, name, price, image, description);
			}
		} catch (SQLException e) {
			System.out.println("Get product by id has been error at : " + e.getMessage());
			e.printStackTrace();
		}
		return product;
	}

		
public int getSize(int productParentsId) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT COUNT(*) ");
		sql.append("FROM product ");
		sql.append("WHERE productParentsId = ? ");
		
		PreparedStatement ptm;
		
		int numberOfRows = 0;
		try {
			ptm = this.connect.prepareStatement(sql.toString());
			ptm.setInt(1, productParentsId);
			ResultSet rs = ptm.executeQuery();
			while(rs.next()) {
				numberOfRows = rs.getInt(1);
				return numberOfRows;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numberOfRows;
	}


}
