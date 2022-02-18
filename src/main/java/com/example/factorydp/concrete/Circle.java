package com.example.factorydp.concrete;

import com.example.factorydp.shape.Shape;

import static java.lang.Math.sqrt;

public class Circle implements Shape {

    @Override
    public int getNoOfSide() {
        return 0;
    }

    @Override
    public void drawShape() {

        int radius = 10;
        float dist;

        // for horizontal movement
        for (int i = 0; i <= 2 * radius; i++) {

            // for vertical movement
            for (int j = 0; j <= 2 * radius; j++) {
                dist = (float) sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));

                // dist should be in the range (radius - 0.5)
                // and (radius + 0.5) to print stars(*)
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
