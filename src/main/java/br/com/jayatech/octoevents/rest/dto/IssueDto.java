package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueDto {
    private Long id;
    private String url;
    private String repositoryUrl;
    private String labelsUrl;
    private String commentsUrl;
    private String eventsUrl;
    private String htmlUrl;
    private String nodeId;
    private int number;
    private String title;
    private UserDto user;
    private String state;
    private boolean locked;
    private int comments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime closedAt;
    private String authorAssociation;
    private String activeLockReason;
    private String body;
    private ReactionsDto reactions;
    private String timelineUrl;

    @JsonCreator
    public IssueDto(@JsonProperty("id") final Long id,
                    @JsonProperty("url") final String url,
                    @JsonProperty("repository_url") final String repositoryUrl,
                    @JsonProperty("labels_url") final String labelsUrl,
                    @JsonProperty("comments_url") final String commentsUrl,
                    @JsonProperty("events_url") final String eventsUrl,
                    @JsonProperty("html_url") final String htmlUrl,
                    @JsonProperty("node_id") final String nodeId,
                    @JsonProperty("number") final int number,
                    @JsonProperty("title") final String title,
                    @JsonProperty("user") final UserDto user,
                    @JsonProperty("state") final String state,
                    @JsonProperty("locked") final boolean locked,
                    @JsonProperty("comments") final int comments,
                    @JsonProperty("created_at") final LocalDateTime createdAt,
                    @JsonProperty("updated_at") final LocalDateTime updatedAt,
                    @JsonProperty("closed_at") final LocalDateTime closedAt,
                    @JsonProperty("author_association") final String authorAssociation,
                    @JsonProperty("active_lock_reason") final String activeLockReason,
                    @JsonProperty("body") final String body,
                    @JsonProperty("reactions") final ReactionsDto reactions,
                    @JsonProperty("timeline_url") final String timelineUrl) {
        this.id = id;
        this.url = url;
        this.repositoryUrl = repositoryUrl;
        this.labelsUrl = labelsUrl;
        this.commentsUrl = commentsUrl;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.nodeId = nodeId;
        this.number = number;
        this.title = title;
        this.user = user;
        this.state = state;
        this.locked = locked;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.authorAssociation = authorAssociation;
        this.activeLockReason = activeLockReason;
        this.body = body;
        this.reactions = reactions;
        this.timelineUrl = timelineUrl;
    }
}
