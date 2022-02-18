package com.example.factorydp.concrete;

import com.example.factorydp.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public int getNoOfSide() {
        return 4;
    }


    @Override
    public void drawShape() {
        int length = 10;
        int breadth = 15;

        for(int i=0; i<length; i++)
        {
            for (int j=0; j<breadth; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
