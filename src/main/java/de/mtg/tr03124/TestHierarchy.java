//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.06 at 07:49:26 AM CET 
//


package de.mtg.tr03124;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This is the abstract base type of all test parts, usually in separate files.
 * 
 * <p>Java class for TestHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://bsi.bund.de/TR03124}FormattedContent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://bsi.bund.de/TR03124}LinkIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestHierarchy", propOrder = {
    "text"
})
@XmlSeeAlso({
    Certificates.class,
    Routines.class,
    TestLayer.class,
    TestCase.class,
    Profiles.class,
    References.class,
    TestUnit.class,
    Routine.class
})
public abstract class TestHierarchy {

    @XmlElement(name = "Text")
    protected FormattedContent text;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedContent }
     *     
     */
    public FormattedContent getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedContent }
     *     
     */
    public void setText(FormattedContent value) {
        this.text = value;
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

}
