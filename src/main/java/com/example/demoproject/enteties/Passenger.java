package com.example.demoproject.enteties;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Passenger {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;

}
