
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

    private final static QName _Catalog_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "catalog");
    private final static QName _Uom_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "uom");
    private final static QName _MaterialType_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "materialType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.packt.erp.modules.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Uom }
     * 
     */
    public Uom createUom() {
        return new Uom();
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link MaterialType }
     * 
     */
    public MaterialType createMaterialType() {
        return new MaterialType();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link UomArray }
     * 
     */
    public UomArray createUomArray() {
        return new UomArray();
    }

    /**
     * Create an instance of {@link CatalogArray }
     * 
     */
    public CatalogArray createCatalogArray() {
        return new CatalogArray();
    }

    /**
     * Create an instance of {@link InventoryForm }
     * 
     */
    public InventoryForm createInventoryForm() {
        return new InventoryForm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Catalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.modules.erp.packt.org/", name = "catalog")
    public JAXBElement<Catalog> createCatalog(Catalog value) {
        return new JAXBElement<Catalog>(_Catalog_QNAME, Catalog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.modules.erp.packt.org/", name = "uom")
    public JAXBElement<Uom> createUom(Uom value) {
        return new JAXBElement<Uom>(_Uom_QNAME, Uom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaterialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.modules.erp.packt.org/", name = "materialType")
    public JAXBElement<MaterialType> createMaterialType(MaterialType value) {
        return new JAXBElement<MaterialType>(_MaterialType_QNAME, MaterialType.class, null, value);
    }

}
