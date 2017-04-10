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
 * <p>Java class for List_OfferPaymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferPaymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BusinessCheck"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="CorporateAccount"/>
 *     &lt;enumeration value="Coupon"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="DirectBill"/>
 *     &lt;enumeration value="InternetAccount"/>
 *     &lt;enumeration value="LoyaltyPaymentCard"/>
 *     &lt;enumeration value="LoyaltyRedemption"/>
 *     &lt;enumeration value="MobilePayment"/>
 *     &lt;enumeration value="Ticket"/>
 *     &lt;enumeration value="Voucher"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferPaymentMethod")
@XmlEnum
public enum ListOfferPaymentMethod_2015B {

    @XmlEnumValue("BusinessCheck")
    BUSINESS_CHECK("BusinessCheck"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("CorporateAccount")
    CORPORATE_ACCOUNT("CorporateAccount"),
    @XmlEnumValue("Coupon")
    COUPON("Coupon"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("DirectBill")
    DIRECT_BILL("DirectBill"),
    @XmlEnumValue("InternetAccount")
    INTERNET_ACCOUNT("InternetAccount"),
    @XmlEnumValue("LoyaltyPaymentCard")
    LOYALTY_PAYMENT_CARD("LoyaltyPaymentCard"),
    @XmlEnumValue("LoyaltyRedemption")
    LOYALTY_REDEMPTION("LoyaltyRedemption"),
    @XmlEnumValue("MobilePayment")
    MOBILE_PAYMENT("MobilePayment"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher");
    private final String value;

    ListOfferPaymentMethod_2015B(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferPaymentMethod_2015B fromValue(String v) {
        for (ListOfferPaymentMethod_2015B c: ListOfferPaymentMethod_2015B.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
