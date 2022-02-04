package com.example.designpattern.concrete;

import com.example.designpattern.strategy.Strategy;

public class SubtractOperation implements Strategy {

    @Override
    public int doOperation(int x, int y) {

        if(x>y)
            return (x - y);
        else
            return (y - x);
    }
}
