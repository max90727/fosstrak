
package org.accada.epcis.soap.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * 
 * 			base type for all EPCIS events.
 * 			
 * 
 * <p>Java class for EPCISEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="recordTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventTimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseExtension" type="{urn:epcglobal:epcis:xsd:1}EPCISEventExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCISEventType", namespace = "urn:epcglobal:epcis:xsd:1", propOrder = {
    "eventTime",
    "recordTime",
    "eventTimeZoneOffset",
    "baseExtension"
})
public abstract class EPCISEventType {

    @XmlElement(required = true)
    protected XMLGregorianCalendar eventTime;
    protected XMLGregorianCalendar recordTime;
    @XmlElement(required = true)
    protected String eventTimeZoneOffset;
    protected EPCISEventExtensionType baseExtension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the recordTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordTime() {
        return recordTime;
    }

    /**
     * Sets the value of the recordTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordTime(XMLGregorianCalendar value) {
        this.recordTime = value;
    }

    /**
     * Gets the value of the eventTimeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTimeZoneOffset() {
        return eventTimeZoneOffset;
    }

    /**
     * Sets the value of the eventTimeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTimeZoneOffset(String value) {
        this.eventTimeZoneOffset = value;
    }

    /**
     * Gets the value of the baseExtension property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISEventExtensionType }
     *     
     */
    public EPCISEventExtensionType getBaseExtension() {
        return baseExtension;
    }

    /**
     * Sets the value of the baseExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISEventExtensionType }
     *     
     */
    public void setBaseExtension(EPCISEventExtensionType value) {
        this.baseExtension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
