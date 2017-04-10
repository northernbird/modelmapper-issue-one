//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The VehicleVendorAvailabilityType complex type identifies the data that describes the availability of one or more vehicles for a specific vendor, along with supplemental information about the vendor and the facilities of that vendor.
 * 
 * <p>Java class for VehicleVendorAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="VehAvails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehAvail" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType"/>
 *                             &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
 *                             &lt;element name="AdvanceBooking" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *                                     &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RateCategory" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RatePeriodSimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailVendorInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleVendorAvailabilityType", propOrder = {
    "vendor",
    "vehAvails",
    "info"
})
public class VehicleVendorAvailabilityType_2008A {

    @XmlElement(name = "Vendor")
    protected CompanyNameType_2008A vendor;
    @XmlElement(name = "VehAvails", required = true)
    protected VehicleVendorAvailabilityType_2008A.VehAvails_2008A vehAvails;
    @XmlElement(name = "Info")
    protected VehicleAvailVendorInfoType_2008A info;

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType_2008A }
     *     
     */
    public CompanyNameType_2008A getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType_2008A }
     *     
     */
    public void setVendor(CompanyNameType_2008A value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vehAvails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleVendorAvailabilityType_2008A.VehAvails_2008A }
     *     
     */
    public VehicleVendorAvailabilityType_2008A.VehAvails_2008A getVehAvails() {
        return vehAvails;
    }

    /**
     * Sets the value of the vehAvails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleVendorAvailabilityType_2008A.VehAvails_2008A }
     *     
     */
    public void setVehAvails(VehicleVendorAvailabilityType_2008A.VehAvails_2008A value) {
        this.vehAvails = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailVendorInfoType_2008A }
     *     
     */
    public VehicleAvailVendorInfoType_2008A getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailVendorInfoType_2008A }
     *     
     */
    public void setInfo(VehicleAvailVendorInfoType_2008A value) {
        this.info = value;
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
     *         &lt;element name="VehAvail" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType"/>
     *                   &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
     *                   &lt;element name="AdvanceBooking" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *                           &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RateCategory" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RatePeriodSimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehAvail"
    })
    public static class VehAvails_2008A {

        @XmlElement(name = "VehAvail", required = true)
        protected List<VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A> vehAvail;
        @XmlAttribute(name = "RateCategory")
        protected String rateCategory;
        @XmlAttribute(name = "RatePeriod")
        protected RatePeriodSimpleType_2008A ratePeriod;

        /**
         * Gets the value of the vehAvail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A }
         * 
         * 
         */
        public List<VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A> getVehAvail() {
            if (vehAvail == null) {
                vehAvail = new ArrayList<VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A>();
            }
            return this.vehAvail;
        }

        /**
         * Gets the value of the rateCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateCategory() {
            return rateCategory;
        }

        /**
         * Sets the value of the rateCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateCategory(String value) {
            this.rateCategory = value;
        }

        /**
         * Gets the value of the ratePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link RatePeriodSimpleType_2008A }
         *     
         */
        public RatePeriodSimpleType_2008A getRatePeriod() {
            return ratePeriod;
        }

        /**
         * Sets the value of the ratePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link RatePeriodSimpleType_2008A }
         *     
         */
        public void setRatePeriod(RatePeriodSimpleType_2008A value) {
            this.ratePeriod = value;
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
         *         &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType"/>
         *         &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
         *         &lt;element name="AdvanceBooking" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
         *                 &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        @XmlType(name = "", propOrder = {
            "vehAvailCore",
            "vehAvailInfo",
            "advanceBooking"
        })
        public static class VehAvail_2008A {

            @XmlElement(name = "VehAvailCore", required = true)
            protected VehicleAvailCoreType_2008A vehAvailCore;
            @XmlElement(name = "VehAvailInfo")
            protected VehicleAvailAdditionalInfoType_2008A vehAvailInfo;
            @XmlElement(name = "AdvanceBooking")
            protected VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A.AdvanceBooking_2008A advanceBooking;

            /**
             * Gets the value of the vehAvailCore property.
             * 
             * @return
             *     possible object is
             *     {@link VehicleAvailCoreType_2008A }
             *     
             */
            public VehicleAvailCoreType_2008A getVehAvailCore() {
                return vehAvailCore;
            }

            /**
             * Sets the value of the vehAvailCore property.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleAvailCoreType_2008A }
             *     
             */
            public void setVehAvailCore(VehicleAvailCoreType_2008A value) {
                this.vehAvailCore = value;
            }

            /**
             * Gets the value of the vehAvailInfo property.
             * 
             * @return
             *     possible object is
             *     {@link VehicleAvailAdditionalInfoType_2008A }
             *     
             */
            public VehicleAvailAdditionalInfoType_2008A getVehAvailInfo() {
                return vehAvailInfo;
            }

            /**
             * Sets the value of the vehAvailInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleAvailAdditionalInfoType_2008A }
             *     
             */
            public void setVehAvailInfo(VehicleAvailAdditionalInfoType_2008A value) {
                this.vehAvailInfo = value;
            }

            /**
             * Gets the value of the advanceBooking property.
             * 
             * @return
             *     possible object is
             *     {@link VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A.AdvanceBooking_2008A }
             *     
             */
            public VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A.AdvanceBooking_2008A getAdvanceBooking() {
                return advanceBooking;
            }

            /**
             * Sets the value of the advanceBooking property.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A.AdvanceBooking_2008A }
             *     
             */
            public void setAdvanceBooking(VehicleVendorAvailabilityType_2008A.VehAvails_2008A.VehAvail_2008A.AdvanceBooking_2008A value) {
                this.advanceBooking = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
             *       &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AdvanceBooking_2008A {

                @XmlAttribute(name = "RulesApplyInd")
                protected Boolean rulesApplyInd;
                @XmlAttribute(name = "AbsoluteDeadline")
                protected String absoluteDeadline;
                @XmlAttribute(name = "OffsetTimeUnit")
                protected TimeUnitType_2008A offsetTimeUnit;
                @XmlAttribute(name = "OffsetUnitMultiplier")
                protected Integer offsetUnitMultiplier;
                @XmlAttribute(name = "OffsetDropTime")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String offsetDropTime;

                /**
                 * Gets the value of the rulesApplyInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRulesApplyInd() {
                    return rulesApplyInd;
                }

                /**
                 * Sets the value of the rulesApplyInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRulesApplyInd(Boolean value) {
                    this.rulesApplyInd = value;
                }

                /**
                 * Gets the value of the absoluteDeadline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbsoluteDeadline() {
                    return absoluteDeadline;
                }

                /**
                 * Sets the value of the absoluteDeadline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbsoluteDeadline(String value) {
                    this.absoluteDeadline = value;
                }

                /**
                 * Gets the value of the offsetTimeUnit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TimeUnitType_2008A }
                 *     
                 */
                public TimeUnitType_2008A getOffsetTimeUnit() {
                    return offsetTimeUnit;
                }

                /**
                 * Sets the value of the offsetTimeUnit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TimeUnitType_2008A }
                 *     
                 */
                public void setOffsetTimeUnit(TimeUnitType_2008A value) {
                    this.offsetTimeUnit = value;
                }

                /**
                 * Gets the value of the offsetUnitMultiplier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOffsetUnitMultiplier() {
                    return offsetUnitMultiplier;
                }

                /**
                 * Sets the value of the offsetUnitMultiplier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOffsetUnitMultiplier(Integer value) {
                    this.offsetUnitMultiplier = value;
                }

                /**
                 * Gets the value of the offsetDropTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetDropTime() {
                    return offsetDropTime;
                }

                /**
                 * Sets the value of the offsetDropTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetDropTime(String value) {
                    this.offsetDropTime = value;
                }

            }

        }

    }

}
