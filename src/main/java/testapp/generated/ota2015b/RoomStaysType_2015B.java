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
 * A collection of RoomStay objects.  Room stays associated with this reservation.
 * 
 * <p>Java class for RoomStaysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStaysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStay" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                 &lt;sequence>
 *                   &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
 *                   &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}MembershipType" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
 *                   &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
 *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
 *                   &lt;element name="Reference" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}BookingRulesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IndexNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
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
@XmlType(name = "RoomStaysType", propOrder = {
    "roomStay"
})
public class RoomStaysType_2015B {

    @XmlElement(name = "RoomStay", required = true)
    protected List<RoomStaysType_2015B.RoomStay_2015B> roomStay;

    /**
     * Gets the value of the roomStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomStaysType_2015B.RoomStay_2015B }
     * 
     * 
     */
    public List<RoomStaysType_2015B.RoomStay_2015B> getRoomStay() {
        if (roomStay == null) {
            roomStay = new ArrayList<RoomStaysType_2015B.RoomStay_2015B>();
        }
        return this.roomStay;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *       &lt;sequence>
     *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
     *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}MembershipType" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
     *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
     *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
     *         &lt;element name="Reference" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}BookingRulesType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IndexNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuestRPHs",
        "memberships",
        "comments",
        "specialRequests",
        "serviceRPHs",
        "reference",
        "bookingRules"
    })
    public static class RoomStay_2015B
        extends RoomStayType_2015B
    {

        @XmlElement(name = "ResGuestRPHs")
        protected ResGuestRPHsType_2015B resGuestRPHs;
        @XmlElement(name = "Memberships")
        protected MembershipType_2015B memberships;
        @XmlElement(name = "Comments")
        protected CommentType_2015B comments;
        @XmlElement(name = "SpecialRequests")
        protected SpecialRequestType_2015B specialRequests;
        @XmlElement(name = "ServiceRPHs")
        protected ServiceRPHsType_2015B serviceRPHs;
        @XmlElement(name = "Reference")
        protected RoomStaysType_2015B.RoomStay_2015B.Reference_2015B reference;
        @XmlElement(name = "BookingRules")
        protected BookingRulesType_2015B bookingRules;
        @XmlAttribute(name = "IndexNumber")
        protected Integer indexNumber;

        /**
         * Gets the value of the resGuestRPHs property.
         * 
         * @return
         *     possible object is
         *     {@link ResGuestRPHsType_2015B }
         *     
         */
        public ResGuestRPHsType_2015B getResGuestRPHs() {
            return resGuestRPHs;
        }

        /**
         * Sets the value of the resGuestRPHs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResGuestRPHsType_2015B }
         *     
         */
        public void setResGuestRPHs(ResGuestRPHsType_2015B value) {
            this.resGuestRPHs = value;
        }

        /**
         * Gets the value of the memberships property.
         * 
         * @return
         *     possible object is
         *     {@link MembershipType_2015B }
         *     
         */
        public MembershipType_2015B getMemberships() {
            return memberships;
        }

        /**
         * Sets the value of the memberships property.
         * 
         * @param value
         *     allowed object is
         *     {@link MembershipType_2015B }
         *     
         */
        public void setMemberships(MembershipType_2015B value) {
            this.memberships = value;
        }

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link CommentType_2015B }
         *     
         */
        public CommentType_2015B getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommentType_2015B }
         *     
         */
        public void setComments(CommentType_2015B value) {
            this.comments = value;
        }

        /**
         * Gets the value of the specialRequests property.
         * 
         * @return
         *     possible object is
         *     {@link SpecialRequestType_2015B }
         *     
         */
        public SpecialRequestType_2015B getSpecialRequests() {
            return specialRequests;
        }

        /**
         * Sets the value of the specialRequests property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialRequestType_2015B }
         *     
         */
        public void setSpecialRequests(SpecialRequestType_2015B value) {
            this.specialRequests = value;
        }

        /**
         * Gets the value of the serviceRPHs property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceRPHsType_2015B }
         *     
         */
        public ServiceRPHsType_2015B getServiceRPHs() {
            return serviceRPHs;
        }

        /**
         * Sets the value of the serviceRPHs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceRPHsType_2015B }
         *     
         */
        public void setServiceRPHs(ServiceRPHsType_2015B value) {
            this.serviceRPHs = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link RoomStaysType_2015B.RoomStay_2015B.Reference_2015B }
         *     
         */
        public RoomStaysType_2015B.RoomStay_2015B.Reference_2015B getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link RoomStaysType_2015B.RoomStay_2015B.Reference_2015B }
         *     
         */
        public void setReference(RoomStaysType_2015B.RoomStay_2015B.Reference_2015B value) {
            this.reference = value;
        }

        /**
         * Gets the value of the bookingRules property.
         * 
         * @return
         *     possible object is
         *     {@link BookingRulesType_2015B }
         *     
         */
        public BookingRulesType_2015B getBookingRules() {
            return bookingRules;
        }

        /**
         * Sets the value of the bookingRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingRulesType_2015B }
         *     
         */
        public void setBookingRules(BookingRulesType_2015B value) {
            this.bookingRules = value;
        }

        /**
         * Gets the value of the indexNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIndexNumber() {
            return indexNumber;
        }

        /**
         * Sets the value of the indexNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIndexNumber(Integer value) {
            this.indexNumber = value;
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
        public static class Reference_2015B
            extends UniqueIDType_2015B
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

    }

}
