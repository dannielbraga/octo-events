package br.com.jayatech.octoevents.controller;

import br.com.jayatech.octoevents.domain.model.IssueEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/issues")
public class IssueEventController {
    public static final Logger LOGGER = LoggerFactory.getLogger(IssueEventController.class);

    @PostMapping
    public void registerIssueEvent(@RequestBody IssueEvent issueEvent) {
        LOGGER.info("Deu tudo certo issueEvent: {}", issueEvent);
    }
}
