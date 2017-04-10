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
 * <p>Java class for OffLocationServiceID_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OffLocationServiceID_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustPickUp"/>
 *     &lt;enumeration value="VehDelivery"/>
 *     &lt;enumeration value="CustDropOff"/>
 *     &lt;enumeration value="VehCollection"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="RepairLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OffLocationServiceID_Type")
@XmlEnum
public enum OffLocationServiceIDType_2015B {


    /**
     * Indicates that the associated information describes an offered service by which the customer may be picked up and taken to the rental facility, to rent a vehicle.
     * 
     */
    @XmlEnumValue("CustPickUp")
    CUST_PICK_UP("CustPickUp"),

    /**
     * Indicates that the associated information describes an offered service by which the vehicle may be delivered to a location, rather than the customer taking delivery at the rental facility.
     * 
     */
    @XmlEnumValue("VehDelivery")
    VEH_DELIVERY("VehDelivery"),

    /**
     * Indicates that the associated information describes an offered service by which the customer may be dropped off at a location after the vehicle rental period has ended.
     * 
     */
    @XmlEnumValue("CustDropOff")
    CUST_DROP_OFF("CustDropOff"),

    /**
     * Indicates that the associated information describes an offered service by which the vehicle may be collected from a location, rather than the customer returning the vehicle to the rental facility.
     * 
     */
    @XmlEnumValue("VehCollection")
    VEH_COLLECTION("VehCollection"),

    /**
     * Indicates that the associated information describes an offered service by which the customer will be delivered the exchanged car.
     * 
     */
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),

    /**
     * Location where a customer's vehicle is being repaired.
     * 
     */
    @XmlEnumValue("RepairLocation")
    REPAIR_LOCATION("RepairLocation");
    private final String value;

    OffLocationServiceIDType_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OffLocationServiceIDType_2015B fromValue(String v) {
        for (OffLocationServiceIDType_2015B c: OffLocationServiceIDType_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
