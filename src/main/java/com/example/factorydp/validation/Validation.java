package com.example.factorydp.validation;

import com.example.factorydp.request.Request;
import org.springframework.stereotype.Component;

@Component
public class Validation {

    public boolean validateShape(String shape, Request request)
    {
        if(shape.equalsIgnoreCase("rectangle"))
        {
            if(request.getSide3() !=0 || request.getSide1() == 0 || request.getSide2() ==0 )
                    return false;
            else
                return true;
        }
        else if(shape.equalsIgnoreCase("circle"))
        {
            if(request.getSide3() !=0 || request.getSide1() == 0 || request.getSide2() !=0 )
                return false;
            else
                return true;
        }
        else if(shape.equalsIgnoreCase("triangle"))
        {
            if(request.getSide3() ==0 || request.getSide1() == 0 || request.getSide2() ==0 )
                return false;
            else
                return true;
        }
        else
            return false;
    }
}
