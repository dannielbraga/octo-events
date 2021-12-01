package br.com.jayatech.octoevents.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Issue {
    private Long id;

    private String url;

    @JsonProperty("repository_url")
    private String repositoryUrl;

    @JsonProperty("labels_url")
    private String labelsUrl;

    @JsonProperty("comments_url")
    private String commentsUrl;

    @JsonProperty("events_url")
    private String eventsUrl;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("node_id")
    private String nodeId;

    private int number;
    private String title;
    private User user;
    private List<Object> labels;
    private String state;
    private boolean locked;
    private Object assignee;
    private List<Object> assignees;
    private Object milestone;
    private int comments;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

    @JsonProperty("closed_at")
    private LocalDateTime closedAt;

    @JsonProperty("author_association")
    private String authorAssociation;

    @JsonProperty("active_lock_reason")
    private String activeLockReason;

    private String body;
    private Reactions reactions;

    @JsonProperty("timeline_url")
    private String timelineUrl;

    @JsonProperty("performed_via_github_app")
    private Object performedGithubApp;
}
