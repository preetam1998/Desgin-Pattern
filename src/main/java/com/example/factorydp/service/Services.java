package com.example.factorydp.service;

import com.example.factorydp.mapShape.MapTheShape;
import com.example.factorydp.request.Request;
import com.example.factorydp.shape.Shape;
import com.example.factorydp.validation.Validation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    @Autowired
    private Validation validation;

    @Autowired
    private MapTheShape mapTheShape;

    // get logger for the class
    private static final Logger logger = LogManager.getLogger(Services.class);


    public boolean getShapeDetails(String shape, Request userRequest) {

        logger.info("Service : Providing Service to Api Call");
        logger.info("Service : Validating request body");

        boolean flag = this.validation.validateShape(shape, userRequest);

        if(flag)
        {
            logger.debug("Service : Valid request ");
            logger.info("Service : Getting Shape Details");

            Shape shape1 = this.mapTheShape.getShape(shape);
            logger.debug("Service : No of Sides ::" + shape1.getNoOfSide());

            logger.debug("Service : Get Shape");
            shape1.drawShape();

            return true;
        }

        return false;
    }
}
