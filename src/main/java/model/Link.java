//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.04.13 à 09:08:17 PM CEST 
//


package model;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "link", namespace = "http://univrouen.fr/rss22")
public class Link {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "rel")
    protected String rel;
    @XmlAttribute(name = "type")
    protected String type;


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public String getHref() {
        return href;
    }


    public void setHref(String value) {
        this.href = value;
    }

    public String getRel() {
        return rel;
    }


    public void setRel(String value) {
        this.rel = value;
    }

    public Link() {
    }

    public Link(String value, String href, String rel, String type) {
        this.value = value;
        this.href = href;
        this.rel = rel;
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setType(String value) {
        this.type = value;
    }

}
