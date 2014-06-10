/**
 * ManufactorServiceBean_AndryukhinNUServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.manufactor;

public class ManufactorServiceBean_AndryukhinNUServiceLocator extends org.apache.axis.client.Service implements org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNUService {

    public ManufactorServiceBean_AndryukhinNUServiceLocator() {
    }


    public ManufactorServiceBean_AndryukhinNUServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManufactorServiceBean_AndryukhinNUServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Manufactor
    private java.lang.String Manufactor_address = "http://localhost:8080/ManufactorServiceBean_AndryukhinNUService/ManufactorServiceBean_AndryukhinNU";

    public java.lang.String getManufactorAddress() {
        return Manufactor_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManufactorWSDDServiceName = "Manufactor";

    public java.lang.String getManufactorWSDDServiceName() {
        return ManufactorWSDDServiceName;
    }

    public void setManufactorWSDDServiceName(java.lang.String name) {
        ManufactorWSDDServiceName = name;
    }

    public org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNU getManufactor() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Manufactor_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManufactor(endpoint);
    }

    public org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNU getManufactor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.bm.service.manufactor.ManufactorBindingStub _stub = new org.bm.service.manufactor.ManufactorBindingStub(portAddress, this);
            _stub.setPortName(getManufactorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManufactorEndpointAddress(java.lang.String address) {
        Manufactor_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNU.class.isAssignableFrom(serviceEndpointInterface)) {
                org.bm.service.manufactor.ManufactorBindingStub _stub = new org.bm.service.manufactor.ManufactorBindingStub(new java.net.URL(Manufactor_address), this);
                _stub.setPortName(getManufactorWSDDServiceName());
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
        if ("Manufactor".equals(inputPortName)) {
            return getManufactor();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://manufactor.org", "ManufactorServiceBean_AndryukhinNUService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://manufactor.org", "Manufactor"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Manufactor".equals(portName)) {
            setManufactorEndpointAddress(address);
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
