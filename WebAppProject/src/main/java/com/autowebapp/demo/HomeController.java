package com.autowebapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("home")
	public String home()
	{
		System.out.println("sayonara");
		return "home.jsp";     /*here, if we want to execute home.jsp if there is request for home
		                         in browser like localhost:9090/home than we can return home.jsp 
		                         from the requestmapping method for home which returns "home.jsp"
		                         to the browser and so after it home.jsp can be opened and executed
		                         by the browser. Also,we have to add a depenedancy from mvn
		                         repository in the pom.xml file. Moreover , the browser searches
		                         for home.jsp in the webapps folder inside main folder by default*/
	}
}
/*here, the @controller is used with a class to make a class as as controller ie whenever there
 is a request with the localhost in the browser than some class should be controlling it. Also,
 if there are so many pages in an application and we want a specific task to run ie we want to
 execute a specific method if there is a request for some particular page than we can use
 @RequestMapping("name of the page") annonitation on top of the method. So whewnever we give
 a request to home like localhost:9090/home than the home() method will be executed*/
