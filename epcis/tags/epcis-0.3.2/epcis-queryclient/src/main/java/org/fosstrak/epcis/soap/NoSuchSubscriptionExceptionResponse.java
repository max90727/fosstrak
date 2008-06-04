package org.accada.epcis.soap;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF (incubator) 2.0.4-incubator Wed Jan 30
 * 15:43:44 CET 2008 Generated source version: 2.0.4-incubator
 */

@WebFault(name = "NoSuchSubscriptionException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class NoSuchSubscriptionExceptionResponse extends Exception {
    public static final long serialVersionUID = 20080130154344L;

    private org.accada.epcis.model.NoSuchSubscriptionException noSuchSubscriptionException;

    public NoSuchSubscriptionExceptionResponse() {
        super();
    }

    public NoSuchSubscriptionExceptionResponse(String message) {
        super(message);
    }

    public NoSuchSubscriptionExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchSubscriptionExceptionResponse(String message,
            org.accada.epcis.model.NoSuchSubscriptionException noSuchSubscriptionException) {
        super(message);
        this.noSuchSubscriptionException = noSuchSubscriptionException;
    }

    public NoSuchSubscriptionExceptionResponse(String message,
            org.accada.epcis.model.NoSuchSubscriptionException noSuchSubscriptionException, Throwable cause) {
        super(message, cause);
        this.noSuchSubscriptionException = noSuchSubscriptionException;
    }

    public org.accada.epcis.model.NoSuchSubscriptionException getFaultInfo() {
        return this.noSuchSubscriptionException;
    }
}
