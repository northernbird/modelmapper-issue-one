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
 * These are the hotel preference elements used on an instance of a profile.
 * 
 * <p>Java class for HotelPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelChainPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyNamePref" type="{http://www.opentravel.org/OTA/2003/05}PropertyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyLocationPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyTypePref" type="{http://www.opentravel.org/OTA/2003/05}PropertyTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyClassPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyClassPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyAmenityPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomAmenityPref" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomLocationPref" type="{http://www.opentravel.org/OTA/2003/05}RoomLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BedTypePref" type="{http://www.opentravel.org/OTA/2003/05}BedTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FoodSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}FoodSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecreationSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}RecreationSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}BusinessSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}PersonalSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecurityFeaturePref" type="{http://www.opentravel.org/OTA/2003/05}SecurityFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysChallFeaturePref" type="{http://www.opentravel.org/OTA/2003/05}PhysChallFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *       &lt;attribute name="HotelGuestType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPrefType", propOrder = {
    "loyaltyPref",
    "paymentFormPref",
    "hotelChainPref",
    "propertyNamePref",
    "propertyLocationPref",
    "propertyTypePref",
    "propertyClassPref",
    "propertyAmenityPref",
    "roomAmenityPref",
    "roomLocationPref",
    "bedTypePref",
    "foodSrvcPref",
    "mediaEntertainPref",
    "petInfoPref",
    "mealPref",
    "recreationSrvcPref",
    "businessSrvcPref",
    "personalSrvcPref",
    "securityFeaturePref",
    "physChallFeaturePref",
    "specRequestPref",
    "tpaExtensions"
})
public class HotelPrefType_2008A {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType_2008A> loyaltyPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType_2008A> paymentFormPref;
    @XmlElement(name = "HotelChainPref")
    protected List<CompanyNamePrefType_2008A> hotelChainPref;
    @XmlElement(name = "PropertyNamePref")
    protected List<PropertyNamePrefType_2008A> propertyNamePref;
    @XmlElement(name = "PropertyLocationPref")
    protected List<PropertyLocationPrefType_2008A> propertyLocationPref;
    @XmlElement(name = "PropertyTypePref")
    protected List<PropertyTypePrefType_2008A> propertyTypePref;
    @XmlElement(name = "PropertyClassPref")
    protected List<PropertyClassPrefType_2008A> propertyClassPref;
    @XmlElement(name = "PropertyAmenityPref")
    protected List<PropertyAmenityPrefType_2008A> propertyAmenityPref;
    @XmlElement(name = "RoomAmenityPref")
    protected List<RoomAmenityPrefType_2008A> roomAmenityPref;
    @XmlElement(name = "RoomLocationPref")
    protected List<RoomLocationPrefType_2008A> roomLocationPref;
    @XmlElement(name = "BedTypePref")
    protected List<BedTypePrefType_2008A> bedTypePref;
    @XmlElement(name = "FoodSrvcPref")
    protected List<FoodSrvcPrefType_2008A> foodSrvcPref;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType_2008A> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType_2008A> petInfoPref;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType_2008A> mealPref;
    @XmlElement(name = "RecreationSrvcPref")
    protected List<RecreationSrvcPrefType_2008A> recreationSrvcPref;
    @XmlElement(name = "BusinessSrvcPref")
    protected List<BusinessSrvcPrefType_2008A> businessSrvcPref;
    @XmlElement(name = "PersonalSrvcPref")
    protected List<PersonalSrvcPrefType_2008A> personalSrvcPref;
    @XmlElement(name = "SecurityFeaturePref")
    protected List<SecurityFeaturePrefType_2008A> securityFeaturePref;
    @XmlElement(name = "PhysChallFeaturePref")
    protected List<PhysChallFeaturePrefType_2008A> physChallFeaturePref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType_2008A> specRequestPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2008A tpaExtensions;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "HotelGuestType")
    protected String hotelGuestType;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType_2008A preferLevel;

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
     * {@link LoyaltyPrefType_2008A }
     * 
     * 
     */
    public List<LoyaltyPrefType_2008A> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType_2008A>();
        }
        return this.loyaltyPref;
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
     * {@link PaymentFormPrefType_2008A }
     * 
     * 
     */
    public List<PaymentFormPrefType_2008A> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType_2008A>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the hotelChainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelChainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelChainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType_2008A }
     * 
     * 
     */
    public List<CompanyNamePrefType_2008A> getHotelChainPref() {
        if (hotelChainPref == null) {
            hotelChainPref = new ArrayList<CompanyNamePrefType_2008A>();
        }
        return this.hotelChainPref;
    }

    /**
     * Gets the value of the propertyNamePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyNamePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyNamePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyNamePrefType_2008A }
     * 
     * 
     */
    public List<PropertyNamePrefType_2008A> getPropertyNamePref() {
        if (propertyNamePref == null) {
            propertyNamePref = new ArrayList<PropertyNamePrefType_2008A>();
        }
        return this.propertyNamePref;
    }

    /**
     * Gets the value of the propertyLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyLocationPrefType_2008A }
     * 
     * 
     */
    public List<PropertyLocationPrefType_2008A> getPropertyLocationPref() {
        if (propertyLocationPref == null) {
            propertyLocationPref = new ArrayList<PropertyLocationPrefType_2008A>();
        }
        return this.propertyLocationPref;
    }

    /**
     * Gets the value of the propertyTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyTypePrefType_2008A }
     * 
     * 
     */
    public List<PropertyTypePrefType_2008A> getPropertyTypePref() {
        if (propertyTypePref == null) {
            propertyTypePref = new ArrayList<PropertyTypePrefType_2008A>();
        }
        return this.propertyTypePref;
    }

    /**
     * Gets the value of the propertyClassPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyClassPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyClassPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyClassPrefType_2008A }
     * 
     * 
     */
    public List<PropertyClassPrefType_2008A> getPropertyClassPref() {
        if (propertyClassPref == null) {
            propertyClassPref = new ArrayList<PropertyClassPrefType_2008A>();
        }
        return this.propertyClassPref;
    }

    /**
     * Gets the value of the propertyAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyAmenityPrefType_2008A }
     * 
     * 
     */
    public List<PropertyAmenityPrefType_2008A> getPropertyAmenityPref() {
        if (propertyAmenityPref == null) {
            propertyAmenityPref = new ArrayList<PropertyAmenityPrefType_2008A>();
        }
        return this.propertyAmenityPref;
    }

    /**
     * Gets the value of the roomAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType_2008A }
     * 
     * 
     */
    public List<RoomAmenityPrefType_2008A> getRoomAmenityPref() {
        if (roomAmenityPref == null) {
            roomAmenityPref = new ArrayList<RoomAmenityPrefType_2008A>();
        }
        return this.roomAmenityPref;
    }

    /**
     * Gets the value of the roomLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomLocationPrefType_2008A }
     * 
     * 
     */
    public List<RoomLocationPrefType_2008A> getRoomLocationPref() {
        if (roomLocationPref == null) {
            roomLocationPref = new ArrayList<RoomLocationPrefType_2008A>();
        }
        return this.roomLocationPref;
    }

    /**
     * Gets the value of the bedTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BedTypePrefType_2008A }
     * 
     * 
     */
    public List<BedTypePrefType_2008A> getBedTypePref() {
        if (bedTypePref == null) {
            bedTypePref = new ArrayList<BedTypePrefType_2008A>();
        }
        return this.bedTypePref;
    }

    /**
     * Gets the value of the foodSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodSrvcPrefType_2008A }
     * 
     * 
     */
    public List<FoodSrvcPrefType_2008A> getFoodSrvcPref() {
        if (foodSrvcPref == null) {
            foodSrvcPref = new ArrayList<FoodSrvcPrefType_2008A>();
        }
        return this.foodSrvcPref;
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
     * {@link MediaEntertainPrefType_2008A }
     * 
     * 
     */
    public List<MediaEntertainPrefType_2008A> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType_2008A>();
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
     * {@link PetInfoPrefType_2008A }
     * 
     * 
     */
    public List<PetInfoPrefType_2008A> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType_2008A>();
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
     * {@link MealPrefType_2008A }
     * 
     * 
     */
    public List<MealPrefType_2008A> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType_2008A>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the recreationSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreationSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreationSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecreationSrvcPrefType_2008A }
     * 
     * 
     */
    public List<RecreationSrvcPrefType_2008A> getRecreationSrvcPref() {
        if (recreationSrvcPref == null) {
            recreationSrvcPref = new ArrayList<RecreationSrvcPrefType_2008A>();
        }
        return this.recreationSrvcPref;
    }

    /**
     * Gets the value of the businessSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSrvcPrefType_2008A }
     * 
     * 
     */
    public List<BusinessSrvcPrefType_2008A> getBusinessSrvcPref() {
        if (businessSrvcPref == null) {
            businessSrvcPref = new ArrayList<BusinessSrvcPrefType_2008A>();
        }
        return this.businessSrvcPref;
    }

    /**
     * Gets the value of the personalSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSrvcPrefType_2008A }
     * 
     * 
     */
    public List<PersonalSrvcPrefType_2008A> getPersonalSrvcPref() {
        if (personalSrvcPref == null) {
            personalSrvcPref = new ArrayList<PersonalSrvcPrefType_2008A>();
        }
        return this.personalSrvcPref;
    }

    /**
     * Gets the value of the securityFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityFeaturePrefType_2008A }
     * 
     * 
     */
    public List<SecurityFeaturePrefType_2008A> getSecurityFeaturePref() {
        if (securityFeaturePref == null) {
            securityFeaturePref = new ArrayList<SecurityFeaturePrefType_2008A>();
        }
        return this.securityFeaturePref;
    }

    /**
     * Gets the value of the physChallFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physChallFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysChallFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysChallFeaturePrefType_2008A }
     * 
     * 
     */
    public List<PhysChallFeaturePrefType_2008A> getPhysChallFeaturePref() {
        if (physChallFeaturePref == null) {
            physChallFeaturePref = new ArrayList<PhysChallFeaturePrefType_2008A>();
        }
        return this.physChallFeaturePref;
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
     * {@link SpecRequestPrefType_2008A }
     * 
     * 
     */
    public List<SpecRequestPrefType_2008A> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType_2008A>();
        }
        return this.specRequestPref;
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
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the hotelGuestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGuestType() {
        return hotelGuestType;
    }

    /**
     * Sets the value of the hotelGuestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGuestType(String value) {
        this.hotelGuestType = value;
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
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
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
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType_2008A }
     *     
     */
    public PreferLevelType_2008A getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType_2008A.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType_2008A }
     *     
     */
    public void setPreferLevel(PreferLevelType_2008A value) {
        this.preferLevel = value;
    }

}
