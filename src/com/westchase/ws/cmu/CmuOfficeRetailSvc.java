/**
 * CmuOfficeRetailSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.westchase.ws.cmu;

public class CmuOfficeRetailSvc  implements java.io.Serializable {
    private long id;

    private int quarter;

    private int property;

    private java.lang.String completed_by;

    private int for_sale;

    private java.lang.String for_sale_contact;

    private java.lang.String for_sale_phone;

    private float sq_ft_for_lease;

    private float occupancy;

    private float occupied;

    private float largest_space;

    private float largest_space_6Mths;

    private float largest_space_12Mths;

    private java.lang.String property_mgr;

    private java.lang.String property_mgr_phone;

    private java.lang.String property_mgr_fax;

    private java.lang.String property_mgr_email;

    private java.lang.String mgmt_company;

    private java.lang.String mgmt_company_addr;

    private java.lang.String leasing_company;

    private java.lang.String leasing_company_addr;

    private java.lang.String leasing_agent;

    private java.lang.String leasing_agent_phone;

    private java.lang.String leasing_agent_fax;

    private java.lang.String leasing_agent_email;

    private java.lang.String comments;

    private boolean static_info_correct;

    public CmuOfficeRetailSvc() {
    }

    public CmuOfficeRetailSvc(
           long id,
           int quarter,
           int property,
           java.lang.String completed_by,
           int for_sale,
           java.lang.String for_sale_contact,
           java.lang.String for_sale_phone,
           float sq_ft_for_lease,
           float occupancy,
           float occupied,
           float largest_space,
           float largest_space_6Mths,
           float largest_space_12Mths,
           java.lang.String property_mgr,
           java.lang.String property_mgr_phone,
           java.lang.String property_mgr_fax,
           java.lang.String property_mgr_email,
           java.lang.String mgmt_company,
           java.lang.String mgmt_company_addr,
           java.lang.String leasing_company,
           java.lang.String leasing_company_addr,
           java.lang.String leasing_agent,
           java.lang.String leasing_agent_phone,
           java.lang.String leasing_agent_fax,
           java.lang.String leasing_agent_email,
           java.lang.String comments,
           boolean static_info_correct) {
           this.id = id;
           this.quarter = quarter;
           this.property = property;
           this.completed_by = completed_by;
           this.for_sale = for_sale;
           this.for_sale_contact = for_sale_contact;
           this.for_sale_phone = for_sale_phone;
           this.sq_ft_for_lease = sq_ft_for_lease;
           this.occupancy = occupancy;
           this.occupied = occupied;
           this.largest_space = largest_space;
           this.largest_space_6Mths = largest_space_6Mths;
           this.largest_space_12Mths = largest_space_12Mths;
           this.property_mgr = property_mgr;
           this.property_mgr_phone = property_mgr_phone;
           this.property_mgr_fax = property_mgr_fax;
           this.property_mgr_email = property_mgr_email;
           this.mgmt_company = mgmt_company;
           this.mgmt_company_addr = mgmt_company_addr;
           this.leasing_company = leasing_company;
           this.leasing_company_addr = leasing_company_addr;
           this.leasing_agent = leasing_agent;
           this.leasing_agent_phone = leasing_agent_phone;
           this.leasing_agent_fax = leasing_agent_fax;
           this.leasing_agent_email = leasing_agent_email;
           this.comments = comments;
           this.static_info_correct = static_info_correct;
    }


    /**
     * Gets the id value for this CmuOfficeRetailSvc.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CmuOfficeRetailSvc.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the quarter value for this CmuOfficeRetailSvc.
     * 
     * @return quarter
     */
    public int getQuarter() {
        return quarter;
    }


    /**
     * Sets the quarter value for this CmuOfficeRetailSvc.
     * 
     * @param quarter
     */
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }


    /**
     * Gets the property value for this CmuOfficeRetailSvc.
     * 
     * @return property
     */
    public int getProperty() {
        return property;
    }


    /**
     * Sets the property value for this CmuOfficeRetailSvc.
     * 
     * @param property
     */
    public void setProperty(int property) {
        this.property = property;
    }


    /**
     * Gets the completed_by value for this CmuOfficeRetailSvc.
     * 
     * @return completed_by
     */
    public java.lang.String getCompleted_by() {
        return completed_by;
    }


    /**
     * Sets the completed_by value for this CmuOfficeRetailSvc.
     * 
     * @param completed_by
     */
    public void setCompleted_by(java.lang.String completed_by) {
        this.completed_by = completed_by;
    }


    /**
     * Gets the for_sale value for this CmuOfficeRetailSvc.
     * 
     * @return for_sale
     */
    public int getFor_sale() {
        return for_sale;
    }


    /**
     * Sets the for_sale value for this CmuOfficeRetailSvc.
     * 
     * @param for_sale
     */
    public void setFor_sale(int for_sale) {
        this.for_sale = for_sale;
    }


    /**
     * Gets the for_sale_contact value for this CmuOfficeRetailSvc.
     * 
     * @return for_sale_contact
     */
    public java.lang.String getFor_sale_contact() {
        return for_sale_contact;
    }


    /**
     * Sets the for_sale_contact value for this CmuOfficeRetailSvc.
     * 
     * @param for_sale_contact
     */
    public void setFor_sale_contact(java.lang.String for_sale_contact) {
        this.for_sale_contact = for_sale_contact;
    }


    /**
     * Gets the for_sale_phone value for this CmuOfficeRetailSvc.
     * 
     * @return for_sale_phone
     */
    public java.lang.String getFor_sale_phone() {
        return for_sale_phone;
    }


    /**
     * Sets the for_sale_phone value for this CmuOfficeRetailSvc.
     * 
     * @param for_sale_phone
     */
    public void setFor_sale_phone(java.lang.String for_sale_phone) {
        this.for_sale_phone = for_sale_phone;
    }


    /**
     * Gets the sq_ft_for_lease value for this CmuOfficeRetailSvc.
     * 
     * @return sq_ft_for_lease
     */
    public float getSq_ft_for_lease() {
        return sq_ft_for_lease;
    }


    /**
     * Sets the sq_ft_for_lease value for this CmuOfficeRetailSvc.
     * 
     * @param sq_ft_for_lease
     */
    public void setSq_ft_for_lease(float sq_ft_for_lease) {
        this.sq_ft_for_lease = sq_ft_for_lease;
    }


    /**
     * Gets the occupancy value for this CmuOfficeRetailSvc.
     * 
     * @return occupancy
     */
    public float getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this CmuOfficeRetailSvc.
     * 
     * @param occupancy
     */
    public void setOccupancy(float occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the occupied value for this CmuOfficeRetailSvc.
     * 
     * @return occupied
     */
    public float getOccupied() {
        return occupied;
    }


    /**
     * Sets the occupied value for this CmuOfficeRetailSvc.
     * 
     * @param occupied
     */
    public void setOccupied(float occupied) {
        this.occupied = occupied;
    }


    /**
     * Gets the largest_space value for this CmuOfficeRetailSvc.
     * 
     * @return largest_space
     */
    public float getLargest_space() {
        return largest_space;
    }


    /**
     * Sets the largest_space value for this CmuOfficeRetailSvc.
     * 
     * @param largest_space
     */
    public void setLargest_space(float largest_space) {
        this.largest_space = largest_space;
    }


    /**
     * Gets the largest_space_6Mths value for this CmuOfficeRetailSvc.
     * 
     * @return largest_space_6Mths
     */
    public float getLargest_space_6Mths() {
        return largest_space_6Mths;
    }


    /**
     * Sets the largest_space_6Mths value for this CmuOfficeRetailSvc.
     * 
     * @param largest_space_6Mths
     */
    public void setLargest_space_6Mths(float largest_space_6Mths) {
        this.largest_space_6Mths = largest_space_6Mths;
    }


    /**
     * Gets the largest_space_12Mths value for this CmuOfficeRetailSvc.
     * 
     * @return largest_space_12Mths
     */
    public float getLargest_space_12Mths() {
        return largest_space_12Mths;
    }


    /**
     * Sets the largest_space_12Mths value for this CmuOfficeRetailSvc.
     * 
     * @param largest_space_12Mths
     */
    public void setLargest_space_12Mths(float largest_space_12Mths) {
        this.largest_space_12Mths = largest_space_12Mths;
    }


    /**
     * Gets the property_mgr value for this CmuOfficeRetailSvc.
     * 
     * @return property_mgr
     */
    public java.lang.String getProperty_mgr() {
        return property_mgr;
    }


    /**
     * Sets the property_mgr value for this CmuOfficeRetailSvc.
     * 
     * @param property_mgr
     */
    public void setProperty_mgr(java.lang.String property_mgr) {
        this.property_mgr = property_mgr;
    }


    /**
     * Gets the property_mgr_phone value for this CmuOfficeRetailSvc.
     * 
     * @return property_mgr_phone
     */
    public java.lang.String getProperty_mgr_phone() {
        return property_mgr_phone;
    }


    /**
     * Sets the property_mgr_phone value for this CmuOfficeRetailSvc.
     * 
     * @param property_mgr_phone
     */
    public void setProperty_mgr_phone(java.lang.String property_mgr_phone) {
        this.property_mgr_phone = property_mgr_phone;
    }


    /**
     * Gets the property_mgr_fax value for this CmuOfficeRetailSvc.
     * 
     * @return property_mgr_fax
     */
    public java.lang.String getProperty_mgr_fax() {
        return property_mgr_fax;
    }


    /**
     * Sets the property_mgr_fax value for this CmuOfficeRetailSvc.
     * 
     * @param property_mgr_fax
     */
    public void setProperty_mgr_fax(java.lang.String property_mgr_fax) {
        this.property_mgr_fax = property_mgr_fax;
    }


    /**
     * Gets the property_mgr_email value for this CmuOfficeRetailSvc.
     * 
     * @return property_mgr_email
     */
    public java.lang.String getProperty_mgr_email() {
        return property_mgr_email;
    }


    /**
     * Sets the property_mgr_email value for this CmuOfficeRetailSvc.
     * 
     * @param property_mgr_email
     */
    public void setProperty_mgr_email(java.lang.String property_mgr_email) {
        this.property_mgr_email = property_mgr_email;
    }


    /**
     * Gets the mgmt_company value for this CmuOfficeRetailSvc.
     * 
     * @return mgmt_company
     */
    public java.lang.String getMgmt_company() {
        return mgmt_company;
    }


    /**
     * Sets the mgmt_company value for this CmuOfficeRetailSvc.
     * 
     * @param mgmt_company
     */
    public void setMgmt_company(java.lang.String mgmt_company) {
        this.mgmt_company = mgmt_company;
    }


    /**
     * Gets the mgmt_company_addr value for this CmuOfficeRetailSvc.
     * 
     * @return mgmt_company_addr
     */
    public java.lang.String getMgmt_company_addr() {
        return mgmt_company_addr;
    }


    /**
     * Sets the mgmt_company_addr value for this CmuOfficeRetailSvc.
     * 
     * @param mgmt_company_addr
     */
    public void setMgmt_company_addr(java.lang.String mgmt_company_addr) {
        this.mgmt_company_addr = mgmt_company_addr;
    }


    /**
     * Gets the leasing_company value for this CmuOfficeRetailSvc.
     * 
     * @return leasing_company
     */
    public java.lang.String getLeasing_company() {
        return leasing_company;
    }


    /**
     * Sets the leasing_company value for this CmuOfficeRetailSvc.
     * 
     * @param leasing_company
     */
    public void setLeasing_company(java.lang.String leasing_company) {
        this.leasing_company = leasing_company;
    }


    /**
     * Gets the leasing_company_addr value for this CmuOfficeRetailSvc.
     * 
     * @return leasing_company_addr
     */
    public java.lang.String getLeasing_company_addr() {
        return leasing_company_addr;
    }


    /**
     * Sets the leasing_company_addr value for this CmuOfficeRetailSvc.
     * 
     * @param leasing_company_addr
     */
    public void setLeasing_company_addr(java.lang.String leasing_company_addr) {
        this.leasing_company_addr = leasing_company_addr;
    }


    /**
     * Gets the leasing_agent value for this CmuOfficeRetailSvc.
     * 
     * @return leasing_agent
     */
    public java.lang.String getLeasing_agent() {
        return leasing_agent;
    }


    /**
     * Sets the leasing_agent value for this CmuOfficeRetailSvc.
     * 
     * @param leasing_agent
     */
    public void setLeasing_agent(java.lang.String leasing_agent) {
        this.leasing_agent = leasing_agent;
    }


    /**
     * Gets the leasing_agent_phone value for this CmuOfficeRetailSvc.
     * 
     * @return leasing_agent_phone
     */
    public java.lang.String getLeasing_agent_phone() {
        return leasing_agent_phone;
    }


    /**
     * Sets the leasing_agent_phone value for this CmuOfficeRetailSvc.
     * 
     * @param leasing_agent_phone
     */
    public void setLeasing_agent_phone(java.lang.String leasing_agent_phone) {
        this.leasing_agent_phone = leasing_agent_phone;
    }


    /**
     * Gets the leasing_agent_fax value for this CmuOfficeRetailSvc.
     * 
     * @return leasing_agent_fax
     */
    public java.lang.String getLeasing_agent_fax() {
        return leasing_agent_fax;
    }


    /**
     * Sets the leasing_agent_fax value for this CmuOfficeRetailSvc.
     * 
     * @param leasing_agent_fax
     */
    public void setLeasing_agent_fax(java.lang.String leasing_agent_fax) {
        this.leasing_agent_fax = leasing_agent_fax;
    }


    /**
     * Gets the leasing_agent_email value for this CmuOfficeRetailSvc.
     * 
     * @return leasing_agent_email
     */
    public java.lang.String getLeasing_agent_email() {
        return leasing_agent_email;
    }


    /**
     * Sets the leasing_agent_email value for this CmuOfficeRetailSvc.
     * 
     * @param leasing_agent_email
     */
    public void setLeasing_agent_email(java.lang.String leasing_agent_email) {
        this.leasing_agent_email = leasing_agent_email;
    }


    /**
     * Gets the comments value for this CmuOfficeRetailSvc.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CmuOfficeRetailSvc.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the static_info_correct value for this CmuOfficeRetailSvc.
     * 
     * @return static_info_correct
     */
    public boolean isStatic_info_correct() {
        return static_info_correct;
    }


    /**
     * Sets the static_info_correct value for this CmuOfficeRetailSvc.
     * 
     * @param static_info_correct
     */
    public void setStatic_info_correct(boolean static_info_correct) {
        this.static_info_correct = static_info_correct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmuOfficeRetailSvc)) return false;
        CmuOfficeRetailSvc other = (CmuOfficeRetailSvc) obj;
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
            this.for_sale == other.getFor_sale() &&
            ((this.for_sale_contact==null && other.getFor_sale_contact()==null) || 
             (this.for_sale_contact!=null &&
              this.for_sale_contact.equals(other.getFor_sale_contact()))) &&
            ((this.for_sale_phone==null && other.getFor_sale_phone()==null) || 
             (this.for_sale_phone!=null &&
              this.for_sale_phone.equals(other.getFor_sale_phone()))) &&
            this.sq_ft_for_lease == other.getSq_ft_for_lease() &&
            this.occupancy == other.getOccupancy() &&
            this.occupied == other.getOccupied() &&
            this.largest_space == other.getLargest_space() &&
            this.largest_space_6Mths == other.getLargest_space_6Mths() &&
            this.largest_space_12Mths == other.getLargest_space_12Mths() &&
            ((this.property_mgr==null && other.getProperty_mgr()==null) || 
             (this.property_mgr!=null &&
              this.property_mgr.equals(other.getProperty_mgr()))) &&
            ((this.property_mgr_phone==null && other.getProperty_mgr_phone()==null) || 
             (this.property_mgr_phone!=null &&
              this.property_mgr_phone.equals(other.getProperty_mgr_phone()))) &&
            ((this.property_mgr_fax==null && other.getProperty_mgr_fax()==null) || 
             (this.property_mgr_fax!=null &&
              this.property_mgr_fax.equals(other.getProperty_mgr_fax()))) &&
            ((this.property_mgr_email==null && other.getProperty_mgr_email()==null) || 
             (this.property_mgr_email!=null &&
              this.property_mgr_email.equals(other.getProperty_mgr_email()))) &&
            ((this.mgmt_company==null && other.getMgmt_company()==null) || 
             (this.mgmt_company!=null &&
              this.mgmt_company.equals(other.getMgmt_company()))) &&
            ((this.mgmt_company_addr==null && other.getMgmt_company_addr()==null) || 
             (this.mgmt_company_addr!=null &&
              this.mgmt_company_addr.equals(other.getMgmt_company_addr()))) &&
            ((this.leasing_company==null && other.getLeasing_company()==null) || 
             (this.leasing_company!=null &&
              this.leasing_company.equals(other.getLeasing_company()))) &&
            ((this.leasing_company_addr==null && other.getLeasing_company_addr()==null) || 
             (this.leasing_company_addr!=null &&
              this.leasing_company_addr.equals(other.getLeasing_company_addr()))) &&
            ((this.leasing_agent==null && other.getLeasing_agent()==null) || 
             (this.leasing_agent!=null &&
              this.leasing_agent.equals(other.getLeasing_agent()))) &&
            ((this.leasing_agent_phone==null && other.getLeasing_agent_phone()==null) || 
             (this.leasing_agent_phone!=null &&
              this.leasing_agent_phone.equals(other.getLeasing_agent_phone()))) &&
            ((this.leasing_agent_fax==null && other.getLeasing_agent_fax()==null) || 
             (this.leasing_agent_fax!=null &&
              this.leasing_agent_fax.equals(other.getLeasing_agent_fax()))) &&
            ((this.leasing_agent_email==null && other.getLeasing_agent_email()==null) || 
             (this.leasing_agent_email!=null &&
              this.leasing_agent_email.equals(other.getLeasing_agent_email()))) &&
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
        _hashCode += getFor_sale();
        if (getFor_sale_contact() != null) {
            _hashCode += getFor_sale_contact().hashCode();
        }
        if (getFor_sale_phone() != null) {
            _hashCode += getFor_sale_phone().hashCode();
        }
        _hashCode += new Float(getSq_ft_for_lease()).hashCode();
        _hashCode += new Float(getOccupancy()).hashCode();
        _hashCode += new Float(getOccupied()).hashCode();
        _hashCode += new Float(getLargest_space()).hashCode();
        _hashCode += new Float(getLargest_space_6Mths()).hashCode();
        _hashCode += new Float(getLargest_space_12Mths()).hashCode();
        if (getProperty_mgr() != null) {
            _hashCode += getProperty_mgr().hashCode();
        }
        if (getProperty_mgr_phone() != null) {
            _hashCode += getProperty_mgr_phone().hashCode();
        }
        if (getProperty_mgr_fax() != null) {
            _hashCode += getProperty_mgr_fax().hashCode();
        }
        if (getProperty_mgr_email() != null) {
            _hashCode += getProperty_mgr_email().hashCode();
        }
        if (getMgmt_company() != null) {
            _hashCode += getMgmt_company().hashCode();
        }
        if (getMgmt_company_addr() != null) {
            _hashCode += getMgmt_company_addr().hashCode();
        }
        if (getLeasing_company() != null) {
            _hashCode += getLeasing_company().hashCode();
        }
        if (getLeasing_company_addr() != null) {
            _hashCode += getLeasing_company_addr().hashCode();
        }
        if (getLeasing_agent() != null) {
            _hashCode += getLeasing_agent().hashCode();
        }
        if (getLeasing_agent_phone() != null) {
            _hashCode += getLeasing_agent_phone().hashCode();
        }
        if (getLeasing_agent_fax() != null) {
            _hashCode += getLeasing_agent_fax().hashCode();
        }
        if (getLeasing_agent_email() != null) {
            _hashCode += getLeasing_agent_email().hashCode();
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
        new org.apache.axis.description.TypeDesc(CmuOfficeRetailSvc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:cmu", "CmuOfficeRetailSvc"));
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
        elemField.setFieldName("for_sale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "for_sale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("for_sale_contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "for_sale_contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("for_sale_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "for_sale_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sq_ft_for_lease");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sq_ft_for_lease"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupancy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "occupancy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "occupied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largest_space");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largest_space"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largest_space_6Mths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largest_space_6mths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largest_space_12Mths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largest_space_12mths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property_mgr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property_mgr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property_mgr_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property_mgr_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property_mgr_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property_mgr_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property_mgr_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property_mgr_email"));
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
        elemField.setFieldName("leasing_company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leasing_company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leasing_company_addr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leasing_company_addr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leasing_agent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leasing_agent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leasing_agent_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leasing_agent_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leasing_agent_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leasing_agent_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leasing_agent_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leasing_agent_email"));
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
