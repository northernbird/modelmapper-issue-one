//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Detailed information about a company.
 * 
 * <p>Java class for CompanyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TelephoneInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneInfoGroup"/>
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>EmailType">
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="URL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessLocale" type="{http://www.opentravel.org/OTA/2003/05}AddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentForm" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepositPayment" type="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://www.opentravel.org/OTA/2003/05}TravelArrangerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProgramType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TripPurpose" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInfoType", propOrder = {
    "companyName",
    "addressInfo",
    "telephoneInfo",
    "email",
    "url",
    "businessLocale",
    "paymentForm",
    "depositPayment",
    "contactPerson",
    "travelArranger",
    "loyaltyProgram",
    "tripPurpose"
})
public class CompanyInfoType_2015B {

    @XmlElement(name = "CompanyName")
    protected List<CompanyNameType_2015B> companyName;
    @XmlElement(name = "AddressInfo")
    protected List<CompanyInfoType_2015B.AddressInfo_2015B> addressInfo;
    @XmlElement(name = "TelephoneInfo")
    protected List<CompanyInfoType_2015B.TelephoneInfo_2015B> telephoneInfo;
    @XmlElement(name = "Email")
    protected List<CompanyInfoType_2015B.Email_2015B> email;
    @XmlElement(name = "URL")
    protected List<URLType_2015B> url;
    @XmlElement(name = "BusinessLocale")
    protected List<AddressType_2015B> businessLocale;
    @XmlElement(name = "PaymentForm")
    protected List<CompanyInfoType_2015B.PaymentForm_2015B> paymentForm;
    @XmlElement(name = "DepositPayment")
    protected RequiredPaymentsType_2015B depositPayment;
    @XmlElement(name = "ContactPerson")
    protected List<ContactPersonType_2015B> contactPerson;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArrangerType_2015B> travelArranger;
    @XmlElement(name = "LoyaltyProgram")
    protected List<LoyaltyProgramType_2015B> loyaltyProgram;
    @XmlElement(name = "TripPurpose")
    protected List<CompanyInfoType_2015B.TripPurpose_2015B> tripPurpose;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;

