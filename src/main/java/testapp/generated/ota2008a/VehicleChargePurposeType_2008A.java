//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleChargePurposeType complex type defines information on a specific charge associated with the rental of a vehicle along with the purpose of the charge.
 * 
 * <p>Java class for VehicleChargePurposeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleChargePurposeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType">
 *       &lt;attribute name="Purpose" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargePurposeType")
public class VehicleChargePurposeType_2008A
    extends VehicleChargeType_2008A
{

    @XmlAttribute(name = "Purpose", required = true)
    protected String purpose;
    @XmlAttribute(name = "RateConvertInd")
    protected Boolean rateConvertInd;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the rateConvertInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateConvertInd() {
        return rateConvertInd;
    }

    /**
     * Sets the value of the rateConvertInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateConvertInd(Boolean value) {
        this.rateConvertInd = value;
    }

}
