package com.example.TIcketBooking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book_Tc {
    @Id
    private String ticketId;
    private String passengerName;
    private String departureCity;
    private String destinationCity;
    private Date departureDate;
    private  Integer price;
}
