package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryDto {
    private final Long id;
    private final String nodeId;
    private final String name;
    private final String fullName;
    private final boolean isPrivate;
    private final OwnerDto ownerDto;
    private final String htmlUrl;
    private final String description;
    private final boolean fork;
    private final String url;
    private final String forksUrl;
    private final String keysUrl;
    private final String collaboratorsUrl;
    private final String teamsUrl;
    private final String hooksUrl;
    private final String issueEventsUrl;
    private final String eventsUrl;
    private final String assigneesUrl;
    private final String branchesUrl;
    private final String tagsUrl;
    private final String blobsUrl;
    private final String gitTagsUrl;
    private final String gitRefsUrl;
    private final String treesUrl;
    private final String statusesUrl;
    private final String languagesUrl;
    private final String stargazersUrl;
    private final String contributorsUrl;
    private final String subscribersUrl;
    private final String subscriptionUrl;
    private final String commitsUrl;
    private final String gitCommitsUrl;
    private final String commentsUrl;
    private final String issueCommentUrl;
    private final String contentsUrl;
    private final String compareUrl;
    private final String mergesUrl;
    private final String archiveUrl;
    private final String downloadsUrl;
    private final String issuesUrl;
    private final String pullsUrl;
    private final String milestonesUrl;
    private final String notificationsUrl;
    private final String labelsUrl;
    private final String releasesUrl;
    private final String deploymentsUrl;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    private final LocalDateTime pushedAt;
    private final String gitUrl;
    private final String sshUrl;
    private final String cloneUrl;
    private final String svnUrl;
    private final String homepage;
    private final int size;
    private final int stargazersCount;
    private final int watchersCount;
    private final String language;
    private final boolean hasIssues;
    private final boolean hasProjects;
    private final boolean hasDownloads;
    private final boolean hasWiki;
    private final boolean hasPages;
    private final int forksCount;
    private final String mirrorUrl;
    private final boolean archived;
    private final boolean disabled;
    private final int openIssuesCount;
    private final boolean allowforking;
    private final boolean isTemplate;
    private final String visibility;
    private final int forks;
    private final int openIssues;
    private final int watchers;
    private final String defaultBranch;

    @JsonCreator
    public RepositoryDto(@JsonProperty("id") final Long id,
                         @JsonProperty("node_id") final String nodeId,
                         @JsonProperty("name") final String name,
                         @JsonProperty("full_name") final String fullName,
                         @JsonProperty("private") final boolean isPrivate,
                         @JsonProperty("owner") final OwnerDto ownerDto,
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
        this.ownerDto = ownerDto;
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
