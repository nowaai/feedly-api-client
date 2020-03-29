package client.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "collection")
public class Collection {

    @Id
    private String id;
    private boolean customizable;
    @OneToMany(targetEntity = Feed.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private List<Feed> feeds;
    private String label;
    private long created;
    private boolean enterprise;
    private long numFeeds;

    public Collection() {
    }

    public Collection(String id, boolean customizable, List<Feed> feeds, String label, long created, boolean enterprise, long numFeeds) {
        this.id = id;
        this.customizable = customizable;
        this.feeds = feeds;
        this.label = label;
        this.created = created;
        this.enterprise = enterprise;
        this.numFeeds = numFeeds;
    }

    public boolean getCustomizable() {
        return customizable;
    }

    public void setCustomizable(boolean value) {
        this.customizable = value;
    }

    public List<Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Feed> value) {
        this.feeds = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long value) {
        this.created = value;
    }

    public boolean getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(boolean value) {
        this.enterprise = value;
    }

    public long getNumFeeds() {
        return numFeeds;
    }

    public void setNumFeeds(long value) {
        this.numFeeds = value;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
