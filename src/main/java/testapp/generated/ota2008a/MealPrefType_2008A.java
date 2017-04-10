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
import javax.xml.bind.annotation.XmlValue;


/**
 * Identifies a food and beverage preference.
 * 
 * <p>Java class for MealPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MealPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to64">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attribute name="MealType" type="{http://www.opentravel.org/OTA/2003/05}MealType" />
 *       &lt;attribute name="FavoriteFood" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="Beverage" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealPrefType", propOrder = {
    "value"
})
public class MealPrefType_2008A {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "MealType")
    protected MealType_2008A mealType;
    @XmlAttribute(name = "FavoriteFood")
    protected String favoriteFood;
    @XmlAttribute(name = "Beverage")
    protected String beverage;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType_2008A preferLevel;

    /**
     * Used for Character Strings, length 0 to 64.
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
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link MealType_2008A }
     *     
     */
    public MealType_2008A getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealType_2008A }
     *     
     */
    public void setMealType(MealType_2008A value) {
        this.mealType = value;
    }

    /**
     * Gets the value of the favoriteFood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

    /**
     * Sets the value of the favoriteFood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoriteFood(String value) {
        this.favoriteFood = value;
    }

    /**
     * Gets the value of the beverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * Sets the value of the beverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeverage(String value) {
        this.beverage = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType_2008A }
     *     
     */
    public PreferLevelType_2008A getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType_2008A.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType_2008A }
     *     
     */
    public void setPreferLevel(PreferLevelType_2008A value) {
        this.preferLevel = value;
    }

}