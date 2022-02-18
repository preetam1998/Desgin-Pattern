package com.example.factorydp.mapShape;

import com.example.factorydp.concrete.Circle;
import com.example.factorydp.concrete.Rectangle;
import com.example.factorydp.concrete.Triangle;
import com.example.factorydp.shape.Shape;
import org.springframework.stereotype.Component;


@Component
public class MapTheShape {

    public Shape getShape(String shape)
    {
        if(shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();

        else if(shape.equalsIgnoreCase("circle"))
            return new Circle();

        else if(shape.equalsIgnoreCase("triangle"))
            return new Triangle();
        else
            return null;
    }
}
