package de.bw.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2015-06-21T16:50:55.116+02:00
 * Generated source version: 2.7.13
 * 
 */
@WebService(targetNamespace = "http://webservices.bw.de/", name = "Ausleihverwaltung")
@XmlSeeAlso({ObjectFactory.class})
public interface Ausleihverwaltung {

    @RequestWrapper(localName = "anzahlVerringern", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AnzahlVerringern")
    @WebMethod
    @ResponseWrapper(localName = "anzahlVerringernResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AnzahlVerringernResponse")
    public void anzahlVerringern(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws BuecherweltException_Exception;

    @RequestWrapper(localName = "ausleiheLoeschen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AusleiheLoeschen")
    @WebMethod
    @ResponseWrapper(localName = "ausleiheLoeschenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AusleiheLoeschenResponse")
    public void ausleiheLoeschen(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws BuecherweltException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "neueAusleiheHinzufuegen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.NeueAusleiheHinzufuegen")
    @WebMethod
    @ResponseWrapper(localName = "neueAusleiheHinzufuegenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.NeueAusleiheHinzufuegenResponse")
    public de.bw.webservices.AusleiheTO neueAusleiheHinzufuegen(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2
    ) throws BuecherweltException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllAusleihen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.GetAllAusleihen")
    @WebMethod
    @ResponseWrapper(localName = "getAllAusleihenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.GetAllAusleihenResponse")
    public java.util.List<de.bw.webservices.AusleiheTO> getAllAusleihen();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "ausleiheSuchen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AusleiheSuchen")
    @WebMethod
    @ResponseWrapper(localName = "ausleiheSuchenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AusleiheSuchenResponse")
    public de.bw.webservices.AusleiheTO ausleiheSuchen(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @RequestWrapper(localName = "anzahlErhoehen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AnzahlErhoehen")
    @WebMethod
    @ResponseWrapper(localName = "anzahlErhoehenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.AnzahlErhoehenResponse")
    public void anzahlErhoehen(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws BuecherweltException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAusleihenByKundenId", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.GetAusleihenByKundenId")
    @WebMethod
    @ResponseWrapper(localName = "getAusleihenByKundenIdResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.GetAusleihenByKundenIdResponse")
    public java.util.List<de.bw.webservices.AusleiheTO> getAusleihenByKundenId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @RequestWrapper(localName = "leihfristVerlaengern", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.LeihfristVerlaengern")
    @WebMethod
    @ResponseWrapper(localName = "leihfristVerlaengernResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.LeihfristVerlaengernResponse")
    public void leihfristVerlaengern(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws BuecherweltException_Exception;
}
