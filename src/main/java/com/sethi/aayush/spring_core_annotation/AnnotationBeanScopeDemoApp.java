package com.sethi.aayush.spring_core_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

		// retrieve bean from spring container
		SwimCoachAnnotation theCoach = context.getBean("swimCoachAnnotation", SwimCoachAnnotation.class);
		SwimCoachAnnotation alphaCoach = context.getBean("swimCoachAnnotation", SwimCoachAnnotation.class);

		CoachAnnotation thePrototypeCoach = context.getBean("tennisCoach", CoachAnnotation.class);
		CoachAnnotation alphaPrototypeCoach = context.getBean("tennisCoach", CoachAnnotation.class);

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
