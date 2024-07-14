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
public class Admin {
    @Id
    private String  id;
    private String username;
    private String fullName;
    private Gender gender;
    private String email;
    private String password;

}
