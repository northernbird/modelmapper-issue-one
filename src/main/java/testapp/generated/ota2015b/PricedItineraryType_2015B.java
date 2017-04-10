//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Itinerary with pricing information.
 * 
 * <p>Java class for PricedItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="AirItineraryPricingInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
 *                 &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Notes" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TicketingInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type">
 *                 &lt;sequence>
 *                   &lt;element name="DeliveryInfo" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PaymentType" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="PriceType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="NUC_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItineraryType", propOrder = {
    "airItinerary",
    "airItineraryPricingInfo",
    "notes",
    "ticketingInfo"
})
@XmlSeeAlso({
    testapp.generated.ota2015b.PricedItinerariesType_2015B.PricedItinerary_2015B.class
})
public class PricedItineraryType_2015B {

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType_2015B airItinerary;
    @XmlElement(name = "AirItineraryPricingInfo")
    protected PricedItineraryType_2015B.AirItineraryPricingInfo_2015B airItineraryPricingInfo;
    @XmlElement(name = "Notes")
    protected List<FreeTextType_2015B> notes;
    @XmlElement(name = "TicketingInfo")
    protected PricedItineraryType_2015B.TicketingInfo_2015B ticketingInfo;
    @XmlAttribute(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "PriceType")
    protected String priceType;
    @XmlAttribute(name = "NUC_Rate")
    protected BigDecimal nucRate;
    @XmlAttribute(name = "ExchangeRate")
    protected BigDecimal exchangeRate;

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType_2015B }
     *     
     */
    public AirItineraryType_2015B getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType_2015B }
     *     
     */
    public void setAirItinerary(AirItineraryType_2015B value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the airItineraryPricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryType_2015B.AirItineraryPricingInfo_2015B }
     *     
     */
    public PricedItineraryType_2015B.AirItineraryPricingInfo_2015B getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    /**
     * Sets the value of the airItineraryPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryType_2015B.AirItineraryPricingInfo_2015B }
     *     
     */
    public void setAirItineraryPricingInfo(PricedItineraryType_2015B.AirItineraryPricingInfo_2015B value) {
        this.airItineraryPricingInfo = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType_2015B }
     * 
     * 
     */
    public List<FreeTextType_2015B> getNotes() {
        if (notes == null) {
            notes = new ArrayList<FreeTextType_2015B>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the ticketingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryType_2015B.TicketingInfo_2015B }
     *     
     */
    public PricedItineraryType_2015B.TicketingInfo_2015B getTicketingInfo() {
        return ticketingInfo;
    }

    /**
     * Sets the value of the ticketingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryType_2015B.TicketingInfo_2015B }
     *     
     */
    public void setTicketingInfo(PricedItineraryType_2015B.TicketingInfo_2015B value) {
        this.ticketingInfo = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the nucRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUCRate() {
        return nucRate;
    }

    /**
     * Sets the value of the nucRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUCRate(BigDecimal value) {
        this.nucRate = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
     *       &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirItineraryPricingInfo_2015B
        extends AirItineraryPricingInfoType_2015B
    {

        @XmlAttribute(name = "RepriceRequired")
        protected Boolean repriceRequired;

        /**
         * Gets the value of the repriceRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRepriceRequired() {
            return repriceRequired;
        }

        /**
         * Sets the value of the repriceRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRepriceRequired(Boolean value) {
            this.repriceRequired = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type">
     *       &lt;sequence>
     *         &lt;element name="DeliveryInfo" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PaymentType" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deliveryInfo"
    })
    public static class TicketingInfo_2015B
        extends TicketingInfoRSType_2015B
    {

        @XmlElement(name = "DeliveryInfo")
        protected List<PricedItineraryType_2015B.TicketingInfo_2015B.DeliveryInfo_2015B> deliveryInfo;
        @XmlAttribute(name = "PaymentType")
        protected List<String> paymentType;

        /**
         * Gets the value of the deliveryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedItineraryType_2015B.TicketingInfo_2015B.DeliveryInfo_2015B }
         * 
         * 
         */
        public List<PricedItineraryType_2015B.TicketingInfo_2015B.DeliveryInfo_2015B> getDeliveryInfo() {
            if (deliveryInfo == null) {
                deliveryInfo = new ArrayList<PricedItineraryType_2015B.TicketingInfo_2015B.DeliveryInfo_2015B>();
            }
            return this.deliveryInfo;
        }

        /**
         * Gets the value of the paymentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaymentType() {
            if (paymentType == null) {
                paymentType = new ArrayList<String>();
            }
            return this.paymentType;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *       &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DeliveryInfo_2015B {

            @XmlAttribute(name = "DistribType")
            protected String distribType;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;

            /**
             * Gets the value of the distribType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistribType() {
                return distribType;
            }

            /**
             * Sets the value of the distribType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistribType(String value) {
                this.distribType = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

        }

    }

}
