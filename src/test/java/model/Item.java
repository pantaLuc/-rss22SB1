


package model;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guid",
    "title",
    "category",
    "published",
    "image",
    "content",
    "contributor",
    "author"
})
@XmlRootElement(name = "item", namespace = "http://univrouen.fr/rss22")
public class Item {

    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected String guid;
    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected String title;
    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected Category category;
    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected String published;
    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected Image image;
    @XmlElement(namespace = "http://univrouen.fr/rss22", required = true)
    protected Content content;
    @XmlElement(namespace = "http://univrouen.fr/rss22")
    protected Contributor contributor;
    @XmlElement(namespace = "http://univrouen.fr/rss22")
    protected Author author;


    public String getGuid() {
        return guid;
    }


    public void setGuid(String value) {
        this.guid = value;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String value) {
        this.title = value;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category value) {
        this.category = value;
    }


    public String getPublished() {
        return published;
    }


    public void setPublished(String value) {
        this.published = value;
    }


    public Image getImage() {
        return image;
    }


    public void setImage(Image value) {
        this.image = value;
    }


    public Content getContent() {
        return content;
    }


    public void setContent(Content value) {
        this.content = value;
    }


    public Contributor getContributor() {
        return contributor;
    }


    public void setContributor(Contributor value) {
        this.contributor = value;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author value) {
        this.author = value;
    }
    public Item() {
    }

    public Item(String guid, String title, String published) {
        this.guid = guid;
        this.title = title;
        this.published = published;
    }
    @Override
    public String toString() {
        return ("Article : " + title + "\n(" + guid + ") Le = " + published );
    }

}
