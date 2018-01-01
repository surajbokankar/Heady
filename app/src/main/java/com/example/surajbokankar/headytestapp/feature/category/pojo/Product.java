package com.example.surajbokankar.headytestapp.feature.category.pojo;

import android.support.annotation.NonNull;

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
"id",
"name",
"date_added",
"variants",
"tax"
})
public class Product  {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("date_added")
    public String dateAdded;
    @JsonProperty("variants")
    public ArrayList<Variant> variants = null;
    @JsonProperty("tax")
    public Tax tax;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();


}