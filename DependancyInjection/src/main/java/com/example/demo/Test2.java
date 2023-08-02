package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
class Test2
{
	public Test2()
	{System.out.println("class test2");
	}
	public void show()
	{System.out.println("show methos of class test2");
	}
}
