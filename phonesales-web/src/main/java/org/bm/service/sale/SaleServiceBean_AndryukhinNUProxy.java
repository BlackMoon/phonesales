package org.bm.service.sale;

public class SaleServiceBean_AndryukhinNUProxy implements org.bm.service.sale.SaleServiceBean_AndryukhinNU {
  private String _endpoint = null;
  private org.bm.service.sale.SaleServiceBean_AndryukhinNU saleServiceBean_AndryukhinNU = null;
  
  public SaleServiceBean_AndryukhinNUProxy() {
    _initSaleServiceBean_AndryukhinNUProxy();
  }
  
  public SaleServiceBean_AndryukhinNUProxy(String endpoint) {
    _endpoint = endpoint;
    _initSaleServiceBean_AndryukhinNUProxy();
  }
  
  private void _initSaleServiceBean_AndryukhinNUProxy() {
    try {
      saleServiceBean_AndryukhinNU = (new org.bm.service.sale.SaleServiceBean_AndryukhinNUServiceLocator()).getSale();
      if (saleServiceBean_AndryukhinNU != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)saleServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)saleServiceBean_AndryukhinNU)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (saleServiceBean_AndryukhinNU != null)
      ((javax.xml.rpc.Stub)saleServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.bm.service.sale.SaleServiceBean_AndryukhinNU getSaleServiceBean_AndryukhinNU() {
    if (saleServiceBean_AndryukhinNU == null)
      _initSaleServiceBean_AndryukhinNUProxy();
    return saleServiceBean_AndryukhinNU;
  }
  
  public org.bm.service.sale.SaleAndryukhinNU[] getAllSales() throws java.rmi.RemoteException{
    if (saleServiceBean_AndryukhinNU == null)
      _initSaleServiceBean_AndryukhinNUProxy();
    return saleServiceBean_AndryukhinNU.getAllSales();
  }
  
  public org.bm.service.sale.SaleAndryukhinNU getSale(int arg0) throws java.rmi.RemoteException{
    if (saleServiceBean_AndryukhinNU == null)
      _initSaleServiceBean_AndryukhinNUProxy();
    return saleServiceBean_AndryukhinNU.getSale(arg0);
  }
  
  public int addSale(org.bm.service.sale.SaleAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (saleServiceBean_AndryukhinNU == null)
      _initSaleServiceBean_AndryukhinNUProxy();
    return saleServiceBean_AndryukhinNU.addSale(arg0);
  }
  
  public void deleteSale(int arg0) throws java.rmi.RemoteException{
    if (saleServiceBean_AndryukhinNU == null)
      _initSaleServiceBean_AndryukhinNUProxy();
    saleServiceBean_AndryukhinNU.deleteSale(arg0);
  }
  
  public void updateSale(org.bm.service.sale.SaleAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (saleServiceBean_AndryukhinNU == null)
      _initSaleServiceBean_AndryukhinNUProxy();
    saleServiceBean_AndryukhinNU.updateSale(arg0);
  }
  
  
}