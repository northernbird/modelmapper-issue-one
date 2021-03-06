//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.10 at 03:53:03 PM CEST 
//


package testapp.generated.ota2015b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies passenger(s) who will travel on the reservation.
 * 
 * <p>Java class for TravelerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirTraveler" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirTravelerType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *                           &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReqDetails" type="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoType", propOrder = {
    "airTraveler",
    "specialReqDetails"
})
public class TravelerInfoType_2015B {

    @XmlElement(name = "AirTraveler")
    protected List<TravelerInfoType_2015B.AirTraveler_2015B> airTraveler;
    @XmlElement(name = "SpecialReqDetails")
    protected List<SpecialReqDetailsType_2015B> specialReqDetails;

    /**
     * Gets the value of the airTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInfoType_2015B.AirTraveler_2015B }
     * 
     * 
     */
    public List<TravelerInfoType_2015B.AirTraveler_2015B> getAirTraveler() {
        if (airTraveler == null) {
            airTraveler = new ArrayList<TravelerInfoType_2015B.AirTraveler_2015B>();
        }
        return this.airTraveler;
    }

    /**
     * Gets the value of the specialReqDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialReqDetailsType_2015B }
     * 
     * 
     */
    public List<SpecialReqDetailsType_2015B> getSpecialReqDetails() {
        if (specialReqDetails == null) {
            specialReqDetails = new ArrayList<SpecialReqDetailsType_2015B>();
        }
        return this.specialReqDetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirTravelerType">
     *       &lt;sequence>
     *         &lt;element name="Comment" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
     *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comment"
    })
    public static class AirTraveler_2015B
        extends AirTravelerType_2015B
    {

        @XmlElement(name = "Comment")
        protected List<TravelerInfoType_2015B.AirTraveler_2015B.Comment_2015B> comment;

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoType_2015B.AirTraveler_2015B.Comment_2015B }
         * 
         * 
         */
        public List<TravelerInfoType_2015B.AirTraveler_2015B.Comment_2015B> getComment() {
            if (comment == null) {
                comment = new ArrayList<TravelerInfoType_2015B.AirTraveler_2015B.Comment_2015B>();
            }
            return this.comment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
         *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Comment_2015B
            extends FormattedTextTextType_2015B
        {

            @XmlAttribute(name = "Name")
            protected String name;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}
