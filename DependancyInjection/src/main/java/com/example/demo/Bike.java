package com.example.demo;

import org.springframework.stereotype.Component;

@Component("bk")      //Bike oonject is not pesent with "bk" name inside spring container
public class Bike
{
	public void showbike()
	{System.out.println("showbike methos of class bike");
	}
}
