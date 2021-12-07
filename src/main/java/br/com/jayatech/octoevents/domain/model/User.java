package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "node_id")
    private String nodeId;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "gravatar_id")
    private String gravatarId;

    @Column(name = "url")
    private String url;

    @Column(name = "html_url")
    private String htmlUrl;

    @Column(name = "followers_url")
    private String followersUrl;

    @Column(name = "following_url")
    private String followingUrl;

    @Column(name = "gists_url")
    private String gistsUrl;

    @Column(name = "starred_url")
    private String starredUrl;

    @Column(name = "subscriptions_url")
    private String subscriptionsUrl;

    @Column(name = "organizations_url")
    private String organizationsUrl;

    @Column(name = "repos_url")
    private String reposUrl;

    @Column(name = "events_url")
    private String eventsUrl;

    @Column(name = "received_events_url")
    private String receivedEventsUrl;

    @Column(name = "type")
    private String type;

    @Column(name = "site_admin")
    private boolean siteAdmin;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Comment> comments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Issue> issues;
}
