//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentRestrictionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentRestrictionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="OneWayOnly"/>
 *     &lt;enumeration value="RoundTripOnly"/>
 *     &lt;enumeration value="AnyReservation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentRestrictionType")
@XmlEnum
public enum EquipmentRestrictionType_2008A {

    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly"),
    @XmlEnumValue("RoundTripOnly")
    ROUND_TRIP_ONLY("RoundTripOnly"),
    @XmlEnumValue("AnyReservation")
    ANY_RESERVATION("AnyReservation");
    private final String value;

    EquipmentRestrictionType_2008A(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentRestrictionType_2008A fromValue(String v) {
        for (EquipmentRestrictionType_2008A c: EquipmentRestrictionType_2008A.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
