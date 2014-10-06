package com.eanurag.business;

import java.util.List;

import javax.jws.WebService;

import com.eanurag.exception.InvalidInputException;
import com.eanurag.impl.ProductCatalogueImpl;
import com.eanurag.model.Product;

@WebService(endpointInterface = "com.eanurag.business.ProductInterface", serviceName = "OnlineKartService", portName = "OnlineKartServicePort")
public class ProductCatalogue implements ProductInterface {
	ProductCatalogueImpl product = new ProductCatalogueImpl();

	@Override
	public Product getProductInfoFromSku(String sku)
			throws InvalidInputException {
		// TODO Auto-generated method stub
		return product.getProductInfoFromSku(sku);
	}

	@Override
	public boolean addProduct(String productName, String sku, int price,
			String category) {
		// TODO Auto-generated method stub
		return product.addProduct(productName, sku, price, category);
	}

	@Override
	public boolean removeProduct(String sku) throws InvalidInputException {
		// TODO Auto-generated method stub
		return product.removeProduct(sku);
	}

	@Override
	public List<String> getProductCategories() {
		// TODO Auto-generated method stub
		return product.getProductCategories();
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return product.getProductList();
	}

}
