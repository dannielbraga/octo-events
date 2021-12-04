package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "issue_event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IssueEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    private Integer idInternal;

    @Column(name = "created_at_internal")
    private LocalDateTime createdAtInternal;

    @Column(name = "action")
    private String action;

    @ManyToOne
    @JoinColumn(name = "issue_id_internal")
    private Issue issue;

    @ManyToOne
    @JoinColumn(name = "comment_id_internal")
    private Comment comment;

    @ManyToOne
    @JoinColumn(name = "repository_id_internal")
    private Repository repository;

    @ManyToOne
    @JoinColumn(name = "sender_id_internal")
    private Sender sender;
}
