package com.manwebapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class ManController
{
	@RequestMapping("man")
	public String home()
	{
		System.out.println("henry");
		return "man";
	}
}
/*here, we can remove ".jsp" extension as if we change the jsp page to vue page or some other
page than we will be required to make changes everywhere even if we keep the file name as same.
So, we can remove ".jsp" from man.jsp but we have to add "spring.mvc.view.suffix=.jsp" in the
application.properties file as ".jsp" is suffix only.
Moreover, as we know that the spring container automatically seraches for jsp files inside
the webapps folder because of auto configuration. But, if we want to place the jsp file inside
nested folders inside webapps folder like inside pages folder than we have to add
"spring.mvc.view.prefix=/pages/" in the application.properties file. And, /pages/ is the 
qualifies name of the nested folder after webapps folder.This is known as manual configuration*/
