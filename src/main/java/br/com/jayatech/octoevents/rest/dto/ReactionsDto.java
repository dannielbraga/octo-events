package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReactionsDto {
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
