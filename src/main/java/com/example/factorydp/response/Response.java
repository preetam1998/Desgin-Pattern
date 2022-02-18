package com.example.factorydp.response;

import lombok.Data;
import org.springframework.http.HttpStatus;


@Data
public class Response {
    private HttpStatus status;
    private String job;
    private String message;



}
