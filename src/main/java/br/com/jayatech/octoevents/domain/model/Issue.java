package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "issue")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    private Long idInternal;

    @Column(name = "created_at_internal")
    private LocalDateTime createdAtInternal;

    @Column(name = "id")
    private Long id;

    @Column(name = "url")
    private String url;

    @Column(name = "repository_url")
    private String repositoryUrl;

    @Column(name = "labels_url")
    private String labelsUrl;

    @Column(name = "comments_url")
    private String commentsUrl;

    @Column(name = "events_url")
    private String eventsUrl;

    @Column(name = "html_url")
    private String htmlUrl;

    @Column(name = "node_id")
    private String nodeId;

    @Column(name = "number")
    private int number;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id_internal")
    private User user;

    @Column(name = "state")
    private String state;

    @Column(name = "locked")
    private boolean locked;

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

    @OneToOne
    @JoinColumn(name = "reactions_id_internal")
    private Reactions reactions;

    @Column(name = "timelineUrl")
    private String timelineUrl;

    @OneToMany(mappedBy = "issue")
    private Set<IssueEvent> issueEvents;
}
