package br.com.jayatech.octoevents.service;

import br.com.jayatech.octoevents.rest.dto.IssueEventDto;

public interface IssueEventService {
    void registerIssueEvent(IssueEventDto issueEventDto);
}
