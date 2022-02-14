package com.example.designpattern.service;

import com.example.designpattern.dto.UserRequest;
import com.example.designpattern.hasmap.MapOperation;
import com.example.designpattern.strategy.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    private MapOperation mapOperation;

    public Services(){
        mapOperation  = new MapOperation();
    }

    public int doOperation(UserRequest userRequest) throws Exception {



        // get Operation tye
        Strategy strategy = this.mapOperation.getOperationType(userRequest.getOperation());
        System.out.println(userRequest.getOperation());
        System.out.println(strategy);

        // Perform Operation
        int result = this.mapOperation.performOperation(strategy, userRequest.getNum1(), userRequest.getNum2());
        return result;
    }
}
