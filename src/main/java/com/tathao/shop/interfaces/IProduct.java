package com.tathao.shop.interfaces;

import java.util.List;

import com.tathao.shop.bean.Product;

public interface IProduct {
	
	public List<Product> getProducts();
	
	public Product getProductById(int id);
	
	public List<Product> getProductsByCategory(int categoryId);
	
	public boolean addProduct(Product product);
	
	public boolean updateProduct(Product product);
	
	public boolean deleteProduct(int id);
}
