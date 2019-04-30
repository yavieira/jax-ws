
package br.com.caelum.estoque.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listItemsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listItemsResponse">
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
@XmlType(name = "listItemsResponse", propOrder = {
    "items"
})
public class ListItemsResponse {

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
