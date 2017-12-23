package com.example.surajbokankar.headytestapp.feature.category.pojo;

import java.util.ArrayList;
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
"ranking",
"products"
})
public class Ranking {

    @JsonProperty("ranking")
    public String ranking;
    @JsonProperty("products")
    public ArrayList<RankingProducts> products = null;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();
}