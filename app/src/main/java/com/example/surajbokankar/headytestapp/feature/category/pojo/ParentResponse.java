package com.example.surajbokankar.headytestapp.feature.category.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"categories",
"rankings"
})
public class ParentResponse {

    @JsonProperty("categories")
    public ArrayList<Category> categories = null;
    @JsonProperty("rankings")
    public ArrayList<Ranking> rankings = null;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
