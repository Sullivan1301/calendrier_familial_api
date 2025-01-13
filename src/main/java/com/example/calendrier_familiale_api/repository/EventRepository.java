package com.example.calendrier_familiale_api.repository;

import com.example.calendrier_familiale_api.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Long> {
}
