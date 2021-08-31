package com.example.demoproject.data_source;

import com.example.demoproject.enteties.Passenger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Data {
    private  List<Passenger> passengers = new ArrayList<>();


    @Bean("Passengers")
    public List<Passenger> passengersSource() {
        passengers.add(Passenger.builder().id(1).build());
        passengers.add(Passenger.builder().id(2).build());
        passengers.add(Passenger.builder().id(3).build());
        passengers.add(Passenger.builder().id(4).build());
        passengers.add(Passenger.builder().id(5).build());
        passengers.add(Passenger.builder().id(6).build());
        return passengers;

    }

}
