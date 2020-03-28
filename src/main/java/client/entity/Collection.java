package client.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "collection")
public class Collection {

    @Id
    private String id;
    private boolean customizable;
    @OneToMany(targetEntity = Feed.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="collection_id")
    private List<Feed> feeds;
    private String label;
    private long created;
    private boolean enterprise;
    private long numFeeds;

    public Collection(){}

    public Collection(String id, boolean customizable, List<Feed> feeds, String label, long created, boolean enterprise, long numFeeds) {
        this.id = id;
        this.customizable = customizable;
        this.feeds = feeds;
        this.label = label;
        this.created = created;
        this.enterprise = enterprise;
        this.numFeeds = numFeeds;
    }

    @JsonProperty("customizable")
    public boolean getCustomizable() {
        return customizable;
    }

    @JsonProperty("customizable")
    public void setCustomizable(boolean value) {
        this.customizable = value;
    }

    @JsonProperty("feeds")
    public List<Feed> getFeeds() {
        return feeds;
    }

    @JsonProperty("feeds")
    public void setFeeds(List<Feed> value) {
        this.feeds = value;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String value) {
        this.label = value;
    }

    @JsonProperty("created")
    public long getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(long value) {
        this.created = value;
    }

    @JsonProperty("enterprise")
    public boolean getEnterprise() {
        return enterprise;
    }

    @JsonProperty("enterprise")
    public void setEnterprise(boolean value) {
        this.enterprise = value;
    }

    @JsonProperty("numFeeds")
    public long getNumFeeds() {
        return numFeeds;
    }

    @JsonProperty("numFeeds")
    public void setNumFeeds(long value) {
        this.numFeeds = value;
    }

    @JsonProperty("id")
    public String getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(String value) {
        this.id = value;
    }
}
