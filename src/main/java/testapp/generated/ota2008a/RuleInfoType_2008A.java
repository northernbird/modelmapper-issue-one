//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains summary fare rule information as well as detailed Rule Information for Fare Basis Codes.  Information may be actual rules data or the results returned from a rules-based inquiry.
 * 
 * <p>Java class for RuleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResTicketingRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdvResTicketing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType">
 *                           &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LengthOfStayRules" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="ChargesRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
 *                   &lt;element name="VoluntaryRefunds" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfoType", propOrder = {
    "resTicketingRules",
    "lengthOfStayRules",
    "chargesRules"
})
@XmlSeeAlso({
    testapp.generated.ota2008a.FareInfoType_2008A.RuleInfo_2008A.class
})
public class RuleInfoType_2008A {

    @XmlElement(name = "ResTicketingRules")
    protected RuleInfoType_2008A.ResTicketingRules_2008A resTicketingRules;
    @XmlElement(name = "LengthOfStayRules")
    protected StayRestrictionsType_2008A lengthOfStayRules;
    @XmlElement(name = "ChargesRules")
    protected RuleInfoType_2008A.ChargesRules_2008A chargesRules;

    /**
     * Gets the value of the resTicketingRules property.
     * 
     * @return
     *     possible object is
     *     {@link RuleInfoType_2008A.ResTicketingRules_2008A }
     *     
     */
    public RuleInfoType_2008A.ResTicketingRules_2008A getResTicketingRules() {
        return resTicketingRules;
    }

    /**
     * Sets the value of the resTicketingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfoType_2008A.ResTicketingRules_2008A }
     *     
     */
    public void setResTicketingRules(RuleInfoType_2008A.ResTicketingRules_2008A value) {
        this.resTicketingRules = value;
    }

    /**
     * Gets the value of the lengthOfStayRules property.
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictionsType_2008A }
     *     
     */
    public StayRestrictionsType_2008A getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    /**
     * Sets the value of the lengthOfStayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType_2008A }
     *     
     */
    public void setLengthOfStayRules(StayRestrictionsType_2008A value) {
        this.lengthOfStayRules = value;
    }

    /**
     * Gets the value of the chargesRules property.
     * 
     * @return
     *     possible object is
     *     {@link RuleInfoType_2008A.ChargesRules_2008A }
     *     
     */
    public RuleInfoType_2008A.ChargesRules_2008A getChargesRules() {
        return chargesRules;
    }

    /**
     * Sets the value of the chargesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfoType_2008A.ChargesRules_2008A }
     *     
     */
    public void setChargesRules(RuleInfoType_2008A.ChargesRules_2008A value) {
        this.chargesRules = value;
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
     *         &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
     *         &lt;element name="VoluntaryRefunds" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
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
        "voluntaryChanges",
        "voluntaryRefunds"
    })
    public static class ChargesRules_2008A {

        @XmlElement(name = "VoluntaryChanges")
        protected VoluntaryChangesType_2008A voluntaryChanges;
        @XmlElement(name = "VoluntaryRefunds")
        protected VoluntaryChangesType_2008A voluntaryRefunds;

        /**
         * Gets the value of the voluntaryChanges property.
         * 
         * @return
         *     possible object is
         *     {@link VoluntaryChangesType_2008A }
         *     
         */
        public VoluntaryChangesType_2008A getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /**
         * Sets the value of the voluntaryChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoluntaryChangesType_2008A }
         *     
         */
        public void setVoluntaryChanges(VoluntaryChangesType_2008A value) {
            this.voluntaryChanges = value;
        }

        /**
         * Gets the value of the voluntaryRefunds property.
         * 
         * @return
         *     possible object is
         *     {@link VoluntaryChangesType_2008A }
         *     
         */
        public VoluntaryChangesType_2008A getVoluntaryRefunds() {
            return voluntaryRefunds;
        }

        /**
         * Sets the value of the voluntaryRefunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoluntaryChangesType_2008A }
         *     
         */
        public void setVoluntaryRefunds(VoluntaryChangesType_2008A value) {
            this.voluntaryRefunds = value;
        }

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
     *         &lt;element name="AdvResTicketing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType">
     *                 &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "advResTicketing"
    })
    public static class ResTicketingRules_2008A {

        @XmlElement(name = "AdvResTicketing")
        protected RuleInfoType_2008A.ResTicketingRules_2008A.AdvResTicketing_2008A advResTicketing;

        /**
         * Gets the value of the advResTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link RuleInfoType_2008A.ResTicketingRules_2008A.AdvResTicketing_2008A }
         *     
         */
        public RuleInfoType_2008A.ResTicketingRules_2008A.AdvResTicketing_2008A getAdvResTicketing() {
            return advResTicketing;
        }

        /**
         * Sets the value of the advResTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link RuleInfoType_2008A.ResTicketingRules_2008A.AdvResTicketing_2008A }
         *     
         */
        public void setAdvResTicketing(RuleInfoType_2008A.ResTicketingRules_2008A.AdvResTicketing_2008A value) {
            this.advResTicketing = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType">
         *       &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdvResTicketing_2008A
            extends AdvResTicketingType_2008A
        {

            @XmlAttribute(name = "FirstTicketDate")
            protected String firstTicketDate;
            @XmlAttribute(name = "LastTicketDate")
            protected String lastTicketDate;

            /**
             * Gets the value of the firstTicketDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstTicketDate() {
                return firstTicketDate;
            }

            /**
             * Sets the value of the firstTicketDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstTicketDate(String value) {
                this.firstTicketDate = value;
            }

            /**
             * Gets the value of the lastTicketDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastTicketDate() {
                return lastTicketDate;
            }

            /**
             * Sets the value of the lastTicketDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastTicketDate(String value) {
                this.lastTicketDate = value;
            }

        }

    }

}
