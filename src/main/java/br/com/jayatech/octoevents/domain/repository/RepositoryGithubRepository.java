package br.com.jayatech.octoevents.domain.repository;

import br.com.jayatech.octoevents.domain.model.RepositoryGithub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGithubRepository extends JpaRepository<RepositoryGithub, Long> {
}
