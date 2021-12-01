package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "issue_event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IssueEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_internal")
    private Integer idInternal;

    @Column(name = "action")
    private String action;

    @ManyToOne
    @JoinColumn(name = "issue_id_internal")
    private Issue issue;

    @Column(name = "id")
    private Comment comment;

    @Column(name = "id")
    private Repository repositoryDto;

    @Column(name = "id")
    private Sender senderDto;
}
