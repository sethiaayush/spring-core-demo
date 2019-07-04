package com.sethi.aayush.spring_core_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

// retrieve bean from spring container
		System.out.println("myCoach-Singleton");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());

		System.out.println("----------------------------------");
		System.out.println("myPrototypeCoach");
		Coach myPrototypeCoach = context.getBean("myPrototypeCoach", Coach.class);
		System.out.println(myPrototypeCoach.getDailyWorkout());
		System.out.println("No destroy method called for prototype cleanup stuff");
// close the context
		context.close();
	}

}
