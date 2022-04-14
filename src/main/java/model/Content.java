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
@XmlRootElement(name = "content", namespace = "http://univrouen.fr/rss22")
public class Content {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "type")
    protected String type;

    public Content() {
    }

    public Content(String value, String href, String type) {
        this.value = value;
        this.href = href;
        this.type = type;
    }

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


    public String getType() {
        return type;
    }


    public void setType(String value) {
        this.type = value;
    }

}
