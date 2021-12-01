package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_internal")
    private Long idInternal;

    @Column(name = "commentId")
    private Long commentId;

    @Column(name = "url")
    private String url;

    @Column(name = "html_url")
    private String htmlUrl;

    @Column(name = "issue_url")
    private String issueUrl;

    @Column(name = "node_id")
    private String nodeId;

    @Column(name = "user_id_internal")
    private User user;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "author_association")
    private String authorAssociation;

    @Column(name = "body")
    private String body;

    @Column(name = "reactions")
    private Reactions reactions;

    @Column(name = "performed_github_app")
    private Object performedGithubApp;
}
