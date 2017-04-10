//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  Minimum information about ticketing required to complete the booking transaction plus eTicket number.
 * 
 * <p>Java class for TicketingInfoRS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoRS_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType">
 *       &lt;attribute name="eTicketNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfoRS_Type")
@XmlSeeAlso({
    testapp.generated.ota2015b.PricedItineraryType_2015B.TicketingInfo_2015B.class
})
public class TicketingInfoRSType_2015B
    extends TicketingInfoType_2015B
{

    @XmlAttribute(name = "eTicketNumber")
    protected String eTicketNumber;

    /**
     * Gets the value of the eTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * Sets the value of the eTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

}
