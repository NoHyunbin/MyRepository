package com.mycompany.restaurant.service;

import com.mycompany.restaurant.dto.MenuList;

public class MenuListService {
	private static final int SUCCESS = 1;
	
	public MenuList resList(int mlresid){
		MenuList menuList = new MenuList();
		return menuList;
	}
	
	public int addMenu(int mlresid){
		return SUCCESS;
	}
	
	public int modify(MenuList menulist){
		return SUCCESS;
	}
	
	public int deleteMenu(String mlname){
		return SUCCESS;
	}
	
	public boolean resHotList(boolean mlishot){
		return true;
	}
	
	public int addHot(String mlname, boolean mlishot){
		return SUCCESS;
	}
	
	public int deleteHot(String mlname, boolean mlishot){
		return SUCCESS;
	}
}