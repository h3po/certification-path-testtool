//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.06 at 07:49:26 AM CET 
//


package de.mtg.tr03124;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.bund.bsi.tr03124 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Routines_QNAME = new QName("http://bsi.bund.de/TR03124", "Routines");
    private final static QName _Paragraph_QNAME = new QName("http://bsi.bund.de/TR03124", "Paragraph");
    private final static QName _TestLayer_QNAME = new QName("http://bsi.bund.de/TR03124", "TestLayer");
    private final static QName _TestUnit_QNAME = new QName("http://bsi.bund.de/TR03124", "TestUnit");
    private final static QName _References_QNAME = new QName("http://bsi.bund.de/TR03124", "References");
    private final static QName _Profiles_QNAME = new QName("http://bsi.bund.de/TR03124", "Profiles");
    private final static QName _TestCase_QNAME = new QName("http://bsi.bund.de/TR03124", "TestCase");
    private final static QName _Link_QNAME = new QName("http://bsi.bund.de/TR03124", "Link");
    private final static QName _Certificates_QNAME = new QName("http://bsi.bund.de/TR03124", "Certificates");
    private final static QName _RoutineCall_QNAME = new QName("http://bsi.bund.de/TR03124", "RoutineCall");
    private final static QName _CertificateCertificateContentCertificateEffectiveDate_QNAME = new QName("http://bsi.bund.de/TR03124", "CertificateEffectiveDate");
    private final static QName _CertificateCertificateContentCertificateExpirationDate_QNAME = new QName("http://bsi.bund.de/TR03124", "CertificateExpirationDate");
    private final static QName _CertificateCertificateContentCertificateAuthorityReference_QNAME = new QName("http://bsi.bund.de/TR03124", "CertificateAuthorityReference");
    private final static QName _CertificateCertificateContentCertificateExtension_QNAME = new QName("http://bsi.bund.de/TR03124", "CertificateExtension");
    private final static QName _CertificateCertificateContentSigningKey_QNAME = new QName("http://bsi.bund.de/TR03124", "SigningKey");
    private final static QName _CertificateCertificateContentCertificateHolderReference_QNAME = new QName("http://bsi.bund.de/TR03124", "CertificateHolderReference");
    private final static QName _CertificateCertificateContentSignerCertificate_QNAME = new QName("http://bsi.bund.de/TR03124", "SignerCertificate");
    private final static QName _CertificateCertificateContentCertificateHolderAuthorization_QNAME = new QName("http://bsi.bund.de/TR03124", "CertificateHolderAuthorization");
    private final static QName _CertificateCertificateContentPublicKey_QNAME = new QName("http://bsi.bund.de/TR03124", "PublicKey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.bund.bsi.tr03124
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public Table createTable() {
        return new Table();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link de.mtg.tr03124.Document.VersionHistory }
     * 
     */
    public de.mtg.tr03124.Document.VersionHistory createDocumentVersionHistory() {
        return new de.mtg.tr03124.Document.VersionHistory();
    }

    /**
     * Create an instance of {@link Certificates }
     * 
     */
    public Certificates createCertificates() {
        return new Certificates();
    }

    /**
     * Create an instance of {@link Heading }
     * 
     */
    public Heading createHeading() {
        return new Heading();
    }

    /**
     * Create an instance of {@link Table.Row }
     * 
     */
    public Table.Row createTableRow() {
        return new Table.Row();
    }

    /**
     * Create an instance of {@link Enumeration }
     * 
     */
    public Enumeration createEnumeration() {
        return new Enumeration();
    }

    /**
     * Create an instance of {@link Hypertext }
     * 
     */
    public Hypertext createHypertext() {
        return new Hypertext();
    }

    /**
     * Create an instance of {@link Routines }
     * 
     */
    public Routines createRoutines() {
        return new Routines();
    }

    /**
     * Create an instance of {@link TestLayer }
     * 
     */
    public TestLayer createTestLayer() {
        return new TestLayer();
    }

    /**
     * Create an instance of {@link RoutineCall }
     * 
     */
    public RoutineCall createRoutineCall() {
        return new RoutineCall();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link TestCase }
     * 
     */
    public TestCase createTestCase() {
        return new TestCase();
    }

    /**
     * Create an instance of {@link Profiles }
     * 
     */
    public Profiles createProfiles() {
        return new Profiles();
    }

    /**
     * Create an instance of {@link References }
     * 
     */
    public References createReferences() {
        return new References();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link TestUnit }
     * 
     */
    public TestUnit createTestUnit() {
        return new TestUnit();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Command }
     * 
     */
    public Command createCommand() {
        return new Command();
    }

    /**
     * Create an instance of {@link LinkData }
     * 
     */
    public LinkData createLinkData() {
        return new LinkData();
    }

    /**
     * Create an instance of {@link APDUResult }
     * 
     */
    public APDUResult createAPDUResult() {
        return new APDUResult();
    }

    /**
     * Create an instance of {@link APDUCommand }
     * 
     */
    public APDUCommand createAPDUCommand() {
        return new APDUCommand();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link ActionStep }
     * 
     */
    public ActionStep createActionStep() {
        return new ActionStep();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link FormattedText }
     * 
     */
    public FormattedText createFormattedText() {
        return new FormattedText();
    }

    /**
     * Create an instance of {@link FormattedContent }
     * 
     */
    public FormattedContent createFormattedContent() {
        return new FormattedContent();
    }

    /**
     * Create an instance of {@link TestHierarchyReference }
     * 
     */
    public TestHierarchyReference createTestHierarchyReference() {
        return new TestHierarchyReference();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link Routine }
     * 
     */
    public Routine createRoutine() {
        return new Routine();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link Certificate.CertificateContent }
     * 
     */
    public Certificate.CertificateContent createCertificateCertificateContent() {
        return new Certificate.CertificateContent();
    }

    /**
     * Create an instance of {@link de.mtg.tr03124.Document.VersionHistory.Version }
     * 
     */
    public de.mtg.tr03124.Document.VersionHistory.Version createDocumentVersionHistoryVersion() {
        return new de.mtg.tr03124.Document.VersionHistory.Version();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Routines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "Routines")
    public JAXBElement<Routines> createRoutines(Routines value) {
        return new JAXBElement<Routines>(_Routines_QNAME, Routines.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hypertext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "Paragraph")
    public JAXBElement<Hypertext> createParagraph(Hypertext value) {
        return new JAXBElement<Hypertext>(_Paragraph_QNAME, Hypertext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestLayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "TestLayer")
    public JAXBElement<TestLayer> createTestLayer(TestLayer value) {
        return new JAXBElement<TestLayer>(_TestLayer_QNAME, TestLayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "TestUnit")
    public JAXBElement<TestUnit> createTestUnit(TestUnit value) {
        return new JAXBElement<TestUnit>(_TestUnit_QNAME, TestUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link References }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "References")
    public JAXBElement<References> createReferences(References value) {
        return new JAXBElement<References>(_References_QNAME, References.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "Profiles")
    public JAXBElement<Profiles> createProfiles(Profiles value) {
        return new JAXBElement<Profiles>(_Profiles_QNAME, Profiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "TestCase")
    public JAXBElement<TestCase> createTestCase(TestCase value) {
        return new JAXBElement<TestCase>(_TestCase_QNAME, TestCase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Link }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "Link")
    public JAXBElement<Link> createLink(Link value) {
        return new JAXBElement<Link>(_Link_QNAME, Link.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Certificates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "Certificates")
    public JAXBElement<Certificates> createCertificates(Certificates value) {
        return new JAXBElement<Certificates>(_Certificates_QNAME, Certificates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutineCall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "RoutineCall")
    public JAXBElement<RoutineCall> createRoutineCall(RoutineCall value) {
        return new JAXBElement<RoutineCall>(_RoutineCall_QNAME, RoutineCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "CertificateEffectiveDate", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentCertificateEffectiveDate(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentCertificateEffectiveDate_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "CertificateExpirationDate", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentCertificateExpirationDate(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentCertificateExpirationDate_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "CertificateAuthorityReference", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentCertificateAuthorityReference(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentCertificateAuthorityReference_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "CertificateExtension", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentCertificateExtension(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentCertificateExtension_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "SigningKey", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentSigningKey(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentSigningKey_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "CertificateHolderReference", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentCertificateHolderReference(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentCertificateHolderReference_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "SignerCertificate", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentSignerCertificate(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentSignerCertificate_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "CertificateHolderAuthorization", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentCertificateHolderAuthorization(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentCertificateHolderAuthorization_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bsi.bund.de/TR03124", name = "PublicKey", scope = Certificate.CertificateContent.class)
    public JAXBElement<String> createCertificateCertificateContentPublicKey(String value) {
        return new JAXBElement<String>(_CertificateCertificateContentPublicKey_QNAME, String.class, Certificate.CertificateContent.class, value);
    }

}
