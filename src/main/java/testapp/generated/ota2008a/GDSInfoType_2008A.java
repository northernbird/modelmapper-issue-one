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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This defines codes used by individual GDS's, which can be used to upload rate information.
 * 
 * <p>Java class for GDS_InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDS_InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GDS_Codes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GDS_CodeDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                               &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChainCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="2"/>
 *                                 &lt;maxLength value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="GDS_PropertyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="GDS_Name" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="Amadeus"/>
 *                                 &lt;enumeration value="ApolloGalileo"/>
 *                                 &lt;enumeration value="Sabre"/>
 *                                 &lt;enumeration value="Worldspan"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MasterChainCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="2"/>
 *             &lt;maxLength value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDS_InfoType", propOrder = {
    "gdsCodes"
})
public class GDSInfoType_2008A {

    @XmlElement(name = "GDS_Codes")
    protected GDSInfoType_2008A.GDSCodes_2008A gdsCodes;
    @XmlAttribute(name = "MasterChainCode")
    protected String masterChainCode;

    /**
     * Gets the value of the gdsCodes property.
     * 
     * @return
     *     possible object is
     *     {@link GDSInfoType_2008A.GDSCodes_2008A }
     *     
     */
    public GDSInfoType_2008A.GDSCodes_2008A getGDSCodes() {
        return gdsCodes;
    }

    /**
     * Sets the value of the gdsCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDSInfoType_2008A.GDSCodes_2008A }
     *     
     */
    public void setGDSCodes(GDSInfoType_2008A.GDSCodes_2008A value) {
        this.gdsCodes = value;
    }

    /**
     * Gets the value of the masterChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterChainCode() {
        return masterChainCode;
    }

    /**
     * Sets the value of the masterChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterChainCode(String value) {
        this.masterChainCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GDS_CodeDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                                     &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChainCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="2"/>
     *                       &lt;maxLength value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="GDS_PropertyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="GDS_Name" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="Amadeus"/>
     *                       &lt;enumeration value="ApolloGalileo"/>
     *                       &lt;enumeration value="Sabre"/>
     *                       &lt;enumeration value="Worldspan"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gdsCode"
    })
    public static class GDSCodes_2008A {

        @XmlElement(name = "GDS_Code")
        protected List<GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A> gdsCode;
        @XmlAttribute(name = "LoadGDSIndicator")
        protected Boolean loadGDSIndicator;

        /**
         * Gets the value of the gdsCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gdsCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGDSCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A }
         * 
         * 
         */
        public List<GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A> getGDSCode() {
            if (gdsCode == null) {
                gdsCode = new ArrayList<GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A>();
            }
            return this.gdsCode;
        }

        /**
         * Gets the value of the loadGDSIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLoadGDSIndicator() {
            return loadGDSIndicator;
        }

        /**
         * Sets the value of the loadGDSIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLoadGDSIndicator(Boolean value) {
            this.loadGDSIndicator = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="GDS_CodeDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *                           &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ChainCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="2"/>
         *             &lt;maxLength value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="GDS_PropertyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="GDS_Name" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="Amadeus"/>
         *             &lt;enumeration value="ApolloGalileo"/>
         *             &lt;enumeration value="Sabre"/>
         *             &lt;enumeration value="Worldspan"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gdsCodeDetails"
        })
        public static class GDSCode_2008A {

            @XmlElement(name = "GDS_CodeDetails")
            protected GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A gdsCodeDetails;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "GDS_PropertyCode")
            protected String gdsPropertyCode;
            @XmlAttribute(name = "GDS_Name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String gdsName;
            @XmlAttribute(name = "LoadGDSIndicator")
            protected Boolean loadGDSIndicator;

            /**
             * Gets the value of the gdsCodeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A }
             *     
             */
            public GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A getGDSCodeDetails() {
                return gdsCodeDetails;
            }

            /**
             * Sets the value of the gdsCodeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A }
             *     
             */
            public void setGDSCodeDetails(GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A value) {
                this.gdsCodeDetails = value;
            }

            /**
             * Gets the value of the chainCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * Sets the value of the chainCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * Gets the value of the gdsPropertyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSPropertyCode() {
                return gdsPropertyCode;
            }

            /**
             * Sets the value of the gdsPropertyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSPropertyCode(String value) {
                this.gdsPropertyCode = value;
            }

            /**
             * Gets the value of the gdsName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSName() {
                return gdsName;
            }

            /**
             * Sets the value of the gdsName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSName(String value) {
                this.gdsName = value;
            }

            /**
             * Gets the value of the loadGDSIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLoadGDSIndicator() {
                return loadGDSIndicator;
            }

            /**
             * Sets the value of the loadGDSIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLoadGDSIndicator(Boolean value) {
                this.loadGDSIndicator = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *                 &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "gdsCodeDetail"
            })
            public static class GDSCodeDetails_2008A {

                @XmlElement(name = "GDS_CodeDetail")
                protected List<GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A.GDSCodeDetail_2008A> gdsCodeDetail;

                /**
                 * Gets the value of the gdsCodeDetail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the gdsCodeDetail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGDSCodeDetail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A.GDSCodeDetail_2008A }
                 * 
                 * 
                 */
                public List<GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A.GDSCodeDetail_2008A> getGDSCodeDetail() {
                    if (gdsCodeDetail == null) {
                        gdsCodeDetail = new ArrayList<GDSInfoType_2008A.GDSCodes_2008A.GDSCode_2008A.GDSCodeDetails_2008A.GDSCodeDetail_2008A>();
                    }
                    return this.gdsCodeDetail;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
                 *       &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class GDSCodeDetail_2008A {

                    @XmlAttribute(name = "PseudoCityCode")
                    protected String pseudoCityCode;
                    @XmlAttribute(name = "AgencyName")
                    protected String agencyName;

                    /**
                     * Gets the value of the pseudoCityCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * Sets the value of the pseudoCityCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
                    }

                    /**
                     * Gets the value of the agencyName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgencyName() {
                        return agencyName;
                    }

                    /**
                     * Sets the value of the agencyName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgencyName(String value) {
                        this.agencyName = value;
                    }

                }

            }

        }

    }

}