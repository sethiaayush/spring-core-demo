package com.sethi.aayush.spring_core_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sethi.aayush.spring_core_annotation.CoachAnnotation;
import com.sethi.aayush.spring_core_annotation.SoccerDefaultBeanIdAnnotationCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SportPackageInterconnectConfig.class);

		// get the bean from spring container
		CoachAnnotation coach = context.getBean("tennisCoach", CoachAnnotation.class);
		CoachAnnotation coachDefaultBeanId = context.getBean("soccerDefaultBeanIdAnnotationCoach",
				CoachAnnotation.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coachDefaultBeanId.getDailyWorkout());
		System.out.println(coachDefaultBeanId.getDailyFortune());
		System.out.println(((SoccerDefaultBeanIdAnnotationCoach) coachDefaultBeanId).getSecondFortune());

		// close the context
		context.close();
	}

}
