package com.example.interview.controller;

import net.minidev.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.lang.constant.Constable;
import java.nio.charset.StandardCharsets;
import java.util.Map;


import java.util.Map;

import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;

@RestController
@RequestMapping
public class booksController {

        @GetMapping("/stocks")
        public Constable getRadarData() throws IOException {
            ClassPathResource stock = new ClassPathResource("Stocks.json");
            String stocks = IOUtils.toString(stock.getInputStream(), StandardCharsets.UTF_8);


            //Get a Json String
            System.out.print(stocks);
            return (stocks);


    }

    @GetMapping("/values")
    public Constable stocksValue() throws IOException {
        ClassPathResource stockval = new ClassPathResource("Stock-Values.json");
        String stockvalue = IOUtils.toString(stockval.getInputStream(), StandardCharsets.UTF_8);

        //Get a Json String
        System.out.print(stockvalue);
        return (stockvalue);

    }
}
