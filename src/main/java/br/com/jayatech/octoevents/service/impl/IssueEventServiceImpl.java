package br.com.jayatech.octoevents.service.impl;

import br.com.jayatech.octoevents.domain.model.*;
import br.com.jayatech.octoevents.domain.repository.IssueEventRepository;
import br.com.jayatech.octoevents.rest.dto.IssueEventDto;
import br.com.jayatech.octoevents.service.IssueEventService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IssueEventServiceImpl implements IssueEventService {
    private final ModelMapper modelMapper;
    private final IssueEventRepository issueEventRepository;

    @Autowired
    public IssueEventServiceImpl(ModelMapper modelMapper, IssueEventRepository issueEventRepository) {
        this.modelMapper = modelMapper;
        this.issueEventRepository = issueEventRepository;
    }

    @Override
    @Transactional
    public void registerIssueEvent(IssueEventDto issueEventDto) {
        IssueEvent issueEvent = toIssueEvent(issueEventDto);
        issueEventRepository.save(issueEvent);
    }

    private IssueEvent toIssueEvent(IssueEventDto issueEventDto) {
        IssueEvent issueEvent = new IssueEvent();
        issueEvent.setAction(issueEventDto.getAction());
        issueEvent.setIssue(modelMapper.map(issueEventDto.getIssueDto(), Issue.class));
        issueEvent.setComment(modelMapper.map(issueEventDto.getCommentDto(), Comment.class));
        issueEvent.setRepository(modelMapper.map(issueEventDto.getRepositoryDto(), Repository.class));
        issueEvent.setSender(modelMapper.map(issueEventDto.getSenderDto(), Sender.class));

        return issueEvent;
    }
}
