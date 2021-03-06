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
 * <p>Java class for RatePlanEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RatePlanEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Negotiated"/>
 *     &lt;enumeration value="Preferred"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RatePlanEnum")
@XmlEnum
public enum RatePlanEnum_2015B {


    /**
     * Inventory is available for sale.
     * 
     */
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),

    /**
     * Inventory is not available for sale.
     * 
     */
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),

    /**
     * Inventory is not available for sale to arriving guests.
     * 
     */
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),

    /**
     * Inventory may not be available for sale to arriving guests.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    RatePlanEnum_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RatePlanEnum_2015B fromValue(String v) {
        for (RatePlanEnum_2015B c: RatePlanEnum_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
