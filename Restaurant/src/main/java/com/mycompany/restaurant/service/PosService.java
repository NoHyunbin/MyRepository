package com.mycompany.restaurant.service;

import com.mycompany.restaurant.dto.Pos;

public class PosService {
	private static final int MODIFY_SUCCESS = 0;
	private static final int ADD_SUCCESS = 1;
	private static final int DELETE_SUCCESS = 2;
	
	public Pos info(int presid){
		Pos pos = new Pos();
		return pos;
	}
	
	public int modify(Pos pos){
		return MODIFY_SUCCESS;
	}
	
	public int add(int presid, String pmlname){
		return ADD_SUCCESS;
	}
	
	public int delete(int ptableno){
		return DELETE_SUCCESS;
	}
	
	public int nowTable(int presid){
		return 0;
	}
}