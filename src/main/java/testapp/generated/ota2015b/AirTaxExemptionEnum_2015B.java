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
 * <p>Java class for AirTaxExemptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirTaxExemptionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PFC_PassengerFacilitationCharge"/>
 *     &lt;enumeration value="ZP_DomesticSegment"/>
 *     &lt;enumeration value="AY_SecurityFee"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirTaxExemptionEnum")
@XmlEnum
public enum AirTaxExemptionEnum_2015B {


    /**
     * Free Baggage Allowance
     * 
     */
    @XmlEnumValue("PFC_PassengerFacilitationCharge")
    PFC_PASSENGER_FACILITATION_CHARGE("PFC_PassengerFacilitationCharge"),

    /**
     * Baggage Charges
     * 
     */
    @XmlEnumValue("ZP_DomesticSegment")
    ZP_DOMESTIC_SEGMENT("ZP_DomesticSegment"),

    /**
     * Flight-Related.
     * 
     */
    @XmlEnumValue("AY_SecurityFee")
    AY_SECURITY_FEE("AY_SecurityFee"),

    /**
     * OpenTravel Reserved words, "Other_" as enumerated value for  open enumeration support to support additional compartment type. The Value corresponding to "Other_" will be specified in the  "Value" attribute. See CompartmentType.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    AirTaxExemptionEnum_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirTaxExemptionEnum_2015B fromValue(String v) {
        for (AirTaxExemptionEnum_2015B c: AirTaxExemptionEnum_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
