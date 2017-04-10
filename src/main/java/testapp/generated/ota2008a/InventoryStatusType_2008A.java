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
 * <p>Java class for InventoryStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Waitlist"/>
 *     &lt;enumeration value="SupplierBooked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryStatusType")
@XmlEnum
public enum InventoryStatusType_2008A {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Waitlist")
    WAITLIST("Waitlist"),

    /**
     * The booking has already been made directly through the supplier.
     * 
     */
    @XmlEnumValue("SupplierBooked")
    SUPPLIER_BOOKED("SupplierBooked");
    private final String value;

    InventoryStatusType_2008A(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryStatusType_2008A fromValue(String v) {
        for (InventoryStatusType_2008A c: InventoryStatusType_2008A.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}