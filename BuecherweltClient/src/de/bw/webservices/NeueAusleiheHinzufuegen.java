
package de.bw.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für neueAusleiheHinzufuegen complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="neueAusleiheHinzufuegen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://webservices.bw.de/}kunde" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://webservices.bw.de/}buch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "neueAusleiheHinzufuegen", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class NeueAusleiheHinzufuegen {

    protected int arg0;
    protected Kunde arg1;
    protected Buch arg2;

    /**
     * Ruft den Wert der arg0-Eigenschaft ab.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Legt den Wert der arg0-Eigenschaft fest.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Ruft den Wert der arg1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Kunde }
     *     
     */
    public Kunde getArg1() {
        return arg1;
    }

    /**
     * Legt den Wert der arg1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Kunde }
     *     
     */
    public void setArg1(Kunde value) {
        this.arg1 = value;
    }

    /**
     * Ruft den Wert der arg2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Buch }
     *     
     */
    public Buch getArg2() {
        return arg2;
    }

    /**
     * Legt den Wert der arg2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Buch }
     *     
     */
    public void setArg2(Buch value) {
        this.arg2 = value;
    }

}
