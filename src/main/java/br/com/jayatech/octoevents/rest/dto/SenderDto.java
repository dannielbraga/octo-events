package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SenderDto {
    private final Long id;
    private final String login;
    private final String nodeId;
    private final String avatarUrl;
    private final String gravatarId;
    private final String url;
    private final String htmlUrl;
    private final String followersUrl;
    private final String followingUrl;
    private final String gistsUrl;
    private final String starredUrl;
    private final String subscriptionsUrl;
    private final String organizationsUrl;
    private final String reposUrl;
    private final String eventsUrl;
    private final String receivedEventsUrl;
    private final String type;
    private final boolean siteAdmin;

    @JsonCreator
    public SenderDto(@JsonProperty("id") final Long id,
                     @JsonProperty("login") final String login,
                     @JsonProperty("node_id") final String nodeId,
                     @JsonProperty("avatar_url") final String avatarUrl,
                     @JsonProperty("gravatar_id") final String gravatarId,
                     @JsonProperty("url") final String url,
                     @JsonProperty("html_url") final String htmlUrl,
                     @JsonProperty("followers_url") final String followersUrl,
                     @JsonProperty("following_url") final String followingUrl,
                     @JsonProperty("gists_url") final String gistsUrl,
                     @JsonProperty("starred_url") final String starredUrl,
                     @JsonProperty("subscriptions_url") String subscriptionsUrl,
                     @JsonProperty("organizations_url") final String organizationsUrl,
                     @JsonProperty("repos_url") final String reposUrl,
                     @JsonProperty("events_url") final String eventsUrl,
                     @JsonProperty("received_events_url") final String receivedEventsUrl,
                     @JsonProperty("type") final String type,
                     @JsonProperty("site_admin") boolean siteAdmin) {
        this.id = id;
        this.login = login;
        this.nodeId = nodeId;
        this.avatarUrl = avatarUrl;
        this.gravatarId = gravatarId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
    }
}
