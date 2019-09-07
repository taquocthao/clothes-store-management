package com.tathao.shop.bean;

public class Product {
	private String id;
	private int productParentsId;
	private String name;
	private double price;
	private String image;
	private String description;
	
	public Product(String id, int productParentsId, String name, double price, String image, String description) {
		super();
		this.id = id;
		this.productParentsId = productParentsId;
		this.name = name;
		this.image = image;
		this.price = price;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the productParentsId
	 */
	public int getProductParentsId() {
		return productParentsId;
	}

	/**
	 * @param productParentsId the productParentsId to set
	 */
	public void setProductParentsId(int productParentsId) {
		this.productParentsId = productParentsId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
