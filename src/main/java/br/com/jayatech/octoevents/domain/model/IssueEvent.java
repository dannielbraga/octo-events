package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IssueEvent {
    private String action;
    private Issue issue;
    private Comment comment;
    private Repository repository;
    private Sender sender;
}
