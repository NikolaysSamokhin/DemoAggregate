package com.example.demoproject.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/aggregator")
public class AggregatorController {

    @GetMapping("/all/getAllOffers")
    public List<String> getOffers(){
        System.out.println("hELLO WORLD");
      return null;
    }
}
