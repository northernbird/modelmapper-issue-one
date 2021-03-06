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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies preferences for common travel needs not associated with a specific travel service.
 * 
 * <p>Java class for CommonPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePref" type="{http://www.opentravel.org/OTA/2003/05}NamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhonePref" type="{http://www.opentravel.org/OTA/2003/05}PhonePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressPref" type="{http://www.opentravel.org/OTA/2003/05}AddressPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InterestPref" type="{http://www.opentravel.org/OTA/2003/05}InterestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InsurancePref" type="{http://www.opentravel.org/OTA/2003/05}InsurancePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatingPref" type="{http://www.opentravel.org/OTA/2003/05}SeatingPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TicketDistribPref" type="{http://www.opentravel.org/OTA/2003/05}TicketDistribPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedTravelerPref" type="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPref" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *                 &lt;attribute name="ContactMethodCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeLevelInfo" type="{http://www.opentravel.org/OTA/2003/05}EmployeeInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrimaryLangID_Group"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AltLangID_Group"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonPrefType", propOrder = {
    "namePref",
    "phonePref",
    "addressPref",
    "paymentFormPref",
    "interestPref",
    "insurancePref",
    "seatingPref",
    "ticketDistribPref",
    "mediaEntertainPref",
    "petInfoPref",
    "mealPref",
    "loyaltyPref",
    "specRequestPref",
    "relatedTravelerPref",
    "contactPref",
    "employeeLevelInfo",
    "tpaExtensions"
})
public class CommonPrefType_2015B {

    @XmlElement(name = "NamePref")
    protected List<NamePrefType_2015B> namePref;
    @XmlElement(name = "PhonePref")
    protected List<PhonePrefType_2015B> phonePref;
    @XmlElement(name = "AddressPref")
    protected List<AddressPrefType_2015B> addressPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType_2015B> paymentFormPref;
    @XmlElement(name = "InterestPref")
    protected List<InterestPrefType_2015B> interestPref;
    @XmlElement(name = "InsurancePref")
    protected List<InsurancePrefType_2015B> insurancePref;
    @XmlElement(name = "SeatingPref")
    protected List<SeatingPrefType_2015B> seatingPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPrefType_2015B> ticketDistribPref;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType_2015B> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType_2015B> petInfoPref;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType_2015B> mealPref;
    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType_2015B> loyaltyPref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType_2015B> specRequestPref;
    @XmlElement(name = "RelatedTravelerPref")
    protected List<RelatedTravelerPrefType_2015B> relatedTravelerPref;
    @XmlElement(name = "ContactPref")
    protected List<CommonPrefType_2015B.ContactPref_2015B> contactPref;
    @XmlElement(name = "EmployeeLevelInfo")
    protected EmployeeInfoType_2015B employeeLevelInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2015B tpaExtensions;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    /**
     * Gets the value of the namePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamePrefType_2015B }
     * 
     * 
     */
    public List<NamePrefType_2015B> getNamePref() {
        if (namePref == null) {
            namePref = new ArrayList<NamePrefType_2015B>();
        }
        return this.namePref;
    }

    /**
     * Gets the value of the phonePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phonePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhonePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhonePrefType_2015B }
     * 
     * 
     */
    public List<PhonePrefType_2015B> getPhonePref() {
        if (phonePref == null) {
            phonePref = new ArrayList<PhonePrefType_2015B>();
        }
        return this.phonePref;
    }

    /**
     * Gets the value of the addressPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressPrefType_2015B }
     * 
     * 
     */
    public List<AddressPrefType_2015B> getAddressPref() {
        if (addressPref == null) {
            addressPref = new ArrayList<AddressPrefType_2015B>();
        }
        return this.addressPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPrefType_2015B }
     * 
     * 
     */
    public List<PaymentFormPrefType_2015B> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType_2015B>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the interestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestPrefType_2015B }
     * 
     * 
     */
    public List<InterestPrefType_2015B> getInterestPref() {
        if (interestPref == null) {
            interestPref = new ArrayList<InterestPrefType_2015B>();
        }
        return this.interestPref;
    }

    /**
     * Gets the value of the insurancePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurancePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurancePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurancePrefType_2015B }
     * 
     * 
     */
    public List<InsurancePrefType_2015B> getInsurancePref() {
        if (insurancePref == null) {
            insurancePref = new ArrayList<InsurancePrefType_2015B>();
        }
        return this.insurancePref;
    }

    /**
     * Gets the value of the seatingPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatingPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatingPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatingPrefType_2015B }
     * 
     * 
     */
    public List<SeatingPrefType_2015B> getSeatingPref() {
        if (seatingPref == null) {
            seatingPref = new ArrayList<SeatingPrefType_2015B>();
        }
        return this.seatingPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPrefType_2015B }
     * 
     * 
     */
    public List<TicketDistribPrefType_2015B> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPrefType_2015B>();
        }
        return this.ticketDistribPref;
    }

    /**
     * Gets the value of the mediaEntertainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPrefType_2015B }
     * 
     * 
     */
    public List<MediaEntertainPrefType_2015B> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType_2015B>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPrefType_2015B }
     * 
     * 
     */
    public List<PetInfoPrefType_2015B> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType_2015B>();
        }
        return this.petInfoPref;
    }

    /**
     * Gets the value of the mealPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPrefType_2015B }
     * 
     * 
     */
    public List<MealPrefType_2015B> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType_2015B>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPrefType_2015B }
     * 
     * 
     */
    public List<LoyaltyPrefType_2015B> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType_2015B>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPrefType_2015B }
     * 
     * 
     */
    public List<SpecRequestPrefType_2015B> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType_2015B>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the relatedTravelerPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTravelerPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTravelerPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTravelerPrefType_2015B }
     * 
     * 
     */
    public List<RelatedTravelerPrefType_2015B> getRelatedTravelerPref() {
        if (relatedTravelerPref == null) {
            relatedTravelerPref = new ArrayList<RelatedTravelerPrefType_2015B>();
        }
        return this.relatedTravelerPref;
    }

    /**
     * Gets the value of the contactPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonPrefType_2015B.ContactPref_2015B }
     * 
     * 
     */
    public List<CommonPrefType_2015B.ContactPref_2015B> getContactPref() {
        if (contactPref == null) {
            contactPref = new ArrayList<CommonPrefType_2015B.ContactPref_2015B>();
        }
        return this.contactPref;
    }

    /**
     * Gets the value of the employeeLevelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfoType_2015B }
     *     
     */
    public EmployeeInfoType_2015B getEmployeeLevelInfo() {
        return employeeLevelInfo;
    }

    /**
     * Sets the value of the employeeLevelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfoType_2015B }
     *     
     */
    public void setEmployeeLevelInfo(EmployeeInfoType_2015B value) {
        this.employeeLevelInfo = value;
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
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
     *       &lt;attribute name="ContactMethodCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContactPref_2015B {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType_2015B preferLevel;
        @XmlAttribute(name = "ContactMethodCode")
        protected String contactMethodCode;

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
         * Gets the value of the contactMethodCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactMethodCode() {
            return contactMethodCode;
        }

        /**
         * Sets the value of the contactMethodCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactMethodCode(String value) {
            this.contactMethodCode = value;
        }

    }

}
