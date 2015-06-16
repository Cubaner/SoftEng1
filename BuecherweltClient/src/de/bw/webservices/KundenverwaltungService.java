package de.bw.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2015-06-16T19:06:57.890+02:00
 * Generated source version: 2.7.13
 * 
 */
@WebServiceClient(name = "KundenverwaltungService", 
                  wsdlLocation = "http://localhost:8080/buecherwelt/Kundenverwaltung?wsdl",
                  targetNamespace = "http://webservices.bw.de/") 
public class KundenverwaltungService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservices.bw.de/", "KundenverwaltungService");
    public final static QName KundenverwaltungPort = new QName("http://webservices.bw.de/", "KundenverwaltungPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/buecherwelt/Kundenverwaltung?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(KundenverwaltungService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/buecherwelt/Kundenverwaltung?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public KundenverwaltungService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public KundenverwaltungService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KundenverwaltungService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public KundenverwaltungService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public KundenverwaltungService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public KundenverwaltungService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Kundenverwaltung
     */
    @WebEndpoint(name = "KundenverwaltungPort")
    public Kundenverwaltung getKundenverwaltungPort() {
        return super.getPort(KundenverwaltungPort, Kundenverwaltung.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Kundenverwaltung
     */
    @WebEndpoint(name = "KundenverwaltungPort")
    public Kundenverwaltung getKundenverwaltungPort(WebServiceFeature... features) {
        return super.getPort(KundenverwaltungPort, Kundenverwaltung.class, features);
    }

}
