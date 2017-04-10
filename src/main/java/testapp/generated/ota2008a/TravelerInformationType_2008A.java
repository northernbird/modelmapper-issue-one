//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:49:35 PM CEST 
//


package testapp.generated.ota2008a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specify passenger numbers and types
 * 
 * <p>Java class for TravelerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType" maxOccurs="10"/>
 *         &lt;element name="AirTraveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInformationType", propOrder = {
    "passengerTypeQuantity",
    "airTraveler"
})
public class TravelerInformationType_2008A {

    @XmlElement(name = "PassengerTypeQuantity", required = true)
    protected List<PassengerTypeQuantityType_2008A> passengerTypeQuantity;
    @XmlElement(name = "AirTraveler")
    protected AirTravelerType_2008A airTraveler;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTypeQuantityType_2008A }
     * 
     * 
     */
    public List<PassengerTypeQuantityType_2008A> getPassengerTypeQuantity() {
        if (passengerTypeQuantity == null) {
            passengerTypeQuantity = new ArrayList<PassengerTypeQuantityType_2008A>();
        }
        return this.passengerTypeQuantity;
    }

    /**
     * Gets the value of the airTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link AirTravelerType_2008A }
     *     
     */
    public AirTravelerType_2008A getAirTraveler() {
        return airTraveler;
    }

    /**
     * Sets the value of the airTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTravelerType_2008A }
     *     
     */
    public void setAirTraveler(AirTravelerType_2008A value) {
        this.airTraveler = value;
    }

}
