package br.com.jayatech.octoevents.rest.controller;

import br.com.jayatech.octoevents.rest.dto.IssueEventDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/issues")
public class IssueEventController {
    public static final Logger LOGGER = LoggerFactory.getLogger(IssueEventController.class);

    @PostMapping
    public void registerIssueEvent(@Valid @RequestBody IssueEventDto issueEventDto) {
        LOGGER.info("Deu tudo certo issueEvent: {}", issueEventDto);
    }
}
