/**
 * PhoneServiceBean_AndryukhinNU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.phone;

public interface PhoneServiceBean_AndryukhinNU extends java.rmi.Remote {
    public org.bm.service.phone.PhoneAndryukhinNU getPhone(int arg0) throws java.rmi.RemoteException;
    public org.bm.service.phone.PhoneAndryukhinNU[] getAllPhones() throws java.rmi.RemoteException;
    public int addPhone(org.bm.service.phone.PhoneAndryukhinNU arg0) throws java.rmi.RemoteException;
    public int getNewPhoneId() throws java.rmi.RemoteException;
    public void deletePhone(int arg0) throws java.rmi.RemoteException;
    public void updatePhone(org.bm.service.phone.PhoneAndryukhinNU arg0) throws java.rmi.RemoteException;
}
