package com.example.designpattern.hasmap;

import com.example.designpattern.operations.AddOperation;
import com.example.designpattern.operations.MultiplyOperation;
import com.example.designpattern.operations.SubtractOperation;
import com.example.designpattern.strategy.Strategy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MapOperation {

    Map<String,Strategy> map = new HashMap<String,Strategy>();

    public MapOperation(){

        map.put(AddOperation.class.getName(),new AddOperation());
        map.put(SubtractOperation.class.getName(),new SubtractOperation());
        map.put(MultiplyOperation.class.getName(),new MultiplyOperation());
    }


    public int performOperation(Strategy strategy, int num1, int num2) throws Exception {
        if(strategy == null)
            throw new Exception("Enter Valid Operation");
        return strategy.doOperation(num1, num2);
    }

    public Strategy getOperationType(String operation)
    {

        if(operation.equalsIgnoreCase("add"))
            return map.get(AddOperation.class.getName());

        else if(operation.equalsIgnoreCase("subtract"))
            return map.get(SubtractOperation.class.getName());

        else if(operation.equalsIgnoreCase("multiply"))
            return map.get(MultiplyOperation.class.getName());

        else
            return null;
    }
}
