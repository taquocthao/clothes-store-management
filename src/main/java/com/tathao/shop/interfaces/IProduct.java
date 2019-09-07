package com.tathao.shop.interfaces;

import java.util.List;

import com.tathao.shop.bean.Product;

public interface IProduct {
	
	public List<Product> getProducts(int productParentsId, int start, int limit);
	
	public Product getProductById(int id);

}
