package com.example.factorydp.contoller;

import com.example.factorydp.request.Request;
import com.example.factorydp.response.Response;
import com.example.factorydp.service.Services;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;

@RestController
@RequestMapping("/factory")
public class Controller {

    @Autowired
    private Services services;

    // get logger for the class
    private static final Logger logger = LogManager.getLogger(Controller.class);


    @GetMapping("/getShape")
    public Response getShapeDetails(@RequestParam String shape, @RequestBody Request userRequest)
    {
        logger.info("Controller : API call received for getting shape information");

        boolean flag = this.services.getShapeDetails(shape, userRequest);

        // Create Response
        logger.info("Creating response");
        Response response = new Response();
        response.setStatus(HttpStatus.OK);
        response.setJob("Get Details of Shape requested !!!!");

        if(flag)
                response.setMessage("Successful");
        else
                response.setMessage("UnSuccessful");

        return response;
    }
}
