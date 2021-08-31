package com.example.demoproject.dao;

import com.example.demoproject.enteties.Order;
import com.example.demoproject.enteties.Passenger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderDao {
    private static int PEOPLE_COUNT;
    private List<Order> orders;

    {
        orders = new ArrayList<>();
        orders.add(new Order());
    }

    public List<Order> index() {
        return orders;
    }

    public Order show(int id) {
        return orders.stream().filter(orders -> orders.getId() == id).findAny().orElse(null);
    }
}
