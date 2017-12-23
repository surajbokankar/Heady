package com.example.surajbokankar.headytestapp.feature.category.pojo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"view_count",
"order_count",
"shares"
})
public class RankingProducts {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("view_count")
    public Integer viewCount;
    @JsonProperty("order_count")
    public Integer orderCount;
    @JsonProperty("shares")
    public Integer shares;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
