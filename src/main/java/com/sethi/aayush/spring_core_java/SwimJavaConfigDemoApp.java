package com.sethi.aayush.spring_core_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		SwimCoachJavaConfig coach = context.getBean("swimCoach", SwimCoachJavaConfig.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println("FirstName : " + coach.getFirstName());
		System.out.println("LastName : " + coach.getLastName());

		// close the context
		context.close();
	}

}
