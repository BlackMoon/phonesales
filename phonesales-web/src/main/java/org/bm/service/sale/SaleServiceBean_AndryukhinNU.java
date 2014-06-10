/**
 * SaleServiceBean_AndryukhinNU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.sale;

public interface SaleServiceBean_AndryukhinNU extends java.rmi.Remote {
    public org.bm.service.sale.SaleAndryukhinNU[] getAllSales() throws java.rmi.RemoteException;
    public org.bm.service.sale.SaleAndryukhinNU getSale(int arg0) throws java.rmi.RemoteException;
    public int addSale(org.bm.service.sale.SaleAndryukhinNU arg0) throws java.rmi.RemoteException;
    public void deleteSale(int arg0) throws java.rmi.RemoteException;
    public void updateSale(org.bm.service.sale.SaleAndryukhinNU arg0) throws java.rmi.RemoteException;
}
