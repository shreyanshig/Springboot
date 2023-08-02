package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependancyInjectionWithDifferentObjects{

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependancyInjectionApplication.class, args);
		Test2 t1=context.getBean(Test2.class);
		t1.show();
		Test2 t2=context.getBean(Test2.class);
		t2.show();
		
	}

}
/*Here, even though we have craeted two refference variable of class Test but the getBean()method
is returning same one object only because the constructor of the class is getting excuted only once.
It is because the objects inside the spring container are singleton by default which means
only object of every class can be created.
So,if we want more than objects of a class than we use @Scope(value="prototype")annonitation
before class test2 so it allows multiple objects of the class test2 created in the spring
conatiner.Also if we use @Scope(value="prototype")annonitation than object is not created when
run() method is invoked but a different object is cteated every time we require it ie every time
the getBean() method is invoked*/