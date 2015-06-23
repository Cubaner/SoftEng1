
package de.bw.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ausleiheTO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ausleiheTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buchId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kundenId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leihdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rueckgabedatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ausleiheTO", propOrder = {
    "buchId",
    "id",
    "kundenId",
    "leihdatum",
    "rueckgabedatum"
})
public class AusleiheTO {

    protected int buchId;
    protected int id;
    protected int kundenId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar leihdatum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rueckgabedatum;

    /**
     * Ruft den Wert der buchId-Eigenschaft ab.
     * 
     */
    public int getBuchId() {
        return buchId;
    }

    /**
     * Legt den Wert der buchId-Eigenschaft fest.
     * 
     */
    public void setBuchId(int value) {
        this.buchId = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der kundenId-Eigenschaft ab.
     * 
     */
    public int getKundenId() {
        return kundenId;
    }

    /**
     * Legt den Wert der kundenId-Eigenschaft fest.
     * 
     */
    public void setKundenId(int value) {
        this.kundenId = value;
    }

    /**
     * Ruft den Wert der leihdatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeihdatum() {
        return leihdatum;
    }

    /**
     * Legt den Wert der leihdatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeihdatum(XMLGregorianCalendar value) {
        this.leihdatum = value;
    }

    /**
     * Ruft den Wert der rueckgabedatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRueckgabedatum() {
        return rueckgabedatum;
    }

    /**
     * Legt den Wert der rueckgabedatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRueckgabedatum(XMLGregorianCalendar value) {
        this.rueckgabedatum = value;
    }

}
