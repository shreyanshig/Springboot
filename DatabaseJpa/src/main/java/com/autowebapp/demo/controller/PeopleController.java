package com.autowebapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.autowebapp.demo.model.People;
import com.autowebapp.demo.dao.PeopleRepo;

@Controller
public class PeopleController
{
	@Autowired
	PeopleRepo pr;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addpeople")
	public String addPeople(People p)
	{
		System.out.println("derek");
		pr.save(p);
		return "home.jsp";
	}
	@RequestMapping("/getPeople")
	public ModelAndView getPeople(@RequestParam int pid)
	{
		System.out.println("david");
		ModelAndView mv=new ModelAndView("getPeople.jsp");   /*here, @RequestParam annoniatation
		                                                       can be used to extract query
		                                                       parameters, form parameters and
		                                                       even files from the request*/
		People p=pr.findById(pid).orElse(new People());
		mv.addObject("people",p);
		return mv;
	}
	
}
