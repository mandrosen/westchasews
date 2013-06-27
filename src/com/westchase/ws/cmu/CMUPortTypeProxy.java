package com.westchase.ws.cmu;

public class CMUPortTypeProxy implements com.westchase.ws.cmu.CMUPortType {
  private String _endpoint = null;
  private com.westchase.ws.cmu.CMUPortType cMUPortType = null;
  
  public CMUPortTypeProxy() {
    _initCMUPortTypeProxy();
  }
  
  public CMUPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCMUPortTypeProxy();
  }
  
  private void _initCMUPortTypeProxy() {
    try {
      cMUPortType = (new com.westchase.ws.cmu.CMULocator()).getCMUPort();
      if (cMUPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cMUPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cMUPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cMUPortType != null)
      ((javax.xml.rpc.Stub)cMUPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.westchase.ws.cmu.CMUPortType getCMUPortType() {
    if (cMUPortType == null)
      _initCMUPortTypeProxy();
    return cMUPortType;
  }
  
  public com.westchase.ws.cmu.CmuApartment[] getNewApartments() throws java.rmi.RemoteException{
    if (cMUPortType == null)
      _initCMUPortTypeProxy();
    return cMUPortType.getNewApartments();
  }
  
  public com.westchase.ws.cmu.CmuDevsite[] getNewDevsites() throws java.rmi.RemoteException{
    if (cMUPortType == null)
      _initCMUPortTypeProxy();
    return cMUPortType.getNewDevsites();
  }
  
  public com.westchase.ws.cmu.CmuHotel[] getNewHotels() throws java.rmi.RemoteException{
    if (cMUPortType == null)
      _initCMUPortTypeProxy();
    return cMUPortType.getNewHotels();
  }
  
  public com.westchase.ws.cmu.CmuLease[] getNewLeases() throws java.rmi.RemoteException{
    if (cMUPortType == null)
      _initCMUPortTypeProxy();
    return cMUPortType.getNewLeases();
  }
  
  public com.westchase.ws.cmu.CmuOfficeRetailSvc[] getNewOfficeRetailSvcs() throws java.rmi.RemoteException{
    if (cMUPortType == null)
      _initCMUPortTypeProxy();
    return cMUPortType.getNewOfficeRetailSvcs();
  }
  
  public void setTransferred(java.lang.String table, int[] ids) throws java.rmi.RemoteException{
    if (cMUPortType == null)
      _initCMUPortTypeProxy();
    cMUPortType.setTransferred(table, ids);
  }
  
  
}