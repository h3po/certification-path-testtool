
package de.mtg.certpathtest.pkiobjects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResponderId
{

    @XmlAttribute
    private String type;
    @XmlAttribute
    private String encoding;

    @XmlValue
    private String value;

    public ResponderId()
    {

    }

    public ResponderId(String value, String type, String encoding)
    {
        super();
        this.value = value;
        this.type = type;
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

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

}
