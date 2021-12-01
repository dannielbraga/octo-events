package br.com.jayatech.octoevents.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reactions {
    private String url;

    @JsonProperty("total_count")
    private int totalCount;

    @JsonProperty("+1")
    private int plusOne;

    @JsonProperty("-1")
    private int minusOne;

    private int laugh;
    private int hooray;
    private int confused;
    private int heart;
    private int rocket;
    private int eyes;
}
