//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * A grouping of elements including Guest Counts, Time Span, pointers to Res Guests, guest Memberships, Comments and Special Requests and finally finacial information including Guarantee, Deposit and Payyment and Cancellation Penalties.
 * 
 * <p>Java class for ResCommonDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResCommonDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *         &lt;element name="TimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
 *                 &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
 *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}MembershipType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}FeesType" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResCommonDetailType", propOrder = {
    "guestCounts",
    "timeSpan",
    "resGuestRPHs",
    "memberships",
    "comments",
    "specialRequests",
    "guarantee",
    "depositPayments",
    "cancelPenalties",
    "fees",
    "total"
})
@XmlSeeAlso({
    ResGlobalInfoType_2015B.class,
    testapp.generated.ota2015b.ServiceType_2015B.ServiceDetails_2015B.class
})
public class ResCommonDetailType_2015B {

    @XmlElement(name = "GuestCounts")
    protected GuestCountType_2015B guestCounts;
    @XmlElement(name = "TimeSpan")
    protected ResCommonDetailType_2015B.TimeSpan_2015B timeSpan;
    @XmlElement(name = "ResGuestRPHs")
    protected ResGuestRPHsType_2015B resGuestRPHs;
    @XmlElement(name = "Memberships")
    protected MembershipType_2015B memberships;
    @XmlElement(name = "Comments")
    protected CommentType_2015B comments;
    @XmlElement(name = "SpecialRequests")
    protected SpecialRequestType_2015B specialRequests;
    @XmlElement(name = "Guarantee")
    protected GuaranteeType_2015B guarantee;
    @XmlElement(name = "DepositPayments")
    protected RequiredPaymentsType_2015B depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType_2015B cancelPenalties;
    @XmlElement(name = "Fees")
    protected FeesType_2015B fees;
    @XmlElement(name = "Total")
    protected TotalType_2015B total;

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType_2015B }
     *     
     */
    public GuestCountType_2015B getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType_2015B }
     *     
     */
    public void setGuestCounts(GuestCountType_2015B value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link ResCommonDetailType_2015B.TimeSpan_2015B }
     *     
     */
    public ResCommonDetailType_2015B.TimeSpan_2015B getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResCommonDetailType_2015B.TimeSpan_2015B }
     *     
     */
    public void setTimeSpan(ResCommonDetailType_2015B.TimeSpan_2015B value) {
        this.timeSpan = value;
    }

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
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType_2015B }
     *     
     */
    public GuaranteeType_2015B getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType_2015B }
     *     
     */
    public void setGuarantee(GuaranteeType_2015B value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the depositPayments property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredPaymentsType_2015B }
     *     
     */
    public RequiredPaymentsType_2015B getDepositPayments() {
        return depositPayments;
    }

    /**
     * Sets the value of the depositPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredPaymentsType_2015B }
     *     
     */
    public void setDepositPayments(RequiredPaymentsType_2015B value) {
        this.depositPayments = value;
    }

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType_2015B }
     *     
     */
    public CancelPenaltiesType_2015B getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType_2015B }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType_2015B value) {
        this.cancelPenalties = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType_2015B }
     *     
     */
    public FeesType_2015B getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType_2015B }
     *     
     */
    public void setFees(FeesType_2015B value) {
        this.fees = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TotalType_2015B }
     *     
     */
    public TotalType_2015B getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType_2015B }
     *     
     */
    public void setTotal(TotalType_2015B value) {
        this.total = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
     *       &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeSpan_2015B
        extends DateTimeSpanType_2015B
    {

        @XmlAttribute(name = "Increment")
        protected Duration increment;

        /**
         * Gets the value of the increment property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getIncrement() {
            return increment;
        }

        /**
         * Sets the value of the increment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setIncrement(Duration value) {
            this.increment = value;
        }

    }

}
