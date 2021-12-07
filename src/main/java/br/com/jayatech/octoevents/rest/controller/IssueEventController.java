package br.com.jayatech.octoevents.rest.controller;

import br.com.jayatech.octoevents.rest.dto.IssueEventDto;
import br.com.jayatech.octoevents.service.IssueEventService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @CrossOrigin
    @ApiOperation(value = "The Webhook endpoint that receives events from Github and saves them to the database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Returns 201 when the event has been successfully received " +
                    "and persisted to the database."),
            @ApiResponse(code = 400, message = "Returns 400 when some domain validation error occurs."),
            @ApiResponse(code = 500, message = "Returns 500 when some internal server error occurs.")
    })
    @PostMapping
    public ResponseEntity<?> registerIssueEvent(@Valid @RequestBody IssueEventDto issueEventDto) {
        issueEventService.registerIssueEvent(issueEventDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @ApiOperation(value = "The event endpoint that will expose persisted events filtering by issue id.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns 200 when the problem is valid and there are 0 or more " +
                    "persistent events for the problem."),
            @ApiResponse(code = 404, message = "Returns 404 when the id entered does not belong to any issue " +
                    "persisted in the database.")
    })
    @GetMapping("/{id}/events")
    public ResponseEntity<List<IssueEventDto>> getEventsForIssueId(@PathVariable("id") Long idIssue) {
        List<IssueEventDto> issueEventDtoList = issueEventService.getEventsForIssueId(idIssue);
        return new ResponseEntity<>(issueEventDtoList, HttpStatus.OK);
    }
}
