package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private Long id;
    private String login;
    private String nodeId;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private boolean siteAdmin;

    @JsonCreator
    public UserDto(@JsonProperty("id") final Long id,
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
                   @JsonProperty("subscriptions_url") final String subscriptionsUrl,
                   @JsonProperty("organizations_url") final String organizationsUrl,
                   @JsonProperty("repos_url") final String reposUrl,
                   @JsonProperty("events_url") final String eventsUrl,
                   @JsonProperty("received_events_url") final String receivedEventsUrl,
                   @JsonProperty("type") final String type,
                   @JsonProperty("site_admin") final boolean siteAdmin) {
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