package com.tathao.shop.bean;

public class InvoiceDetails {

	private int id;
	private int invoiceId;
	private int productId;
	private int quantity;
	private double totalPrices;
	
	public InvoiceDetails(int id, int invoiceId, int productId, int quantity, double totalPrices) {
		super();
		this.id = id;
		this.invoiceId = invoiceId;
		this.productId = productId;
		this.quantity = quantity;
		this.totalPrices = totalPrices;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrices() {
		return totalPrices;
	}

	public void setTotalPrices(double totalPrices) {
		this.totalPrices = totalPrices;
	}
	
}
