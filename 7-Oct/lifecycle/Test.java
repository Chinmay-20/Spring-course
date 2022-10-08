package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//samosa sobj=(samosa)context.getBean("s1");
		//System.out.println(sobj.getPrice());
		//System.out.println(sobj);
		
		context.registerShutdownHook();
		
		//System.out.println();
		//System.out.println();
		
		//Pepsi p1=(Pepsi) context.getBean("p1");
		//System.out.println(p1);
		
		Example eg=(Example) context.getBean("example");
		System.out.println(eg);
	}
}
