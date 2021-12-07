package br.com.jayatech.octoevents.service.impl;

import br.com.jayatech.octoevents.domain.model.*;
import br.com.jayatech.octoevents.domain.repository.*;
import br.com.jayatech.octoevents.exception.IssueNotFoundException;
import br.com.jayatech.octoevents.rest.dto.*;
import br.com.jayatech.octoevents.service.IssueEventService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class IssueEventServiceImpl implements IssueEventService {
    private final ModelMapper modelMapper;
    private final IssueEventRepository issueEventRepository;
    private final IssueRepository issueRepository;
    private final RepositoryGithubRepository repositoryGithubRepository;
    private final SenderRepository senderRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final ReactionsRepository reactionsRepository;
    private final OwnerRepository ownerRepository;

    @Autowired
    public IssueEventServiceImpl(final ModelMapper modelMapper, final IssueEventRepository issueEventRepository,
                                 final IssueRepository issueRepository, final SenderRepository senderRepository,
                                 final RepositoryGithubRepository repositoryGithubRepository,
                                 final CommentRepository commentRepository, final UserRepository userRepository,
                                 final ReactionsRepository reactionsRepository, final OwnerRepository ownerRepository) {
        this.modelMapper = modelMapper;
        this.issueEventRepository = issueEventRepository;
        this.issueRepository = issueRepository;
        this.repositoryGithubRepository = repositoryGithubRepository;
        this.senderRepository = senderRepository;
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
        this.reactionsRepository = reactionsRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public List<IssueEventDto> getEventsForIssueId(Long idIssue) {
        var issue = issueRepository
                .findById(idIssue)
                .orElseThrow(() ->  new IssueNotFoundException("No issues found for the given id."));

        return issueEventRepository.findAllByIssueId(issue.getId())
                .stream()
                .map(this::toIssueEventDto)
                .collect(Collectors.toList());
    }

    private IssueEventDto toIssueEventDto(IssueEvent issueEvent) {
        var issueEventDto = new IssueEventDto();
        issueEventDto.setAction(issueEvent.getAction());
        issueEventDto.setIssueDto(modelMapper.map(issueEvent.getIssue(), IssueDto.class));
        issueEventDto.setRepositoryDto(modelMapper.map(issueEvent.getRepository(), RepositoryDto.class));
        issueEventDto.setSenderDto(modelMapper.map(issueEvent.getSender(), SenderDto.class));

        if (Objects.nonNull(issueEvent.getComment())) {
            issueEventDto.setCommentDto(modelMapper.map(issueEvent.getComment(), CommentDto.class));
        }

        return issueEventDto;
    }

    @Override
    @Transactional
    public void registerIssueEvent(final IssueEventDto issueEventDto) {
        var issueEvent = new IssueEvent();
        issueEvent.setCreatedAt(LocalDateTime.now());
        issueEvent.setAction(issueEventDto.getAction());
        issueEvent.setIssue(saveIssue(issueEventDto.getIssueDto()));
        issueEvent.setRepository(saveRepositoryGithub(issueEventDto.getRepositoryDto()));
        issueEvent.setSender(saveSender(issueEventDto.getSenderDto()));

        if (Objects.nonNull(issueEventDto.getCommentDto())) {
            issueEvent.setComment(saveComment(issueEventDto.getCommentDto()));
        }

        issueEventRepository.save(issueEvent);
    }

    private Issue saveIssue(IssueDto issueDto) {
        var issue = modelMapper.map(issueDto, Issue.class);
        issue.setUser(saveUser(issue.getUser()));
        issue.setReactions(saveReactions(issue.getReactions()));
        return issueRepository.save(issue);
    }

    private RepositoryGithub saveRepositoryGithub(RepositoryDto repositoryDto) {
        var repository = modelMapper.map(repositoryDto, RepositoryGithub.class);
        repository.setOwner(saveOwner(repository.getOwner()));
        return repositoryGithubRepository.save(repository);
    }

    private Sender saveSender(SenderDto senderDto) {
        return senderRepository.save(modelMapper.map(senderDto, Sender.class));
    }

    private Comment saveComment(CommentDto commentDto) {
        var comment = modelMapper.map(commentDto, Comment.class);
        comment.setUser(saveUser(comment.getUser()));
        comment.setReactions(saveReactions(comment.getReactions()));
        return commentRepository.save(comment);
    }

    private User saveUser(User user) {
        return userRepository.save(user);
    }

    private Reactions saveReactions(Reactions reactions) {
        return reactionsRepository.save(reactions);
    }

    private Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }
}
