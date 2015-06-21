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
 * 2015-06-19T20:47:53.006+02:00
 * Generated source version: 2.7.13
 * 
 */
@WebService(targetNamespace = "http://webservices.bw.de/", name = "Buchverwaltung")
@XmlSeeAlso({ObjectFactory.class})
public interface Buchverwaltung {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "neuesBuchHinzufuegen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.NeuesBuchHinzufuegen")
    @WebMethod
    @ResponseWrapper(localName = "neuesBuchHinzufuegenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.NeuesBuchHinzufuegenResponse")
    public de.bw.webservices.BuchTO neuesBuchHinzufuegen(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3
    ) throws BuecherweltException_Exception;

    @RequestWrapper(localName = "buchBearbeiten", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchBearbeiten")
    @WebMethod
    @ResponseWrapper(localName = "buchBearbeitenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchBearbeitenResponse")
    public void buchBearbeiten(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4
    ) throws BuecherweltException_Exception;

    @RequestWrapper(localName = "buchLoeschen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchLoeschen")
    @WebMethod
    @ResponseWrapper(localName = "buchLoeschenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchLoeschenResponse")
    public void buchLoeschen(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "buchSuchen", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchSuchen")
    @WebMethod
    @ResponseWrapper(localName = "buchSuchenResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchSuchenResponse")
    public de.bw.webservices.BuchTO buchSuchen(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllBuecher", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.GetAllBuecher")
    @WebMethod
    @ResponseWrapper(localName = "getAllBuecherResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.GetAllBuecherResponse")
    public java.util.List<de.bw.webservices.BuchTO> getAllBuecher();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "buchSuchenByName", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchSuchenByName")
    @WebMethod
    @ResponseWrapper(localName = "buchSuchenByNameResponse", targetNamespace = "http://webservices.bw.de/", className = "de.bw.webservices.BuchSuchenByNameResponse")
    public de.bw.webservices.BuchTO buchSuchenByName(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
