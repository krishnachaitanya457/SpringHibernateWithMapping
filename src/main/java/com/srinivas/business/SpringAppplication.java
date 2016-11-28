package com.srinivas.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srinivas.dao.SpringDao;
import com.srinivas.pojo.ReservationEvent;

public class SpringAppplication {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpringDao springDao=(SpringDao)applicationContext.getBean("springDao");
		springDao.insert(new ReservationEvent(12, "X2138", "RFX"));
	}
}