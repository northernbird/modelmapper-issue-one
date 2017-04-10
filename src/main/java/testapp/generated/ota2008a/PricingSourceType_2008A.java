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
 * <p>Java class for PricingSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingSourceType")
@XmlEnum
public enum PricingSourceType_2008A {


    /**
     *  Published fare.
     * 
     */
    @XmlEnumValue("Published")
    PUBLISHED("Published"),

    /**
     *  Private fare.
     * 
     */
    @XmlEnumValue("Private")
    PRIVATE("Private"),

    /**
     *  Fare is both public and private.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PricingSourceType_2008A(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingSourceType_2008A fromValue(String v) {
        for (PricingSourceType_2008A c: PricingSourceType_2008A.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}