package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependancyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependancyInjectionApplication.class, args);
		Test t=context.getBean(Test.class);
		t.show();
		
	}

}
/*Here, there is a container called spring container which contains objects of different classes 
 called as spring beans. The run() method returns an object of ConfigurableApplicationContext
 and also intilizes the container with the all the objects present inside it. Since, we have
 not kept object of class Test inside it, we have got an error. So,if we want to place object
 of class Test inside the spring container, we have to use @Component annonitation before class 
 Test. Now getBean() method requires a class whose object is required as its argument. And
 when we invoke getBean() method ,it returns the object of class Test. Now, we could have used
 Test t=new Test() to craete object of class Test but we want loose coupling.So we want spring
 framework to craete it and return it to us.And, that is what dependancy injection is.
 Moreover, there are 2 types of object or beans in the spring container singleton and prototype.
 So, every obejct craeted is of type singleton by default ie only one object of every class
 is craeted*/
