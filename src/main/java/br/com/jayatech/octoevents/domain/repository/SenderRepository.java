package br.com.jayatech.octoevents.domain.repository;

import br.com.jayatech.octoevents.domain.model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderRepository extends JpaRepository<Sender, Long> {
}
