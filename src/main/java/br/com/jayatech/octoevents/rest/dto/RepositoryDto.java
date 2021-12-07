package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryDto {
    private Long id;
    private String nodeId;
    private String name;
    private String fullName;
    private boolean isPrivate;
    private OwnerDto owner;
    private String htmlUrl;
    private String description;
    private boolean fork;
    private String url;
    private String forksUrl;
    private String keysUrl;
    private String collaboratorsUrl;
    private String teamsUrl;
    private String hooksUrl;
    private String issueEventsUrl;
    private String eventsUrl;
    private String assigneesUrl;
    private String branchesUrl;
    private String tagsUrl;
    private String blobsUrl;
    private String gitTagsUrl;
    private String gitRefsUrl;
    private String treesUrl;
    private String statusesUrl;
    private String languagesUrl;
    private String stargazersUrl;
    private String contributorsUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String commitsUrl;
    private String gitCommitsUrl;
    private String commentsUrl;
    private String issueCommentUrl;
    private String contentsUrl;
    private String compareUrl;
    private String mergesUrl;
    private String archiveUrl;
    private String downloadsUrl;
    private String issuesUrl;
    private String pullsUrl;
    private String milestonesUrl;
    private String notificationsUrl;
    private String labelsUrl;
    private String releasesUrl;
    private String deploymentsUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime pushedAt;
    private String gitUrl;
    private String sshUrl;
    private String cloneUrl;
    private String svnUrl;
    private String homepage;
    private int size;
    private int stargazersCount;
    private int watchersCount;
    private String language;
    private boolean hasIssues;
    private boolean hasProjects;
    private boolean hasDownloads;
    private boolean hasWiki;
    private boolean hasPages;
    private int forksCount;
    private String mirrorUrl;
    private boolean archived;
    private boolean disabled;
    private int openIssuesCount;
    private boolean allowforking;
    private boolean isTemplate;
    private String visibility;
    private int forks;
    private int openIssues;
    private int watchers;
    private String defaultBranch;

    @JsonCreator
    public RepositoryDto(@JsonProperty("id") final Long id,
                         @JsonProperty("node_id") final String nodeId,
                         @JsonProperty("name") final String name,
                         @JsonProperty("full_name") final String fullName,
                         @JsonProperty("private") final boolean isPrivate,
                         @JsonProperty("owner") final OwnerDto owner,
                         @JsonProperty("html_url") final String htmlUrl,
                         @JsonProperty("description") final String description,
                         @JsonProperty("fork") final boolean fork,
                         @JsonProperty("url") final String url,
                         @JsonProperty("forks_url") final String forksUrl,
                         @JsonProperty("keys_url") final String keysUrl,
                         @JsonProperty("collaborators_url") final String collaboratorsUrl,
                         @JsonProperty("teams_url") final String teamsUrl,
                         @JsonProperty("hooks_url") final String hooksUrl,
                         @JsonProperty("issue_events_url") final String issueEventsUrl,
                         @JsonProperty("events_url") final String eventsUrl,
                         @JsonProperty("assignees_url") final String assigneesUrl,
                         @JsonProperty("branches_url") final String branchesUrl,
                         @JsonProperty("tags_url") final String tagsUrl,
                         @JsonProperty("blobs_url") final String blobsUrl,
                         @JsonProperty("git_tags_url") final String gitTagsUrl,
                         @JsonProperty("git_refs_url") final String gitRefsUrl,
                         @JsonProperty("trees_url") final String treesUrl,
                         @JsonProperty("statuses_url") final String statusesUrl,
                         @JsonProperty("languages_url") final String languagesUrl,
                         @JsonProperty("stargazers_url") final String stargazersUrl,
                         @JsonProperty("contributors_url") final String contributorsUrl,
                         @JsonProperty("subscribers_url") final String subscribersUrl,
                         @JsonProperty("subscription_url") final String subscriptionUrl,
                         @JsonProperty("commits_url") final String commitsUrl,
                         @JsonProperty("git_commits_url") final String gitCommitsUrl,
                         @JsonProperty("comments_url") final String commentsUrl,
                         @JsonProperty("issue_comment_url") final String issueCommentUrl,
                         @JsonProperty("contents_url") final String contentsUrl,
                         @JsonProperty("compare_url") final String compareUrl,
                         @JsonProperty("merges_url") final String mergesUrl,
                         @JsonProperty("archive_url") final String archiveUrl,
                         @JsonProperty("downloads_url") final String downloadsUrl,
                         @JsonProperty("issues_url") final String issuesUrl,
                         @JsonProperty("pulls_url") final String pullsUrl,
                         @JsonProperty("milestones_url") final String milestonesUrl,
                         @JsonProperty("notifications_url") final String notificationsUrl,
                         @JsonProperty("labels_url") final String labelsUrl,
                         @JsonProperty("releases_url") final String releasesUrl,
                         @JsonProperty("deployments_url") final String deploymentsUrl,
                         @JsonProperty("created_at") final LocalDateTime createdAt,
                         @JsonProperty("updated_at") final LocalDateTime updatedAt,
                         @JsonProperty("pushed_at") final LocalDateTime pushedAt,
                         @JsonProperty("git_url") final String gitUrl,
                         @JsonProperty("ssh_url") final String sshUrl,
                         @JsonProperty("clone_url") final String cloneUrl,
                         @JsonProperty("svn_url") final String svnUrl,
                         @JsonProperty("homepage") final String homepage,
                         @JsonProperty("size") final int size,
                         @JsonProperty("stargazers_count") final int stargazersCount,
                         @JsonProperty("watchers_count") final int watchersCount,
                         @JsonProperty("language") final String language,
                         @JsonProperty("has_issues") final boolean hasIssues,
                         @JsonProperty("has_projects") final boolean hasProjects,
                         @JsonProperty("has_downloads") final boolean hasDownloads,
                         @JsonProperty("has_wiki") final boolean hasWiki,
                         @JsonProperty("has_pages") final boolean hasPages,
                         @JsonProperty("forks_count") final int forksCount,
                         @JsonProperty("mirror_url") final String mirrorUrl,
                         @JsonProperty("archived") final boolean archived,
                         @JsonProperty("disabled") final boolean disabled,
                         @JsonProperty("open_issues_count") final int openIssuesCount,
                         @JsonProperty("allowforking") final boolean allowforking,
                         @JsonProperty("is_template") final boolean isTemplate,
                         @JsonProperty("visibility") final String visibility,
                         @JsonProperty("forks") final int forks,
                         @JsonProperty("open_issues") final int openIssues,
                         @JsonProperty("watchers") final int watchers,
                         @JsonProperty("default_branch") final String defaultBranch) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this.isPrivate = isPrivate;
        this.owner = owner;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasDownloads = hasDownloads;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.forksCount = forksCount;
        this.mirrorUrl = mirrorUrl;
        this.archived = archived;
        this.disabled = disabled;
        this.openIssuesCount = openIssuesCount;
        this.allowforking = allowforking;
        this.isTemplate = isTemplate;
        this.visibility = visibility;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.defaultBranch = defaultBranch;
    }
}
