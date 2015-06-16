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
 * 2015-06-16T19:06:25.724+02:00
 * Generated source version: 2.7.13
 * 
 */
@WebServiceClient(name = "AusleihverwaltungService", 
                  wsdlLocation = "http://localhost:8080/buecherwelt/Ausleihverwaltung?wsdl",
                  targetNamespace = "http://webservices.bw.de/") 
public class AusleihverwaltungService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservices.bw.de/", "AusleihverwaltungService");
    public final static QName AusleihverwaltungPort = new QName("http://webservices.bw.de/", "AusleihverwaltungPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/buecherwelt/Ausleihverwaltung?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AusleihverwaltungService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/buecherwelt/Ausleihverwaltung?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AusleihverwaltungService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AusleihverwaltungService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AusleihverwaltungService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AusleihverwaltungService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AusleihverwaltungService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AusleihverwaltungService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Ausleihverwaltung
     */
    @WebEndpoint(name = "AusleihverwaltungPort")
    public Ausleihverwaltung getAusleihverwaltungPort() {
        return super.getPort(AusleihverwaltungPort, Ausleihverwaltung.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Ausleihverwaltung
     */
    @WebEndpoint(name = "AusleihverwaltungPort")
    public Ausleihverwaltung getAusleihverwaltungPort(WebServiceFeature... features) {
        return super.getPort(AusleihverwaltungPort, Ausleihverwaltung.class, features);
    }

}
