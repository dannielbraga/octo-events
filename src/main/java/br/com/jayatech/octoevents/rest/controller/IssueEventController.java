package br.com.jayatech.octoevents.rest.controller;

import br.com.jayatech.octoevents.rest.dto.IssueEventDto;
import br.com.jayatech.octoevents.service.IssueEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
        issueEventService.registerIssueEvent(issueEventDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}/events")
    public ResponseEntity<List<IssueEventDto>> getEventsForIssueId(@PathVariable("id") Long idIssue) {
        List<IssueEventDto> issueEventDtoList = issueEventService.getEventsForIssueId(idIssue);
        return new ResponseEntity<>(issueEventDtoList, HttpStatus.OK);
    }
}
