package br.com.jayatech.octoevents.domain.repository;

import br.com.jayatech.octoevents.domain.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
