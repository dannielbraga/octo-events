package br.com.jayatech.octoevents.service;

import br.com.jayatech.octoevents.rest.dto.IssueEventDto;

import java.util.List;

public interface IssueEventService {
    void registerIssueEvent(IssueEventDto issueEventDto);

    List<IssueEventDto> getEventsForIssueId(Long idIssue);
}
