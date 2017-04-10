//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the row details in a seat map.
 * 
 * <p>Java class for RowDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Characteristics" type="{http://www.opentravel.org/OTA/2003/05}RowCharacteristicsType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="SeatInfo" type="{http://www.opentravel.org/OTA/2003/05}SeatDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OperableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PlaneSection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GridNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="BufferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CabinType" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *       &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowDetailType", propOrder = {
    "characteristics",
    "description",
    "seatInfo",
    "tpaExtensions"
})
public class RowDetailType_2015B {

    @XmlElement(name = "Characteristics")
    protected List<RowCharacteristicsType_2015B> characteristics;
    @XmlElement(name = "Description")
    protected List<FormattedTextTextType_2015B> description;
    @XmlElement(name = "SeatInfo")
    protected List<SeatDetailsType_2015B> seatInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType_2015B tpaExtensions;
    @XmlAttribute(name = "OperableInd")
    protected Boolean operableInd;
    @XmlAttribute(name = "PlaneSection")
    protected String planeSection;
    @XmlAttribute(name = "GridNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gridNumber;
    @XmlAttribute(name = "BufferInd")
    protected Boolean bufferInd;
    @XmlAttribute(name = "CabinType")
    protected String cabinType;
    @XmlAttribute(name = "RowNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rowNumber;

    /**
     * Gets the value of the characteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowCharacteristicsType_2015B }
     * 
     * 
     */
    public List<RowCharacteristicsType_2015B> getCharacteristics() {
        if (characteristics == null) {
            characteristics = new ArrayList<RowCharacteristicsType_2015B>();
        }
        return this.characteristics;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextTextType_2015B }
     * 
     * 
     */
    public List<FormattedTextTextType_2015B> getDescription() {
        if (description == null) {
            description = new ArrayList<FormattedTextTextType_2015B>();
        }
        return this.description;
    }

    /**
     * Gets the value of the seatInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatDetailsType_2015B }
     * 
     * 
     */
    public List<SeatDetailsType_2015B> getSeatInfo() {
        if (seatInfo == null) {
            seatInfo = new ArrayList<SeatDetailsType_2015B>();
        }
        return this.seatInfo;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType_2015B }
     *     
     */
    public TPAExtensionsType_2015B getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType_2015B }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType_2015B value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the operableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperableInd() {
        return operableInd;
    }

    /**
     * Sets the value of the operableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperableInd(Boolean value) {
        this.operableInd = value;
    }

    /**
     * Gets the value of the planeSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaneSection() {
        return planeSection;
    }

    /**
     * Sets the value of the planeSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaneSection(String value) {
        this.planeSection = value;
    }

    /**
     * Gets the value of the gridNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGridNumber() {
        return gridNumber;
    }

    /**
     * Sets the value of the gridNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGridNumber(BigInteger value) {
        this.gridNumber = value;
    }

    /**
     * Gets the value of the bufferInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBufferInd() {
        return bufferInd;
    }

    /**
     * Sets the value of the bufferInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBufferInd(Boolean value) {
        this.bufferInd = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinType(String value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

}
