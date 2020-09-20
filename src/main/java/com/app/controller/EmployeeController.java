package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class EmployeeController {
	/*
	 * @RequestMapping(value="/show",method=RequestMethod.GET) public ModelAndView
	 * showForm() { ModelAndView mav=new ModelAndView("command");
	 * mav.setViewName("RegisterData"); return mav;
	 * 
	 * }
	 */
	
	  @RequestMapping(value="/reg",method=RequestMethod.POST) 
	  public ModelAndView register(@ModelAttribute("employee") Employee emp) { 
	  ModelAndView mav=new ModelAndView(); 
	  mav.setViewName("Registration"); 
	  mav.addObject("emp", emp);
	  
	  return mav;
	  
	  }
	 
}
