/**
 * CMU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.westchase.ws.cmu;

public interface CMU extends javax.xml.rpc.Service {
    public java.lang.String getCMUPortAddress();

    public com.westchase.ws.cmu.CMUPortType getCMUPort() throws javax.xml.rpc.ServiceException;

    public com.westchase.ws.cmu.CMUPortType getCMUPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
