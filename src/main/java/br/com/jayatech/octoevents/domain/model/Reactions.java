package br.com.jayatech.octoevents.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    private Long idInternal;

    @Column(name = "created_at_internal")
    private LocalDateTime createdAtInternal;

    @Column(name = "url")
    private String url;

    @Column(name = "total_count")
    private int totalCount;

    @Column(name = "plus_one")
    private int plusOne;

    @Column(name = "minus_one")
    private int minusOne;

    @Column(name = "laugh")
    private int laugh;

    @Column(name = "hooray")
    private int hooray;

    @Column(name = "confused")
    private int confused;

    @Column(name = "heart")
    private int heart;

    @Column(name = "rocket")
    private int rocket;

    @Column(name = "eyes")
    private int eyes;
}
