package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueEventDto {
    @NotNull(message = "Action must not be null.")
    private final String action;
    @NotNull(message = "Issue must not be null.")
    private final IssueDto issueDto;
    private final CommentDto commentDto;
    @NotNull(message = "Repository must not be null.")
    private final RepositoryDto repositoryDto;
    @NotNull(message = "Sender must not be null.")
    private final SenderDto senderDto;

    @JsonCreator
    public IssueEventDto(@JsonProperty("action") final String action,
                         @JsonProperty("issue") final IssueDto issueDto,
                         @JsonProperty("comment") final CommentDto commentDto,
                         @JsonProperty("repository") final RepositoryDto repositoryDto,
                         @JsonProperty("sender") final SenderDto senderDto) {
        this.action = action;
        this.issueDto = issueDto;
        this.commentDto = commentDto;
        this.repositoryDto = repositoryDto;
        this.senderDto = senderDto;
    }
}
