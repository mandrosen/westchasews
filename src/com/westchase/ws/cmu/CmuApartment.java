/**
 * CmuApartment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.westchase.ws.cmu;

public class CmuApartment  implements java.io.Serializable {
    private long id;

    private int quarter;

    private int property;

    private java.lang.String completed_by;

    private float occupancy_rate;

    private java.lang.String community_mgr;

    private java.lang.String community_mgr_email;

    private java.lang.String community_mgr_phone;

    private java.lang.String community_mgr_fax;

    private java.lang.String mgmt_company;

    private java.lang.String mgmt_company_addr;

    private java.lang.String supervisor;

    private java.lang.String supervisor_email;

    private java.lang.String supervisor_phone;

    private java.lang.String supervisor_fax;

    private java.lang.String owner;

    private java.lang.String owner_address;

    private java.lang.String owner_phone;

    private java.lang.String owner_fax;

    private java.lang.String comments;

    private boolean static_info_correct;

    public CmuApartment() {
    }

    public CmuApartment(
           long id,
           int quarter,
           int property,
           java.lang.String completed_by,
           float occupancy_rate,
           java.lang.String community_mgr,
           java.lang.String community_mgr_email,
           java.lang.String community_mgr_phone,
           java.lang.String community_mgr_fax,
           java.lang.String mgmt_company,
           java.lang.String mgmt_company_addr,
           java.lang.String supervisor,
           java.lang.String supervisor_email,
           java.lang.String supervisor_phone,
           java.lang.String supervisor_fax,
           java.lang.String owner,
           java.lang.String owner_address,
           java.lang.String owner_phone,
           java.lang.String owner_fax,
           java.lang.String comments,
           boolean static_info_correct) {
           this.id = id;
           this.quarter = quarter;
           this.property = property;
           this.completed_by = completed_by;
           this.occupancy_rate = occupancy_rate;
           this.community_mgr = community_mgr;
           this.community_mgr_email = community_mgr_email;
           this.community_mgr_phone = community_mgr_phone;
           this.community_mgr_fax = community_mgr_fax;
           this.mgmt_company = mgmt_company;
           this.mgmt_company_addr = mgmt_company_addr;
           this.supervisor = supervisor;
           this.supervisor_email = supervisor_email;
           this.supervisor_phone = supervisor_phone;
           this.supervisor_fax = supervisor_fax;
           this.owner = owner;
           this.owner_address = owner_address;
           this.owner_phone = owner_phone;
           this.owner_fax = owner_fax;
           this.comments = comments;
           this.static_info_correct = static_info_correct;
    }


    /**
     * Gets the id value for this CmuApartment.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CmuApartment.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the quarter value for this CmuApartment.
     * 
     * @return quarter
     */
    public int getQuarter() {
        return quarter;
    }


    /**
     * Sets the quarter value for this CmuApartment.
     * 
     * @param quarter
     */
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }


    /**
     * Gets the property value for this CmuApartment.
     * 
     * @return property
     */
    public int getProperty() {
        return property;
    }


    /**
     * Sets the property value for this CmuApartment.
     * 
     * @param property
     */
    public void setProperty(int property) {
        this.property = property;
    }


    /**
     * Gets the completed_by value for this CmuApartment.
     * 
     * @return completed_by
     */
    public java.lang.String getCompleted_by() {
        return completed_by;
    }


    /**
     * Sets the completed_by value for this CmuApartment.
     * 
     * @param completed_by
     */
    public void setCompleted_by(java.lang.String completed_by) {
        this.completed_by = completed_by;
    }


    /**
     * Gets the occupancy_rate value for this CmuApartment.
     * 
     * @return occupancy_rate
     */
    public float getOccupancy_rate() {
        return occupancy_rate;
    }


    /**
     * Sets the occupancy_rate value for this CmuApartment.
     * 
     * @param occupancy_rate
     */
    public void setOccupancy_rate(float occupancy_rate) {
        this.occupancy_rate = occupancy_rate;
    }


    /**
     * Gets the community_mgr value for this CmuApartment.
     * 
     * @return community_mgr
     */
    public java.lang.String getCommunity_mgr() {
        return community_mgr;
    }


    /**
     * Sets the community_mgr value for this CmuApartment.
     * 
     * @param community_mgr
     */
    public void setCommunity_mgr(java.lang.String community_mgr) {
        this.community_mgr = community_mgr;
    }


    /**
     * Gets the community_mgr_email value for this CmuApartment.
     * 
     * @return community_mgr_email
     */
    public java.lang.String getCommunity_mgr_email() {
        return community_mgr_email;
    }


    /**
     * Sets the community_mgr_email value for this CmuApartment.
     * 
     * @param community_mgr_email
     */
    public void setCommunity_mgr_email(java.lang.String community_mgr_email) {
        this.community_mgr_email = community_mgr_email;
    }


    /**
     * Gets the community_mgr_phone value for this CmuApartment.
     * 
     * @return community_mgr_phone
     */
    public java.lang.String getCommunity_mgr_phone() {
        return community_mgr_phone;
    }


    /**
     * Sets the community_mgr_phone value for this CmuApartment.
     * 
     * @param community_mgr_phone
     */
    public void setCommunity_mgr_phone(java.lang.String community_mgr_phone) {
        this.community_mgr_phone = community_mgr_phone;
    }


    /**
     * Gets the community_mgr_fax value for this CmuApartment.
     * 
     * @return community_mgr_fax
     */
    public java.lang.String getCommunity_mgr_fax() {
        return community_mgr_fax;
    }


    /**
     * Sets the community_mgr_fax value for this CmuApartment.
     * 
     * @param community_mgr_fax
     */
    public void setCommunity_mgr_fax(java.lang.String community_mgr_fax) {
        this.community_mgr_fax = community_mgr_fax;
    }


    /**
     * Gets the mgmt_company value for this CmuApartment.
     * 
     * @return mgmt_company
     */
    public java.lang.String getMgmt_company() {
        return mgmt_company;
    }


    /**
     * Sets the mgmt_company value for this CmuApartment.
     * 
     * @param mgmt_company
     */
    public void setMgmt_company(java.lang.String mgmt_company) {
        this.mgmt_company = mgmt_company;
    }


    /**
     * Gets the mgmt_company_addr value for this CmuApartment.
     * 
     * @return mgmt_company_addr
     */
    public java.lang.String getMgmt_company_addr() {
        return mgmt_company_addr;
    }


    /**
     * Sets the mgmt_company_addr value for this CmuApartment.
     * 
     * @param mgmt_company_addr
     */
    public void setMgmt_company_addr(java.lang.String mgmt_company_addr) {
        this.mgmt_company_addr = mgmt_company_addr;
    }


    /**
     * Gets the supervisor value for this CmuApartment.
     * 
     * @return supervisor
     */
    public java.lang.String getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this CmuApartment.
     * 
     * @param supervisor
     */
    public void setSupervisor(java.lang.String supervisor) {
        this.supervisor = supervisor;
    }


    /**
     * Gets the supervisor_email value for this CmuApartment.
     * 
     * @return supervisor_email
     */
    public java.lang.String getSupervisor_email() {
        return supervisor_email;
    }


    /**
     * Sets the supervisor_email value for this CmuApartment.
     * 
     * @param supervisor_email
     */
    public void setSupervisor_email(java.lang.String supervisor_email) {
        this.supervisor_email = supervisor_email;
    }


    /**
     * Gets the supervisor_phone value for this CmuApartment.
     * 
     * @return supervisor_phone
     */
    public java.lang.String getSupervisor_phone() {
        return supervisor_phone;
    }


    /**
     * Sets the supervisor_phone value for this CmuApartment.
     * 
     * @param supervisor_phone
     */
    public void setSupervisor_phone(java.lang.String supervisor_phone) {
        this.supervisor_phone = supervisor_phone;
    }


    /**
     * Gets the supervisor_fax value for this CmuApartment.
     * 
     * @return supervisor_fax
     */
    public java.lang.String getSupervisor_fax() {
        return supervisor_fax;
    }


    /**
     * Sets the supervisor_fax value for this CmuApartment.
     * 
     * @param supervisor_fax
     */
    public void setSupervisor_fax(java.lang.String supervisor_fax) {
        this.supervisor_fax = supervisor_fax;
    }


    /**
     * Gets the owner value for this CmuApartment.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CmuApartment.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the owner_address value for this CmuApartment.
     * 
     * @return owner_address
     */
    public java.lang.String getOwner_address() {
        return owner_address;
    }


    /**
     * Sets the owner_address value for this CmuApartment.
     * 
     * @param owner_address
     */
    public void setOwner_address(java.lang.String owner_address) {
        this.owner_address = owner_address;
    }


    /**
     * Gets the owner_phone value for this CmuApartment.
     * 
     * @return owner_phone
     */
    public java.lang.String getOwner_phone() {
        return owner_phone;
    }


    /**
     * Sets the owner_phone value for this CmuApartment.
     * 
     * @param owner_phone
     */
    public void setOwner_phone(java.lang.String owner_phone) {
        this.owner_phone = owner_phone;
    }


    /**
     * Gets the owner_fax value for this CmuApartment.
     * 
     * @return owner_fax
     */
    public java.lang.String getOwner_fax() {
        return owner_fax;
    }


    /**
     * Sets the owner_fax value for this CmuApartment.
     * 
     * @param owner_fax
     */
    public void setOwner_fax(java.lang.String owner_fax) {
        this.owner_fax = owner_fax;
    }


    /**
     * Gets the comments value for this CmuApartment.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CmuApartment.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the static_info_correct value for this CmuApartment.
     * 
     * @return static_info_correct
     */
    public boolean isStatic_info_correct() {
        return static_info_correct;
    }


    /**
     * Sets the static_info_correct value for this CmuApartment.
     * 
     * @param static_info_correct
     */
    public void setStatic_info_correct(boolean static_info_correct) {
        this.static_info_correct = static_info_correct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmuApartment)) return false;
        CmuApartment other = (CmuApartment) obj;
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
            this.occupancy_rate == other.getOccupancy_rate() &&
            ((this.community_mgr==null && other.getCommunity_mgr()==null) || 
             (this.community_mgr!=null &&
              this.community_mgr.equals(other.getCommunity_mgr()))) &&
            ((this.community_mgr_email==null && other.getCommunity_mgr_email()==null) || 
             (this.community_mgr_email!=null &&
              this.community_mgr_email.equals(other.getCommunity_mgr_email()))) &&
            ((this.community_mgr_phone==null && other.getCommunity_mgr_phone()==null) || 
             (this.community_mgr_phone!=null &&
              this.community_mgr_phone.equals(other.getCommunity_mgr_phone()))) &&
            ((this.community_mgr_fax==null && other.getCommunity_mgr_fax()==null) || 
             (this.community_mgr_fax!=null &&
              this.community_mgr_fax.equals(other.getCommunity_mgr_fax()))) &&
            ((this.mgmt_company==null && other.getMgmt_company()==null) || 
             (this.mgmt_company!=null &&
              this.mgmt_company.equals(other.getMgmt_company()))) &&
            ((this.mgmt_company_addr==null && other.getMgmt_company_addr()==null) || 
             (this.mgmt_company_addr!=null &&
              this.mgmt_company_addr.equals(other.getMgmt_company_addr()))) &&
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              this.supervisor.equals(other.getSupervisor()))) &&
            ((this.supervisor_email==null && other.getSupervisor_email()==null) || 
             (this.supervisor_email!=null &&
              this.supervisor_email.equals(other.getSupervisor_email()))) &&
            ((this.supervisor_phone==null && other.getSupervisor_phone()==null) || 
             (this.supervisor_phone!=null &&
              this.supervisor_phone.equals(other.getSupervisor_phone()))) &&
            ((this.supervisor_fax==null && other.getSupervisor_fax()==null) || 
             (this.supervisor_fax!=null &&
              this.supervisor_fax.equals(other.getSupervisor_fax()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.owner_address==null && other.getOwner_address()==null) || 
             (this.owner_address!=null &&
              this.owner_address.equals(other.getOwner_address()))) &&
            ((this.owner_phone==null && other.getOwner_phone()==null) || 
             (this.owner_phone!=null &&
              this.owner_phone.equals(other.getOwner_phone()))) &&
            ((this.owner_fax==null && other.getOwner_fax()==null) || 
             (this.owner_fax!=null &&
              this.owner_fax.equals(other.getOwner_fax()))) &&
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
        _hashCode += new Float(getOccupancy_rate()).hashCode();
        if (getCommunity_mgr() != null) {
            _hashCode += getCommunity_mgr().hashCode();
        }
        if (getCommunity_mgr_email() != null) {
            _hashCode += getCommunity_mgr_email().hashCode();
        }
        if (getCommunity_mgr_phone() != null) {
            _hashCode += getCommunity_mgr_phone().hashCode();
        }
        if (getCommunity_mgr_fax() != null) {
            _hashCode += getCommunity_mgr_fax().hashCode();
        }
        if (getMgmt_company() != null) {
            _hashCode += getMgmt_company().hashCode();
        }
        if (getMgmt_company_addr() != null) {
            _hashCode += getMgmt_company_addr().hashCode();
        }
        if (getSupervisor() != null) {
            _hashCode += getSupervisor().hashCode();
        }
        if (getSupervisor_email() != null) {
            _hashCode += getSupervisor_email().hashCode();
        }
        if (getSupervisor_phone() != null) {
            _hashCode += getSupervisor_phone().hashCode();
        }
        if (getSupervisor_fax() != null) {
            _hashCode += getSupervisor_fax().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwner_address() != null) {
            _hashCode += getOwner_address().hashCode();
        }
        if (getOwner_phone() != null) {
            _hashCode += getOwner_phone().hashCode();
        }
        if (getOwner_fax() != null) {
            _hashCode += getOwner_fax().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += (isStatic_info_correct() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmuApartment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:cmu", "CmuApartment"));
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
        elemField.setFieldName("occupancy_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "occupancy_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community_mgr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community_mgr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community_mgr_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community_mgr_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community_mgr_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community_mgr_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community_mgr_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community_mgr_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgmt_company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgmt_company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgmt_company_addr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgmt_company_addr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supervisor_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supervisor_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supervisor_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
