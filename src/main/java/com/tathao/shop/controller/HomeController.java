package com.tathao.shop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tathao.shop.bean.Product;
import com.tathao.shop.model.ProductService;

public class HomeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ProductService productService;
	
	public HomeController() {
		productService = new ProductService();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = productService.getProducts();
		request.setAttribute("products", products);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/homePage.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
