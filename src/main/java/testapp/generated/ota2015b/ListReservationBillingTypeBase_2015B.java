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
 * <p>Java class for List_ReservationBillingType_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_ReservationBillingType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Casino"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Group "/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_ReservationBillingType_Base")
@XmlEnum
public enum ListReservationBillingTypeBase_2015B {

    @XmlEnumValue("Casino")
    CASINO("Casino"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Group ")
    GROUP("Group "),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListReservationBillingTypeBase_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListReservationBillingTypeBase_2015B fromValue(String v) {
        for (ListReservationBillingTypeBase_2015B c: ListReservationBillingTypeBase_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
