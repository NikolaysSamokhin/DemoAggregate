package com.example.demoproject.enteties;

import com.example.demoproject.AggregatorName;
import lombok.Data;

@Data
public class Aggregator {
    private AggregatorName aggregatorName;
    private int rating;
}
