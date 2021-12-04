package br.com.jayatech.octoevents.rest.controller;

import br.com.jayatech.octoevents.rest.dto.IssueEventDto;
import br.com.jayatech.octoevents.service.IssueEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/issues")
public class IssueEventController {
    private final IssueEventService issueEventService;

    @Autowired
    public IssueEventController(IssueEventService issueEventService) {
        this.issueEventService = issueEventService;
    }

    @PostMapping
    public ResponseEntity<?> registerIssueEvent(@Valid @RequestBody IssueEventDto issueEventDto) {
        this.issueEventService.registerIssueEvent(issueEventDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
