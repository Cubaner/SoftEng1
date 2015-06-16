
package de.bw.webservices;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.13
 * 2015-06-16T19:07:12.787+02:00
 * Generated source version: 2.7.13
 */

@WebFault(name = "BuecherweltException", targetNamespace = "http://webservices.bw.de/")
public class BuecherweltException_Exception extends Exception {
    
    private de.bw.webservices.BuecherweltException buecherweltException;

    public BuecherweltException_Exception() {
        super();
    }
    
    public BuecherweltException_Exception(String message) {
        super(message);
    }
    
    public BuecherweltException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public BuecherweltException_Exception(String message, de.bw.webservices.BuecherweltException buecherweltException) {
        super(message);
        this.buecherweltException = buecherweltException;
    }

    public BuecherweltException_Exception(String message, de.bw.webservices.BuecherweltException buecherweltException, Throwable cause) {
        super(message, cause);
        this.buecherweltException = buecherweltException;
    }

    public de.bw.webservices.BuecherweltException getFaultInfo() {
        return this.buecherweltException;
    }
}
