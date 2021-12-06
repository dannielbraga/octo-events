package br.com.jayatech.octoevents.domain.repository;

import br.com.jayatech.octoevents.domain.model.Reactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionsRepository extends JpaRepository<Reactions, Long> {
}
