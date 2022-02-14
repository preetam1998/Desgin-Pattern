package com.example.designpattern.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter

public class Response {
    private HttpStatus status;
    private String operation;
    private String result;
}
