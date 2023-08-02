package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
	@Autowired
	@Qualifier("bk")
	private Bike b;
	public void showvehicle()
	{System.out.println("showvehicle methos ofclass Vehicle");
	b.showbike();
	}
}
