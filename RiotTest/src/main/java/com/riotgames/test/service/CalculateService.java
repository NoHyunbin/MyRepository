package com.riotgames.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.riotgames.test.dao.CalculateDao;

@Component
public class CalculateService {
	@Autowired
	private CalculateDao calculateDao;

	public String calc(String exp) {
		return calculateDao.calc(exp);
	}

}
