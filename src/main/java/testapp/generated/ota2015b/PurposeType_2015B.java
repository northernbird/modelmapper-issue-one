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
 * <p>Java class for PurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sell"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Additional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurposeType")
@XmlEnum
public enum PurposeType_2015B {

    @XmlEnumValue("Sell")
    SELL("Sell"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Additional")
    ADDITIONAL("Additional");
    private final String value;

    PurposeType_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurposeType_2015B fromValue(String v) {
        for (PurposeType_2015B c: PurposeType_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
