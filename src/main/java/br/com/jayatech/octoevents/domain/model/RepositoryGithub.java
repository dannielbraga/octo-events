package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "repository")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RepositoryGithub {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "node_id")
    private String nodeId;

    @Column(name = "name")
    private String name;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "is_private")
    private boolean isPrivate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "html_url")
    private String htmlUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "fork")
    private boolean fork;

    @Column(name = "url")
    private String url;

    @Column(name = "forks_url")
    private String forksUrl;

    @Column(name = "keys_url")
    private String keysUrl;

    @Column(name = "collaborators_url")
    private String collaboratorsUrl;

    @Column(name = "teams_url")
    private String teamsUrl;

    @Column(name = "hooks_url")
    private String hooksUrl;

    @Column(name = "issue_events_url")
    private String issueEventsUrl;

    @Column(name = "events_url")
    private String eventsUrl;

    @Column(name = "assignees_url")
    private String assigneesUrl;

    @Column(name = "branches_url")
    private String branchesUrl;

    @Column(name = "tags_url")
    private String tagsUrl;

    @Column(name = "blobs_url")
    private String blobsUrl;

    @Column(name = "git_tags_url")
    private String gitTagsUrl;

    @Column(name = "git_refs_url")
    private String gitRefsUrl;

    @Column(name = "trees_url")
    private String treesUrl;

    @Column(name = "statuses_url")
    private String statusesUrl;

    @Column(name = "languages_url")
    private String languagesUrl;

    @Column(name = "stargazers_url")
    private String stargazersUrl;

    @Column(name = "contributors_url")
    private String contributorsUrl;

    @Column(name = "subscribers_url")
    private String subscribersUrl;

    @Column(name = "subscription_url")
    private String subscriptionUrl;

    @Column(name = "commits_url")
    private String commitsUrl;

    @Column(name = "git_commits_url")
    private String gitCommitsUrl;

    @Column(name = "comments_url")
    private String commentsUrl;

    @Column(name = "issue_comment_url")
    private String issueCommentUrl;

    @Column(name = "contents_url")
    private String contentsUrl;

    @Column(name = "compare_url")
    private String compareUrl;

    @Column(name = "merges_url")
    private String mergesUrl;

    @Column(name = "archive_url")
    private String archiveUrl;

    @Column(name = "downloads_url")
    private String downloadsUrl;

    @Column(name = "issues_url")
    private String issuesUrl;

    @Column(name = "pulls_url")
    private String pullsUrl;

    @Column(name = "milestones_url")
    private String milestonesUrl;

    @Column(name = "notifications_url")
    private String notificationsUrl;

    @Column(name = "labels_url")
    private String labelsUrl;

    @Column(name = "releases_url")
    private String releasesUrl;

    @Column(name = "deployments_url")
    private String deploymentsUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "pushed_at")
    private LocalDateTime pushedAt;

    @Column(name = "git_url")
    private String gitUrl;

    @Column(name = "ssh_url")
    private String sshUrl;

    @Column(name = "clone_url")
    private String cloneUrl;

    @Column(name = "svn_url")
    private String svnUrl;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "size")
    private int size;

    @Column(name = "stargazers_count")
    private int stargazersCount;

    @Column(name = "watchers_count")
    private int watchersCount;

    @Column(name = "language")
    private String language;

    @Column(name = "has_issues")
    private boolean hasIssues;

    @Column(name = "has_projects")
    private boolean hasProjects;

    @Column(name = "has_downloads")
    private boolean hasDownloads;

    @Column(name = "has_wiki")
    private boolean hasWiki;

    @Column(name = "has_pages")
    private boolean hasPages;

    @Column(name = "forks_count")
    private int forksCount;

    @Column(name = "mirror_url")
    private String mirrorUrl;

    @Column(name = "archived")
    private boolean archived;

    @Column(name = "disabled")
    private boolean disabled;

    @Column(name = "open_issues_count")
    private int openIssuesCount;

    @Column(name = "allowforking")
    private boolean allowforking;

    @Column(name = "is_template")
    private boolean isTemplate;

    @Column(name = "visibility")
    private String visibility;

    @Column(name = "forks")
    private int forks;

    @Column(name = "open_issues")
    private int openIssues;

    @Column(name = "watchers")
    private int watchers;

    @Column(name = "default_branch")
    private String defaultBranch;

    @OneToMany(mappedBy = "repository", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<IssueEvent> issueEvents;
}
