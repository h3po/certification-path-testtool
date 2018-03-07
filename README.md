# cpt: Certification Path Validation Test Tool

A Test Tool for the X.509 certification path validation

The Certification Path Validation Test Tool (CPT) is an open-source tool set that facilitates the testing of X.509 certificate path validation according to RFC 5280 in applications and libraries. Its main features are

* generation of X.509 certificates and CRLs from an XML test specification using a generic engine,
* a predefined test suite covering the important aspects of RFC 5280,
* easy extension and adaption of the existing test cases for the specific requirements of an application context,
* and additional tools for the execution of the test cases against TLS and IPsec implementations.

# Background

In digital communication X.509 certificates are used for authentication and verification of public keys. These certificates bind the public key to the identity of its owner within the setting of a public key infrastructure (PKI). The most common standard for digital certificates is X.509v3. The data formats for certificates and revocation lists and the algorithms for their processing are specified in RFC 5280. It describes in detail the steps for the validation of a certificate, the so-called certification path validation. Nevertheless, many bugs in the certification path validation of cryptography libraries have been reported in recent years. These bugs occurred due to incorrect interpretations of the standards or programming errors.

The CPT with its integrated test suite addresses these problems by allowing for the flexible generation of test data which can be used for verifying the structural correctness of the X.509 path validation implementations.

The CPT was contracted out by the German Federal Office for Information Security (BSI) to MTG AG as the main contractor and cryptosource GmbH as subcontractor. The tool is maintained by the two vendors.

# CPT Basis Tool

This github project represents the CPT Basis Tool. The CPT Basis Tool creates the test data, i.e. the test certificates and revocation lists and runs a CRL server for downloading test CRLs during testing. In addition, there is a test specification, which describes the test suite delivered with the tool. The XML file format for the test case specification conforms to [TR-03124](https://www.bsi.bund.de/DE/Publikationen/TechnischeRichtlinien/tr03124/index_htm.html).

# Quick start

* Import the project in your favorite IDE. 
* Configure your system to resolve the IP 127.0.0.1 to DNS certpath_test_host (or configure properly the configuration file *src/main/resources/cpt.ini*)
* Run the class *CertificationPathTest* with paramaters *-c src/main/resources/cpt.ini -o out -d testCases*. The tools reads the test cases and creates certificates and CRLs.

More detailed information like extensive documentation covering for example configuration options, extending the test cases, specifying certificate content etc. can be found at the BSI web pages
[BSI - cpt](https://www.bsi.bund.de/EN/Topics/OtherTopics/CPT/cpt_node.html)
