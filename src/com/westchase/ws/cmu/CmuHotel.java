/**
 * CmuHotel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.westchase.ws.cmu;

public class CmuHotel  implements java.io.Serializable {
    private long id;

    private int quarter;

    private int property;

    private java.lang.String completed_by;

    private java.lang.String general_mgr;

    private java.lang.String general_mgr_email;

    private java.lang.String general_mgr_phone;

    private float occupancy;

    private java.lang.String comments;

    private boolean static_info_correct;

    public CmuHotel() {
    }

    public CmuHotel(
           long id,
           int quarter,
           int property,
           java.lang.String completed_by,
           java.lang.String general_mgr,
           java.lang.String general_mgr_email,
           java.lang.String general_mgr_phone,
           float occupancy,
           java.lang.String comments,
           boolean static_info_correct) {
           this.id = id;
           this.quarter = quarter;
           this.property = property;
           this.completed_by = completed_by;
           this.general_mgr = general_mgr;
           this.general_mgr_email = general_mgr_email;
           this.general_mgr_phone = general_mgr_phone;
           this.occupancy = occupancy;
           this.comments = comments;
           this.static_info_correct = static_info_correct;
    }


    /**
     * Gets the id value for this CmuHotel.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CmuHotel.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the quarter value for this CmuHotel.
     * 
     * @return quarter
     */
    public int getQuarter() {
        return quarter;
    }


    /**
     * Sets the quarter value for this CmuHotel.
     * 
     * @param quarter
     */
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }


    /**
     * Gets the property value for this CmuHotel.
     * 
     * @return property
     */
    public int getProperty() {
        return property;
    }


    /**
     * Sets the property value for this CmuHotel.
     * 
     * @param property
     */
    public void setProperty(int property) {
        this.property = property;
    }


    /**
     * Gets the completed_by value for this CmuHotel.
     * 
     * @return completed_by
     */
    public java.lang.String getCompleted_by() {
        return completed_by;
    }


    /**
     * Sets the completed_by value for this CmuHotel.
     * 
     * @param completed_by
     */
    public void setCompleted_by(java.lang.String completed_by) {
        this.completed_by = completed_by;
    }


    /**
     * Gets the general_mgr value for this CmuHotel.
     * 
     * @return general_mgr
     */
    public java.lang.String getGeneral_mgr() {
        return general_mgr;
    }


    /**
     * Sets the general_mgr value for this CmuHotel.
     * 
     * @param general_mgr
     */
    public void setGeneral_mgr(java.lang.String general_mgr) {
        this.general_mgr = general_mgr;
    }


    /**
     * Gets the general_mgr_email value for this CmuHotel.
     * 
     * @return general_mgr_email
     */
    public java.lang.String getGeneral_mgr_email() {
        return general_mgr_email;
    }


    /**
     * Sets the general_mgr_email value for this CmuHotel.
     * 
     * @param general_mgr_email
     */
    public void setGeneral_mgr_email(java.lang.String general_mgr_email) {
        this.general_mgr_email = general_mgr_email;
    }


    /**
     * Gets the general_mgr_phone value for this CmuHotel.
     * 
     * @return general_mgr_phone
     */
    public java.lang.String getGeneral_mgr_phone() {
        return general_mgr_phone;
    }


    /**
     * Sets the general_mgr_phone value for this CmuHotel.
     * 
     * @param general_mgr_phone
     */
    public void setGeneral_mgr_phone(java.lang.String general_mgr_phone) {
        this.general_mgr_phone = general_mgr_phone;
    }


    /**
     * Gets the occupancy value for this CmuHotel.
     * 
     * @return occupancy
     */
    public float getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this CmuHotel.
     * 
     * @param occupancy
     */
    public void setOccupancy(float occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the comments value for this CmuHotel.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CmuHotel.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the static_info_correct value for this CmuHotel.
     * 
     * @return static_info_correct
     */
    public boolean isStatic_info_correct() {
        return static_info_correct;
    }


    /**
     * Sets the static_info_correct value for this CmuHotel.
     * 
     * @param static_info_correct
     */
    public void setStatic_info_correct(boolean static_info_correct) {
        this.static_info_correct = static_info_correct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmuHotel)) return false;
        CmuHotel other = (CmuHotel) obj;
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
            ((this.completed_by==null && other.getCompleted_by()==null) || 
             (this.completed_by!=null &&
              this.completed_by.equals(other.getCompleted_by()))) &&
            ((this.general_mgr==null && other.getGeneral_mgr()==null) || 
             (this.general_mgr!=null &&
              this.general_mgr.equals(other.getGeneral_mgr()))) &&
            ((this.general_mgr_email==null && other.getGeneral_mgr_email()==null) || 
             (this.general_mgr_email!=null &&
              this.general_mgr_email.equals(other.getGeneral_mgr_email()))) &&
            ((this.general_mgr_phone==null && other.getGeneral_mgr_phone()==null) || 
             (this.general_mgr_phone!=null &&
              this.general_mgr_phone.equals(other.getGeneral_mgr_phone()))) &&
            this.occupancy == other.getOccupancy() &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.static_info_correct == other.isStatic_info_correct();
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
        if (getCompleted_by() != null) {
            _hashCode += getCompleted_by().hashCode();
        }
        if (getGeneral_mgr() != null) {
            _hashCode += getGeneral_mgr().hashCode();
        }
        if (getGeneral_mgr_email() != null) {
            _hashCode += getGeneral_mgr_email().hashCode();
        }
        if (getGeneral_mgr_phone() != null) {
            _hashCode += getGeneral_mgr_phone().hashCode();
        }
        _hashCode += new Float(getOccupancy()).hashCode();
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += (isStatic_info_correct() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmuHotel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:cmu", "CmuHotel"));
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
        elemField.setFieldName("completed_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completed_by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("general_mgr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "general_mgr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("general_mgr_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "general_mgr_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("general_mgr_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "general_mgr_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupancy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "occupancy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("static_info_correct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "static_info_correct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
