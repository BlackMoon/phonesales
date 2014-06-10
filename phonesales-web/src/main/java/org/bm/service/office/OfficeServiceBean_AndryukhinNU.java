/**
 * OfficeServiceBean_AndryukhinNU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.office;

public interface OfficeServiceBean_AndryukhinNU extends java.rmi.Remote {
    public org.bm.service.office.OfficeAndryukhinNU[] getAllOffices() throws java.rmi.RemoteException;
    public org.bm.service.office.OfficeAndryukhinNU getOffice(int arg0) throws java.rmi.RemoteException;
    public int addOffice(org.bm.service.office.OfficeAndryukhinNU arg0) throws java.rmi.RemoteException;
    public void updateOffice(org.bm.service.office.OfficeAndryukhinNU arg0) throws java.rmi.RemoteException;
    public void deleteOffice(int arg0) throws java.rmi.RemoteException;
    public int getNewOfficeId() throws java.rmi.RemoteException;
}
