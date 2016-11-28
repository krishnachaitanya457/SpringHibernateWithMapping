package com.srinivas.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.srinivas.pojo.ReservationEvent;

@Transactional
public class SpringDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(ReservationEvent reservationEvent){
		hibernateTemplate.save(reservationEvent);
	}
	
}
