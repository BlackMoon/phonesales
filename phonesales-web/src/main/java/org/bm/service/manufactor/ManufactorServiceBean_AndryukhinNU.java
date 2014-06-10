/**
 * ManufactorServiceBean_AndryukhinNU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.manufactor;

public interface ManufactorServiceBean_AndryukhinNU extends java.rmi.Remote {
    public org.bm.service.manufactor.ManufactorAndryukhinNU[] getAllManufactors() throws java.rmi.RemoteException;
    public int getNewManufactorId() throws java.rmi.RemoteException;
    public void deleteManufactor(int arg0) throws java.rmi.RemoteException;
    public void updateManufactor(org.bm.service.manufactor.ManufactorAndryukhinNU arg0) throws java.rmi.RemoteException;
    public org.bm.service.manufactor.ManufactorAndryukhinNU getManufactor(int arg0) throws java.rmi.RemoteException;
    public int addManufactor(org.bm.service.manufactor.ManufactorAndryukhinNU arg0) throws java.rmi.RemoteException;
}
