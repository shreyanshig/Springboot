package com.manwebapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ClientData
{
//	@RequestMapping("client")
//	public String clienthome(HttpServletRequest req)
//	{
//		String name=req.getParameter("name");
//		System.out.println("cleint home"+ name);
//		req.setAttribute("name", name);   /*Here, we can use request dispatcher to send the data
//		 									sent by the browser to the jsp page*/
//		return "clientweb";
//	}
//	@RequestMapping("client")
	public String clienthome(@RequestParam("name") String n,HttpServletRequest req)
	{
		System.out.println("the name of the client is"+n);
		req.setAttribute("name", n);
		return "clientweb";
		/*Here, if we specify a string as first paramater of the controller function than the data
		 sent by the client directly gets stored in that variable because of auto configuration.
		 Here ,if the parameter name in the browser is same as the variable name in the first
		 parameter of the clienthome() function ie n than we are not required to add the
		 @RequestParam() annoniation. But, if the paramter name ie key from browser is different
		 from the variable name in the first clienthome() function than we have to use
		 @RequestParam("name of the key in the browser") annonitation like if we data with the key
		 as name from the browser but here we specified variable name as "n" than we have to the
		 @RequestParam() annonitation and inside the annonination we have to specify the
		 key name used in the browser. So, the annoniation maps "name" from the broweser with
		 the variable "n"*/
	}
	@RequestMapping("client")
	public ModelAndView clienthome(@RequestParam("name") String n)
	{
		ModelAndView mv=new ModelAndView();   /*here, we can use ModelAndView to send data to
		                                        other pages like other jsp pages. So that allows
		                                        us to not use HttpServletRequest*/
		mv.setViewName("clientweb");          /*Here, we can set view name ie the page to which
		                                        we want to send data*/
		mv.addObject("name",n);             /*here, we can send data to the page by putting
		                                        the required data to be sent in the ModelandView
		                                        object and associating it with a key ie a name
		                                        with which we can retrieve the data int he jsp page*/
		return mv;
	}
}
