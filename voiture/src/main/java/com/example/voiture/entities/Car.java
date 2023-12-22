package com.example.voiture.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    @Getter
    @Setter
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Long client_id;

}
