package com.example.demoproject.enteties;

import com.example.demoproject.enteties.enums.TripType;
import lombok.Data;

import java.util.List;

@Data
public class Trip {
    private int id;
    private float price;
    private Aggregator aggregator;
    private List<String> startLocation;
    private List<String> startFinish;
    private List<Passenger> passengers;
    private TripType tripType;
}
