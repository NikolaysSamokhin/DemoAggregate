package com.example.demoproject.dao;

import com.example.demoproject.enteties.Passenger;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
public class PassengerDao {

    @Autowired
    private List<Passenger> passengers;


    public List<Passenger> index() {
        return passengers;
    }

    public Passenger show(int id) {
        return passengers.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
