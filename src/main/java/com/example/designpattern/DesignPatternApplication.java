package com.example.designpattern;

import com.example.designpattern.concrete.AddOperation;
import com.example.designpattern.concrete.MultiplyOperation;
import com.example.designpattern.concrete.SubtractOperation;
import com.example.designpattern.context.Context;
import com.example.designpattern.strategy.Strategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);

        // Strategy for Addition
        Context context1 = new Context(new AddOperation());
        System.out.println("Adding x: "+ 12 + ", y: " + 34 + " , result: " +  context1.executeStrategy(12, 34));

        // Strategy for Subtract
        Context context2 = new Context(new SubtractOperation());
        System.out.println("Subtracting x: "+ 12 + ", y: " + 34 + " , result: " +  context2.executeStrategy(12, 34));

        //Strategy for Multiply
        Context context3 = new Context(new MultiplyOperation());
        System.out.println("Multiplying x: "+ 12 + ", y: " + 34 + " , result: " +  context3.executeStrategy(12, 34));
    }

}
