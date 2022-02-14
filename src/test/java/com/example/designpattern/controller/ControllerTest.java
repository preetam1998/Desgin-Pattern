package com.example.designpattern.controller;

import com.example.designpattern.service.Services;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONArray;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Mock
    private Services services;

    @Autowired
    private ObjectMapper objectMapper;



    @Test
    void doOperation() throws Exception {


        String filePath = "src/test/java/jsonFile/Data.json";

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(filePath))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray requestBody = (JSONArray) obj;
            System.out.println(requestBody.size());
            for(int i=0; i<requestBody.size(); i++)
            {
                MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                                .get("/strategyDP/do-operation")
                                .content(requestBody.get(i).toString())
                                .contentType(MediaType.APPLICATION_JSON))
                        .andDo(print())
                        .andExpect(status().isOk()).andReturn();
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}