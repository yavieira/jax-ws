
package br.com.caelum.estoque.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.estoque.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CadastrarItemResponse_QNAME = new QName("http://ws.estoque.caelum.com.br/", "cadastrarItemResponse");
    private final static QName _ListAllItems_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listAllItems");
    private final static QName _Token_QNAME = new QName("http://ws.estoque.caelum.com.br/", "token");
    private final static QName _CadastrarItem_QNAME = new QName("http://ws.estoque.caelum.com.br/", "cadastrarItem");
    private final static QName _Filtros_QNAME = new QName("http://ws.estoque.caelum.com.br/", "filtros");
    private final static QName _ListItemsResponse_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listItemsResponse");
    private final static QName _ListaItens_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listaItens");
    private final static QName _Item_QNAME = new QName("http://ws.estoque.caelum.com.br/", "item");
    private final static QName _AuthorizationFault_QNAME = new QName("http://ws.estoque.caelum.com.br/", "AuthorizationFault");
    private final static QName _ListAllItemsResponse_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listAllItemsResponse");
    private final static QName _ListItems_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listItems");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.estoque.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAllItemsResponse }
     * 
     */
    public ListAllItemsResponse createListAllItemsResponse() {
        return new ListAllItemsResponse();
    }

    /**
     * Create an instance of {@link ListItems }
     * 
     */
    public ListItems createListItems() {
        return new ListItems();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ListaItens }
     * 
     */
    public ListaItens createListaItens() {
        return new ListaItens();
    }

    /**
     * Create an instance of {@link CadastrarItem }
     * 
     */
    public CadastrarItem createCadastrarItem() {
        return new CadastrarItem();
    }

    /**
     * Create an instance of {@link Filtros }
     * 
     */
    public Filtros createFiltros() {
        return new Filtros();
    }

    /**
     * Create an instance of {@link ListItemsResponse }
     * 
     */
    public ListItemsResponse createListItemsResponse() {
        return new ListItemsResponse();
    }

    /**
     * Create an instance of {@link CadastrarItemResponse }
     * 
     */
    public CadastrarItemResponse createCadastrarItemResponse() {
        return new CadastrarItemResponse();
    }

    /**
     * Create an instance of {@link ListAllItems }
     * 
     */
    public ListAllItems createListAllItems() {
        return new ListAllItems();
    }

    /**
     * Create an instance of {@link TokenUsuario }
     * 
     */
    public TokenUsuario createTokenUsuario() {
        return new TokenUsuario();
    }

    /**
     * Create an instance of {@link Filtro }
     * 
     */
    public Filtro createFiltro() {
        return new Filtro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "cadastrarItemResponse")
    public JAXBElement<CadastrarItemResponse> createCadastrarItemResponse(CadastrarItemResponse value) {
        return new JAXBElement<CadastrarItemResponse>(_CadastrarItemResponse_QNAME, CadastrarItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listAllItems")
    public JAXBElement<ListAllItems> createListAllItems(ListAllItems value) {
        return new JAXBElement<ListAllItems>(_ListAllItems_QNAME, ListAllItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "token")
    public JAXBElement<TokenUsuario> createToken(TokenUsuario value) {
        return new JAXBElement<TokenUsuario>(_Token_QNAME, TokenUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "cadastrarItem")
    public JAXBElement<CadastrarItem> createCadastrarItem(CadastrarItem value) {
        return new JAXBElement<CadastrarItem>(_CadastrarItem_QNAME, CadastrarItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filtros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "filtros")
    public JAXBElement<Filtros> createFiltros(Filtros value) {
        return new JAXBElement<Filtros>(_Filtros_QNAME, Filtros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listItemsResponse")
    public JAXBElement<ListItemsResponse> createListItemsResponse(ListItemsResponse value) {
        return new JAXBElement<ListItemsResponse>(_ListItemsResponse_QNAME, ListItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listaItens")
    public JAXBElement<ListaItens> createListaItens(ListaItens value) {
        return new JAXBElement<ListaItens>(_ListaItens_QNAME, ListaItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "AuthorizationFault")
    public JAXBElement<String> createAuthorizationFault(String value) {
        return new JAXBElement<String>(_AuthorizationFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listAllItemsResponse")
    public JAXBElement<ListAllItemsResponse> createListAllItemsResponse(ListAllItemsResponse value) {
        return new JAXBElement<ListAllItemsResponse>(_ListAllItemsResponse_QNAME, ListAllItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listItems")
    public JAXBElement<ListItems> createListItems(ListItems value) {
        return new JAXBElement<ListItems>(_ListItems_QNAME, ListItems.class, null, value);
    }

}
