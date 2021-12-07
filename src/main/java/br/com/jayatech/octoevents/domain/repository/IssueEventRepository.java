package br.com.jayatech.octoevents.domain.repository;

import br.com.jayatech.octoevents.domain.model.IssueEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueEventRepository extends JpaRepository<IssueEvent, Long> {
    @Query(" select issueEvent from IssueEvent issueEvent " +
            " left join fetch issueEvent.comment com " +
            " left join fetch com.user comUser " +
            " left join fetch com.reactions comReact " +
            " join fetch issueEvent.issue issue " +
            " join fetch issue.user issueUser " +
            " join fetch issue.reactions issueReact " +
            " join fetch issueEvent.repository repo " +
            " join fetch repo.owner repoOwner " +
            " join fetch issueEvent.sender send " +
            "where issueEvent.issue.id = :issueId")
    List<IssueEvent> findAllByIssueId(@Param("issueId") Long issueId);
}
