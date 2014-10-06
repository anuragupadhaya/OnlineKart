package com.eanurag.impl;

import java.util.ArrayList;
import java.util.List;

import com.eanurag.exception.InvalidInputException;
import com.eanurag.model.Product;

public class ProductCatalogueImpl {
	List<Product> productList = new ArrayList<Product>();

	public Product getProductInfoFromSku(String sku)
			throws InvalidInputException {
		// TODO Auto-generated method stub
		for (Product p : productList) {
			if (sku.equalsIgnoreCase(p.getSku())) {
				return p;
			}
		}
		throw new InvalidInputException("Invalid Input", sku
				+ " is not a valid input");
	}

	public boolean addProduct(String productName, String sku, int price,
			String category) {
		// TODO Auto-generated method stub
		Product newProduct = new Product(productName, sku, price, category);
		productList.add(newProduct);
		return true;
	}

	public boolean removeProduct(String sku) throws InvalidInputException {
		// TODO Auto-generated method stub
		for (Product p : productList) {
			if (sku.equalsIgnoreCase(p.getSku())) {
				return productList.remove(p);
			}
		}
		throw new InvalidInputException("Invalid Input", sku
				+ " is not a valid input");
	}

	public List<String> getProductCategories() {
		// TODO Auto-generated method stub
		List<String> productCat = new ArrayList<String>();
		for (Product p : productList)
			productCat.add(p.getCategory());
		return productCat;
	}

	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return productList;
	}

}
