package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentDto {
    private final Long id;
    private final String url;
    private final String htmlUrl;
    private final String issueUrl;
    private final String nodeId;
    private final UserDto userDto;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    private final String authorAssociation;
    private final String body;
    private final ReactionsDto reactions;
    private final Object performedGithubApp;

    @JsonCreator
    public CommentDto(final Long id, final String url, @JsonProperty("html_url") final String htmlUrl,
                      @JsonProperty("issue_url") final String issueUrl, @JsonProperty("node_id") final String nodeId,
                      @JsonProperty("user") final UserDto userDto,
                      @JsonProperty("created_at") final LocalDateTime createdAt,
                      @JsonProperty("updated_at") final LocalDateTime updatedAt,
                      @JsonProperty("author_association") final String authorAssociation, final String body,
                      final ReactionsDto reactions,
                      @JsonProperty("performed_via_github_app") final Object performedGithubApp) {
        this.id = id;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.issueUrl = issueUrl;
        this.nodeId = nodeId;
        this.userDto = userDto;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.reactions = reactions;
        this.performedGithubApp = performedGithubApp;
    }
}
