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
import javax.xml.bind.annotation.XmlValue;


/**
 * Code and optional string to describe a location point.
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "value"
})
@XmlSeeAlso({
    testapp.generated.ota2015b.VerificationType_2015B.StartLocation_2015B.class,
    testapp.generated.ota2015b.VerificationType_2015B.EndLocation_2015B.class,
    testapp.generated.ota2015b.ConnectionType_2015B.ConnectionLocation_2015B.class,
    testapp.generated.ota2015b.RailOriginDestinationInformationType_2015B.OriginLocation_2015B.class,
    testapp.generated.ota2015b.RailOriginDestinationInformationType_2015B.DestinationLocation_2015B.class,
    testapp.generated.ota2015b.RailOriginDestinationSummaryType_2015B.OriginLocation_2015B.class,
    testapp.generated.ota2015b.RailOriginDestinationSummaryType_2015B.DestinationLocation_2015B.class,
    LocationPrefType_2015B.class,
    testapp.generated.ota2015b.VehicleAvailCoreType_2015B.VendorLocation_2015B.class,
    testapp.generated.ota2015b.VehicleAvailCoreType_2015B.DropOffLocation_2015B.class,
    StationType_2015B.class,
    testapp.generated.ota2015b.VehicleRentalCoreType_2015B.PickUpLocation_2015B.class,
    testapp.generated.ota2015b.VehicleRentalCoreType_2015B.ReturnLocation_2015B.class,
    testapp.generated.ota2015b.ItemSearchCriterionType_2015B.CodeRef_2015B.class,
    AirportPrefType_2015B.class,
    testapp.generated.ota2015b.VehicleLocationAdditionalDetailsType_2015B.OneWayDropLocations_2015B.OneWayDropLocation_2015B.class,
    testapp.generated.ota2015b.RailConnectionType_2015B.ConnectionLocation_2015B.class,
    testapp.generated.ota2015b.OriginDestinationInformationType_2015B.OriginLocation_2015B.class,
    testapp.generated.ota2015b.OriginDestinationInformationType_2015B.DestinationLocation_2015B.class
})
public class LocationType_2015B {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

}
