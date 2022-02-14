package com.example.designpattern.controller;

import com.example.designpattern.dto.UserRequest;
import com.example.designpattern.response.Response;
import com.example.designpattern.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategyDP/")
public class Controller {

    @Autowired
    private Services services;


    @GetMapping("wel-come")
    public Response welCome()
    {
        Response response = new Response();
        response.setStatus(HttpStatus.OK);
        response.setOperation("Wel Come User");
        response.setResult("User got Service");
        return response;
    }

    @GetMapping("do-operation")
    public Response doOperation(@RequestBody UserRequest userRequest) throws Exception {

        int result = this.services.doOperation(userRequest);


        Response response = new Response();
        response.setStatus(HttpStatus.OK);
        response.setOperation("Operation : " + userRequest.getOperation() +  ", on num1 : "+ userRequest.getNum1()
                                             +  " and num2 : " + userRequest.getNum2());
        response.setResult("Result  : "  + result);
        return response;
    }

}
