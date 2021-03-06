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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing Information for an Air Itinerary.
 * 
 * <p>Java class for AirItineraryPricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryPricingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareType">
 *                 &lt;attribute name="Usage">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="PassengerFare"/>
 *                       &lt;enumeration value="TicketFee"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PTC_FareBreakdowns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="256"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareInfo" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceRequestInformation" type="{http://www.opentravel.org/OTA/2003/05}PriceRequestInformationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://www.opentravel.org/OTA/2003/05}PricingSourceType" />
 *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="QuoteID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryPricingInfoType", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos",
    "priceRequestInformation",
    "tpaExtensions"
})
@XmlSeeAlso({
    BookingPriceInfoType_2015B.class,
    testapp.generated.ota2015b.PricedItineraryType_2015B.AirItineraryPricingInfo_2015B.class
})
public class AirItineraryPricingInfoType_2015B {

    @XmlElement(name = "ItinTotalFare")
    protected List<AirItineraryPricingInfoType_2015B.ItinTotalFare_2015B> itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected AirItineraryPricingInfoType_2015B.PTCFareBreakdowns_2015B ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected AirItineraryPricingInfoType_2015B.FareInfos_2015B fareInfos;
    @XmlElement(name = "PriceRequestInformation")
    protected PriceRequestInformationType_2015B priceRequestInformation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2015B tpaExtensions;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType_2015B pricingSource;
    @XmlAttribute(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;
    @XmlAttribute(name = "QuoteID")
    protected String quoteID;

    /**
     * Gets the value of the itinTotalFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinTotalFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinTotalFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItineraryPricingInfoType_2015B.ItinTotalFare_2015B }
     * 
     * 
     */
    public List<AirItineraryPricingInfoType_2015B.ItinTotalFare_2015B> getItinTotalFare() {
        if (itinTotalFare == null) {
            itinTotalFare = new ArrayList<AirItineraryPricingInfoType_2015B.ItinTotalFare_2015B>();
        }
        return this.itinTotalFare;
    }

    /**
     * Gets the value of the ptcFareBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType_2015B.PTCFareBreakdowns_2015B }
     *     
     */
    public AirItineraryPricingInfoType_2015B.PTCFareBreakdowns_2015B getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * Sets the value of the ptcFareBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType_2015B.PTCFareBreakdowns_2015B }
     *     
     */
    public void setPTCFareBreakdowns(AirItineraryPricingInfoType_2015B.PTCFareBreakdowns_2015B value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * Gets the value of the fareInfos property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType_2015B.FareInfos_2015B }
     *     
     */
    public AirItineraryPricingInfoType_2015B.FareInfos_2015B getFareInfos() {
        return fareInfos;
    }

    /**
     * Sets the value of the fareInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType_2015B.FareInfos_2015B }
     *     
     */
    public void setFareInfos(AirItineraryPricingInfoType_2015B.FareInfos_2015B value) {
        this.fareInfos = value;
    }

    /**
     * Gets the value of the priceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRequestInformationType_2015B }
     *     
     */
    public PriceRequestInformationType_2015B getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * Sets the value of the priceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestInformationType_2015B }
     *     
     */
    public void setPriceRequestInformation(PriceRequestInformationType_2015B value) {
        this.priceRequestInformation = value;
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
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType_2015B }
     *     
     */
    public PricingSourceType_2015B getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType_2015B }
     *     
     */
    public void setPricingSource(PricingSourceType_2015B value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the validatingAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirlineCode() {
        return validatingAirlineCode;
    }

    /**
     * Sets the value of the validatingAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirlineCode(String value) {
        this.validatingAirlineCode = value;
    }

    /**
     * Gets the value of the quoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * Sets the value of the quoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
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
     *         &lt;element name="FareInfo" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "fareInfo"
    })
    public static class FareInfos_2015B {

        @XmlElement(name = "FareInfo", required = true)
        protected List<AirItineraryPricingInfoType_2015B.FareInfos_2015B.FareInfo_2015B> fareInfo;

        /**
         * Gets the value of the fareInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryPricingInfoType_2015B.FareInfos_2015B.FareInfo_2015B }
         * 
         * 
         */
        public List<AirItineraryPricingInfoType_2015B.FareInfos_2015B.FareInfo_2015B> getFareInfo() {
            if (fareInfo == null) {
                fareInfo = new ArrayList<AirItineraryPricingInfoType_2015B.FareInfos_2015B.FareInfo_2015B>();
            }
            return this.fareInfo;
        }


        /**
         *  Information used to define a fare and its associated rules information.
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions"
        })
        public static class FareInfo_2015B
            extends FareInfoType_2015B
        {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType_2015B tpaExtensions;
            @XmlAttribute(name = "Operation")
            protected ActionType_2015B operation;
            @XmlAttribute(name = "RPH")
            protected String rph;

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
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType_2015B }
             *     
             */
            public ActionType_2015B getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType_2015B }
             *     
             */
            public void setOperation(ActionType_2015B value) {
                this.operation = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareType">
     *       &lt;attribute name="Usage">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="PassengerFare"/>
     *             &lt;enumeration value="TicketFee"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ItinTotalFare_2015B
        extends FareType_2015B
    {

        @XmlAttribute(name = "Usage")
        protected String usage;

        /**
         * Gets the value of the usage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsage() {
            return usage;
        }

        /**
         * Sets the value of the usage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsage(String value) {
            this.usage = value;
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
     *         &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="256"/>
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
        "ptcFareBreakdown"
    })
    public static class PTCFareBreakdowns_2015B {

        @XmlElement(name = "PTC_FareBreakdown", required = true)
        protected List<PTCFareBreakdownType_2015B> ptcFareBreakdown;

        /**
         * Gets the value of the ptcFareBreakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCFareBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType_2015B }
         * 
         * 
         */
        public List<PTCFareBreakdownType_2015B> getPTCFareBreakdown() {
            if (ptcFareBreakdown == null) {
                ptcFareBreakdown = new ArrayList<PTCFareBreakdownType_2015B>();
            }
            return this.ptcFareBreakdown;
        }

    }

}
