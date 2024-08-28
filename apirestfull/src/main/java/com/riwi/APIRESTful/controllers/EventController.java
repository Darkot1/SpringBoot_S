package com.riwi.APIRESTful.controllers;

import com.riwi.APIRESTful.models.EventEntity;
import com.riwi.APIRESTful.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/eventos")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/crear")
    public ResponseEntity<EventEntity> createEvent(@RequestBody EventEntity event) {
        EventEntity createdEvent = eventService.createEvent(event);
        return ResponseEntity.ok(createdEvent);
    }

    @GetMapping("/listaEventos")
    public List<EventEntity> getEvents(){
        return eventService.getEvents();
    }

    @GetMapping("/evento/{id}")
    public ResponseEntity<EventEntity> getEventById(@PathVariable UUID id){
        EventEntity event = eventService.getEventById(id);
        if (event != null) {
            return ResponseEntity.ok(event);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<EventEntity> updateEvent(@PathVariable UUID id, @RequestBody EventEntity event){
        EventEntity updatedEvent = eventService.updateEvent(id, event);
        if (updatedEvent != null) {
            return ResponseEntity.ok(updatedEvent);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable UUID id){
        eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}