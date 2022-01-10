package com.getarrays.calendarmanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getarrays.calendarmanager.model.Event;

public interface EventRepo extends JpaRepository<Event, Long>{
	
	void deleteEventById(Long id);
	
	Optional<Event> findEventById(Long id);
}
