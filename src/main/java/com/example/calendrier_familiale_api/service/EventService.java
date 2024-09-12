package com.example.calendrier_familiale_api.service;

import com.example.calendrier_familiale_api.model.Event;
import com.example.calendrier_familiale_api.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(UUID id) {
        return eventRepository.findById(id);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(UUID id, Event event) {
        if (eventRepository.existsById(id)){
            event.setId(id);
            return eventRepository.save(event);
        }
        return null;
    }
    public void deleteEvent(UUID id) {
        eventRepository.deleteById(id);
    }
}
