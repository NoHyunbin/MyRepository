package com.mycompany.restaurant.service;

import com.mycompany.restaurant.dto.Reservation;

public class ReservationService {
	private static final int SUCCESS = 1;

	public int reservation(String rvmid, int rvResid) {
		
		return SUCCESS;
	}
	
	public int delete(String rvmid, int rvResid) {
		
		return SUCCESS;
	}
	
	public Reservation info(String rvmid) {
		
		Reservation reservation = new Reservation();
		
		return reservation;
	}
}
