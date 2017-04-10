//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Use: This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" enumeration in combination with the Code Extension fields to exchange a value that is not in the list and is known to your trading partners.
 * 
 * <p>Java class for List_ChargeUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_ChargeUnit">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit_Base">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_ChargeUnit", propOrder = {
    "value"
})
@XmlSeeAlso({
    testapp.generated.ota2015b.CodeListFeeType_2015B.Qualifiers_2015B.ChargeUnit_2015B.Unit_2015B.class,
    testapp.generated.ota2015b.CodeListFeeType_2015B.Taxes_2015B.Qualifiers_2015B.ChargeUnit_2015B.Unit_2015B.class
})
public class ListChargeUnit_2015B {

    @XmlValue
    protected ListChargeUnitBase_2015B value;

    /**
     * Source: Charge Type (CHG) OpenTravel codelist.
     * 
     * @return
     *     possible object is
     *     {@link ListChargeUnitBase_2015B }
     *     
     */
    public ListChargeUnitBase_2015B getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListChargeUnitBase_2015B }
     *     
     */
    public void setValue(ListChargeUnitBase_2015B value) {
        this.value = value;
    }

}
