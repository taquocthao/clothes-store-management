package com.tathao.shop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tathao.shop.bean.Product;
import com.tathao.shop.model.ProductService;
import com.tathao.shop.utils.Constant;

public class WomanProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ProductService productService;
	
    public WomanProductController() {
    	productService = new ProductService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productTShirt = Constant.Number.CATEGORY_WOMAN_TSHIRT_ID;
		int productShirt = Constant.Number.CATEGORY_WOMAN_SHIRT_ID;
		int productJeans = Constant.Number.CATEGORY_WOMAN_JEANS_ID;
		int productCoat = Constant.Number.CATEGORY_WOMAN_COAT_ID;
		int productShoes = Constant.Number.CATEGORY_WOMAN_SHOES_ID;
		int productDress = Constant.Number.CATEGORY_WOMAN_DRESS_ID;
		int productSkirt = Constant.Number.CATEGORY_WOMAN_SKIRT_ID;
		int productThongs = Constant.Number.CATEGORY_MAN_THONGS_ID;

		int limitRecord = Constant.Number.LIMIT_RECORD;
		
		int productsSize = Constant.Number.ZERO;
		
		String spageId = request.getParameter("page");
		int pageId = 0;
		int start = 0;
		
		if(spageId == null || spageId == "") {
			pageId = 1;	
		} else {
			pageId = Integer.parseInt(spageId);
		}
		
		if(pageId == 1) {
			//
		} else {
			start = ( pageId - 1 ) * limitRecord + 1;
		}
		
		String pathInfo = request.getPathInfo();
		List<Product> listProducts = new ArrayList<Product>();
		
		switch (pathInfo) {
			case Constant.Path.PATH_TSHIRT:
			{
				listProducts = productService
						.getProducts(productTShirt, start, limitRecord);
				productsSize = listProducts.size();
				break;
			}
			case Constant.Path.PATH_JEANS:
			{
				listProducts = productService
						.getProducts(productJeans, start, limitRecord);				
				break;
			}
			case Constant.Path.PATH_COAT:
			{
				listProducts = productService
						.getProducts(productCoat, start, limitRecord);
				
				break;
			}
			case Constant.Path.PATH_SHIRT:
			{
				listProducts = productService
						.getProducts(productShirt, start, limitRecord);				
				break;
			}
			default:
			{
				listProducts = productService
						.getProducts(productShirt, start ,limitRecord);	
				break;
			}
		}
		
		int totalPage = Math.round(productsSize / limitRecord);
		productsSize = listProducts.size();
		
		request.setAttribute("products", listProducts);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("currentPage", pageId);
		
		request.setAttribute("currentPage", pageId);	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/manProductsPage.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
