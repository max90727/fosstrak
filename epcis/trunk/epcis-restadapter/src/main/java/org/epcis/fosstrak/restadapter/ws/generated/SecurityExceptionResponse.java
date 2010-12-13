package org.epcis.fosstrak.restadapter.ws.generated;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "SecurityException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class SecurityExceptionResponse
        extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SecurityException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SecurityExceptionResponse(String message, SecurityException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SecurityExceptionResponse(String message, SecurityException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ch.diuf.unifr.softeng.gen.SecurityException
     */
    public SecurityException getFaultInfo() {
        return faultInfo;
    }
}