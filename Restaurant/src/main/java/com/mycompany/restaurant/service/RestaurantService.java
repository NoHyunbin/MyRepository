package com.mycompany.restaurant.service;

import com.mycompany.restaurant.dto.Restaurant;

public class RestaurantService {
	public static final int SUCCESS = 1;
	
	public int add(Restaurant restaurant){
		return SUCCESS;
	}
		
	public int delete(int resid){
		return SUCCESS;
	}
	
	public int modify(Restaurant restaurant){
		return SUCCESS;
	}
	
	public Restaurant info(Restaurant restaurant){
		Restaurant restaurant1 = new Restaurant();
		return restaurant1;
	}
		
}

