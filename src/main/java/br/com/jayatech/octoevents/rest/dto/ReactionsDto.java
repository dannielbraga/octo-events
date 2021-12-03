package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReactionsDto {
    private final String url;
    private final int totalCount;
    private final int plusOne;
    private final int minusOne;
    private final int laugh;
    private final int hooray;
    private final int confused;
    private final int heart;
    private final int rocket;
    private final int eyes;

    @JsonCreator
    public ReactionsDto(final String url, @JsonProperty("total_count") final int totalCount,
                        @JsonProperty("+1") final int plusOne, @JsonProperty("-1") final int minusOne,
                        final int laugh, final int hooray, final int confused, final int heart, final int rocket,
                        final int eyes) {
        this.url = url;
        this.totalCount = totalCount;
        this.plusOne = plusOne;
        this.minusOne = minusOne;
        this.laugh = laugh;
        this.hooray = hooray;
        this.confused = confused;
        this.heart = heart;
        this.rocket = rocket;
        this.eyes = eyes;
    }
}
