package com.kyle.struts2.tags;

public class Product {

	private Integer productId;
	
	private String productName;
	
	private String productDesc;
	
	private double productPrice;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public String testTag(){
		
		this.productDesc = 	"desc";
		this.productName =   "CPU";
		this.productId   =   1001;
		this.productPrice = 1000;
       return "success";
	}
}
