package com.sethi.aayush.spring_core_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

		// get the bean from spring container
		CoachAnnotation coach = context.getBean("tennisCoach", CoachAnnotation.class);
		CoachAnnotation coachDefaultBeanId = context.getBean("soccerDefaultBeanIdAnnotationCoach",
				CoachAnnotation.class);

		CoachAnnotation coachFieldAutowiring = context.getBean("badmintonCoachAnnotation", CoachAnnotation.class);

		SwimCoachAnnotation coachPropertiesFile = context.getBean("swimCoachAnnotation", SwimCoachAnnotation.class);
		System.out.println("---------------------------------------------------------------------------------------");
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coachDefaultBeanId.getDailyWorkout());
		System.out.println(coachDefaultBeanId.getDailyFortune());
		System.out.println(((SoccerDefaultBeanIdAnnotationCoach) coachDefaultBeanId).getSecondFortune());

		System.out.println(coachFieldAutowiring.getDailyWorkout());
		System.out.println(coachFieldAutowiring.getDailyFortune());

		System.out.println(coachPropertiesFile.getDailyWorkout());
		System.out.println(coachPropertiesFile.getDailyFortune());
		System.out.println(coachPropertiesFile.getFirstName());
		System.out.println(coachPropertiesFile.getLastName());
		// close the context
		context.close();
	}

}
