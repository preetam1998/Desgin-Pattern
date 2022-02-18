package com.example.factorydp.request;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Setter
@Getter
@ToString

public class Request {
    private int side1 ;
    private int side2 ;
    private int side3 ;

    public Request(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
