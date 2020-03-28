package client.entity;

import javax.persistence.*;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name = "feed")
public class Feed {

    @Id
    private String id;
    private String feedID;
    private String title;
    private long updated;
    private double velocity;
    @OneToMany(targetEntity = Topic.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="feed_id")
    private List<Topic> topics;
    private long subscribers;
    private String website;
    private boolean partial;
    private long estimatedEngagement;
    private String iconURL;
    private String visualURL;
    private String contentType;
    private String language;
    private String description;
    private String coverURL;
    private String coverColor;

    public Feed() {}

    public Feed(String id, String feedID, String title, long updated, double velocity, List<Topic> topics, long subscribers, String website, boolean partial, long estimatedEngagement, String iconURL, String visualURL, String contentType, String language, String description, String coverURL, String coverColor) {
        this.id = id;
        this.feedID = feedID;
        this.title = title;
        this.updated = updated;
        this.velocity = velocity;
        this.topics = topics;
        this.subscribers = subscribers;
        this.website = website;
        this.partial = partial;
        this.estimatedEngagement = estimatedEngagement;
        this.iconURL = iconURL;
        this.visualURL = visualURL;
        this.contentType = contentType;
        this.language = language;
        this.description = description;
        this.coverURL = coverURL;
        this.coverColor = coverColor;
    }

    @JsonProperty("id")
    public String getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(String value) {
        this.id = value;
    }

    @JsonProperty("feedId")
    public String getFeedID() {
        return feedID;
    }

    @JsonProperty("feedId")
    public void setFeedID(String value) {
        this.feedID = value;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String value) {
        this.title = value;
    }

    @JsonProperty("updated")
    public long getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(long value) {
        this.updated = value;
    }

    @JsonProperty("velocity")
    public double getVelocity() {
        return velocity;
    }

    @JsonProperty("velocity")
    public void setVelocity(double value) {
        this.velocity = value;
    }

    @JsonProperty("topics")
    public List<Topic> getTopics() {
        return topics;
    }

    @JsonProperty("topics")
    public void setTopics(List<Topic> value) {
        this.topics = value;
    }

    @JsonProperty("subscribers")
    public long getSubscribers() {
        return subscribers;
    }

    @JsonProperty("subscribers")
    public void setSubscribers(long value) {
        this.subscribers = value;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String value) {
        this.website = value;
    }

    @JsonProperty("partial")
    public boolean getPartial() {
        return partial;
    }

    @JsonProperty("partial")
    public void setPartial(boolean value) {
        this.partial = value;
    }

    @JsonProperty("estimatedEngagement")
    public long getEstimatedEngagement() {
        return estimatedEngagement;
    }

    @JsonProperty("estimatedEngagement")
    public void setEstimatedEngagement(long value) {
        this.estimatedEngagement = value;
    }

    @JsonProperty("iconUrl")
    public String getIconURL() {
        return iconURL;
    }

    @JsonProperty("iconUrl")
    public void setIconURL(String value) {
        this.iconURL = value;
    }

    @JsonProperty("visualUrl")
    public String getVisualURL() {
        return visualURL;
    }

    @JsonProperty("visualUrl")
    public void setVisualURL(String value) {
        this.visualURL = value;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String value) {
        this.contentType = value;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String value) {
        this.language = value;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String value) {
        this.description = value;
    }

    @JsonProperty("coverUrl")
    public String getCoverURL() {
        return coverURL;
    }

    @JsonProperty("coverUrl")
    public void setCoverURL(String value) {
        this.coverURL = value;
    }

    @JsonProperty("coverColor")
    public String getCoverColor() {
        return coverColor;
    }

    @JsonProperty("coverColor")
    public void setCoverColor(String value) {
        this.coverColor = value;
    }
}
