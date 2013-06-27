/**
 * CMUPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.westchase.ws.cmu;

public interface CMUPortType extends java.rmi.Remote {

    /**
     * returns new cmu apartments
     */
    public com.westchase.ws.cmu.CmuApartment[] getNewApartments() throws java.rmi.RemoteException;

    /**
     * returns new cmu devsites
     */
    public com.westchase.ws.cmu.CmuDevsite[] getNewDevsites() throws java.rmi.RemoteException;

    /**
     * returns new cmu hotels
     */
    public com.westchase.ws.cmu.CmuHotel[] getNewHotels() throws java.rmi.RemoteException;

    /**
     * returns new cmu leases
     */
    public com.westchase.ws.cmu.CmuLease[] getNewLeases() throws java.rmi.RemoteException;

    /**
     * returns new cmu office retail svcs
     */
    public com.westchase.ws.cmu.CmuOfficeRetailSvc[] getNewOfficeRetailSvcs() throws java.rmi.RemoteException;

    /**
     * runs the specified query
     */
    public void setTransferred(java.lang.String table, int[] ids) throws java.rmi.RemoteException;
}
