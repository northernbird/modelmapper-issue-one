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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the information used to fully describe a rail reservation.
 * 
 * <p>Java class for RailReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
 *         &lt;element name="Itinerary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginAndDestination" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *                             &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *                             &lt;element name="TrainSegment" type="{http://www.opentravel.org/OTA/2003/05}BookedTrainSegmentType" maxOccurs="9"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RailCharges" type="{http://www.opentravel.org/OTA/2003/05}RailChargesType" minOccurs="0"/>
 *                   &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerInfo" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerCategoryDetailType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="PaymentRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentRule" type="{http://www.opentravel.org/OTA/2003/05}MonetaryRuleType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fulfillment" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastHoldDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailReservationType", propOrder = {
    "uniqueID",
    "itinerary",
    "passengerInfo",
    "paymentRules",
    "fulfillment",
    "tpaExtensions"
})
public class RailReservationType_2015B {

    @XmlElement(name = "UniqueID", required = true)
    protected UniqueIDType_2015B uniqueID;
    @XmlElement(name = "Itinerary", required = true)
    protected RailReservationType_2015B.Itinerary_2015B itinerary;
    @XmlElement(name = "PassengerInfo")
    protected List<RailPassengerCategoryDetailType_2015B> passengerInfo;
    @XmlElement(name = "PaymentRules")
    protected RailReservationType_2015B.PaymentRules_2015B paymentRules;
    @XmlElement(name = "Fulfillment")
    protected CompanyNameType_2015B fulfillment;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2015B tpaExtensions;
    @XmlAttribute(name = "LastHoldDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastHoldDate;

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

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link RailReservationType_2015B.Itinerary_2015B }
     *     
     */
    public RailReservationType_2015B.Itinerary_2015B getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailReservationType_2015B.Itinerary_2015B }
     *     
     */
    public void setItinerary(RailReservationType_2015B.Itinerary_2015B value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerCategoryDetailType_2015B }
     * 
     * 
     */
    public List<RailPassengerCategoryDetailType_2015B> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<RailPassengerCategoryDetailType_2015B>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link RailReservationType_2015B.PaymentRules_2015B }
     *     
     */
    public RailReservationType_2015B.PaymentRules_2015B getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailReservationType_2015B.PaymentRules_2015B }
     *     
     */
    public void setPaymentRules(RailReservationType_2015B.PaymentRules_2015B value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType_2015B }
     *     
     */
    public CompanyNameType_2015B getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType_2015B }
     *     
     */
    public void setFulfillment(CompanyNameType_2015B value) {
        this.fulfillment = value;
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
     * Gets the value of the lastHoldDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastHoldDate() {
        return lastHoldDate;
    }

    /**
     * Sets the value of the lastHoldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastHoldDate(XMLGregorianCalendar value) {
        this.lastHoldDate = value;
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
     *         &lt;element name="OriginAndDestination" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
     *                   &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
     *                   &lt;element name="TrainSegment" type="{http://www.opentravel.org/OTA/2003/05}BookedTrainSegmentType" maxOccurs="9"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RailCharges" type="{http://www.opentravel.org/OTA/2003/05}RailChargesType" minOccurs="0"/>
     *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/>
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
        "originAndDestination",
        "railCharges",
        "vendorMessages"
    })
    public static class Itinerary_2015B {

        @XmlElement(name = "OriginAndDestination", required = true)
        protected List<RailReservationType_2015B.Itinerary_2015B.OriginAndDestination_2015B> originAndDestination;
        @XmlElement(name = "RailCharges")
        protected RailChargesType_2015B railCharges;
        @XmlElement(name = "VendorMessages")
        protected VendorMessagesType_2015B vendorMessages;

        /**
         * Gets the value of the originAndDestination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originAndDestination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginAndDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RailReservationType_2015B.Itinerary_2015B.OriginAndDestination_2015B }
         * 
         * 
         */
        public List<RailReservationType_2015B.Itinerary_2015B.OriginAndDestination_2015B> getOriginAndDestination() {
            if (originAndDestination == null) {
                originAndDestination = new ArrayList<RailReservationType_2015B.Itinerary_2015B.OriginAndDestination_2015B>();
            }
            return this.originAndDestination;
        }

        /**
         * Gets the value of the railCharges property.
         * 
         * @return
         *     possible object is
         *     {@link RailChargesType_2015B }
         *     
         */
        public RailChargesType_2015B getRailCharges() {
            return railCharges;
        }

        /**
         * Sets the value of the railCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link RailChargesType_2015B }
         *     
         */
        public void setRailCharges(RailChargesType_2015B value) {
            this.railCharges = value;
        }

        /**
         * Gets the value of the vendorMessages property.
         * 
         * @return
         *     possible object is
         *     {@link VendorMessagesType_2015B }
         *     
         */
        public VendorMessagesType_2015B getVendorMessages() {
            return vendorMessages;
        }

        /**
         * Sets the value of the vendorMessages property.
         * 
         * @param value
         *     allowed object is
         *     {@link VendorMessagesType_2015B }
         *     
         */
        public void setVendorMessages(VendorMessagesType_2015B value) {
            this.vendorMessages = value;
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
         *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
         *         &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
         *         &lt;element name="TrainSegment" type="{http://www.opentravel.org/OTA/2003/05}BookedTrainSegmentType" maxOccurs="9"/>
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
            "originLocation",
            "destinationLocation",
            "trainSegment"
        })
        public static class OriginAndDestination_2015B {

            @XmlElement(name = "OriginLocation", required = true)
            protected LocationType_2015B originLocation;
            @XmlElement(name = "DestinationLocation", required = true)
            protected LocationType_2015B destinationLocation;
            @XmlElement(name = "TrainSegment", required = true)
            protected List<BookedTrainSegmentType_2015B> trainSegment;

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link LocationType_2015B }
             *     
             */
            public LocationType_2015B getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType_2015B }
             *     
             */
            public void setOriginLocation(LocationType_2015B value) {
                this.originLocation = value;
            }

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link LocationType_2015B }
             *     
             */
            public LocationType_2015B getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType_2015B }
             *     
             */
            public void setDestinationLocation(LocationType_2015B value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the trainSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trainSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTrainSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookedTrainSegmentType_2015B }
             * 
             * 
             */
            public List<BookedTrainSegmentType_2015B> getTrainSegment() {
                if (trainSegment == null) {
                    trainSegment = new ArrayList<BookedTrainSegmentType_2015B>();
                }
                return this.trainSegment;
            }

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
     *         &lt;element name="PaymentRule" type="{http://www.opentravel.org/OTA/2003/05}MonetaryRuleType" maxOccurs="9"/>
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
        "paymentRule"
    })
    public static class PaymentRules_2015B {

        @XmlElement(name = "PaymentRule", required = true)
        protected List<MonetaryRuleType_2015B> paymentRule;

        /**
         * Gets the value of the paymentRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryRuleType_2015B }
         * 
         * 
         */
        public List<MonetaryRuleType_2015B> getPaymentRule() {
            if (paymentRule == null) {
                paymentRule = new ArrayList<MonetaryRuleType_2015B>();
            }
            return this.paymentRule;
        }

    }

}