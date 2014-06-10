package org.bm.service.office;

public class OfficeServiceBean_AndryukhinNUProxy implements org.bm.service.office.OfficeServiceBean_AndryukhinNU {
  private String _endpoint = null;
  private org.bm.service.office.OfficeServiceBean_AndryukhinNU officeServiceBean_AndryukhinNU = null;
  
  public OfficeServiceBean_AndryukhinNUProxy() {
    _initOfficeServiceBean_AndryukhinNUProxy();
  }
  
  public OfficeServiceBean_AndryukhinNUProxy(String endpoint) {
    _endpoint = endpoint;
    _initOfficeServiceBean_AndryukhinNUProxy();
  }
  
  private void _initOfficeServiceBean_AndryukhinNUProxy() {
    try {
      officeServiceBean_AndryukhinNU = (new org.bm.service.office.OfficeServiceBean_AndryukhinNUServiceLocator()).getOffice();
      if (officeServiceBean_AndryukhinNU != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)officeServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)officeServiceBean_AndryukhinNU)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (officeServiceBean_AndryukhinNU != null)
      ((javax.xml.rpc.Stub)officeServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.bm.service.office.OfficeServiceBean_AndryukhinNU getOfficeServiceBean_AndryukhinNU() {
    if (officeServiceBean_AndryukhinNU == null)
      _initOfficeServiceBean_AndryukhinNUProxy();
    return officeServiceBean_AndryukhinNU;
  }
  
  public org.bm.service.office.OfficeAndryukhinNU[] getAllOffices() throws java.rmi.RemoteException{
    if (officeServiceBean_AndryukhinNU == null)
      _initOfficeServiceBean_AndryukhinNUProxy();
    return officeServiceBean_AndryukhinNU.getAllOffices();
  }
  
  public org.bm.service.office.OfficeAndryukhinNU getOffice(int arg0) throws java.rmi.RemoteException{
    if (officeServiceBean_AndryukhinNU == null)
      _initOfficeServiceBean_AndryukhinNUProxy();
    return officeServiceBean_AndryukhinNU.getOffice(arg0);
  }
  
  public int addOffice(org.bm.service.office.OfficeAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (officeServiceBean_AndryukhinNU == null)
      _initOfficeServiceBean_AndryukhinNUProxy();
    return officeServiceBean_AndryukhinNU.addOffice(arg0);
  }
  
  public void updateOffice(org.bm.service.office.OfficeAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (officeServiceBean_AndryukhinNU == null)
      _initOfficeServiceBean_AndryukhinNUProxy();
    officeServiceBean_AndryukhinNU.updateOffice(arg0);
  }
  
  public void deleteOffice(int arg0) throws java.rmi.RemoteException{
    if (officeServiceBean_AndryukhinNU == null)
      _initOfficeServiceBean_AndryukhinNUProxy();
    officeServiceBean_AndryukhinNU.deleteOffice(arg0);
  }
  
  public int getNewOfficeId() throws java.rmi.RemoteException{
    if (officeServiceBean_AndryukhinNU == null)
      _initOfficeServiceBean_AndryukhinNUProxy();
    return officeServiceBean_AndryukhinNU.getNewOfficeId();
  }
  
  
}