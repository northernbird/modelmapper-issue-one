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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A collection of ResGuest objects, identifying the guests associated with this reservation. Which guests are in which room is determined by each RoomStays ResGuestRPHs collection.
 * 
 * <p>Java class for ResGuestsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGuestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGuest" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
 *                   &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
 *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
 *                   &lt;element name="ProfileRPHs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProfileRPH" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
 *                   &lt;element name="DepartureTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
 *                   &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *                   &lt;element name="InHouseTimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="GroupEventCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ResGuestsType", propOrder = {
    "resGuest"
})
public class ResGuestsType_2008A {

    @XmlElement(name = "ResGuest", required = true)
    protected List<ResGuestsType_2008A.ResGuest_2008A> resGuest;

    /**
     * Gets the value of the resGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResGuestsType_2008A.ResGuest_2008A }
     * 
     * 
     */
    public List<ResGuestsType_2008A.ResGuest_2008A> getResGuest() {
        if (resGuest == null) {
            resGuest = new ArrayList<ResGuestsType_2008A.ResGuest_2008A>();
        }
        return this.resGuest;
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
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
     *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
     *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
     *         &lt;element name="ProfileRPHs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProfileRPH" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
     *         &lt;element name="DepartureTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
     *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
     *         &lt;element name="InHouseTimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="GroupEventCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profiles",
        "specialRequests",
        "comments",
        "serviceRPHs",
        "profileRPHs",
        "arrivalTransport",
        "departureTransport",
        "guestCounts",
        "inHouseTimeSpan",
        "tpaExtensions"
    })
    public static class ResGuest_2008A {

        @XmlElement(name = "Profiles")
        protected ProfilesType_2008A profiles;
        @XmlElement(name = "SpecialRequests")
        protected SpecialRequestType_2008A specialRequests;
        @XmlElement(name = "Comments")
        protected CommentType_2008A comments;
        @XmlElement(name = "ServiceRPHs")
        protected ServiceRPHsType_2008A serviceRPHs;
        @XmlElement(name = "ProfileRPHs")
        protected ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A profileRPHs;
        @XmlElement(name = "ArrivalTransport")
        protected TransportInfoType_2008A arrivalTransport;
        @XmlElement(name = "DepartureTransport")
        protected TransportInfoType_2008A departureTransport;
        @XmlElement(name = "GuestCounts")
        protected GuestCountType_2008A guestCounts;
        @XmlElement(name = "InHouseTimeSpan")
        protected DateTimeSpanType_2008A inHouseTimeSpan;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType_2008A tpaExtensions;
        @XmlAttribute(name = "ResGuestRPH")
        protected String resGuestRPH;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "ArrivalTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar arrivalTime;
        @XmlAttribute(name = "DepartureTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar departureTime;
        @XmlAttribute(name = "GroupEventCode")
        protected String groupEventCode;
        @XmlAttribute(name = "VIP")
        protected Boolean vip;
        @XmlAttribute(name = "PrimaryIndicator")
        protected Boolean primaryIndicator;

        /**
         * Gets the value of the profiles property.
         * 
         * @return
         *     possible object is
         *     {@link ProfilesType_2008A }
         *     
         */
        public ProfilesType_2008A getProfiles() {
            return profiles;
        }

        /**
         * Sets the value of the profiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProfilesType_2008A }
         *     
         */
        public void setProfiles(ProfilesType_2008A value) {
            this.profiles = value;
        }

        /**
         * Gets the value of the specialRequests property.
         * 
         * @return
         *     possible object is
         *     {@link SpecialRequestType_2008A }
         *     
         */
        public SpecialRequestType_2008A getSpecialRequests() {
            return specialRequests;
        }

        /**
         * Sets the value of the specialRequests property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialRequestType_2008A }
         *     
         */
        public void setSpecialRequests(SpecialRequestType_2008A value) {
            this.specialRequests = value;
        }

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link CommentType_2008A }
         *     
         */
        public CommentType_2008A getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommentType_2008A }
         *     
         */
        public void setComments(CommentType_2008A value) {
            this.comments = value;
        }

        /**
         * Gets the value of the serviceRPHs property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceRPHsType_2008A }
         *     
         */
        public ServiceRPHsType_2008A getServiceRPHs() {
            return serviceRPHs;
        }

        /**
         * Sets the value of the serviceRPHs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceRPHsType_2008A }
         *     
         */
        public void setServiceRPHs(ServiceRPHsType_2008A value) {
            this.serviceRPHs = value;
        }

        /**
         * Gets the value of the profileRPHs property.
         * 
         * @return
         *     possible object is
         *     {@link ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A }
         *     
         */
        public ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A getProfileRPHs() {
            return profileRPHs;
        }

        /**
         * Sets the value of the profileRPHs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A }
         *     
         */
        public void setProfileRPHs(ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A value) {
            this.profileRPHs = value;
        }

        /**
         * Gets the value of the arrivalTransport property.
         * 
         * @return
         *     possible object is
         *     {@link TransportInfoType_2008A }
         *     
         */
        public TransportInfoType_2008A getArrivalTransport() {
            return arrivalTransport;
        }

        /**
         * Sets the value of the arrivalTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportInfoType_2008A }
         *     
         */
        public void setArrivalTransport(TransportInfoType_2008A value) {
            this.arrivalTransport = value;
        }

        /**
         * Gets the value of the departureTransport property.
         * 
         * @return
         *     possible object is
         *     {@link TransportInfoType_2008A }
         *     
         */
        public TransportInfoType_2008A getDepartureTransport() {
            return departureTransport;
        }

        /**
         * Sets the value of the departureTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportInfoType_2008A }
         *     
         */
        public void setDepartureTransport(TransportInfoType_2008A value) {
            this.departureTransport = value;
        }

        /**
         * Gets the value of the guestCounts property.
         * 
         * @return
         *     possible object is
         *     {@link GuestCountType_2008A }
         *     
         */
        public GuestCountType_2008A getGuestCounts() {
            return guestCounts;
        }

        /**
         * Sets the value of the guestCounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link GuestCountType_2008A }
         *     
         */
        public void setGuestCounts(GuestCountType_2008A value) {
            this.guestCounts = value;
        }

        /**
         * Gets the value of the inHouseTimeSpan property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType_2008A }
         *     
         */
        public DateTimeSpanType_2008A getInHouseTimeSpan() {
            return inHouseTimeSpan;
        }

        /**
         * Sets the value of the inHouseTimeSpan property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType_2008A }
         *     
         */
        public void setInHouseTimeSpan(DateTimeSpanType_2008A value) {
            this.inHouseTimeSpan = value;
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
         * Gets the value of the resGuestRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * Sets the value of the resGuestRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
        }

        /**
         * Gets the value of the ageQualifyingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * Sets the value of the ageQualifyingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        /**
         * Gets the value of the arrivalTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalTime() {
            return arrivalTime;
        }

        /**
         * Sets the value of the arrivalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalTime(XMLGregorianCalendar value) {
            this.arrivalTime = value;
        }

        /**
         * Gets the value of the departureTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureTime() {
            return departureTime;
        }

        /**
         * Sets the value of the departureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureTime(XMLGregorianCalendar value) {
            this.departureTime = value;
        }

        /**
         * Gets the value of the groupEventCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupEventCode() {
            return groupEventCode;
        }

        /**
         * Sets the value of the groupEventCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupEventCode(String value) {
            this.groupEventCode = value;
        }

        /**
         * Gets the value of the vip property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVIP() {
            return vip;
        }

        /**
         * Sets the value of the vip property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVIP(Boolean value) {
            this.vip = value;
        }

        /**
         * Gets the value of the primaryIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryIndicator() {
            return primaryIndicator;
        }

        /**
         * Sets the value of the primaryIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryIndicator(Boolean value) {
            this.primaryIndicator = value;
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
         *         &lt;element name="ProfileRPH" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
            "profileRPH"
        })
        public static class ProfileRPHs_2008A {

            @XmlElement(name = "ProfileRPH", required = true)
            protected List<ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A.ProfileRPH_2008A> profileRPH;

            /**
             * Gets the value of the profileRPH property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the profileRPH property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProfileRPH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A.ProfileRPH_2008A }
             * 
             * 
             */
            public List<ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A.ProfileRPH_2008A> getProfileRPH() {
                if (profileRPH == null) {
                    profileRPH = new ArrayList<ResGuestsType_2008A.ResGuest_2008A.ProfileRPHs_2008A.ProfileRPH_2008A>();
                }
                return this.profileRPH;
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
             *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProfileRPH_2008A {

                @XmlAttribute(name = "RPH")
                protected String rph;

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

    }

}
