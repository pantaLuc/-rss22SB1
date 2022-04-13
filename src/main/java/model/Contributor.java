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
    "name",
    "uri"
})
@XmlRootElement(name = "contributor", namespace = "http://univrouen.fr/rss22")
public class Contributor {

    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected String name;
    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected String uri;


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getUri() {
        return uri;
    }


    public void setUri(String value) {
        this.uri = value;
    }

}
