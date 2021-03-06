//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines information to do a query by train operator or specific train information.
 * 
 * <p>Java class for TrainQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Train" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType" minOccurs="0"/>
 *         &lt;element name="NetworkCode" type="{http://www.opentravel.org/OTA/2003/05}NetworkCodeType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainQueryType", propOrder = {
    "train",
    "networkCode"
})
public class TrainQueryType_2015B {

    @XmlElement(name = "Train")
    protected TrainIdentificationType_2015B train;
    @XmlElement(name = "NetworkCode")
    protected NetworkCodeType_2015B networkCode;

    /**
     * Gets the value of the train property.
     * 
     * @return
     *     possible object is
     *     {@link TrainIdentificationType_2015B }
     *     
     */
    public TrainIdentificationType_2015B getTrain() {
        return train;
    }

    /**
     * Sets the value of the train property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainIdentificationType_2015B }
     *     
     */
    public void setTrain(TrainIdentificationType_2015B value) {
        this.train = value;
    }

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCodeType_2015B }
     *     
     */
    public NetworkCodeType_2015B getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCodeType_2015B }
     *     
     */
    public void setNetworkCode(NetworkCodeType_2015B value) {
        this.networkCode = value;
    }

}
