package br.com.jayatech.octoevents.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private Long id;
    private String url;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("issue_url")
    private String issueUrl;

    @JsonProperty("node_id")
    private String nodeId;

    private User user;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

    @JsonProperty("author_association")
    private String authorAssociation;

    private String body;
    private Reactions reactions;

    @JsonProperty("performed_via_github_app")
    private Object performedGithubApp;
}
