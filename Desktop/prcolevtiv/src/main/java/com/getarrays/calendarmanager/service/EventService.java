package com.getarrays.calendarmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getarrays.calendarmanager.exceptions.EventNotFoundException;
import com.getarrays.calendarmanager.model.Event;
import com.getarrays.calendarmanager.repository.EventRepo;

@Service
public class EventService {
	private final EventRepo eventRepo;
	
	@Autowired
	public EventService(EventRepo r) {
		eventRepo = r;
	}
	
	public Event addEvent(Event e) {
		return eventRepo.save(e);
	}
	
	public List<Event> getAllEvents() {
		return eventRepo.findAll();
	}
	
	public Event updateEvent(Event e) {
		return eventRepo.save(e);
	}
	
	public void deleteEvent(Long id) {
		eventRepo.deleteById(id);
	}
	
	public Event findEventById(Long id) {
		return eventRepo.findById(id)
				.orElseThrow(() -> new EventNotFoundException("Event with id : " + id + " not found."));
	}
}
