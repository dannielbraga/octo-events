package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueDto {
    private final Long id;
    private final String url;
    private final String repositoryUrl;
    private final String labelsUrl;
    private final String commentsUrl;
    private final String eventsUrl;
    private final String htmlUrl;
    private final String nodeId;
    private final int number;
    private final String title;
    private final UserDto userDto;
    private final String state;
    private final boolean locked;
    private final int comments;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    private final LocalDateTime closedAt;
    private final String authorAssociation;
    private final String activeLockReason;
    private final String body;
    private final ReactionsDto reactions;
    private final String timelineUrl;

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
                    @JsonProperty("user") final UserDto userDto,
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
        this.userDto = userDto;
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
