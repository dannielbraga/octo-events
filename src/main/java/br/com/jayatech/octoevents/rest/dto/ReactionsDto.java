package br.com.jayatech.octoevents.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReactionsDto {
    private String url;
    private int totalCount;
    private int plusOne;
    private int minusOne;
    private int laugh;
    private int hooray;
    private int confused;
    private int heart;
    private int rocket;
    private int eyes;

    @JsonCreator
    public ReactionsDto(@JsonProperty("url") final String url,
                        @JsonProperty("total_count") final int totalCount,
                        @JsonProperty("+1") final int plusOne,
                        @JsonProperty("-1") final int minusOne,
                        @JsonProperty("laugh") final int laugh,
                        @JsonProperty("hooray") final int hooray,
                        @JsonProperty("confused") final int confused,
                        @JsonProperty("heart") final int heart,
                        @JsonProperty("rocket") final int rocket,
                        @JsonProperty("eyes") final int eyes) {
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
