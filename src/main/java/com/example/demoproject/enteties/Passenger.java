package com.example.demoproject.enteties;

import lombok.Data;

@Data
public class Passenger {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;
}
