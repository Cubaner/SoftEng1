
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
    private final static QName _GetAllBuecher_QNAME = new QName("http://webservices.bw.de/", "getAllBuecher");
    private final static QName _BuchBearbeitenResponse_QNAME = new QName("http://webservices.bw.de/", "buchBearbeitenResponse");
    private final static QName _AnzahlErhoehenResponse_QNAME = new QName("http://webservices.bw.de/", "anzahlErhoehenResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://webservices.bw.de/", "loginResponse");
    private final static QName _BuchBearbeiten_QNAME = new QName("http://webservices.bw.de/", "buchBearbeiten");
    private final static QName _BuecherweltException_QNAME = new QName("http://webservices.bw.de/", "BuecherweltException");
    private final static QName _AnzahlVerringern_QNAME = new QName("http://webservices.bw.de/", "anzahlVerringern");
    private final static QName _BuchLoeschenResponse_QNAME = new QName("http://webservices.bw.de/", "buchLoeschenResponse");
    private final static QName _BuchSuchenResponse_QNAME = new QName("http://webservices.bw.de/", "buchSuchenResponse");
    private final static QName _NeuesBuchHinzufuegenResponse_QNAME = new QName("http://webservices.bw.de/", "neuesBuchHinzufuegenResponse");
    private final static QName _Logout_QNAME = new QName("http://webservices.bw.de/", "logout");
    private final static QName _BuchSuchen_QNAME = new QName("http://webservices.bw.de/", "buchSuchen");
    private final static QName _BuchLoeschen_QNAME = new QName("http://webservices.bw.de/", "buchLoeschen");
    private final static QName _Login_QNAME = new QName("http://webservices.bw.de/", "login");
    private final static QName _GetBuchMitIdEins_QNAME = new QName("http://webservices.bw.de/", "getBuchMitIdEins");
    private final static QName _LogoutResponse_QNAME = new QName("http://webservices.bw.de/", "logoutResponse");
    private final static QName _NeuesBuchHinzufuegen_QNAME = new QName("http://webservices.bw.de/", "neuesBuchHinzufuegen");
    private final static QName _GetAllBuecherResponse_QNAME = new QName("http://webservices.bw.de/", "getAllBuecherResponse");
    private final static QName _GetBuchMitIdEinsResponse_QNAME = new QName("http://webservices.bw.de/", "getBuchMitIdEinsResponse");

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
     * Create an instance of {@link BuchBearbeitenResponse }
     * 
     */
    public BuchBearbeitenResponse createBuchBearbeitenResponse() {
        return new BuchBearbeitenResponse();
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
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link BuchLoeschenResponse }
     * 
     */
    public BuchLoeschenResponse createBuchLoeschenResponse() {
        return new BuchLoeschenResponse();
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
     * Create an instance of {@link NeuesBuchHinzufuegenResponse }
     * 
     */
    public NeuesBuchHinzufuegenResponse createNeuesBuchHinzufuegenResponse() {
        return new NeuesBuchHinzufuegenResponse();
    }

    /**
     * Create an instance of {@link BuchSuchenResponse }
     * 
     */
    public BuchSuchenResponse createBuchSuchenResponse() {
        return new BuchSuchenResponse();
    }

    /**
     * Create an instance of {@link BuchSuchen }
     * 
     */
    public BuchSuchen createBuchSuchen() {
        return new BuchSuchen();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link BuchLoeschen }
     * 
     */
    public BuchLoeschen createBuchLoeschen() {
        return new BuchLoeschen();
    }

    /**
     * Create an instance of {@link GetBuchMitIdEins }
     * 
     */
    public GetBuchMitIdEins createGetBuchMitIdEins() {
        return new GetBuchMitIdEins();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetBuchMitIdEinsResponse }
     * 
     */
    public GetBuchMitIdEinsResponse createGetBuchMitIdEinsResponse() {
        return new GetBuchMitIdEinsResponse();
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
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link UserLoginResponse }
     * 
     */
    public UserLoginResponse createUserLoginResponse() {
        return new UserLoginResponse();
    }

    /**
     * Create an instance of {@link ReturncodeResponse }
     * 
     */
    public ReturncodeResponse createReturncodeResponse() {
        return new ReturncodeResponse();
    }

    /**
     * Create an instance of {@link Buch }
     * 
     */
    public Buch createBuch() {
        return new Buch();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AnzahlErhoehenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "anzahlErhoehenResponse")
    public JAXBElement<AnzahlErhoehenResponse> createAnzahlErhoehenResponse(AnzahlErhoehenResponse value) {
        return new JAXBElement<AnzahlErhoehenResponse>(_AnzahlErhoehenResponse_QNAME, AnzahlErhoehenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AnzahlVerringern }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "anzahlVerringern")
    public JAXBElement<AnzahlVerringern> createAnzahlVerringern(AnzahlVerringern value) {
        return new JAXBElement<AnzahlVerringern>(_AnzahlVerringern_QNAME, AnzahlVerringern.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuchMitIdEins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getBuchMitIdEins")
    public JAXBElement<GetBuchMitIdEins> createGetBuchMitIdEins(GetBuchMitIdEins value) {
        return new JAXBElement<GetBuchMitIdEins>(_GetBuchMitIdEins_QNAME, GetBuchMitIdEins.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuchMitIdEinsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getBuchMitIdEinsResponse")
    public JAXBElement<GetBuchMitIdEinsResponse> createGetBuchMitIdEinsResponse(GetBuchMitIdEinsResponse value) {
        return new JAXBElement<GetBuchMitIdEinsResponse>(_GetBuchMitIdEinsResponse_QNAME, GetBuchMitIdEinsResponse.class, null, value);
    }

}
