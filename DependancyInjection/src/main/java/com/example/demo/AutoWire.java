package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutoWire {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependancyInjectionApplication.class, args);
		People p=context.getBean(People.class);
		p.display();
		//Auto wire with different name of obejct
		Vehicle v=context.getBean(Vehicle.class);
		v.showvehicle();
		
	}

}
/*Here, even though we have use @Component annonitation before class Student still there is
 null pointer exception because we have craeted a refference of class Stduent inside class People 
 and even though object of class Stduent is present inside the spring conatiner but object of
 class of Popele is unaware about the existence of object of class Student inside the spring
 container. So, we have to use @Autowired annonitation before creating a refference of class
 Student in class Popele to make class Poeple search for obejct of class Student inside the same
 spring container*/
/*Here, now the the obejct of every class is cretaed inside the spring container is craeted with
the name of the class itself but its first character is in lowercase. So, if want to craete objetc
with different name inside the spring conatiner than we can use
@Component(name with which object is required to be created) before defining a class. Also, if we
want to access anouther obejct inside a class like we are using object of class Bike inside the
class Vehicle than we have to use one more annonitation ie
@Qualifier(name of the object of the class  in spring container whose object is required) with
teh @Autowired annonitation*/
