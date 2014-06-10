package org.bm.service.manufactor;

public class ManufactorServiceBean_AndryukhinNUProxy implements org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNU {
  private String _endpoint = null;
  private org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNU manufactorServiceBean_AndryukhinNU = null;
  
  public ManufactorServiceBean_AndryukhinNUProxy() {
    _initManufactorServiceBean_AndryukhinNUProxy();
  }
  
  public ManufactorServiceBean_AndryukhinNUProxy(String endpoint) {
    _endpoint = endpoint;
    _initManufactorServiceBean_AndryukhinNUProxy();
  }
  
  private void _initManufactorServiceBean_AndryukhinNUProxy() {
    try {
      manufactorServiceBean_AndryukhinNU = (new org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNUServiceLocator()).getManufactor();
      if (manufactorServiceBean_AndryukhinNU != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)manufactorServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)manufactorServiceBean_AndryukhinNU)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (manufactorServiceBean_AndryukhinNU != null)
      ((javax.xml.rpc.Stub)manufactorServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.bm.service.manufactor.ManufactorServiceBean_AndryukhinNU getManufactorServiceBean_AndryukhinNU() {
    if (manufactorServiceBean_AndryukhinNU == null)
      _initManufactorServiceBean_AndryukhinNUProxy();
    return manufactorServiceBean_AndryukhinNU;
  }
  
  public org.bm.service.manufactor.ManufactorAndryukhinNU[] getAllManufactors() throws java.rmi.RemoteException{
    if (manufactorServiceBean_AndryukhinNU == null)
      _initManufactorServiceBean_AndryukhinNUProxy();
    return manufactorServiceBean_AndryukhinNU.getAllManufactors();
  }
  
  public int getNewManufactorId() throws java.rmi.RemoteException{
    if (manufactorServiceBean_AndryukhinNU == null)
      _initManufactorServiceBean_AndryukhinNUProxy();
    return manufactorServiceBean_AndryukhinNU.getNewManufactorId();
  }
  
  public void deleteManufactor(int arg0) throws java.rmi.RemoteException{
    if (manufactorServiceBean_AndryukhinNU == null)
      _initManufactorServiceBean_AndryukhinNUProxy();
    manufactorServiceBean_AndryukhinNU.deleteManufactor(arg0);
  }
  
  public void updateManufactor(org.bm.service.manufactor.ManufactorAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (manufactorServiceBean_AndryukhinNU == null)
      _initManufactorServiceBean_AndryukhinNUProxy();
    manufactorServiceBean_AndryukhinNU.updateManufactor(arg0);
  }
  
  public org.bm.service.manufactor.ManufactorAndryukhinNU getManufactor(int arg0) throws java.rmi.RemoteException{
    if (manufactorServiceBean_AndryukhinNU == null)
      _initManufactorServiceBean_AndryukhinNUProxy();
    return manufactorServiceBean_AndryukhinNU.getManufactor(arg0);
  }
  
  public int addManufactor(org.bm.service.manufactor.ManufactorAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (manufactorServiceBean_AndryukhinNU == null)
      _initManufactorServiceBean_AndryukhinNUProxy();
    return manufactorServiceBean_AndryukhinNU.addManufactor(arg0);
  }
  
  
}