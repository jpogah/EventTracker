package com.jpogah.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpogah.model.Event;

@RestController
public class EventsReportController {
	
	@RequestMapping("/events")
	public @ResponseBody List<Event> getEvents(){
		List<Event> events = new ArrayList<>();
		
		Event event1 = new Event();
		event1.setName("Java User Group");
		
		Event event2 = new Event();
		event2.setName("Angular User Group");
		events.add(event1);
		events.add(event2);
		return events;
		}

}
