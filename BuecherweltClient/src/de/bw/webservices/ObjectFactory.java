
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

    private final static QName _MitarbeiterLoeschenResponse_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterLoeschenResponse");
    private final static QName _MitarbeiterSuchen_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterSuchen");
    private final static QName _GetAllMitarbeiter_QNAME = new QName("http://webservices.bw.de/", "getAllMitarbeiter");
    private final static QName _MitarbeiterSuchenResponse_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterSuchenResponse");
    private final static QName _BuecherweltException_QNAME = new QName("http://webservices.bw.de/", "BuecherweltException");
    private final static QName _GetAllMitarbeiterResponse_QNAME = new QName("http://webservices.bw.de/", "getAllMitarbeiterResponse");
    private final static QName _MitarbeiterBearbeitenResponse_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterBearbeitenResponse");
    private final static QName _MitarbeiterBearbeiten_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterBearbeiten");
    private final static QName _MitarbeiterSuchenByBenutzername_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterSuchenByBenutzername");
    private final static QName _InvalidLoginException_QNAME = new QName("http://webservices.bw.de/", "InvalidLoginException");
    private final static QName _NeuenMitarbeiterHinzufuegenResponse_QNAME = new QName("http://webservices.bw.de/", "neuenMitarbeiterHinzufuegenResponse");
    private final static QName _Logout_QNAME = new QName("http://webservices.bw.de/", "logout");
    private final static QName _NeuenMitarbeiterHinzufuegen_QNAME = new QName("http://webservices.bw.de/", "neuenMitarbeiterHinzufuegen");
    private final static QName _LoginMitarbeiterResponse_QNAME = new QName("http://webservices.bw.de/", "loginMitarbeiterResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://webservices.bw.de/", "logoutResponse");
    private final static QName _MitarbeiterLoeschen_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterLoeschen");
    private final static QName _LoginMitarbeiter_QNAME = new QName("http://webservices.bw.de/", "loginMitarbeiter");
    private final static QName _MitarbeiterSuchenByBenutzernameResponse_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterSuchenByBenutzernameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.bw.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MitarbeiterLoeschenResponse }
     * 
     */
    public MitarbeiterLoeschenResponse createMitarbeiterLoeschenResponse() {
        return new MitarbeiterLoeschenResponse();
    }

    /**
     * Create an instance of {@link MitarbeiterSuchenResponse }
     * 
     */
    public MitarbeiterSuchenResponse createMitarbeiterSuchenResponse() {
        return new MitarbeiterSuchenResponse();
    }

    /**
     * Create an instance of {@link GetAllMitarbeiter }
     * 
     */
    public GetAllMitarbeiter createGetAllMitarbeiter() {
        return new GetAllMitarbeiter();
    }

    /**
     * Create an instance of {@link MitarbeiterSuchen }
     * 
     */
    public MitarbeiterSuchen createMitarbeiterSuchen() {
        return new MitarbeiterSuchen();
    }

    /**
     * Create an instance of {@link MitarbeiterBearbeiten }
     * 
     */
    public MitarbeiterBearbeiten createMitarbeiterBearbeiten() {
        return new MitarbeiterBearbeiten();
    }

    /**
     * Create an instance of {@link BuecherweltException }
     * 
     */
    public BuecherweltException createBuecherweltException() {
        return new BuecherweltException();
    }

    /**
     * Create an instance of {@link GetAllMitarbeiterResponse }
     * 
     */
    public GetAllMitarbeiterResponse createGetAllMitarbeiterResponse() {
        return new GetAllMitarbeiterResponse();
    }

    /**
     * Create an instance of {@link MitarbeiterBearbeitenResponse }
     * 
     */
    public MitarbeiterBearbeitenResponse createMitarbeiterBearbeitenResponse() {
        return new MitarbeiterBearbeitenResponse();
    }

    /**
     * Create an instance of {@link InvalidLoginException }
     * 
     */
    public InvalidLoginException createInvalidLoginException() {
        return new InvalidLoginException();
    }

    /**
     * Create an instance of {@link NeuenMitarbeiterHinzufuegenResponse }
     * 
     */
    public NeuenMitarbeiterHinzufuegenResponse createNeuenMitarbeiterHinzufuegenResponse() {
        return new NeuenMitarbeiterHinzufuegenResponse();
    }

    /**
     * Create an instance of {@link MitarbeiterSuchenByBenutzername }
     * 
     */
    public MitarbeiterSuchenByBenutzername createMitarbeiterSuchenByBenutzername() {
        return new MitarbeiterSuchenByBenutzername();
    }

    /**
     * Create an instance of {@link NeuenMitarbeiterHinzufuegen }
     * 
     */
    public NeuenMitarbeiterHinzufuegen createNeuenMitarbeiterHinzufuegen() {
        return new NeuenMitarbeiterHinzufuegen();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LoginMitarbeiterResponse }
     * 
     */
    public LoginMitarbeiterResponse createLoginMitarbeiterResponse() {
        return new LoginMitarbeiterResponse();
    }

    /**
     * Create an instance of {@link MitarbeiterSuchenByBenutzernameResponse }
     * 
     */
    public MitarbeiterSuchenByBenutzernameResponse createMitarbeiterSuchenByBenutzernameResponse() {
        return new MitarbeiterSuchenByBenutzernameResponse();
    }

    /**
     * Create an instance of {@link LoginMitarbeiter }
     * 
     */
    public LoginMitarbeiter createLoginMitarbeiter() {
        return new LoginMitarbeiter();
    }

    /**
     * Create an instance of {@link MitarbeiterLoeschen }
     * 
     */
    public MitarbeiterLoeschen createMitarbeiterLoeschen() {
        return new MitarbeiterLoeschen();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link SessionTO }
     * 
     */
    public SessionTO createSessionTO() {
        return new SessionTO();
    }

    /**
     * Create an instance of {@link MitarbeiterTO }
     * 
     */
    public MitarbeiterTO createMitarbeiterTO() {
        return new MitarbeiterTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterLoeschenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterLoeschenResponse")
    public JAXBElement<MitarbeiterLoeschenResponse> createMitarbeiterLoeschenResponse(MitarbeiterLoeschenResponse value) {
        return new JAXBElement<MitarbeiterLoeschenResponse>(_MitarbeiterLoeschenResponse_QNAME, MitarbeiterLoeschenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterSuchen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterSuchen")
    public JAXBElement<MitarbeiterSuchen> createMitarbeiterSuchen(MitarbeiterSuchen value) {
        return new JAXBElement<MitarbeiterSuchen>(_MitarbeiterSuchen_QNAME, MitarbeiterSuchen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMitarbeiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAllMitarbeiter")
    public JAXBElement<GetAllMitarbeiter> createGetAllMitarbeiter(GetAllMitarbeiter value) {
        return new JAXBElement<GetAllMitarbeiter>(_GetAllMitarbeiter_QNAME, GetAllMitarbeiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterSuchenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterSuchenResponse")
    public JAXBElement<MitarbeiterSuchenResponse> createMitarbeiterSuchenResponse(MitarbeiterSuchenResponse value) {
        return new JAXBElement<MitarbeiterSuchenResponse>(_MitarbeiterSuchenResponse_QNAME, MitarbeiterSuchenResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMitarbeiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAllMitarbeiterResponse")
    public JAXBElement<GetAllMitarbeiterResponse> createGetAllMitarbeiterResponse(GetAllMitarbeiterResponse value) {
        return new JAXBElement<GetAllMitarbeiterResponse>(_GetAllMitarbeiterResponse_QNAME, GetAllMitarbeiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterBearbeitenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterBearbeitenResponse")
    public JAXBElement<MitarbeiterBearbeitenResponse> createMitarbeiterBearbeitenResponse(MitarbeiterBearbeitenResponse value) {
        return new JAXBElement<MitarbeiterBearbeitenResponse>(_MitarbeiterBearbeitenResponse_QNAME, MitarbeiterBearbeitenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterBearbeiten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterBearbeiten")
    public JAXBElement<MitarbeiterBearbeiten> createMitarbeiterBearbeiten(MitarbeiterBearbeiten value) {
        return new JAXBElement<MitarbeiterBearbeiten>(_MitarbeiterBearbeiten_QNAME, MitarbeiterBearbeiten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterSuchenByBenutzername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterSuchenByBenutzername")
    public JAXBElement<MitarbeiterSuchenByBenutzername> createMitarbeiterSuchenByBenutzername(MitarbeiterSuchenByBenutzername value) {
        return new JAXBElement<MitarbeiterSuchenByBenutzername>(_MitarbeiterSuchenByBenutzername_QNAME, MitarbeiterSuchenByBenutzername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidLoginException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "InvalidLoginException")
    public JAXBElement<InvalidLoginException> createInvalidLoginException(InvalidLoginException value) {
        return new JAXBElement<InvalidLoginException>(_InvalidLoginException_QNAME, InvalidLoginException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuenMitarbeiterHinzufuegenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "neuenMitarbeiterHinzufuegenResponse")
    public JAXBElement<NeuenMitarbeiterHinzufuegenResponse> createNeuenMitarbeiterHinzufuegenResponse(NeuenMitarbeiterHinzufuegenResponse value) {
        return new JAXBElement<NeuenMitarbeiterHinzufuegenResponse>(_NeuenMitarbeiterHinzufuegenResponse_QNAME, NeuenMitarbeiterHinzufuegenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuenMitarbeiterHinzufuegen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "neuenMitarbeiterHinzufuegen")
    public JAXBElement<NeuenMitarbeiterHinzufuegen> createNeuenMitarbeiterHinzufuegen(NeuenMitarbeiterHinzufuegen value) {
        return new JAXBElement<NeuenMitarbeiterHinzufuegen>(_NeuenMitarbeiterHinzufuegen_QNAME, NeuenMitarbeiterHinzufuegen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginMitarbeiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "loginMitarbeiterResponse")
    public JAXBElement<LoginMitarbeiterResponse> createLoginMitarbeiterResponse(LoginMitarbeiterResponse value) {
        return new JAXBElement<LoginMitarbeiterResponse>(_LoginMitarbeiterResponse_QNAME, LoginMitarbeiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterLoeschen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterLoeschen")
    public JAXBElement<MitarbeiterLoeschen> createMitarbeiterLoeschen(MitarbeiterLoeschen value) {
        return new JAXBElement<MitarbeiterLoeschen>(_MitarbeiterLoeschen_QNAME, MitarbeiterLoeschen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginMitarbeiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "loginMitarbeiter")
    public JAXBElement<LoginMitarbeiter> createLoginMitarbeiter(LoginMitarbeiter value) {
        return new JAXBElement<LoginMitarbeiter>(_LoginMitarbeiter_QNAME, LoginMitarbeiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterSuchenByBenutzernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterSuchenByBenutzernameResponse")
    public JAXBElement<MitarbeiterSuchenByBenutzernameResponse> createMitarbeiterSuchenByBenutzernameResponse(MitarbeiterSuchenByBenutzernameResponse value) {
        return new JAXBElement<MitarbeiterSuchenByBenutzernameResponse>(_MitarbeiterSuchenByBenutzernameResponse_QNAME, MitarbeiterSuchenByBenutzernameResponse.class, null, value);
    }

}