    /**
     * Gets the value of the companyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType_2015B }
     * 
     * 
     */
    public List<CompanyNameType_2015B> getCompanyName() {
        if (companyName == null) {
            companyName = new ArrayList<CompanyNameType_2015B>();
        }
        return this.companyName;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInfoType_2015B.AddressInfo_2015B }
     * 
     * 
     */
    public List<CompanyInfoType_2015B.AddressInfo_2015B> getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new ArrayList<CompanyInfoType_2015B.AddressInfo_2015B>();
        }
        return this.addressInfo;
    }

    /**
     * Gets the value of the telephoneInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInfoType_2015B.TelephoneInfo_2015B }
     * 
     * 
     */
    public List<CompanyInfoType_2015B.TelephoneInfo_2015B> getTelephoneInfo() {
        if (telephoneInfo == null) {
            telephoneInfo = new ArrayList<CompanyInfoType_2015B.TelephoneInfo_2015B>();
        }
        return this.telephoneInfo;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInfoType_2015B.Email_2015B }
     * 
     * 
     */
    public List<CompanyInfoType_2015B.Email_2015B> getEmail() {
        if (email == null) {
            email = new ArrayList<CompanyInfoType_2015B.Email_2015B>();
        }
        return this.email;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLType_2015B }
     * 
     * 
     */
    public List<URLType_2015B> getURL() {
        if (url == null) {
            url = new ArrayList<URLType_2015B>();
        }
        return this.url;
    }

    /**
     * Gets the value of the businessLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType_2015B }
     * 
     * 
     */
    public List<AddressType_2015B> getBusinessLocale() {
        if (businessLocale == null) {
            businessLocale = new ArrayList<AddressType_2015B>();
        }
        return this.businessLocale;
    }

    /**
     * Gets the value of the paymentForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInfoType_2015B.PaymentForm_2015B }
     * 
     * 
     */
    public List<CompanyInfoType_2015B.PaymentForm_2015B> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<CompanyInfoType_2015B.PaymentForm_2015B>();
        }
        return this.paymentForm;
    }

    /**
     * Gets the value of the depositPayment property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredPaymentsType_2015B }
     *     
     */
    public RequiredPaymentsType_2015B getDepositPayment() {
        return depositPayment;
    }

    /**
     * Sets the value of the depositPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredPaymentsType_2015B }
     *     
     */
    public void setDepositPayment(RequiredPaymentsType_2015B value) {
        this.depositPayment = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType_2015B }
     * 
     * 
     */
    public List<ContactPersonType_2015B> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<ContactPersonType_2015B>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the travelArranger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelArranger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelArranger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelArrangerType_2015B }
     * 
     * 
     */
    public List<TravelArrangerType_2015B> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new ArrayList<TravelArrangerType_2015B>();
        }
        return this.travelArranger;
    }

    /**
     * Gets the value of the loyaltyProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramType_2015B }
     * 
     * 
     */
    public List<LoyaltyProgramType_2015B> getLoyaltyProgram() {
        if (loyaltyProgram == null) {
            loyaltyProgram = new ArrayList<LoyaltyProgramType_2015B>();
        }
        return this.loyaltyProgram;
    }

    /**
     * Gets the value of the tripPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInfoType_2015B.TripPurpose_2015B }
     * 
     * 
     */
    public List<CompanyInfoType_2015B.TripPurpose_2015B> getTripPurpose() {
        if (tripPurpose == null) {
            tripPurpose = new ArrayList<CompanyInfoType_2015B.TripPurpose_2015B>();
        }
        return this.tripPurpose;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AddressInfo_2015B
        extends AddressInfoType_2015B
    {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType_2015B transferAction;

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public TransferActionType_2015B getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public void setTransferAction(TransferActionType_2015B value) {
            this.transferAction = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>EmailType">
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Email_2015B
        extends EmailType_2015B
    {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType_2015B transferAction;

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public TransferActionType_2015B getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public void setTransferAction(TransferActionType_2015B value) {
            this.transferAction = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentForm_2015B
        extends PaymentFormType_2015B
    {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType_2015B transferAction;

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public TransferActionType_2015B getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public void setTransferAction(TransferActionType_2015B value) {
            this.transferAction = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneInfoGroup"/>
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TelephoneInfo_2015B {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType_2015B transferAction;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "ShareSynchInd")
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        protected String shareMarketInd;
        @XmlAttribute(name = "PhoneLocationType")
        protected String phoneLocationType;
        @XmlAttribute(name = "PhoneTechType")
        protected String phoneTechType;
        @XmlAttribute(name = "PhoneUseType")
        protected String phoneUseType;
        @XmlAttribute(name = "CountryAccessCode")
        protected String countryAccessCode;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "PhoneNumber", required = true)
        protected String phoneNumber;
        @XmlAttribute(name = "Extension")
        protected String extension;
        @XmlAttribute(name = "PIN")
        protected String pin;
        @XmlAttribute(name = "Remark")
        protected String remark;
        @XmlAttribute(name = "FormattedInd")
        protected Boolean formattedInd;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public TransferActionType_2015B getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType_2015B }
         *     
         */
        public void setTransferAction(TransferActionType_2015B value) {
            this.transferAction = value;
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

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the phoneLocationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneLocationType() {
            return phoneLocationType;
        }

        /**
         * Sets the value of the phoneLocationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneLocationType(String value) {
            this.phoneLocationType = value;
        }

        /**
         * Gets the value of the phoneTechType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneTechType() {
            return phoneTechType;
        }

        /**
         * Sets the value of the phoneTechType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneTechType(String value) {
            this.phoneTechType = value;
        }

        /**
         * Gets the value of the phoneUseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUseType() {
            return phoneUseType;
        }

        /**
         * Sets the value of the phoneUseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUseType(String value) {
            this.phoneUseType = value;
        }

        /**
         * Gets the value of the countryAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryAccessCode() {
            return countryAccessCode;
        }

        /**
         * Sets the value of the countryAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryAccessCode(String value) {
            this.countryAccessCode = value;
        }

        /**
         * Gets the value of the areaCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * Sets the value of the areaCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * Gets the value of the pin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * Sets the value of the pin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
        }

        /**
         * Gets the value of the remark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemark() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemark(String value) {
            this.remark = value;
        }

        /**
         * Gets the value of the formattedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFormattedInd() {
            return formattedInd;
        }

        /**
         * Sets the value of the formattedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedInd(Boolean value) {
            this.formattedInd = value;
        }

        /**
         * Gets the value of the defaultInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultInd() {
            return defaultInd;
        }

        /**
         * Sets the value of the defaultInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TripPurpose_2015B {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Description")
        protected String description;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

}