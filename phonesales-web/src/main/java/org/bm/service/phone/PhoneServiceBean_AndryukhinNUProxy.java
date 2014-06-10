package org.bm.service.phone;

public class PhoneServiceBean_AndryukhinNUProxy implements org.bm.service.phone.PhoneServiceBean_AndryukhinNU {
  private String _endpoint = null;
  private org.bm.service.phone.PhoneServiceBean_AndryukhinNU phoneServiceBean_AndryukhinNU = null;
  
  public PhoneServiceBean_AndryukhinNUProxy() {
    _initPhoneServiceBean_AndryukhinNUProxy();
  }
  
  public PhoneServiceBean_AndryukhinNUProxy(String endpoint) {
    _endpoint = endpoint;
    _initPhoneServiceBean_AndryukhinNUProxy();
  }
  
  private void _initPhoneServiceBean_AndryukhinNUProxy() {
    try {
      phoneServiceBean_AndryukhinNU = (new org.bm.service.phone.PhoneServiceBean_AndryukhinNUServiceLocator()).getPhone();
      if (phoneServiceBean_AndryukhinNU != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)phoneServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)phoneServiceBean_AndryukhinNU)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (phoneServiceBean_AndryukhinNU != null)
      ((javax.xml.rpc.Stub)phoneServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.bm.service.phone.PhoneServiceBean_AndryukhinNU getPhoneServiceBean_AndryukhinNU() {
    if (phoneServiceBean_AndryukhinNU == null)
      _initPhoneServiceBean_AndryukhinNUProxy();
    return phoneServiceBean_AndryukhinNU;
  }
  
  public org.bm.service.phone.PhoneAndryukhinNU getPhone(int arg0) throws java.rmi.RemoteException{
    if (phoneServiceBean_AndryukhinNU == null)
      _initPhoneServiceBean_AndryukhinNUProxy();
    return phoneServiceBean_AndryukhinNU.getPhone(arg0);
  }
  
  public org.bm.service.phone.PhoneAndryukhinNU[] getAllPhones() throws java.rmi.RemoteException{
    if (phoneServiceBean_AndryukhinNU == null)
      _initPhoneServiceBean_AndryukhinNUProxy();
    return phoneServiceBean_AndryukhinNU.getAllPhones();
  }
  
  public int addPhone(org.bm.service.phone.PhoneAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (phoneServiceBean_AndryukhinNU == null)
      _initPhoneServiceBean_AndryukhinNUProxy();
    return phoneServiceBean_AndryukhinNU.addPhone(arg0);
  }
  
  public int getNewPhoneId() throws java.rmi.RemoteException{
    if (phoneServiceBean_AndryukhinNU == null)
      _initPhoneServiceBean_AndryukhinNUProxy();
    return phoneServiceBean_AndryukhinNU.getNewPhoneId();
  }
  
  public void deletePhone(int arg0) throws java.rmi.RemoteException{
    if (phoneServiceBean_AndryukhinNU == null)
      _initPhoneServiceBean_AndryukhinNUProxy();
    phoneServiceBean_AndryukhinNU.deletePhone(arg0);
  }
  
  public void updatePhone(org.bm.service.phone.PhoneAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (phoneServiceBean_AndryukhinNU == null)
      _initPhoneServiceBean_AndryukhinNUProxy();
    phoneServiceBean_AndryukhinNU.updatePhone(arg0);
  }
  
  
}