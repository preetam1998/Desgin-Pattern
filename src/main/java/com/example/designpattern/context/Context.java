package com.example.designpattern.context;


import com.example.designpattern.strategy.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y){
        return strategy.doOperation(x, y);
    }
}

