package com.riwi.APIRESTful.services;

import com.riwi.APIRESTful.models.EventEntity;
import com.riwi.APIRESTful.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Transactional
    public EventEntity createEvent(EventEntity entity) {
        return eventRepository.save(entity);
    }

    public List<EventEntity> getEvents() {
        return eventRepository.findAll();
    }

    public EventEntity getEventById(UUID id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Transactional
    public EventEntity updateEvent(UUID id, EventEntity entity) {
        EventEntity event = getEventById(id);
        if (event != null) {
            event.setName(entity.getName());
            event.setCreationDate(entity.getCreationDate());
            event.setLocation(entity.getLocation());
            event.setAbility(entity.getAbility());
            return eventRepository.save(event);
        }
        return null;
    }


    @Transactional
    public void deleteEvent(UUID id){
        eventRepository.deleteById(id);
    }


}