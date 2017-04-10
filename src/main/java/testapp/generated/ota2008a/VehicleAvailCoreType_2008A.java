//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The VehicleAvailCoreType complex type identifies the data that describes common, or core,  information made available as part of describing the availability and rate of one or more vehicles.
 * 
 * <p>Java class for VehicleAvailCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType"/>
 *         &lt;element name="RentalRate" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalRateType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TotalCharge" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleTotalChargeGroup"/>
 *                 &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricedEquips" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricedEquip" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPricedType" maxOccurs="25"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargePurposeType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Reference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vendor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *                 &lt;attribute name="ParticipationLevelCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VendorLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="CounterLocInfo">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="WalkToCar"/>
 *                       &lt;enumeration value="ShuttleToCar"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DropOffLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" />
 *       &lt;attribute name="IsAlternateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailCoreType", propOrder = {
    "vehicle",
    "rentalRate",
    "totalCharge",
    "pricedEquips",
    "fees",
    "reference",
    "vendor",
    "vendorLocation",
    "dropOffLocation",
    "tpaExtensions"
})
public class VehicleAvailCoreType_2008A {

    @XmlElement(name = "Vehicle", required = true)
    protected VehicleType_2008A vehicle;
    @XmlElement(name = "RentalRate")
    protected List<VehicleRentalRateType_2008A> rentalRate;
    @XmlElement(name = "TotalCharge")
    protected List<VehicleAvailCoreType_2008A.TotalCharge_2008A> totalCharge;
    @XmlElement(name = "PricedEquips")
    protected VehicleAvailCoreType_2008A.PricedEquips_2008A pricedEquips;
    @XmlElement(name = "Fees")
    protected VehicleAvailCoreType_2008A.Fees_2008A fees;
    @XmlElement(name = "Reference")
    protected VehicleAvailCoreType_2008A.Reference_2008A reference;
    @XmlElement(name = "Vendor")
    protected VehicleAvailCoreType_2008A.Vendor_2008A vendor;
    @XmlElement(name = "VendorLocation")
    protected VehicleAvailCoreType_2008A.VendorLocation_2008A vendorLocation;
    @XmlElement(name = "DropOffLocation")
    protected VehicleAvailCoreType_2008A.DropOffLocation_2008A dropOffLocation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2008A tpaExtensions;
    @XmlAttribute(name = "Status", required = true)
    protected InventoryStatusType_2008A status;
    @XmlAttribute(name = "IsAlternateInd")
    protected Boolean isAlternateInd;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType_2008A }
     *     
     */
    public VehicleType_2008A getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType_2008A }
     *     
     */
    public void setVehicle(VehicleType_2008A value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the rentalRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType_2008A }
     * 
     * 
     */
    public List<VehicleRentalRateType_2008A> getRentalRate() {
        if (rentalRate == null) {
            rentalRate = new ArrayList<VehicleRentalRateType_2008A>();
        }
        return this.rentalRate;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAvailCoreType_2008A.TotalCharge_2008A }
     * 
     * 
     */
    public List<VehicleAvailCoreType_2008A.TotalCharge_2008A> getTotalCharge() {
        if (totalCharge == null) {
            totalCharge = new ArrayList<VehicleAvailCoreType_2008A.TotalCharge_2008A>();
        }
        return this.totalCharge;
    }

    /**
     * Gets the value of the pricedEquips property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType_2008A.PricedEquips_2008A }
     *     
     */
    public VehicleAvailCoreType_2008A.PricedEquips_2008A getPricedEquips() {
        return pricedEquips;
    }

    /**
     * Sets the value of the pricedEquips property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType_2008A.PricedEquips_2008A }
     *     
     */
    public void setPricedEquips(VehicleAvailCoreType_2008A.PricedEquips_2008A value) {
        this.pricedEquips = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType_2008A.Fees_2008A }
     *     
     */
    public VehicleAvailCoreType_2008A.Fees_2008A getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType_2008A.Fees_2008A }
     *     
     */
    public void setFees(VehicleAvailCoreType_2008A.Fees_2008A value) {
        this.fees = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType_2008A.Reference_2008A }
     *     
     */
    public VehicleAvailCoreType_2008A.Reference_2008A getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType_2008A.Reference_2008A }
     *     
     */
    public void setReference(VehicleAvailCoreType_2008A.Reference_2008A value) {
        this.reference = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType_2008A.Vendor_2008A }
     *     
     */
    public VehicleAvailCoreType_2008A.Vendor_2008A getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType_2008A.Vendor_2008A }
     *     
     */
    public void setVendor(VehicleAvailCoreType_2008A.Vendor_2008A value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vendorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType_2008A.VendorLocation_2008A }
     *     
     */
    public VehicleAvailCoreType_2008A.VendorLocation_2008A getVendorLocation() {
        return vendorLocation;
    }

    /**
     * Sets the value of the vendorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType_2008A.VendorLocation_2008A }
     *     
     */
    public void setVendorLocation(VehicleAvailCoreType_2008A.VendorLocation_2008A value) {
        this.vendorLocation = value;
    }

    /**
     * Gets the value of the dropOffLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType_2008A.DropOffLocation_2008A }
     *     
     */
    public VehicleAvailCoreType_2008A.DropOffLocation_2008A getDropOffLocation() {
        return dropOffLocation;
    }

    /**
     * Sets the value of the dropOffLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType_2008A.DropOffLocation_2008A }
     *     
     */
    public void setDropOffLocation(VehicleAvailCoreType_2008A.DropOffLocation_2008A value) {
        this.dropOffLocation = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType_2008A }
     *     
     */
    public TPAExtensionsType_2008A getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType_2008A }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType_2008A value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatusType_2008A }
     *     
     */
    public InventoryStatusType_2008A getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatusType_2008A }
     *     
     */
    public void setStatus(InventoryStatusType_2008A value) {
        this.status = value;
    }

    /**
     * Gets the value of the isAlternateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlternateInd() {
        return isAlternateInd;
    }

    /**
     * Sets the value of the isAlternateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlternateInd(Boolean value) {
        this.isAlternateInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DropOffLocation_2008A
        extends LocationType_2008A
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the extendedLocationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * Sets the value of the extendedLocationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * Gets the value of the counterLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * Sets the value of the counterLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargePurposeType" maxOccurs="99"/>
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
        "fee"
    })
    public static class Fees_2008A {

        @XmlElement(name = "Fee", required = true)
        protected List<VehicleChargePurposeType_2008A> fee;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleChargePurposeType_2008A }
         * 
         * 
         */
        public List<VehicleChargePurposeType_2008A> getFee() {
            if (fee == null) {
                fee = new ArrayList<VehicleChargePurposeType_2008A>();
            }
            return this.fee;
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
     *         &lt;element name="PricedEquip" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPricedType" maxOccurs="25"/>
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
        "pricedEquip"
    })
    public static class PricedEquips_2008A {

        @XmlElement(name = "PricedEquip", required = true)
        protected List<VehicleEquipmentPricedType_2008A> pricedEquip;

        /**
         * Gets the value of the pricedEquip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedEquip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedEquip().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleEquipmentPricedType_2008A }
         * 
         * 
         */
        public List<VehicleEquipmentPricedType_2008A> getPricedEquip() {
            if (pricedEquip == null) {
                pricedEquip = new ArrayList<VehicleEquipmentPricedType_2008A>();
            }
            return this.pricedEquip;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Reference_2008A
        extends UniqueIDType_2008A
    {

        @XmlAttribute(name = "DateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTime;

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTime(XMLGregorianCalendar value) {
            this.dateTime = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleTotalChargeGroup"/>
     *       &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalCharge_2008A {

        @XmlAttribute(name = "RateConvertInd")
        protected Boolean rateConvertInd;
        @XmlAttribute(name = "RateTotalAmount")
        protected BigDecimal rateTotalAmount;
        @XmlAttribute(name = "EstimatedTotalAmount")
        protected BigDecimal estimatedTotalAmount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the rateConvertInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRateConvertInd() {
            return rateConvertInd;
        }

        /**
         * Sets the value of the rateConvertInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRateConvertInd(Boolean value) {
            this.rateConvertInd = value;
        }

        /**
         * Gets the value of the rateTotalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRateTotalAmount() {
            return rateTotalAmount;
        }

        /**
         * Sets the value of the rateTotalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRateTotalAmount(BigDecimal value) {
            this.rateTotalAmount = value;
        }

        /**
         * Gets the value of the estimatedTotalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEstimatedTotalAmount() {
            return estimatedTotalAmount;
        }

        /**
         * Sets the value of the estimatedTotalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEstimatedTotalAmount(BigDecimal value) {
            this.estimatedTotalAmount = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="CounterLocInfo">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="WalkToCar"/>
     *             &lt;enumeration value="ShuttleToCar"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorLocation_2008A
        extends LocationType_2008A
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "CounterLocInfo")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String counterLocInfo;

        /**
         * Gets the value of the extendedLocationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * Sets the value of the extendedLocationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * Gets the value of the counterLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * Sets the value of the counterLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the counterLocInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocInfo() {
            return counterLocInfo;
        }

        /**
         * Sets the value of the counterLocInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocInfo(String value) {
            this.counterLocInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
     *       &lt;attribute name="ParticipationLevelCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Vendor_2008A
        extends CompanyNameType_2008A
    {

        @XmlAttribute(name = "ParticipationLevelCode")
        protected String participationLevelCode;

        /**
         * Gets the value of the participationLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipationLevelCode() {
            return participationLevelCode;
        }

        /**
         * Sets the value of the participationLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipationLevelCode(String value) {
            this.participationLevelCode = value;
        }

    }

}