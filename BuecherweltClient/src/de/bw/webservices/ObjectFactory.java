
package de.bw.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.bw.webservices package. 
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

    private final static QName _GetAllBuecher_QNAME = new QName("http://webservices.bw.de/", "getAllBuecher");
    private final static QName _BuchBearbeitenResponse_QNAME = new QName("http://webservices.bw.de/", "buchBearbeitenResponse");
    private final static QName _BuchBearbeiten_QNAME = new QName("http://webservices.bw.de/", "buchBearbeiten");
    private final static QName _BuecherweltException_QNAME = new QName("http://webservices.bw.de/", "BuecherweltException");
    private final static QName _BuchSuchenByName_QNAME = new QName("http://webservices.bw.de/", "buchSuchenByName");
    private final static QName _BuchLoeschenResponse_QNAME = new QName("http://webservices.bw.de/", "buchLoeschenResponse");
    private final static QName _BuchSuchenResponse_QNAME = new QName("http://webservices.bw.de/", "buchSuchenResponse");
    private final static QName _NeuesBuchHinzufuegenResponse_QNAME = new QName("http://webservices.bw.de/", "neuesBuchHinzufuegenResponse");
    private final static QName _BuchSuchenByNameResponse_QNAME = new QName("http://webservices.bw.de/", "buchSuchenByNameResponse");
    private final static QName _BuchSuchen_QNAME = new QName("http://webservices.bw.de/", "buchSuchen");
    private final static QName _BuchLoeschen_QNAME = new QName("http://webservices.bw.de/", "buchLoeschen");
    private final static QName _NeuesBuchHinzufuegen_QNAME = new QName("http://webservices.bw.de/", "neuesBuchHinzufuegen");
    private final static QName _GetAllBuecherResponse_QNAME = new QName("http://webservices.bw.de/", "getAllBuecherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.bw.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuchSuchen }
     * 
     */
    public BuchSuchen createBuchSuchen() {
        return new BuchSuchen();
    }

    /**
     * Create an instance of {@link BuchSuchenByNameResponse }
     * 
     */
    public BuchSuchenByNameResponse createBuchSuchenByNameResponse() {
        return new BuchSuchenByNameResponse();
    }

    /**
     * Create an instance of {@link BuchBearbeitenResponse }
     * 
     */
    public BuchBearbeitenResponse createBuchBearbeitenResponse() {
        return new BuchBearbeitenResponse();
    }

    /**
     * Create an instance of {@link GetAllBuecher }
     * 
     */
    public GetAllBuecher createGetAllBuecher() {
        return new GetAllBuecher();
    }

    /**
     * Create an instance of {@link BuchBearbeiten }
     * 
     */
    public BuchBearbeiten createBuchBearbeiten() {
        return new BuchBearbeiten();
    }

    /**
     * Create an instance of {@link BuchLoeschen }
     * 
     */
    public BuchLoeschen createBuchLoeschen() {
        return new BuchLoeschen();
    }

    /**
     * Create an instance of {@link BuchSuchenByName }
     * 
     */
    public BuchSuchenByName createBuchSuchenByName() {
        return new BuchSuchenByName();
    }

    /**
     * Create an instance of {@link BuchLoeschenResponse }
     * 
     */
    public BuchLoeschenResponse createBuchLoeschenResponse() {
        return new BuchLoeschenResponse();
    }

    /**
     * Create an instance of {@link BuecherweltException }
     * 
     */
    public BuecherweltException createBuecherweltException() {
        return new BuecherweltException();
    }

    /**
     * Create an instance of {@link NeuesBuchHinzufuegenResponse }
     * 
     */
    public NeuesBuchHinzufuegenResponse createNeuesBuchHinzufuegenResponse() {
        return new NeuesBuchHinzufuegenResponse();
    }

    /**
     * Create an instance of {@link GetAllBuecherResponse }
     * 
     */
    public GetAllBuecherResponse createGetAllBuecherResponse() {
        return new GetAllBuecherResponse();
    }

    /**
     * Create an instance of {@link NeuesBuchHinzufuegen }
     * 
     */
    public NeuesBuchHinzufuegen createNeuesBuchHinzufuegen() {
        return new NeuesBuchHinzufuegen();
    }

    /**
     * Create an instance of {@link BuchSuchenResponse }
     * 
     */
    public BuchSuchenResponse createBuchSuchenResponse() {
        return new BuchSuchenResponse();
    }

    /**
     * Create an instance of {@link BuchTO }
     * 
     */
    public BuchTO createBuchTO() {
        return new BuchTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBuecher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAllBuecher")
    public JAXBElement<GetAllBuecher> createGetAllBuecher(GetAllBuecher value) {
        return new JAXBElement<GetAllBuecher>(_GetAllBuecher_QNAME, GetAllBuecher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchBearbeitenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchBearbeitenResponse")
    public JAXBElement<BuchBearbeitenResponse> createBuchBearbeitenResponse(BuchBearbeitenResponse value) {
        return new JAXBElement<BuchBearbeitenResponse>(_BuchBearbeitenResponse_QNAME, BuchBearbeitenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchBearbeiten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchBearbeiten")
    public JAXBElement<BuchBearbeiten> createBuchBearbeiten(BuchBearbeiten value) {
        return new JAXBElement<BuchBearbeiten>(_BuchBearbeiten_QNAME, BuchBearbeiten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuecherweltException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "BuecherweltException")
    public JAXBElement<BuecherweltException> createBuecherweltException(BuecherweltException value) {
        return new JAXBElement<BuecherweltException>(_BuecherweltException_QNAME, BuecherweltException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchSuchenByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchSuchenByName")
    public JAXBElement<BuchSuchenByName> createBuchSuchenByName(BuchSuchenByName value) {
        return new JAXBElement<BuchSuchenByName>(_BuchSuchenByName_QNAME, BuchSuchenByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchLoeschenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchLoeschenResponse")
    public JAXBElement<BuchLoeschenResponse> createBuchLoeschenResponse(BuchLoeschenResponse value) {
        return new JAXBElement<BuchLoeschenResponse>(_BuchLoeschenResponse_QNAME, BuchLoeschenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchSuchenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchSuchenResponse")
    public JAXBElement<BuchSuchenResponse> createBuchSuchenResponse(BuchSuchenResponse value) {
        return new JAXBElement<BuchSuchenResponse>(_BuchSuchenResponse_QNAME, BuchSuchenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuesBuchHinzufuegenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "neuesBuchHinzufuegenResponse")
    public JAXBElement<NeuesBuchHinzufuegenResponse> createNeuesBuchHinzufuegenResponse(NeuesBuchHinzufuegenResponse value) {
        return new JAXBElement<NeuesBuchHinzufuegenResponse>(_NeuesBuchHinzufuegenResponse_QNAME, NeuesBuchHinzufuegenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchSuchenByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchSuchenByNameResponse")
    public JAXBElement<BuchSuchenByNameResponse> createBuchSuchenByNameResponse(BuchSuchenByNameResponse value) {
        return new JAXBElement<BuchSuchenByNameResponse>(_BuchSuchenByNameResponse_QNAME, BuchSuchenByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchSuchen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchSuchen")
    public JAXBElement<BuchSuchen> createBuchSuchen(BuchSuchen value) {
        return new JAXBElement<BuchSuchen>(_BuchSuchen_QNAME, BuchSuchen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuchLoeschen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "buchLoeschen")
    public JAXBElement<BuchLoeschen> createBuchLoeschen(BuchLoeschen value) {
        return new JAXBElement<BuchLoeschen>(_BuchLoeschen_QNAME, BuchLoeschen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuesBuchHinzufuegen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "neuesBuchHinzufuegen")
    public JAXBElement<NeuesBuchHinzufuegen> createNeuesBuchHinzufuegen(NeuesBuchHinzufuegen value) {
        return new JAXBElement<NeuesBuchHinzufuegen>(_NeuesBuchHinzufuegen_QNAME, NeuesBuchHinzufuegen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBuecherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAllBuecherResponse")
    public JAXBElement<GetAllBuecherResponse> createGetAllBuecherResponse(GetAllBuecherResponse value) {
        return new JAXBElement<GetAllBuecherResponse>(_GetAllBuecherResponse_QNAME, GetAllBuecherResponse.class, null, value);
    }

}
