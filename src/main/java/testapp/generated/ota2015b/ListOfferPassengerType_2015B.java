//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_OfferPassengerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferPassengerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CorporateEmployee"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="FrequentGuest"/>
 *     &lt;enumeration value="FrequentTraveler"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="LoyaltyProgramMember"/>
 *     &lt;enumeration value="MeetingAttendee"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Retired"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferPassengerType")
@XmlEnum
public enum ListOfferPassengerType_2015B {

    @XmlEnumValue("CorporateEmployee")
    CORPORATE_EMPLOYEE("CorporateEmployee"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("FrequentGuest")
    FREQUENT_GUEST("FrequentGuest"),
    @XmlEnumValue("FrequentTraveler")
    FREQUENT_TRAVELER("FrequentTraveler"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("LoyaltyProgramMember")
    LOYALTY_PROGRAM_MEMBER("LoyaltyProgramMember"),
    @XmlEnumValue("MeetingAttendee")
    MEETING_ATTENDEE("MeetingAttendee"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Retired")
    RETIRED("Retired"),
    VIP("VIP"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferPassengerType_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferPassengerType_2015B fromValue(String v) {
        for (ListOfferPassengerType_2015B c: ListOfferPassengerType_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
