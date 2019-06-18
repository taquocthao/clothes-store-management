package com.tathao.shop.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tathao.shop.bean.Product;
import com.tathao.shop.interfaces.IProduct;
import com.tathao.shop.utils.Constant;
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
	public List<Product> getProducts() {
		String sql = Constant.Data.Product.SQL_SELECT_PRODUCTS;
		try {
			Statement stament = this.connect.createStatement();
			ResultSet result = stament.executeQuery(sql);
			List<Product> listProducts = new ArrayList<Product>();
			
			while(result.next()) {
				int id = result.getInt(1);
				int categoryId = result.getInt(2);
				String name = result.getString(3);
				double price = result.getDouble(4);
				String image = result.getString(5);
				String description = result.getString(6);
				listProducts.add(new Product(id, categoryId, name, price, image, description));
			}
			return listProducts;	
		} catch (SQLException e) {
			System.out.println("Get products has been error at : " + e.getMessage());
			return null;
		}
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
