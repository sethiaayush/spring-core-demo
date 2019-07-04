package com.sethi.aayush.spring_core_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoachSingleton", Coach.class);
		Coach alphaCoach = context.getBean("myCoachSingleton", Coach.class);

		Coach thePrototypeCoach = context.getBean("myCoach", Coach.class);
		Coach alphaPrototypeCoach = context.getBean("myCoach", Coach.class);

// check if they are the same
		boolean resultSingleton = theCoach == alphaCoach;
		boolean resultPrototype = thePrototypeCoach == alphaPrototypeCoach;

// print out the results
		System.out.println("-----------------Singleton---------------");
		System.out.println("\nPointing to the same object : " + resultSingleton);
		System.out.println("Memory location for theCoach : " + theCoach);
		System.out.println("Memory location for alphaCoach : " + alphaCoach);

		System.out.println("\n\n-----------------Protype-----------------\n");
		System.out.println("Pointing to the same object : " + resultPrototype);
		System.out.println("Memory location for theCoach : " + thePrototypeCoach);
		System.out.println("Memory location for alphaCoach : " + alphaPrototypeCoach);

// close the context
		context.close();
	}

}
