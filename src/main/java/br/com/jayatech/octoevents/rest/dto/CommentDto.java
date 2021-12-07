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
public class CommentDto {
    private Long id;
    private String url;
    private String htmlUrl;
    private String issueUrl;
    private String nodeId;
    private UserDto userDto;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String authorAssociation;
    private String body;
    private ReactionsDto reactions;

    @JsonCreator
    public CommentDto(@JsonProperty("id") final Long id,
                      @JsonProperty("url") final String url,
                      @JsonProperty("html_url") final String htmlUrl,
                      @JsonProperty("issue_url") final String issueUrl,
                      @JsonProperty("node_id") final String nodeId,
                      @JsonProperty("user") final UserDto userDto,
                      @JsonProperty("created_at") final LocalDateTime createdAt,
                      @JsonProperty("updated_at") final LocalDateTime updatedAt,
                      @JsonProperty("author_association") final String authorAssociation,
                      @JsonProperty("body") final String body,
                      @JsonProperty("reactions") final ReactionsDto reactions) {
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
    }
}
