package com.eanurag.business;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.eanurag.exception.InvalidInputException;
import com.eanurag.model.Product;

@WebService(name = "OnlineKart")
public interface ProductInterface {
	@WebMethod
	@WebResult(name = "Product")
	public Product getProductInfoFromSku(@WebParam(name = "sku") String sku)
			throws InvalidInputException;

	@WebMethod
	@WebResult(name = "Product")
	public List<Product> getProductList();

	@WebMethod
	public boolean addProduct(@WebParam(name = "name") String productName,
			@WebParam(name = "sku") String sku,
			@WebParam(name = "price") int price,
			@WebParam(name = "category") String category);

	@WebMethod
	public boolean removeProduct(@WebParam(name = "sku") String sku)
			throws InvalidInputException;

	@WebMethod
	@WebResult(name = "Category")
	public List<String> getProductCategories();

}
