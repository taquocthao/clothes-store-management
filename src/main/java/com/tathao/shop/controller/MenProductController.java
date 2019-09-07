package com.tathao.shop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import com.tathao.shop.bean.Product;
import com.tathao.shop.model.ProductService;
import com.tathao.shop.utils.Constant;


public class MenProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ProductService productService;
	
	public MenProductController() {
		productService = new ProductService();
	}
	
	/**
	 * @author taquocthao
	 * @param
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productTShirt = Constant.Number.CATEGORY_MAN_TSHIRT_ID;
		int productShirt = Constant.Number.CATEGORY_MAN_SHIRT_ID;
		int productJeans = Constant.Number.CATEGORY_MAN_JEANS_ID;
		int productCoat = Constant.Number.CATEGORY_MAN_COAT_ID;
		int productShoes = Constant.Number.CATEGORY_MAN_SHOES_ID;
		int productShort = Constant.Number.CATEGORY_MAN_SHORTS_ID;
		int productPants = Constant.Number.CATEGORY_MAN_PANTS_ID;
		int productThongs = Constant.Number.CATEGORY_MAN_THONGS_ID;

		int limitRecord = Constant.Number.LIMIT_RECORD;
		
		
		
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
		int productsSize = Constant.Number.ZERO;
		
		switch (pathInfo) {
			case Constant.Path.PATH_TSHIRT:
			{
				listProducts = productService
						.getProducts(productTShirt, start, limitRecord);
				productsSize = productService.getSize(Constant.Number.CATEGORY_MAN_TSHIRT_ID);
				break;
			}
			case Constant.Path.PATH_JEANS:
			{
				listProducts = productService
						.getProducts(productJeans, start, limitRecord);			
				productsSize = productService.getSize(Constant.Number.CATEGORY_MAN_JEANS_ID);
				break;
			}
			case Constant.Path.PATH_COAT:
			{
				listProducts = productService
						.getProducts(productCoat, start, limitRecord);
				productsSize = productService.getSize(Constant.Number.CATEGORY_MAN_COAT_ID);
				break;
			}
			case Constant.Path.PATH_SHIRT:
			{
				listProducts = productService
						.getProducts(productShirt, start, limitRecord);		
				productsSize = productService.getSize(Constant.Number.CATEGORY_MAN_SHIRT_ID);
				break;
			}
			default:
			{
				listProducts = productService
						.getProducts(productShirt, start ,limitRecord);	
				productsSize = productService.getSize(Constant.Number.CATEGORY_MAN_SHIRT_ID);
				break;
			}
		}
		
		int totalPage = Math.round(productsSize / limitRecord);
		
		request.setAttribute("products", listProducts);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("currentPage", pageId);
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/manProductsPage.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
