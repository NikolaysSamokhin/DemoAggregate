package com.example.demoproject.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    @GetMapping("/all")
    public List<String> getAllOrders() {
        System.out.println("getAllOrders");
        return null;
    }

    @GetMapping("/{id}")
    public List<String> getOrder(@PathVariable String id, Model model) {
        model.addAttribute("getOrder", id);
        System.out.println("getOrder "+ id);
        return null;
    }
}
