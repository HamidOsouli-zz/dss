//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.31 at 09:22:14 AM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Signature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Signature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationProcessBasicSignatures" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessBasicSignatures" minOccurs="0"/&gt;
 *         &lt;element name="ValidationProcessTimestamps" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessTimestamps" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ValidationProcessLongTermData" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessLongTermData" minOccurs="0"/&gt;
 *         &lt;element name="ValidationProcessArchivalData" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessArchivalData" minOccurs="0"/&gt;
 *         &lt;element name="ValidationSignatureQualification" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationSignatureQualification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CounterSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", propOrder = {
    "validationProcessBasicSignatures",
    "validationProcessTimestamps",
    "validationProcessLongTermData",
    "validationProcessArchivalData",
    "validationSignatureQualification"
})
public class XmlSignature {

    @XmlElement(name = "ValidationProcessBasicSignatures")
    protected XmlValidationProcessBasicSignatures validationProcessBasicSignatures;
    @XmlElement(name = "ValidationProcessTimestamps")
    protected List<XmlValidationProcessTimestamps> validationProcessTimestamps;
    @XmlElement(name = "ValidationProcessLongTermData")
    protected XmlValidationProcessLongTermData validationProcessLongTermData;
    @XmlElement(name = "ValidationProcessArchivalData")
    protected XmlValidationProcessArchivalData validationProcessArchivalData;
    @XmlElement(name = "ValidationSignatureQualification")
    protected XmlValidationSignatureQualification validationSignatureQualification;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "CounterSignature")
    protected Boolean counterSignature;

    /**
     * Gets the value of the validationProcessBasicSignatures property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationProcessBasicSignatures }
     *     
     */
    public XmlValidationProcessBasicSignatures getValidationProcessBasicSignatures() {
        return validationProcessBasicSignatures;
    }

    /**
     * Sets the value of the validationProcessBasicSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationProcessBasicSignatures }
     *     
     */
    public void setValidationProcessBasicSignatures(XmlValidationProcessBasicSignatures value) {
        this.validationProcessBasicSignatures = value;
    }

    /**
     * Gets the value of the validationProcessTimestamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationProcessTimestamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationProcessTimestamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlValidationProcessTimestamps }
     * 
     * 
     */
    public List<XmlValidationProcessTimestamps> getValidationProcessTimestamps() {
        if (validationProcessTimestamps == null) {
            validationProcessTimestamps = new ArrayList<XmlValidationProcessTimestamps>();
        }
        return this.validationProcessTimestamps;
    }

    /**
     * Gets the value of the validationProcessLongTermData property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationProcessLongTermData }
     *     
     */
    public XmlValidationProcessLongTermData getValidationProcessLongTermData() {
        return validationProcessLongTermData;
    }

    /**
     * Sets the value of the validationProcessLongTermData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationProcessLongTermData }
     *     
     */
    public void setValidationProcessLongTermData(XmlValidationProcessLongTermData value) {
        this.validationProcessLongTermData = value;
    }

    /**
     * Gets the value of the validationProcessArchivalData property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationProcessArchivalData }
     *     
     */
    public XmlValidationProcessArchivalData getValidationProcessArchivalData() {
        return validationProcessArchivalData;
    }

    /**
     * Sets the value of the validationProcessArchivalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationProcessArchivalData }
     *     
     */
    public void setValidationProcessArchivalData(XmlValidationProcessArchivalData value) {
        this.validationProcessArchivalData = value;
    }

    /**
     * Gets the value of the validationSignatureQualification property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationSignatureQualification }
     *     
     */
    public XmlValidationSignatureQualification getValidationSignatureQualification() {
        return validationSignatureQualification;
    }

    /**
     * Sets the value of the validationSignatureQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationSignatureQualification }
     *     
     */
    public void setValidationSignatureQualification(XmlValidationSignatureQualification value) {
        this.validationSignatureQualification = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the counterSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterSignature() {
        return counterSignature;
    }

    /**
     * Sets the value of the counterSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterSignature(Boolean value) {
        this.counterSignature = value;
    }

}
