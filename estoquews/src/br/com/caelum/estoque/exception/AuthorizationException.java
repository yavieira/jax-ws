package br.com.caelum.estoque.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "AuthorizationFault")
public class AuthorizationException extends Exception {

	public AuthorizationException(String mensagem) {
		super(mensagem);
	}

	public String getFaultInfo() {
		return "Token invalido";
	}
}
