/**
 * SaleAndryukhinNU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bm.service.sale;

public class SaleAndryukhinNU  implements java.io.Serializable {
    private int id;

    private org.bm.service.office.OfficeAndryukhinNU office;

    private int officeid;

    private org.bm.service.phone.PhoneAndryukhinNU phone;

    private int phoneid;

    private float price;

    private java.util.Date saleDate;

    public SaleAndryukhinNU() {
    }

    public SaleAndryukhinNU(
           int id,
           org.bm.service.office.OfficeAndryukhinNU office,
           int officeid,
           org.bm.service.phone.PhoneAndryukhinNU phone,
           int phoneid,
           float price,
           java.util.Date saleDate) {
           this.id = id;
           this.office = office;
           this.officeid = officeid;
           this.phone = phone;
           this.phoneid = phoneid;
           this.price = price;
           this.saleDate = saleDate;
    }


    /**
     * Gets the id value for this SaleAndryukhinNU.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SaleAndryukhinNU.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the office value for this SaleAndryukhinNU.
     * 
     * @return office
     */
    public org.bm.service.office.OfficeAndryukhinNU getOffice() {
        return office;
    }


    /**
     * Sets the office value for this SaleAndryukhinNU.
     * 
     * @param office
     */
    public void setOffice(org.bm.service.office.OfficeAndryukhinNU office) {
        this.office = office;
    }


    /**
     * Gets the officeid value for this SaleAndryukhinNU.
     * 
     * @return officeid
     */
    public int getOfficeid() {
        return officeid;
    }


    /**
     * Sets the officeid value for this SaleAndryukhinNU.
     * 
     * @param officeid
     */
    public void setOfficeid(int officeid) {
        this.officeid = officeid;
    }


    /**
     * Gets the phone value for this SaleAndryukhinNU.
     * 
     * @return phone
     */
    public org.bm.service.phone.PhoneAndryukhinNU getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this SaleAndryukhinNU.
     * 
     * @param phone
     */
    public void setPhone(org.bm.service.phone.PhoneAndryukhinNU phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneid value for this SaleAndryukhinNU.
     * 
     * @return phoneid
     */
    public int getPhoneid() {
        return phoneid;
    }


    /**
     * Sets the phoneid value for this SaleAndryukhinNU.
     * 
     * @param phoneid
     */
    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
    }


    /**
     * Gets the price value for this SaleAndryukhinNU.
     * 
     * @return price
     */
    public float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this SaleAndryukhinNU.
     * 
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }


    /**
     * Gets the saleDate value for this SaleAndryukhinNU.
     * 
     * @return saleDate
     */
    public java.util.Date getSaleDate() {
        return saleDate;
    }


    /**
     * Sets the saleDate value for this SaleAndryukhinNU.
     * 
     * @param saleDate
     */
    public void setSaleDate(java.util.Date saleDate) {
        this.saleDate = saleDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaleAndryukhinNU)) return false;
        SaleAndryukhinNU other = (SaleAndryukhinNU) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.office==null && other.getOffice()==null) || 
             (this.office!=null &&
              this.office.equals(other.getOffice()))) &&
            this.officeid == other.getOfficeid() &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            this.phoneid == other.getPhoneid() &&
            this.price == other.getPrice() &&
            ((this.saleDate==null && other.getSaleDate()==null) || 
             (this.saleDate!=null &&
              this.saleDate.equals(other.getSaleDate())));
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
        if (getOffice() != null) {
            _hashCode += getOffice().hashCode();
        }
        _hashCode += getOfficeid();
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        _hashCode += getPhoneid();
        _hashCode += new Float(getPrice()).hashCode();
        if (getSaleDate() != null) {
            _hashCode += getSaleDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaleAndryukhinNU.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sale.org", "saleAndryukhinNU"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("office");
        elemField.setXmlName(new javax.xml.namespace.QName("", "office"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://office.org", "officeAndryukhinNU"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://phone.org", "phoneAndryukhinNU"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
