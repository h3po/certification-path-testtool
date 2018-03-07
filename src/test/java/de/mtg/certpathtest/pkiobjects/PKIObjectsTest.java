
package de.mtg.certpathtest.pkiobjects;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.mtg.certpathtest.ObjectCache;
import de.mtg.certpathtest.Utils;
import de.mtg.tr03124.TestCase;

/**
 *
 * Unit tests for {@link de.mtg.certpathtest.pkiobjects.PKIObjects}.
 *
 * @see de.mtg.certpathtest.pkiobjects.PKIObjects PKIObjects
 *
 *
 */
public class PKIObjectsTest
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
     * Tests the basic functionality of {@link de.mtg.certpathtest.pkiobjects.PKIObjects}.
     *
     * @throws Exception if any exception occurs.
     */
    @Test
    public void testCorrect() throws Exception
    {

        ObjectCache objectCache = ObjectCache.getInstance();

        Random random = new Random();

        String id = "JUNIT-" + random.nextInt(Integer.MAX_VALUE);

        Certificate xmlCertificate = new Certificate();

        xmlCertificate.setId(id);
        xmlCertificate.setIssuerDN(new IssuerDN("CN=Test Issuer, C=DE", "UTF8"));
        xmlCertificate.setSubjectDN(new SubjectDN("CN=Test User, C=DE", "UTF8"));
        xmlCertificate.setSerialNumber("1234567678");
        xmlCertificate.setVersion("2");
        xmlCertificate.setNotBefore(new NotBefore("-3D", "UTC"));
        xmlCertificate.setNotAfter(new NotAfter("+3D", "UTC"));
        xmlCertificate.setPublicKey(new PublicKey("RSA,2048", "pretty"));
        xmlCertificate.setSignature("1.2.840.113549.1.1.11"); // SHA256WithRSAEncryption
        xmlCertificate.setVerifiedBy(id);

        PKIObjects pkiObjects = new PKIObjects();
        pkiObjects.getCertificates().add(xmlCertificate);

        String testCaseId = "TESTCASE-0001";
        TestCase testCase = new TestCase();
        testCase.setId(testCaseId);

        objectCache.addPKIobjectsToTestCase(testCaseId, pkiObjects);

        Assert.assertTrue(!Utils.hasReference(testCase));

        xmlCertificate = new Certificate();
        xmlCertificate.setRefid(id);

        PKIObjects pkiObjectsWithReference = new PKIObjects();
        pkiObjectsWithReference.getCertificates().add(xmlCertificate);

        testCaseId = "TESTCASE-0002";
        testCase = new TestCase();
        testCase.setId(testCaseId);
        objectCache.addPKIobjectsToTestCase(testCaseId, pkiObjectsWithReference);

        Assert.assertTrue(Utils.hasReference(testCase));

        objectCache.clear();

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
        ObjectCache.getInstance().clear();
    }
}
