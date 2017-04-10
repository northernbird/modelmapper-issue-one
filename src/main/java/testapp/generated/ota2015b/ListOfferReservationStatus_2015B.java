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
 * <p>Java class for List_OfferReservationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferReservationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Tentative"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferReservationStatus")
@XmlEnum
public enum ListOfferReservationStatus_2015B {


    /**
     * Reservation has been confirmed.
     * 
     */
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),

    /**
     * No reservation.
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * The reservation is tentative and has been guaranteed.
     * 
     */
    @XmlEnumValue("Tentative")
    TENTATIVE("Tentative"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferReservationStatus_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferReservationStatus_2015B fromValue(String v) {
        for (ListOfferReservationStatus_2015B c: ListOfferReservationStatus_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
