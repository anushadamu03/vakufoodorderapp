package com.vaku.foodapp.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private int statusCode; // e.g "200" , "404"
    private String message; //Additional info about the response
    private T data; //the actual payload
    private Map<String, Serializable> meta;
}
