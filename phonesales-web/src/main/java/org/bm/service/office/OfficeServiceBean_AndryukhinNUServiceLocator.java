/**
 * OfficeServiceBean_AndryukhinNUServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.office;

public class OfficeServiceBean_AndryukhinNUServiceLocator extends org.apache.axis.client.Service implements org.bm.service.office.OfficeServiceBean_AndryukhinNUService {

    public OfficeServiceBean_AndryukhinNUServiceLocator() {
    }


    public OfficeServiceBean_AndryukhinNUServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OfficeServiceBean_AndryukhinNUServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Office
    private java.lang.String Office_address = "http://localhost:8080/OfficeServiceBean_AndryukhinNUService/OfficeServiceBean_AndryukhinNU";

    public java.lang.String getOfficeAddress() {
        return Office_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OfficeWSDDServiceName = "Office";

    public java.lang.String getOfficeWSDDServiceName() {
        return OfficeWSDDServiceName;
    }

    public void setOfficeWSDDServiceName(java.lang.String name) {
        OfficeWSDDServiceName = name;
    }

    public org.bm.service.office.OfficeServiceBean_AndryukhinNU getOffice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Office_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOffice(endpoint);
    }

    public org.bm.service.office.OfficeServiceBean_AndryukhinNU getOffice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.bm.service.office.OfficeBindingStub _stub = new org.bm.service.office.OfficeBindingStub(portAddress, this);
            _stub.setPortName(getOfficeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOfficeEndpointAddress(java.lang.String address) {
        Office_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.bm.service.office.OfficeServiceBean_AndryukhinNU.class.isAssignableFrom(serviceEndpointInterface)) {
                org.bm.service.office.OfficeBindingStub _stub = new org.bm.service.office.OfficeBindingStub(new java.net.URL(Office_address), this);
                _stub.setPortName(getOfficeWSDDServiceName());
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
        if ("Office".equals(inputPortName)) {
            return getOffice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://office.org", "OfficeServiceBean_AndryukhinNUService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://office.org", "Office"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Office".equals(portName)) {
            setOfficeEndpointAddress(address);
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
