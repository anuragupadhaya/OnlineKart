package com.eanurag.deploy;

import javax.xml.ws.Endpoint;

import com.eanurag.business.ProductCatalogue;

public class OnlineKartPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:1234/onlinekart", new ProductCatalogue());
	}

}
