package br.com.caelum.estoque.ws;

import java.util.Arrays;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.caelum.estoque.ws.EstoqueWS", serviceName = "EstoqueWS")
public class EstoqueWSImpl implements EstoqueWS {

	@Override
	public ListaItens listItems(Filtros filtros) {
		System.out.println("Chamando listItems");
		ListaItens list = new ListaItens();
		list.item = Arrays.asList(geraItem());
		return list;
	}

	@Override
	public ListaItens listAllItems() {
		System.out.println("Chamando listAllItems");
		ListaItens list = new ListaItens();
		list.item = Arrays.asList(geraItem());
		return list;
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters, TokenUsuario token)
			throws AuthorizationException {
		System.out.println("Chamando cadastrarItem");
		CadastrarItemResponse response = new CadastrarItemResponse();
		response.setItem(geraItem());
		return response;
	}
	
	private Item geraItem() {
		Item item = new Item();
		item.codigo = "Bard";
		item.nome = "Hamlet";
		item.quantidade = 5;
		item.tipo = "Livro";
	
		return item;
	}
}
