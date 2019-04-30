package test;

import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.caelum.estoque.client.EstoqueWS;
import br.com.caelum.estoque.client.Filtro;
import br.com.caelum.estoque.client.Filtros;
import br.com.caelum.estoque.client.Item;
import br.com.caelum.estoque.client.ListaItens;
import br.com.caelum.estoque.client.TipoItem;

public class TestDynamicClient {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://localhost:8080/estoquews?wsdl");
		QName qname = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSService");
		
		Service service = Service.create(url, qname);
		EstoqueWS client = service.getPort(EstoqueWS.class);
		
		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo(TipoItem.CELULAR);
		
		ListaItens lista = client.listItems((Filtros) Arrays.<Filtro>asList(filtro));
		
		for (Item item : lista.item) {
			System.out.println(item.getNome());
		}
	}
}
