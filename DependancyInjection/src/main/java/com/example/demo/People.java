package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class People
{
	private int pid;
	@Autowired
	private Student s;
	public void display()
	{System.out.println("display method of class people");
	 s.showdetails();
	}
}
