package br.com.jayatech.octoevents.domain.model;

import br.com.jayatech.octoevents.rest.dto.ReactionsDto;
import br.com.jayatech.octoevents.rest.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "issue")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_internal")
    private Long idInternal;

    @Column(name = "issue_id")
    private Long issueId;

    @Column(name = "url")
    private String url;

    @Column(name = "repositoryUrl")
    private String repositoryUrl;

    @Column(name = "labelsUrl")
    private String labelsUrl;

    @Column(name = "commentsUrl")
    private String commentsUrl;

    @Column(name = "eventsUrl")
    private String eventsUrl;

    @Column(name = "htmlUrl")
    private String htmlUrl;

    @Column(name = "nodeId")
    private String nodeId;

    @Column(name = "number")
    private int number;

    @Column(name = "title")
    private String title;

    @Column(name = "userDto")
    private UserDto userDto;

    @Column(name = "labels")
    private List<Object> labels;

    @Column(name = "state")
    private String state;

    @Column(name = "locked")
    private boolean locked;

    @Column(name = "assignee")
    private Object assignee;

    @Column(name = "assignees")
    private List<Object> assignees;

    @Column(name = "milestone")
    private Object milestone;

    @Column(name = "comments")
    private int comments;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "closed_at")
    private LocalDateTime closedAt;

    @Column(name = "authorAssociation")
    private String authorAssociation;

    @Column(name = "activeLockReason")
    private String activeLockReason;

    @Column(name = "body")
    private String body;

    @Column(name = "reactions")
    private ReactionsDto reactions;

    @Column(name = "timelineUrl")
    private String timelineUrl;

    @Column(name = "performed_github_app")
    private Object performedGithubApp;
}
