
package proxy;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour relever complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="relever">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dateRelever" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="operations" type="{http://example.org/}operations" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="rib" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relever", propOrder = {
    "dateRelever",
    "solde",
    "operations"
})
public class Relever {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRelever;
    protected Double solde;
    protected Operations operations;
    @XmlAttribute(name = "rib")
    protected String rib;

    /**
     * Obtient la valeur de la propri�t� dateRelever.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRelever() {
        return dateRelever;
    }

    /**
     * D�finit la valeur de la propri�t� dateRelever.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRelever(XMLGregorianCalendar value) {
        this.dateRelever = value;
    }

    /**
     * Obtient la valeur de la propri�t� solde.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSolde() {
        return solde;
    }

    /**
     * D�finit la valeur de la propri�t� solde.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSolde(Double value) {
        this.solde = value;
    }

    /**
     * Obtient la valeur de la propri�t� operations.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * D�finit la valeur de la propri�t� operations.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Obtient la valeur de la propri�t� rib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRib() {
        return rib;
    }

    /**
     * D�finit la valeur de la propri�t� rib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRib(String value) {
        this.rib = value;
    }

}
