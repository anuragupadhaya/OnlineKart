package com.eanurag.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Product")
@XmlType(propOrder = { "productName", "sku", "price", "category" })
public class Product {
	private String productName;
	private String sku;
	private int price;
	private String category;

	public Product() {

	}

	public Product(String productName, String sku, int price, String category) {
		this.productName = productName;
		this.sku = sku;
		this.price = price;
		this.category = category;
	}

	@XmlElement(name = "Name")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@XmlElement(name = "ID")
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@XmlElement(name = "Price")
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@XmlElement(name = "Category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
