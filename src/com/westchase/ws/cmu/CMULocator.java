/**
 * CMULocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.westchase.ws.cmu;

public class CMULocator extends org.apache.axis.client.Service implements com.westchase.ws.cmu.CMU {

    public CMULocator() {
    }


    public CMULocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CMULocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CMUPort
    private java.lang.String CMUPort_address = "http://www.westchasedistrict.com/app/cmu/ws/cmu.php";

    public java.lang.String getCMUPortAddress() {
        return CMUPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CMUPortWSDDServiceName = "CMUPort";

    public java.lang.String getCMUPortWSDDServiceName() {
        return CMUPortWSDDServiceName;
    }

    public void setCMUPortWSDDServiceName(java.lang.String name) {
        CMUPortWSDDServiceName = name;
    }

    public com.westchase.ws.cmu.CMUPortType getCMUPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CMUPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCMUPort(endpoint);
    }

    public com.westchase.ws.cmu.CMUPortType getCMUPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.westchase.ws.cmu.CMUBindingStub _stub = new com.westchase.ws.cmu.CMUBindingStub(portAddress, this);
            _stub.setPortName(getCMUPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCMUPortEndpointAddress(java.lang.String address) {
        CMUPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.westchase.ws.cmu.CMUPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.westchase.ws.cmu.CMUBindingStub _stub = new com.westchase.ws.cmu.CMUBindingStub(new java.net.URL(CMUPort_address), this);
                _stub.setPortName(getCMUPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CMUPort".equals(inputPortName)) {
            return getCMUPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:cmu", "CMU");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:cmu", "CMUPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CMUPort".equals(portName)) {
            setCMUPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
