//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The OffLocationServicePricedType complex type describes the data that is used to describe a priced off-location service, that is, an off-location service and the corresponding charge.
 * 
 * <p>Java class for OffLocationServicePricedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffLocationServicePricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceType"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServicePricedType", propOrder = {
    "offLocService",
    "charge"
})
public class OffLocationServicePricedType_2008A {

    @XmlElement(name = "OffLocService", required = true)
    protected OffLocationServiceType_2008A offLocService;
    @XmlElement(name = "Charge")
    protected VehicleChargeType_2008A charge;

    /**
     * Gets the value of the offLocService property.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceType_2008A }
     *     
     */
    public OffLocationServiceType_2008A getOffLocService() {
        return offLocService;
    }

    /**
     * Sets the value of the offLocService property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceType_2008A }
     *     
     */
    public void setOffLocService(OffLocationServiceType_2008A value) {
        this.offLocService = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType_2008A }
     *     
     */
    public VehicleChargeType_2008A getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType_2008A }
     *     
     */
    public void setCharge(VehicleChargeType_2008A value) {
        this.charge = value;
    }

}