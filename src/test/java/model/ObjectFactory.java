//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.04.13 à 09:08:17 PM CEST 
//


package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _Name_QNAME = new QName("http://univrouen.fr/rss22", "name");
    private final static QName _Uri_QNAME = new QName("http://univrouen.fr/rss22", "uri");
    private final static QName _Guid_QNAME = new QName("http://univrouen.fr/rss22", "guid");
    private final static QName _Title_QNAME = new QName("http://univrouen.fr/rss22", "title");
    private final static QName _Published_QNAME = new QName("http://univrouen.fr/rss22", "published");
    private final static QName _PubDate_QNAME = new QName("http://univrouen.fr/rss22", "pubDate");
    private final static QName _Copyright_QNAME = new QName("http://univrouen.fr/rss22", "copyright");


    public ObjectFactory() {
    }


    public Category createCategory() {
        return new Category();
    }


    public Image createImage() {
        return new Image();
    }


    public Content createContent() {
        return new Content();
    }


    public Contributor createContributor() {
        return new Contributor();
    }


    public Author createAuthor() {
        return new Author();
    }

    public Link createLink() {
        return new Link();
    }


    public Item createItem() {
        return new Item();
    }


    public Feed createFeed() {
        return new Feed();
    }


    @XmlElementDecl(namespace = "http://univrouen.fr/rss22", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "http://univrouen.fr/rss22", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "http://univrouen.fr/rss22", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    @XmlElementDecl(namespace = "http://univrouen.fr/rss22", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "http://univrouen.fr/rss22", name = "published")
    public JAXBElement<String> createPublished(String value) {
        return new JAXBElement<String>(_Published_QNAME, String.class, null, value);
    }

    @XmlElementDecl(namespace = "http://univrouen.fr/rss22", name = "pubDate")
    public JAXBElement<String> createPubDate(String value) {
        return new JAXBElement<String>(_PubDate_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "http://univrouen.fr/rss22", name = "copyright")
    public JAXBElement<String> createCopyright(String value) {
        return new JAXBElement<String>(_Copyright_QNAME, String.class, null, value);
    }

}
