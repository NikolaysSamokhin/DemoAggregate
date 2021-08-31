package com.example.demoproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/price")
public class PriceController {

    @GetMapping("/all")
    public List<String> getAllPrices() {
        System.out.println("getAllPrices");
        return null;
    }

    @GetMapping("/{id}")
    public List<String> getPrice(@PathVariable String id) {
        System.out.println("getPrice " + id);
        return null;
    }
}
