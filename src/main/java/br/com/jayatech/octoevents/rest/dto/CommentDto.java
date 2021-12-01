package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDto {
    private Long id;
    private String url;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("issue_url")
    private String issueUrl;

    @JsonProperty("node_id")
    private String nodeId;

    private UserDto userDto;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

    @JsonProperty("author_association")
    private String authorAssociation;

    private String body;
    private ReactionsDto reactions;

    @JsonProperty("performed_via_github_app")
    private Object performedGithubApp;
}
