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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Use: This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" enumeration in combination with the Code Extension fields to exchange a value that is not in the list and is known to your trading partners.
 * 
 * <p>Java class for List_PowerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_PowerType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_PowerType_Base">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_CodeExtGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_PowerType", propOrder = {
    "value"
})
public class ListPowerType_2015B {

    @XmlValue
    protected ListPowerTypeBase_2015B value;
    @XmlAttribute(name = "RemovalInd")
    protected Boolean removalInd;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DescriptionDetail")
    protected String descriptionDetail;
    @XmlAttribute(name = "SourceName")
    protected String sourceName;
    @XmlAttribute(name = "SourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String sourceURL;
    @XmlAttribute(name = "ResourceName")
    protected String resourceName;
    @XmlAttribute(name = "ResourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String resourceURL;
    @XmlAttribute(name = "UniqueID")
    protected String uniqueID;

    /**
     * Source: OpenTravel.
     * 
     * @return
     *     possible object is
     *     {@link ListPowerTypeBase_2015B }
     *     
     */
    public ListPowerTypeBase_2015B getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPowerTypeBase_2015B }
     *     
     */
    public void setValue(ListPowerTypeBase_2015B value) {
        this.value = value;
    }

    /**
     * Gets the value of the removalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemovalInd() {
        return removalInd;
    }

    /**
     * Sets the value of the removalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovalInd(Boolean value) {
        this.removalInd = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    /**
     * Sets the value of the descriptionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionDetail(String value) {
        this.descriptionDetail = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the sourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURL() {
        return sourceURL;
    }

    /**
     * Sets the value of the sourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURL(String value) {
        this.sourceURL = value;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the resourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceURL() {
        return resourceURL;
    }

    /**
     * Sets the value of the resourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceURL(String value) {
        this.resourceURL = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueID(String value) {
        this.uniqueID = value;
    }

}
