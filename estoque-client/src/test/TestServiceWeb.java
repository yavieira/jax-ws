package test;

import br.com.caelum.estoque.client.EstoqueWS;
import br.com.caelum.estoque.client.EstoqueWS_Service;
import br.com.caelum.estoque.client.Filtro;
import br.com.caelum.estoque.client.Filtros;
import br.com.caelum.estoque.client.ListaItens;
import br.com.caelum.estoque.client.TipoItem;

public class TestServiceWeb {

	public static void main(String[] args) {
		
		//Estabelece uma conexão via SOAP/XML com o servidor ("getEstoqueWSImplPort" Proxy/Remote)
		EstoqueWS client = new EstoqueWS_Service().getEstoqueWSImplPort();
		
		Filtros filtros = new Filtros();
		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo(TipoItem.CELULAR);
		filtros.getFiltro().add(filtro);
		
		ListaItens itens = client.listItems(filtros);
		
		System.out.println(itens);
	}
}
