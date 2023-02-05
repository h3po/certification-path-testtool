
package de.mtg.certpathtest.pkiobjects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class RevocationDate
{

    @XmlAttribute
    private String encoding;

    @XmlValue
    private String value;

    public RevocationDate()
    {

    }

    public RevocationDate(String value, String encoding)
    {
        super();
        this.value = value;
        this.encoding = encoding;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getEncoding()
    {
        return encoding;
    }

    public void setEncoding(String encoding)
    {
        this.encoding = encoding;
    }

}
