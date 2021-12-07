package br.com.jayatech.octoevents.domain.repository;

import br.com.jayatech.octoevents.domain.model.IssueEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueEventRepository extends JpaRepository<IssueEvent, Long> {
    List<IssueEvent> findAllByIssueId(Long idIssue);
}
