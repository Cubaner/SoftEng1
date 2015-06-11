
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

    private final static QName _Logout_QNAME = new QName("http://webservices.bw.de/", "logout");
    private final static QName _MitarbeiterLoeschenResponse_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterLoeschenResponse");
    private final static QName _NeuenMitarbeiterHinzufuegen_QNAME = new QName("http://webservices.bw.de/", "neuenMitarbeiterHinzufuegen");
    private final static QName _MitarbeiterSuchen_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterSuchen");
    private final static QName _LoginResponse_QNAME = new QName("http://webservices.bw.de/", "loginResponse");
    private final static QName _GetAllMitarbeiter_QNAME = new QName("http://webservices.bw.de/", "getAllMitarbeiter");
    private final static QName _MitarbeiterSuchenResponse_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterSuchenResponse");
    private final static QName _GetAllMitarbeiterResponse_QNAME = new QName("http://webservices.bw.de/", "getAllMitarbeiterResponse");
    private final static QName _BuecherweltException_QNAME = new QName("http://webservices.bw.de/", "BuecherweltException");
    private final static QName _Login_QNAME = new QName("http://webservices.bw.de/", "login");
    private final static QName _LogoutResponse_QNAME = new QName("http://webservices.bw.de/", "logoutResponse");
    private final static QName _MitarbeiterLoeschen_QNAME = new QName("http://webservices.bw.de/", "mitarbeiterLoeschen");
    private final static QName _NeuenMitarbeiterHinzufuegenResponse_QNAME = new QName("http://webservices.bw.de/", "neuenMitarbeiterHinzufuegenResponse");

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
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link MitarbeiterSuchen }
     * 
     */
    public MitarbeiterSuchen createMitarbeiterSuchen() {
        return new MitarbeiterSuchen();
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
     * Create an instance of {@link NeuenMitarbeiterHinzufuegenResponse }
     * 
     */
    public NeuenMitarbeiterHinzufuegenResponse createNeuenMitarbeiterHinzufuegenResponse() {
        return new NeuenMitarbeiterHinzufuegenResponse();
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
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
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
     * Create an instance of {@link UserLoginResponse }
     * 
     */
    public UserLoginResponse createUserLoginResponse() {
        return new UserLoginResponse();
    }

    /**
     * Create an instance of {@link Mitarbeiter }
     * 
     */
    public Mitarbeiter createMitarbeiter() {
        return new Mitarbeiter();
    }

    /**
     * Create an instance of {@link ReturncodeResponse }
     * 
     */
    public ReturncodeResponse createReturncodeResponse() {
        return new ReturncodeResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterLoeschenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterLoeschenResponse")
    public JAXBElement<MitarbeiterLoeschenResponse> createMitarbeiterLoeschenResponse(MitarbeiterLoeschenResponse value) {
        return new JAXBElement<MitarbeiterLoeschenResponse>(_MitarbeiterLoeschenResponse_QNAME, MitarbeiterLoeschenResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MitarbeiterSuchen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "mitarbeiterSuchen")
    public JAXBElement<MitarbeiterSuchen> createMitarbeiterSuchen(MitarbeiterSuchen value) {
        return new JAXBElement<MitarbeiterSuchen>(_MitarbeiterSuchen_QNAME, MitarbeiterSuchen.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMitarbeiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "getAllMitarbeiterResponse")
    public JAXBElement<GetAllMitarbeiterResponse> createGetAllMitarbeiterResponse(GetAllMitarbeiterResponse value) {
        return new JAXBElement<GetAllMitarbeiterResponse>(_GetAllMitarbeiterResponse_QNAME, GetAllMitarbeiterResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuenMitarbeiterHinzufuegenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bw.de/", name = "neuenMitarbeiterHinzufuegenResponse")
    public JAXBElement<NeuenMitarbeiterHinzufuegenResponse> createNeuenMitarbeiterHinzufuegenResponse(NeuenMitarbeiterHinzufuegenResponse value) {
        return new JAXBElement<NeuenMitarbeiterHinzufuegenResponse>(_NeuenMitarbeiterHinzufuegenResponse_QNAME, NeuenMitarbeiterHinzufuegenResponse.class, null, value);
    }

}