package br.com.jayatech.octoevents.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueEventDto {
    private String action;
    private IssueDto issueDto;
    private CommentDto comment;
    private RepositoryDto repositoryDto;
    private SenderDto senderDto;
}
