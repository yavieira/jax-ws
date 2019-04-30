
package br.com.caelum.estoque.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listAllItemsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listAllItemsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://ws.estoque.caelum.com.br/}listaItens" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAllItemsResponse", propOrder = {
    "items"
})
public class ListAllItemsResponse {

    @XmlElement(name = "Items")
    protected ListaItens items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ListaItens }
     *     
     */
    public ListaItens getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaItens }
     *     
     */
    public void setItems(ListaItens value) {
        this.items = value;
    }

}
