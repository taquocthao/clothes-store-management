package com.tathao.shop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tathao.shop.bean.ProductCatalogs;
import com.tathao.shop.bean.ProductCategory;
import com.tathao.shop.utils.DataProvider;

public class CatalogsService {

	private Connection connect;
	
	public CatalogsService() {
		try {
			this.connect = DataProvider.getConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("class not found " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("error sql " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public List<ProductCatalogs> getListCatalogs(){
		StringBuilder sql = new StringBuilder();
		sql.append("select * "
				 + "from product_catalogs");
		try {
			Statement statement = this.connect.createStatement();
			ResultSet result = statement.executeQuery(sql.toString());
			List<ProductCatalogs> catalogs = new ArrayList<ProductCatalogs>();
			
			while(result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				catalogs.add(new ProductCatalogs(id, name));
			}
			return catalogs;
		} catch (SQLException e) {
			System.out.println("error when create statement: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ProductCategory> getListCategoryByCatalogId(int catalogId){
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * ");
		sql.append("from product_category cate, product_catalos cata, catalogs_category c ");
		sql.append("where cate.id = c.categoryId and cata.id = ?");
		
		List<ProductCategory> listCategory = new ArrayList<ProductCategory>();
		
		try {
			PreparedStatement ptm = this.connect.prepareStatement(sql.toString());
			ResultSet rs = ptm.executeQuery();
			while(rs.next()) {
				int categoryId = rs.getInt(1);
				String name = rs.getString(2);
				listCategory.add(new ProductCategory(categoryId, name));
			}
		} catch (SQLException e) {
			System.out.println("get list category by catalogId has been error: " + e.getMessage());
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
