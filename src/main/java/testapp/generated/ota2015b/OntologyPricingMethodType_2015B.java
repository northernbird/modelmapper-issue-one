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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Pricing method with ontology reference.
 * 
 * <p>Java class for OntologyPricingMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OntologyPricingMethodType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferPricingType">
 *       &lt;attribute name="InclusiveInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ApproximateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OtherType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OntologyRefID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,8}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyPricingMethodType", propOrder = {
    "value"
})
public class OntologyPricingMethodType_2015B {

    @XmlValue
    protected ListOfferPricingType_2015B value;
    @XmlAttribute(name = "InclusiveInd")
    protected Boolean inclusiveInd;
    @XmlAttribute(name = "ApproximateInd")
    protected Boolean approximateInd;
    @XmlAttribute(name = "OtherType")
    protected String otherType;
    @XmlAttribute(name = "OntologyRefID")
    protected String ontologyRefID;

    /**
     * Source: Coverage Type (COV) OpenTravel codelist.
     * 
     * @return
     *     possible object is
     *     {@link ListOfferPricingType_2015B }
     *     
     */
    public ListOfferPricingType_2015B getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfferPricingType_2015B }
     *     
     */
    public void setValue(ListOfferPricingType_2015B value) {
        this.value = value;
    }

    /**
     * Gets the value of the inclusiveInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveInd() {
        return inclusiveInd;
    }

    /**
     * Sets the value of the inclusiveInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveInd(Boolean value) {
        this.inclusiveInd = value;
    }

    /**
     * Gets the value of the approximateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the ontologyRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyRefID() {
        return ontologyRefID;
    }

    /**
     * Sets the value of the ontologyRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyRefID(String value) {
        this.ontologyRefID = value;
    }

}
