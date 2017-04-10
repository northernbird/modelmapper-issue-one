//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The classifications of revenue data associated with the StayInfo report. A RevenueCategory provide a way to classify guest financial stay data and analyze guest spending for a certain category (e.g., food and beverage, room, etc.)
 * 
 * <p>Java class for RevenueCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenueCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RevenueDetails" type="{http://www.opentravel.org/OTA/2003/05}RevenueDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RevenueCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueCategoryType", propOrder = {
    "summaryAmount",
    "revenueDetails"
})
public class RevenueCategoryType_2015B {

    @XmlElement(name = "SummaryAmount")
    protected RevenueCategoryType_2015B.SummaryAmount_2015B summaryAmount;
    @XmlElement(name = "RevenueDetails")
    protected RevenueDetailsType_2015B revenueDetails;
    @XmlAttribute(name = "RevenueCategoryCode")
    protected String revenueCategoryCode;

    /**
     * Gets the value of the summaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueCategoryType_2015B.SummaryAmount_2015B }
     *     
     */
    public RevenueCategoryType_2015B.SummaryAmount_2015B getSummaryAmount() {
        return summaryAmount;
    }

    /**
     * Sets the value of the summaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueCategoryType_2015B.SummaryAmount_2015B }
     *     
     */
    public void setSummaryAmount(RevenueCategoryType_2015B.SummaryAmount_2015B value) {
        this.summaryAmount = value;
    }

    /**
     * Gets the value of the revenueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueDetailsType_2015B }
     *     
     */
    public RevenueDetailsType_2015B getRevenueDetails() {
        return revenueDetails;
    }

    /**
     * Sets the value of the revenueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueDetailsType_2015B }
     *     
     */
    public void setRevenueDetails(RevenueDetailsType_2015B value) {
        this.revenueDetails = value;
    }

    /**
     * Gets the value of the revenueCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCategoryCode() {
        return revenueCategoryCode;
    }

    /**
     * Sets the value of the revenueCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCategoryCode(String value) {
        this.revenueCategoryCode = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SummaryAmount_2015B {

        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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