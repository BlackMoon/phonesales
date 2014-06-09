package org.bm.service.person;

public class PersonServiceBean_AndryukhinNUProxy implements org.bm.service.person.PersonServiceBean_AndryukhinNU {
  private String _endpoint = null;
  private org.bm.service.person.PersonServiceBean_AndryukhinNU personServiceBean_AndryukhinNU = null;
  
  public PersonServiceBean_AndryukhinNUProxy() {
    _initPersonServiceBean_AndryukhinNUProxy();
  }
  
  public PersonServiceBean_AndryukhinNUProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonServiceBean_AndryukhinNUProxy();
  }
  
  private void _initPersonServiceBean_AndryukhinNUProxy() {
    try {
      personServiceBean_AndryukhinNU = (new org.bm.service.person.PersonServiceBean_AndryukhinNUServiceLocator()).getPerson();
      if (personServiceBean_AndryukhinNU != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personServiceBean_AndryukhinNU)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personServiceBean_AndryukhinNU != null)
      ((javax.xml.rpc.Stub)personServiceBean_AndryukhinNU)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.bm.service.person.PersonServiceBean_AndryukhinNU getPersonServiceBean_AndryukhinNU() {
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    return personServiceBean_AndryukhinNU;
  }
  
  public org.bm.service.person.PersonAndryukhinNU getByLogin(java.lang.String arg0) throws java.rmi.RemoteException{
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    return personServiceBean_AndryukhinNU.getByLogin(arg0);
  }
  
  public org.bm.service.person.PersonAndryukhinNU getPerson(int arg0) throws java.rmi.RemoteException{
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    return personServiceBean_AndryukhinNU.getPerson(arg0);
  }
  
  public org.bm.service.person.PersonAndryukhinNU[] getAllPersons() throws java.rmi.RemoteException{
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    return personServiceBean_AndryukhinNU.getAllPersons();
  }
  
  public int addPerson(org.bm.service.person.PersonAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    return personServiceBean_AndryukhinNU.addPerson(arg0);
  }
  
  public void deletePerson(int arg0) throws java.rmi.RemoteException{
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    personServiceBean_AndryukhinNU.deletePerson(arg0);
  }
  
  public void updatePerson(org.bm.service.person.PersonAndryukhinNU arg0) throws java.rmi.RemoteException{
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    personServiceBean_AndryukhinNU.updatePerson(arg0);
  }
  
  public int getNewPersonId() throws java.rmi.RemoteException{
    if (personServiceBean_AndryukhinNU == null)
      _initPersonServiceBean_AndryukhinNUProxy();
    return personServiceBean_AndryukhinNU.getNewPersonId();
  }
  
  
}