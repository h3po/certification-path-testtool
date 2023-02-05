//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.06 at 07:49:26 AM CET 
//


package de.mtg.tr03124;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The APDU result is a special kind of result containing a specific ISO 7816 APDU to be received from the test object.
 * 
 * <p>Java class for APDUResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APDUResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bsi.bund.de/TR03124}Result">
 *       &lt;sequence>
 *         &lt;element name="APDU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APDUResult", propOrder = {
    "apdu"
})
public class APDUResult
    extends Result
{

    @XmlElement(name = "APDU", required = true)
    protected String apdu;

    /**
     * Gets the value of the apdu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPDU() {
        return apdu;
    }

    /**
     * Sets the value of the apdu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPDU(String value) {
        this.apdu = value;
    }

}
