
package de.mtg.certpathtest.pkiobjects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Extension
{

    @XmlAttribute
    private String oid;
    @XmlAttribute
    private String critical;
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String type;

    @XmlValue
    private String value;

    public Extension()
    {

    }

    public Extension(String value, String oid, String critical, String name, String type)
    {
        super();
        this.value = value;
        this.oid = oid;
        this.critical = critical;
        this.name = name;
        this.type = type;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getOid()
    {
        return oid;
    }

    public void setOid(String oid)
    {
        this.oid = oid;
    }

    public String getCritical()
    {
        return critical;
    }

    public void setCritical(String critical)
    {
        this.critical = critical;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
