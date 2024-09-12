package com.example.calendrier_familiale_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
import java.time.LocalDate;

@Getter
@Setter

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;
    private String description;
    private LocalDate date;
    private String location;
    private String type;
}
