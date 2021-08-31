package com.example.demoproject.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/price")
public class PriceController {

    @GetMapping("/all")
    public List<String> getAllPrices(){
        System.out.println("hELLO WORLD");
      return null;
    }
}
