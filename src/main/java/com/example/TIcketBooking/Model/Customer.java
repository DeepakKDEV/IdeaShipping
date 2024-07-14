package com.example.TIcketBooking.Model;

import com.example.TIcketBooking.Model.PackagenumDto.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private String  password;
    private String phoneNumber;
    private  String  address;
}
