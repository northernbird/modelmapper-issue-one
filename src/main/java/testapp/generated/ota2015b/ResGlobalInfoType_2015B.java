//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ResGlobalInfo is a container for various information that affects the Reservation as a whole. These include global comments, counts, reservation IDs, loyalty programs, and payment methods.
 * 
 * <p>Java class for ResGlobalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGlobalInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/>
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}RoutingHopType" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
 *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}BookingRulesType" minOccurs="0"/>
 *         &lt;element name="TotalCommissions" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGlobalInfoType", propOrder = {
    "hotelReservationIDs",
    "routingHops",
    "profiles",
    "bookingRules",
    "totalCommissions"
})
@XmlSeeAlso({
    testapp.generated.ota2015b.HotelReservationType_2015B.ResGlobalInfo_2015B.class
})
public class ResGlobalInfoType_2015B
    extends ResCommonDetailType_2015B
{

    @XmlElement(name = "HotelReservationIDs")
    protected HotelReservationIDsType_2015B hotelReservationIDs;
    @XmlElement(name = "RoutingHops")
    protected RoutingHopType_2015B routingHops;
    @XmlElement(name = "Profiles")
    protected ProfilesType_2015B profiles;
    @XmlElement(name = "BookingRules")
    protected BookingRulesType_2015B bookingRules;
    @XmlElement(name = "TotalCommissions")
    protected CommissionType_2015B totalCommissions;

    /**
     * Gets the value of the hotelReservationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationIDsType_2015B }
     *     
     */
    public HotelReservationIDsType_2015B getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * Sets the value of the hotelReservationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationIDsType_2015B }
     *     
     */
    public void setHotelReservationIDs(HotelReservationIDsType_2015B value) {
        this.hotelReservationIDs = value;
    }

    /**
     * Gets the value of the routingHops property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingHopType_2015B }
     *     
     */
    public RoutingHopType_2015B getRoutingHops() {
        return routingHops;
    }

    /**
     * Sets the value of the routingHops property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingHopType_2015B }
     *     
     */
    public void setRoutingHops(RoutingHopType_2015B value) {
        this.routingHops = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilesType_2015B }
     *     
     */
    public ProfilesType_2015B getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilesType_2015B }
     *     
     */
    public void setProfiles(ProfilesType_2015B value) {
        this.profiles = value;
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
     * Gets the value of the totalCommissions property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType_2015B }
     *     
     */
    public CommissionType_2015B getTotalCommissions() {
        return totalCommissions;
    }

    /**
     * Sets the value of the totalCommissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType_2015B }
     *     
     */
    public void setTotalCommissions(CommissionType_2015B value) {
        this.totalCommissions = value;
    }

}
