//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specify actual airline, flight number, or booking class
 * 
 * <p>Java class for SpecificFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="BookingClassPref" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BookingClassPrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificFlightInfoType", propOrder = {
    "flightNumber",
    "airline",
    "bookingClassPref",
    "tpaExtensions"
})
public class SpecificFlightInfoType_2015B {

    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "Airline")
    protected CompanyNameType_2015B airline;
    @XmlElement(name = "BookingClassPref")
    protected List<SpecificFlightInfoType_2015B.BookingClassPref_2015B> bookingClassPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2015B tpaExtensions;

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType_2015B }
     *     
     */
    public CompanyNameType_2015B getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType_2015B }
     *     
     */
    public void setAirline(CompanyNameType_2015B value) {
        this.airline = value;
    }

    /**
     * Gets the value of the bookingClassPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificFlightInfoType_2015B.BookingClassPref_2015B }
     * 
     * 
     */
    public List<SpecificFlightInfoType_2015B.BookingClassPref_2015B> getBookingClassPref() {
        if (bookingClassPref == null) {
            bookingClassPref = new ArrayList<SpecificFlightInfoType_2015B.BookingClassPref_2015B>();
        }
        return this.bookingClassPref;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType_2015B }
     *     
     */
    public TPAExtensionsType_2015B getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType_2015B }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType_2015B value) {
        this.tpaExtensions = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BookingClassPrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingClassPref_2015B {

        @XmlAttribute(name = "ResBookDesigCode", required = true)
        protected String resBookDesigCode;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType_2015B preferLevel;
        @XmlAttribute(name = "ResBookDesigCodeType")
        protected String resBookDesigCodeType;

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType_2015B }
         *     
         */
        public PreferLevelType_2015B getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType_2015B }
         *     
         */
        public void setPreferLevel(PreferLevelType_2015B value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the resBookDesigCodeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCodeType() {
            return resBookDesigCodeType;
        }

        /**
         * Sets the value of the resBookDesigCodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCodeType(String value) {
            this.resBookDesigCodeType = value;
        }

    }

}
