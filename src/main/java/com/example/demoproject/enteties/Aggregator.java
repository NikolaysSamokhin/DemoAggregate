package com.example.demoproject.enteties;

import com.example.demoproject.enteties.enums.AggregatorName;
import lombok.Data;

@Data
public class Aggregator {
    private int id;
    private AggregatorName aggregatorName;
    private int rating;
}
