package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class WSPublisher {

	public static void main(String[] args) {
		
		EstoqueWS ws = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
		
		Endpoint.publish(url, ws);
		
	}
}
