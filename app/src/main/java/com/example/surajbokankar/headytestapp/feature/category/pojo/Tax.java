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
"name",
"value"
})
public class Tax {

    @JsonProperty("name")
    public String name;
    @JsonProperty("value")
    public Integer value;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();
}