//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about a person or entity associated with an air trip who will not be traveling. This is generally used to describe one or more parties that may be paying for a ticket and/or making the travel plans.
 * 
 * <p>Java class for AirArrangerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirArrangerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompanyInfo" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Role">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Individual"/>
 *             &lt;enumeration value="Employer"/>
 *             &lt;enumeration value="TravelAgent"/>
 *             &lt;enumeration value="Application"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="IATA_Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirArrangerType", propOrder = {
    "profileRef",
    "companyInfo",
    "contactName"
})
public class AirArrangerType_2015B {

    @XmlElement(name = "ProfileRef")
    protected AirArrangerType_2015B.ProfileRef_2015B profileRef;
    @XmlElement(name = "CompanyInfo")
    protected CompanyNameType_2015B companyInfo;
    @XmlElement(name = "ContactName")
    protected PersonNameType_2015B contactName;
    @XmlAttribute(name = "Role")
    protected String role;
    @XmlAttribute(name = "IATA_Number")
    protected String iataNumber;

    /**
     * Gets the value of the profileRef property.
     * 
     * @return
     *     possible object is
     *     {@link AirArrangerType_2015B.ProfileRef_2015B }
     *     
     */
    public AirArrangerType_2015B.ProfileRef_2015B getProfileRef() {
        return profileRef;
    }

    /**
     * Sets the value of the profileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirArrangerType_2015B.ProfileRef_2015B }
     *     
     */
    public void setProfileRef(AirArrangerType_2015B.ProfileRef_2015B value) {
        this.profileRef = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType_2015B }
     *     
     */
    public CompanyNameType_2015B getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType_2015B }
     *     
     */
    public void setCompanyInfo(CompanyNameType_2015B value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType_2015B }
     *     
     */
    public PersonNameType_2015B getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType_2015B }
     *     
     */
    public void setContactName(PersonNameType_2015B value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uniqueID"
    })
    public static class ProfileRef_2015B {

        @XmlElement(name = "UniqueID", required = true)
        protected UniqueIDType_2015B uniqueID;

        /**
         * Gets the value of the uniqueID property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType_2015B }
         *     
         */
        public UniqueIDType_2015B getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType_2015B }
         *     
         */
        public void setUniqueID(UniqueIDType_2015B value) {
            this.uniqueID = value;
        }

    }

}
