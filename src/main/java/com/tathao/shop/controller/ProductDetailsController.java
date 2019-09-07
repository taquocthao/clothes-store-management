package com.tathao.shop.controller;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tathao.shop.bean.Product;
import com.tathao.shop.model.ProductService;


public class ProductDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ProductService productService;
	
    public ProductDetailsController() {
       productService = new ProductService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String productId = request.getParameter("product");
		Product product = productService.getProductById(Integer.parseInt(productId));
		
		if(product != null) {
			//Encode product id			
//			String productIdEncode = Base64.getUrlEncoder().encodeToString(productId.getBytes());			
//			product.setId(productIdEncode);
//			
//			System.out.println("encode: " + productIdEncode);
//			
			request.setAttribute("productDetails", product);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/productDetailsPage.jsp");
			dispatcher.forward(request, response);
			
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/errorPage/notFoundProduct.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
