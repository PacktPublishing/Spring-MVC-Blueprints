
package org.packt.erp.modules.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.packt.erp.modules.service.impl package. 
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

    private final static QName _GetAllSuppliersResponse_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "getAllSuppliersResponse");
    private final static QName _GetContactInfoResponse_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "getContactInfoResponse");
    private final static QName _GetAllSuppliers_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "getAllSuppliers");
    private final static QName _GetContactInfo_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "getContactInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.packt.erp.modules.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContactInfoResponse }
     * 
     */
    public GetContactInfoResponse createGetContactInfoResponse() {
        return new GetContactInfoResponse();
    }

    /**
     * Create an instance of {@link GetAllSuppliersResponse }
     * 
     */
    public GetAllSuppliersResponse createGetAllSuppliersResponse() {
        return new GetAllSuppliersResponse();
    }

    /**
     * Create an instance of {@link GetAllSuppliers }
     * 
     */
    public GetAllSuppliers createGetAllSuppliers() {
        return new GetAllSuppliers();
    }

    /**
     * Create an instance of {@link GetContactInfo }
     * 
     */
    public GetContactInfo createGetContactInfo() {
        return new GetContactInfo();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Supplier }
     * 
     */
    public Supplier createSupplier() {
        return new Supplier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSuppliersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.modules.erp.packt.org/", name = "getAllSuppliersResponse")
    public JAXBElement<GetAllSuppliersResponse> createGetAllSuppliersResponse(GetAllSuppliersResponse value) {
        return new JAXBElement<GetAllSuppliersResponse>(_GetAllSuppliersResponse_QNAME, GetAllSuppliersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.modules.erp.packt.org/", name = "getContactInfoResponse")
    public JAXBElement<GetContactInfoResponse> createGetContactInfoResponse(GetContactInfoResponse value) {
        return new JAXBElement<GetContactInfoResponse>(_GetContactInfoResponse_QNAME, GetContactInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSuppliers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.modules.erp.packt.org/", name = "getAllSuppliers")
    public JAXBElement<GetAllSuppliers> createGetAllSuppliers(GetAllSuppliers value) {
        return new JAXBElement<GetAllSuppliers>(_GetAllSuppliers_QNAME, GetAllSuppliers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.modules.erp.packt.org/", name = "getContactInfo")
    public JAXBElement<GetContactInfo> createGetContactInfo(GetContactInfo value) {
        return new JAXBElement<GetContactInfo>(_GetContactInfo_QNAME, GetContactInfo.class, null, value);
    }

}
