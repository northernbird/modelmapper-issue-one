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
 * <p>Java class for List_OfferPaymentCardIssuer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferPaymentCardIssuer">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AmericanExpress"/>
 *     &lt;enumeration value="BankOfAmerica"/>
 *     &lt;enumeration value="BritishAirways"/>
 *     &lt;enumeration value="CapitalOne"/>
 *     &lt;enumeration value="Chase"/>
 *     &lt;enumeration value="Citibank"/>
 *     &lt;enumeration value="ContinentalAirlines"/>
 *     &lt;enumeration value="DeltaAirlines"/>
 *     &lt;enumeration value="DiscoverCard"/>
 *     &lt;enumeration value="Disney"/>
 *     &lt;enumeration value="Eurocard"/>
 *     &lt;enumeration value="Hilton"/>
 *     &lt;enumeration value="Hyatt"/>
 *     &lt;enumeration value="Mariott"/>
 *     &lt;enumeration value="Mastercard"/>
 *     &lt;enumeration value="RitzCarlton"/>
 *     &lt;enumeration value="SouthwestAirlines"/>
 *     &lt;enumeration value="StarwoodHotels"/>
 *     &lt;enumeration value="UnitedAirlines"/>
 *     &lt;enumeration value="USAirways"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferPaymentCardIssuer")
@XmlEnum
public enum ListOfferPaymentCardIssuer_2015B {

    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("BankOfAmerica")
    BANK_OF_AMERICA("BankOfAmerica"),
    @XmlEnumValue("BritishAirways")
    BRITISH_AIRWAYS("BritishAirways"),
    @XmlEnumValue("CapitalOne")
    CAPITAL_ONE("CapitalOne"),
    @XmlEnumValue("Chase")
    CHASE("Chase"),
    @XmlEnumValue("Citibank")
    CITIBANK("Citibank"),
    @XmlEnumValue("ContinentalAirlines")
    CONTINENTAL_AIRLINES("ContinentalAirlines"),
    @XmlEnumValue("DeltaAirlines")
    DELTA_AIRLINES("DeltaAirlines"),
    @XmlEnumValue("DiscoverCard")
    DISCOVER_CARD("DiscoverCard"),
    @XmlEnumValue("Disney")
    DISNEY("Disney"),
    @XmlEnumValue("Eurocard")
    EUROCARD("Eurocard"),
    @XmlEnumValue("Hilton")
    HILTON("Hilton"),
    @XmlEnumValue("Hyatt")
    HYATT("Hyatt"),
    @XmlEnumValue("Mariott")
    MARIOTT("Mariott"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("RitzCarlton")
    RITZ_CARLTON("RitzCarlton"),
    @XmlEnumValue("SouthwestAirlines")
    SOUTHWEST_AIRLINES("SouthwestAirlines"),
    @XmlEnumValue("StarwoodHotels")
    STARWOOD_HOTELS("StarwoodHotels"),
    @XmlEnumValue("UnitedAirlines")
    UNITED_AIRLINES("UnitedAirlines"),
    @XmlEnumValue("USAirways")
    US_AIRWAYS("USAirways"),
    VISA("VISA"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferPaymentCardIssuer_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferPaymentCardIssuer_2015B fromValue(String v) {
        for (ListOfferPaymentCardIssuer_2015B c: ListOfferPaymentCardIssuer_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
