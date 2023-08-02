package com.manwebapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientDataAsObject
{
	@RequestMapping("clientobject")
	public ModelAndView home(Student s)
	{
		System.out.println("derek");
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",s);
		mv.setViewName("clientobject");
		return mv;
		
	}
	
}
/*here, we can accept data from client as an object itself. But , if we want that the data memebers
 of the class studnet gets assigned with the values we send than we have to define setters in
 class student. Also, if we are accessing the data memebers of class Student from a jsp page
 using Expression Language EL ie ${} than we have to define getters also in class student*/
