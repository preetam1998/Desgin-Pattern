package com.example.designpattern.concrete;

import com.example.designpattern.strategy.Strategy;

public class MultiplyOperation implements Strategy {

    @Override
    public int doOperation(int x, int y) {

        return (x*y);
    }

}
