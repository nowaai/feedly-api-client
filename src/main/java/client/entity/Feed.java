package client.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "feed")
public class Feed {

    @Id
    private String id;
    private String feedID;
    private String title;
    private long updated;
    private double velocity;
    @OneToMany(targetEntity = Topic.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
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

    public Feed() {
    }

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

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getFeedID() {
        return feedID;
    }

    public void setFeedID(String value) {
        this.feedID = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long value) {
        this.updated = value;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double value) {
        this.velocity = value;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> value) {
        this.topics = value;
    }

    public long getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(long value) {
        this.subscribers = value;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String value) {
        this.website = value;
    }

    public boolean getPartial() {
        return partial;
    }

    public void setPartial(boolean value) {
        this.partial = value;
    }

    public long getEstimatedEngagement() {
        return estimatedEngagement;
    }

    public void setEstimatedEngagement(long value) {
        this.estimatedEngagement = value;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String value) {
        this.iconURL = value;
    }

    public String getVisualURL() {
        return visualURL;
    }

    public void setVisualURL(String value) {
        this.visualURL = value;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String value) {
        this.contentType = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String value) {
        this.coverURL = value;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String value) {
        this.coverColor = value;
    }
}
