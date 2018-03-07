
package de.mtg.certpathtest.extensions;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.mtg.certpathtest.pkiobjects.Extension;
import de.mtg.certpathtest.pkiobjects.WrongPKIObjectException;
import de.mtg.certpathtest.pkiobjects.extensions.CRLNumber;

/**
 *
 * Unit tests for {@link de.mtg.certpathtest.pkiobjects.extensions.CRLNumber}.
 *
 * @see de.mtg.certpathtest.pkiobjects.extensions.CRLNumber CRLNumber
 *
 *
 */
public class CRLNumberTest
{

    /**
     *
     * Prepares the environment before every test.
     *
     * @throws Exception if any exception occurs.
     */
    @Before
    public void setUp() throws Exception
    {

    }

    /**
     *
     * Tests whether this extension can be created correctly from a correct representation.
     *
     * @throws Exception if any exception occurs.
     */
    @Test
    public void testCorrect() throws Exception
    {

        BigInteger value = new BigInteger("-123");

        Extension extension = new Extension();
        extension.setCritical("false");
        extension.setOid(org.bouncycastle.asn1.x509.Extension.cRLNumber.getId());
        extension.setType("pretty");
        extension.setValue(value.toString());

        CRLNumber crlNumber = new CRLNumber(extension);
        byte[] encoded = crlNumber.getEncoded();

        ByteArrayInputStream bais = new ByteArrayInputStream(encoded);
        ASN1InputStream asn1InputStream = new ASN1InputStream(bais);
        ASN1Integer asn1Integer = (ASN1Integer) asn1InputStream.readObject();
        asn1InputStream.close();
        bais.close();

        Assert.assertEquals(0, asn1Integer.getValue().compareTo(value));
        Assert.assertNotNull(asn1Integer.getValue());

    }

    /**
     *
     * Tests whether this extension cannot be created from a wrong pretty representation and a proper exception is
     * thrown.
     *
     * @throws Exception if any exception occurs.
     */
    @Test(expected = WrongPKIObjectException.class)
    public void testIncorrect() throws Exception
    {

        Extension extension = new Extension();
        extension.setCritical("false");
        extension.setOid(org.bouncycastle.asn1.x509.Extension.cRLNumber.getId());
        extension.setType("pretty");
        extension.setValue("-3D");

        new CRLNumber(extension);

    }

    /**
     *
     * Performs any necessary cleaning after each test run.
     *
     * @throws Exception if any exception occurs.
     */
    @After
    public void tearDown() throws Exception
    {

    }

}
