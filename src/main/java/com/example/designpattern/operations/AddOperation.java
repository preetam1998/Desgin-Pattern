package com.example.designpattern.operations;

import com.example.designpattern.strategy.Strategy;

public class AddOperation implements Strategy {

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public int doOperation(int x, int y) {
        return (x + y);
    }
}
