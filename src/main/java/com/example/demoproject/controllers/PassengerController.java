package com.example.demoproject.controllers;

import com.example.demoproject.dao.PassengerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/passenger")
public class PassengerController {

    @Autowired
    private PassengerDao passenger;

    @GetMapping("/all")
    public List<String> getAllPassengers() {
        System.out.println("getAllPassengers");
        return null;
    }

    @GetMapping("/{id}")
    public List<String> getPassenger(@PathVariable String id, Model model) {
        model.addAttribute("getPassenger", passenger.show(Integer.parseInt(id)));
        return null;
    }
}
