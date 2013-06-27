/**
 * CmuLease.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.westchase.ws.cmu;

public class CmuLease  implements java.io.Serializable {
    private long id;

    private int quarter;

    private int property;

    private java.lang.String tenant_name;

    private float sq_ft;

    private int lease_trans_type;

    private java.lang.String owners_rep;

    private java.lang.String tenants_rep;

    public CmuLease() {
    }

    public CmuLease(
           long id,
           int quarter,
           int property,
           java.lang.String tenant_name,
           float sq_ft,
           int lease_trans_type,
           java.lang.String owners_rep,
           java.lang.String tenants_rep) {
           this.id = id;
           this.quarter = quarter;
           this.property = property;
           this.tenant_name = tenant_name;
           this.sq_ft = sq_ft;
           this.lease_trans_type = lease_trans_type;
           this.owners_rep = owners_rep;
           this.tenants_rep = tenants_rep;
    }


    /**
     * Gets the id value for this CmuLease.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CmuLease.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the quarter value for this CmuLease.
     * 
     * @return quarter
     */
    public int getQuarter() {
        return quarter;
    }


    /**
     * Sets the quarter value for this CmuLease.
     * 
     * @param quarter
     */
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }


    /**
     * Gets the property value for this CmuLease.
     * 
     * @return property
     */
    public int getProperty() {
        return property;
    }


    /**
     * Sets the property value for this CmuLease.
     * 
     * @param property
     */
    public void setProperty(int property) {
        this.property = property;
    }


    /**
     * Gets the tenant_name value for this CmuLease.
     * 
     * @return tenant_name
     */
    public java.lang.String getTenant_name() {
        return tenant_name;
    }


    /**
     * Sets the tenant_name value for this CmuLease.
     * 
     * @param tenant_name
     */
    public void setTenant_name(java.lang.String tenant_name) {
        this.tenant_name = tenant_name;
    }


    /**
     * Gets the sq_ft value for this CmuLease.
     * 
     * @return sq_ft
     */
    public float getSq_ft() {
        return sq_ft;
    }


    /**
     * Sets the sq_ft value for this CmuLease.
     * 
     * @param sq_ft
     */
    public void setSq_ft(float sq_ft) {
        this.sq_ft = sq_ft;
    }


    /**
     * Gets the lease_trans_type value for this CmuLease.
     * 
     * @return lease_trans_type
     */
    public int getLease_trans_type() {
        return lease_trans_type;
    }


    /**
     * Sets the lease_trans_type value for this CmuLease.
     * 
     * @param lease_trans_type
     */
    public void setLease_trans_type(int lease_trans_type) {
        this.lease_trans_type = lease_trans_type;
    }


    /**
     * Gets the owners_rep value for this CmuLease.
     * 
     * @return owners_rep
     */
    public java.lang.String getOwners_rep() {
        return owners_rep;
    }


    /**
     * Sets the owners_rep value for this CmuLease.
     * 
     * @param owners_rep
     */
    public void setOwners_rep(java.lang.String owners_rep) {
        this.owners_rep = owners_rep;
    }


    /**
     * Gets the tenants_rep value for this CmuLease.
     * 
     * @return tenants_rep
     */
    public java.lang.String getTenants_rep() {
        return tenants_rep;
    }


    /**
     * Sets the tenants_rep value for this CmuLease.
     * 
     * @param tenants_rep
     */
    public void setTenants_rep(java.lang.String tenants_rep) {
        this.tenants_rep = tenants_rep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmuLease)) return false;
        CmuLease other = (CmuLease) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.quarter == other.getQuarter() &&
            this.property == other.getProperty() &&
            ((this.tenant_name==null && other.getTenant_name()==null) || 
             (this.tenant_name!=null &&
              this.tenant_name.equals(other.getTenant_name()))) &&
            this.sq_ft == other.getSq_ft() &&
            this.lease_trans_type == other.getLease_trans_type() &&
            ((this.owners_rep==null && other.getOwners_rep()==null) || 
             (this.owners_rep!=null &&
              this.owners_rep.equals(other.getOwners_rep()))) &&
            ((this.tenants_rep==null && other.getTenants_rep()==null) || 
             (this.tenants_rep!=null &&
              this.tenants_rep.equals(other.getTenants_rep())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getId()).hashCode();
        _hashCode += getQuarter();
        _hashCode += getProperty();
        if (getTenant_name() != null) {
            _hashCode += getTenant_name().hashCode();
        }
        _hashCode += new Float(getSq_ft()).hashCode();
        _hashCode += getLease_trans_type();
        if (getOwners_rep() != null) {
            _hashCode += getOwners_rep().hashCode();
        }
        if (getTenants_rep() != null) {
            _hashCode += getTenants_rep().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmuLease.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:cmu", "CmuLease"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenant_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tenant_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sq_ft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sq_ft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lease_trans_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lease_trans_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owners_rep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owners_rep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenants_rep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tenants_rep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
