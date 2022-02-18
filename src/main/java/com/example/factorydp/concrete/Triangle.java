package com.example.factorydp.concrete;

import com.example.factorydp.shape.Shape;

public class Triangle implements Shape {
    @Override
    public int getNoOfSide() {
        return 3;
    }

    @Override
    public void drawShape() {

        int height = 10;
        int base = 15;

       for (int i=0; i<height; i++) {

           for (int j=base-i; j>1; j--) {

                System.out.print(" ");
           }
           for (int j=0; j<=i; j++ ) {

               System.out.print("* ");
           }

        System.out.println();
        }
    }
}
