/**
 * PhoneAndryukhinNU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.phone;

public class PhoneAndryukhinNU  implements java.io.Serializable {
    private int id;

    private org.bm.service.manufactor.ManufactorAndryukhinNU manufactor;

    private int manufactorid;

    private java.lang.String model;

    private int year;

    public PhoneAndryukhinNU() {
    }

    public PhoneAndryukhinNU(
           int id,
           org.bm.service.manufactor.ManufactorAndryukhinNU manufactor,
           int manufactorid,
           java.lang.String model,
           int year) {
           this.id = id;
           this.manufactor = manufactor;
           this.manufactorid = manufactorid;
           this.model = model;
           this.year = year;
    }


    /**
     * Gets the id value for this PhoneAndryukhinNU.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PhoneAndryukhinNU.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the manufactor value for this PhoneAndryukhinNU.
     * 
     * @return manufactor
     */
    public org.bm.service.manufactor.ManufactorAndryukhinNU getManufactor() {
        return manufactor;
    }


    /**
     * Sets the manufactor value for this PhoneAndryukhinNU.
     * 
     * @param manufactor
     */
    public void setManufactor(org.bm.service.manufactor.ManufactorAndryukhinNU manufactor) {
        this.manufactor = manufactor;
    }


    /**
     * Gets the manufactorid value for this PhoneAndryukhinNU.
     * 
     * @return manufactorid
     */
    public int getManufactorid() {
        return manufactorid;
    }


    /**
     * Sets the manufactorid value for this PhoneAndryukhinNU.
     * 
     * @param manufactorid
     */
    public void setManufactorid(int manufactorid) {
        this.manufactorid = manufactorid;
    }


    /**
     * Gets the model value for this PhoneAndryukhinNU.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this PhoneAndryukhinNU.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the year value for this PhoneAndryukhinNU.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this PhoneAndryukhinNU.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhoneAndryukhinNU)) return false;
        PhoneAndryukhinNU other = (PhoneAndryukhinNU) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.manufactor==null && other.getManufactor()==null) || 
             (this.manufactor!=null &&
              this.manufactor.equals(other.getManufactor()))) &&
            this.manufactorid == other.getManufactorid() &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            this.year == other.getYear();
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
        _hashCode += getId();
        if (getManufactor() != null) {
            _hashCode += getManufactor().hashCode();
        }
        _hashCode += getManufactorid();
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        _hashCode += getYear();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneAndryukhinNU.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://phone.org", "phoneAndryukhinNU"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://manufactor.org", "manufactorAndryukhinNU"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufactorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufactorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
