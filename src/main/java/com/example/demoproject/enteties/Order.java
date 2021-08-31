package com.example.demoproject.enteties;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int id;
    private boolean reservation = false;
    private List<Passenger> passengerList;
    private List<Location> locations;
    private List<Trip> trips;
}
