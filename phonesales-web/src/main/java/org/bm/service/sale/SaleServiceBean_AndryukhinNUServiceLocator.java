/**
 * SaleServiceBean_AndryukhinNUServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.sale;

public class SaleServiceBean_AndryukhinNUServiceLocator extends org.apache.axis.client.Service implements org.bm.service.sale.SaleServiceBean_AndryukhinNUService {

    public SaleServiceBean_AndryukhinNUServiceLocator() {
    }


    public SaleServiceBean_AndryukhinNUServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaleServiceBean_AndryukhinNUServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Sale
    private java.lang.String Sale_address = "http://localhost:8080/SaleServiceBean_AndryukhinNUService/SaleServiceBean_AndryukhinNU";

    public java.lang.String getSaleAddress() {
        return Sale_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaleWSDDServiceName = "Sale";

    public java.lang.String getSaleWSDDServiceName() {
        return SaleWSDDServiceName;
    }

    public void setSaleWSDDServiceName(java.lang.String name) {
        SaleWSDDServiceName = name;
    }

    public org.bm.service.sale.SaleServiceBean_AndryukhinNU getSale() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Sale_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSale(endpoint);
    }

    public org.bm.service.sale.SaleServiceBean_AndryukhinNU getSale(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.bm.service.sale.SaleBindingStub _stub = new org.bm.service.sale.SaleBindingStub(portAddress, this);
            _stub.setPortName(getSaleWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaleEndpointAddress(java.lang.String address) {
        Sale_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.bm.service.sale.SaleServiceBean_AndryukhinNU.class.isAssignableFrom(serviceEndpointInterface)) {
                org.bm.service.sale.SaleBindingStub _stub = new org.bm.service.sale.SaleBindingStub(new java.net.URL(Sale_address), this);
                _stub.setPortName(getSaleWSDDServiceName());
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
        if ("Sale".equals(inputPortName)) {
            return getSale();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sale.org", "SaleServiceBean_AndryukhinNUService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sale.org", "Sale"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Sale".equals(portName)) {
            setSaleEndpointAddress(address);
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
