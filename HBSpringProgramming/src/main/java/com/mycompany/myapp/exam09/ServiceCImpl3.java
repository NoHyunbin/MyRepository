package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCImpl3 implements ServiceD {
	private static final Logger logger = LoggerFactory.getLogger(ServiceCImpl3.class);
	
	public ServiceCImpl3() {
		logger.info("ServiceCImpl3 객체 생성");
	}
	
	@Override
	public void method() {
		logger.info("method3 실행");
	}

}
