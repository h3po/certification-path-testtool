
package de.mtg.certpathtest.pkiobjects;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;
import java.util.ArrayList;

@XmlRootElement(name = "PKIObjects")
public class PKIObjects
{

    private ArrayList<Variable> variables = new ArrayList<>();
    private ArrayList<Certificate> certificates = new ArrayList<>();
    private ArrayList<CRL> revocationLists = new ArrayList<>();
    private ArrayList<OcspResponse> ocspResponses = new ArrayList<>();
    private Path path;

    public PKIObjects()
    {

    }

    public ArrayList<Variable> getVariables()
    {
        return this.variables;
    }

    @XmlElement(name = "Variable")
    public void setVariables(ArrayList<Variable> variables)
    {
        this.variables = variables;
    }

    public Path getPath()
    {
        return this.path;
    }

    @XmlElement(name = "Path")
    public void setPath(Path path)
    {
        this.path = path;
    }

    public ArrayList<Certificate> getCertificates()
    {
        return certificates;
    }

    @XmlElement(name = "Certificate")
    public void setCertificates(ArrayList<Certificate> certificates)
    {
        this.certificates = certificates;
    }

    public ArrayList<CRL> getCRLs()
    {
        return this.revocationLists;
    }

    @XmlElement(name = "CRL")
    public void setCRLs(ArrayList<CRL> revocationLists)
    {
        this.revocationLists = revocationLists;
    }

    public ArrayList<OcspResponse> getOcspResponses()
    {
        return this.ocspResponses;
    }

    @XmlElement(name = "OcspResponse")
    public void setOcspResponses(ArrayList<OcspResponse> ocspResponses)
    {
        this.ocspResponses = ocspResponses;
    }

    @Override
    public String toString()
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(PKIObjects.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(jakarta.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(jakarta.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(this, stringWriter);
            stringWriter.flush();
            stringWriter.close();
            return stringWriter.toString();
        }
        catch (Exception e)
        {
            return "";
        }

    }

}