package com.mycompany.restaurant.service;

import com.mycompany.restaurant.dto.Event;

public class EventService {
	private static final int SUCCESS = 1;
	
	public int create(Event event){
		return SUCCESS;
	}
	
	public int delete(String ename){
		return SUCCESS;
	}
	
	public Event modify(Event event){
		Event event1 = new Event();
		return event1;
	}
}