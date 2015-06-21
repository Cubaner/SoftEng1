
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

    private final static QName _AnzahlErhoehen_QNAME = new QName("http://webservices.bw.de/", "anzahlErhoehen");
    private final static QName _AnzahlVerringernResponse_QNAME = new QName("http://webservices.bw.de/", "anzahlVerringernResponse");
    private final static QName _AnzahlErhoehenResponse_QNAME = new QName("http://webservices.bw.de/", "anzahlErhoehenResponse");
    private final static QName _AusleiheLoeschen_QNAME = new QName("http://webservices.bw.de/", "ausleiheLoeschen");
    private final static QName _BuecherweltException_QNAME = new QName("http://webservices.bw.de/", "BuecherweltException");
    private final static QName _AusleiheSuchenResponse_QNAME = new QName("http://webservices.bw.de/", "ausleiheSuchenResponse");
    private final static QName _NeueAusleiheHinzufuegen_QNAME = new QName("http://webservices.bw.de/", "neueAusleiheHinzufuegen");
    private final static QName _AnzahlVerringern_QNAME = new QName("http://webservices.bw.de/", "anzahlVerringern");
    private final static QName _AusleiheSuchen_QNAME = new QName("http://webservices.bw.de/", "ausleiheSuchen");
    private final static QName _GetAllAusleihen_QNAME = new QName("http://webservices.bw.de/", "getAllAusleihen");
    private final static QName _GetAusleihenByKundenId_QNAME = new QName("http://webservices.bw.de/", "getAusleihenByKundenId");
    private final static QName _LeihfristVerlaengern_QNAME = new QName("http://webservices.bw.de/", "leihfristVerlaengern");
    private final static QName _AusleiheLoeschenResponse_QNAME = new QName("http://webservices.bw.de/", "ausleiheLoeschenResponse");
    private final static QName _GetAllAusleihenResponse_QNAME = new QName("http://webservices.bw.de/", "getAllAusleihenResponse");
    private final static QName _LeihfristVerlaengernResponse_QNAME = new QName("http://webservices.bw.de/", "leihfristVerlaengernResponse");
    private final static QName _GetAusleihenByKundenIdResponse_QNAME = new QName("http://webservices.bw.de/", "getAusleihenByKundenIdResponse");
    private final static QName _NeueAusleiheHinzufuegenResponse_QNAME = new QName("http://webservices.bw.de/", "neueAusleiheHinzufuegenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.bw.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnzahlErhoehenResponse }
     * 
     */
    public AnzahlErhoehenResponse createAnzahlErhoehenResponse() {
        return new AnzahlErhoehenResponse();
    }

    /**
     * Create an instance of {@link AusleiheLoeschen }
     * 
     */
    public AusleiheLoeschen createAusleiheLoeschen() {
        return new AusleiheLoeschen();
    }

    /**
     * Create an instance of {@link AnzahlErhoehen }
     * 
     */
    public AnzahlErhoehen createAnzahlErhoehen() {
        return new AnzahlErhoehen();
    }

    /**
     * Create an instance of {@link AnzahlVerringernResponse }
     * 
     */
    public AnzahlVerringernResponse createAnzahlVerringernResponse() {
        return new AnzahlVerringernResponse();
    }

    /**
     * Create an instance of {@link AusleiheSuchen }
     * 
     */
    public AusleiheSuchen createAusleiheSuchen() {
        return new AusleiheSuchen();
    }

    /**
     * Create an instance of {@link NeueAusleiheHinzufuegen }
     * 
     */
    public NeueAusleiheHinzufuegen createNeueAusleiheHinzufuegen() {
        return new NeueAusleiheHinzufuegen();
    }

    /**
     * Create an instance of {@link AnzahlVerringern }
     * 
     */
    public AnzahlVerringern createAnzahlVerringern() {
        return new AnzahlVerringern();
    }

    /**
     * Create an instance of {@link BuecherweltException }
     * 
     */
    public BuecherweltException createBuecherweltException() {
        return new BuecherweltException();
    }

    /**
     * Create an instance of {@link AusleiheSuchenResponse }
     * 
     */
    public AusleiheSuchenResponse createAusleiheSuchenResponse() {
        return new AusleiheSuchenResponse();
    }

    /**
     * Create an instance of {@link LeihfristVerlaengern }
     * 
     */
    public LeihfristVerlaengern createLeihfristVerlaengern() {
        return new LeihfristVerlaengern();
    }

    /**
     * Create an instance of {@link AusleiheLoeschenResponse }
     * 
     */
    public AusleiheLoeschenResponse createAusleiheLoeschenResponse() {
        return new AusleiheLoeschenResponse();
    }

    /**
     * Create an instance of {@link GetAusleihenByKundenId }
     * 
     */
    public GetAusleihenByKundenId createGetAusleihenByKundenId() {
        return new GetAusleihenByKundenId();
    }

    /**
     * Create an instance of {@link GetAllAusleihen }
     * 
     */
    public GetAllAusleihen createGetAllAusleihen() {
        return new GetAllAusleihen();
    }

    /**
     * Create an instance of {@link LeihfristVerlaengernResponse }
     * 
     */
    public LeihfristVerlaengernResponse createLeihfristVerlaengernResponse() {
        return new LeihfristVerlaengernResponse();
    }

    /**
     * Create an instance of {@link GetAllAusleihenResponse }
     * 
     */
    public GetAllAusleihenResponse createGetAllAusleihenResponse() {
        return new GetAllAusleihenResponse();
    }

    /**
     * Create an instance of {@link NeueAusleiheHinzufuegenResponse }
     * 
     */
    public NeueAusleiheHinzufuegenResponse createNeueAusleiheHinzufuegenResponse() {
        return new NeueAusleiheHinzufuegenResponse();
    }

    /**
     * Create an instance of {@link GetAusleihenByKundenIdResponse }
     * 
     */
    public GetAusleihenByKundenIdResponse createGetAusleihenByKundenIdResponse() {
        return new GetAusleihenByKundenIdResponse();
    }

    /**
     * Create an instance of {@link AusleiheTO }
     * 
     */
    public AusleiheTO createAusleiheTO() {
        return new AusleiheTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnzahlErhoehen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "anzahlErhoehen")
    public JAXBElement<AnzahlErhoehen> createAnzahlErhoehen(AnzahlErhoehen value) {
        return new JAXBElement<AnzahlErhoehen>(_AnzahlErhoehen_QNAME, AnzahlErhoehen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnzahlVerringernResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "anzahlVerringernResponse")
    public JAXBElement<AnzahlVerringernResponse> createAnzahlVerringernResponse(AnzahlVerringernResponse value) {
        return new JAXBElement<AnzahlVerringernResponse>(_AnzahlVerringernResponse_QNAME, AnzahlVerringernResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnzahlErhoehenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "anzahlErhoehenResponse")
    public JAXBElement<AnzahlErhoehenResponse> createAnzahlErhoehenResponse(AnzahlErhoehenResponse value) {
        return new JAXBElement<AnzahlErhoehenResponse>(_AnzahlErhoehenResponse_QNAME, AnzahlErhoehenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AusleiheLoeschen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "ausleiheLoeschen")
    public JAXBElement<AusleiheLoeschen> createAusleiheLoeschen(AusleiheLoeschen value) {
        return new JAXBElement<AusleiheLoeschen>(_AusleiheLoeschen_QNAME, AusleiheLoeschen.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AusleiheSuchenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "ausleiheSuchenResponse")
    public JAXBElement<AusleiheSuchenResponse> createAusleiheSuchenResponse(AusleiheSuchenResponse value) {
        return new JAXBElement<AusleiheSuchenResponse>(_AusleiheSuchenResponse_QNAME, AusleiheSuchenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeueAusleiheHinzufuegen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "neueAusleiheHinzufuegen")
    public JAXBElement<NeueAusleiheHinzufuegen> createNeueAusleiheHinzufuegen(NeueAusleiheHinzufuegen value) {
        return new JAXBElement<NeueAusleiheHinzufuegen>(_NeueAusleiheHinzufuegen_QNAME, NeueAusleiheHinzufuegen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnzahlVerringern }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "anzahlVerringern")
    public JAXBElement<AnzahlVerringern> createAnzahlVerringern(AnzahlVerringern value) {
        return new JAXBElement<AnzahlVerringern>(_AnzahlVerringern_QNAME, AnzahlVerringern.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AusleiheSuchen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "ausleiheSuchen")
    public JAXBElement<AusleiheSuchen> createAusleiheSuchen(AusleiheSuchen value) {
        return new JAXBElement<AusleiheSuchen>(_AusleiheSuchen_QNAME, AusleiheSuchen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAusleihen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAllAusleihen")
    public JAXBElement<GetAllAusleihen> createGetAllAusleihen(GetAllAusleihen value) {
        return new JAXBElement<GetAllAusleihen>(_GetAllAusleihen_QNAME, GetAllAusleihen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAusleihenByKundenId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAusleihenByKundenId")
    public JAXBElement<GetAusleihenByKundenId> createGetAusleihenByKundenId(GetAusleihenByKundenId value) {
        return new JAXBElement<GetAusleihenByKundenId>(_GetAusleihenByKundenId_QNAME, GetAusleihenByKundenId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeihfristVerlaengern }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "leihfristVerlaengern")
    public JAXBElement<LeihfristVerlaengern> createLeihfristVerlaengern(LeihfristVerlaengern value) {
        return new JAXBElement<LeihfristVerlaengern>(_LeihfristVerlaengern_QNAME, LeihfristVerlaengern.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AusleiheLoeschenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "ausleiheLoeschenResponse")
    public JAXBElement<AusleiheLoeschenResponse> createAusleiheLoeschenResponse(AusleiheLoeschenResponse value) {
        return new JAXBElement<AusleiheLoeschenResponse>(_AusleiheLoeschenResponse_QNAME, AusleiheLoeschenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAusleihenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAllAusleihenResponse")
    public JAXBElement<GetAllAusleihenResponse> createGetAllAusleihenResponse(GetAllAusleihenResponse value) {
        return new JAXBElement<GetAllAusleihenResponse>(_GetAllAusleihenResponse_QNAME, GetAllAusleihenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeihfristVerlaengernResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "leihfristVerlaengernResponse")
    public JAXBElement<LeihfristVerlaengernResponse> createLeihfristVerlaengernResponse(LeihfristVerlaengernResponse value) {
        return new JAXBElement<LeihfristVerlaengernResponse>(_LeihfristVerlaengernResponse_QNAME, LeihfristVerlaengernResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAusleihenByKundenIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAusleihenByKundenIdResponse")
    public JAXBElement<GetAusleihenByKundenIdResponse> createGetAusleihenByKundenIdResponse(GetAusleihenByKundenIdResponse value) {
        return new JAXBElement<GetAusleihenByKundenIdResponse>(_GetAusleihenByKundenIdResponse_QNAME, GetAusleihenByKundenIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeueAusleiheHinzufuegenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "neueAusleiheHinzufuegenResponse")
    public JAXBElement<NeueAusleiheHinzufuegenResponse> createNeueAusleiheHinzufuegenResponse(NeueAusleiheHinzufuegenResponse value) {
        return new JAXBElement<NeueAusleiheHinzufuegenResponse>(_NeueAusleiheHinzufuegenResponse_QNAME, NeueAusleiheHinzufuegenResponse.class, null, value);
    }

}
