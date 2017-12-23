package com.example.surajbokankar.headytestapp.feature.category.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"color",
"size",
"price"
})
public class Variant {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("color")
    public String color;
    @JsonProperty("size")
    public Object size;
    @JsonProperty("price")
    public Integer price;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

}