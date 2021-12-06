package br.com.jayatech.octoevents.domain.repository;

import br.com.jayatech.octoevents.domain.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
}
