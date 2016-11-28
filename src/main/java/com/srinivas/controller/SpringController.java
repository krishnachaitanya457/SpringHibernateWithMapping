package com.srinivas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srinivas.dao.SpringDao;
import com.srinivas.pojo.ReservationEvent;

@Controller
public class SpringController {

	@Autowired
	private SpringDao springDao;
	
	public SpringDao getSpringDao() {
		return springDao;
	}
	public void setSpringDao(SpringDao springDao) {
		this.springDao = springDao;
	}

	@RequestMapping("/")
	public ModelAndView getPage(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "amrutha");
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insert(@ModelAttribute("re") ReservationEvent re){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("home");
		springDao.insert(re);
		modelAndView.addObject("insert", "Details Inserted");
		return modelAndView;
	}
}
