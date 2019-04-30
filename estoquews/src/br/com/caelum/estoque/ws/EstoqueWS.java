package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.exception.AuthorizationException;
import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ItemValidador;
import br.com.caelum.estoque.modelo.item.ListaItens;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;

@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	@WebMethod(operationName = "listAllItems")
	@WebResult(name = "Items")
	public ListaItens getAllItens() {
		System.out.println("Chamando getItens()");
		List<Item> items = dao.todosItens();
		return new ListaItens(items);
	}

	@WebMethod(operationName = "listItems")
	@WebResult(name = "Items")
	public ListaItens getItens(Filtros filtros) {
		System.out.println("Chamando getItens()");
		List<Filtro> filtro = filtros.getLista();
		List<Item> items = dao.todosItens(filtro);
		return new ListaItens(items);
	}
	
	@WebMethod(operationName = "cadastrarItem")
	@WebResult(name = "item")	
	public Item cadastrarItem (
			@WebParam(name="token", header = true) TokenUsuario token, 
			@WebParam(name="item") Item item) 
					throws AuthorizationException {
		System.out.println("Cadastrando item " + item + " Token " + token);
		boolean valid = new TokenDao().ehValido(token);
		
		if(!valid) {
			throw new AuthorizationException("Authorization failed");
		}
		
		new ItemValidador(item).validate();
		this.dao.cadastrar(item);
		
		return item;
	}
}
