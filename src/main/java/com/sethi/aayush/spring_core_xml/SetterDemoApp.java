package com.sethi.aayush.spring_core_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retreive bean from the spring container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println(coach.getDailyFortune());

		// call method to print literal values
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());

		//call method to print value set from properties file
		System.out.println(coach.getFirstName());
		System.out.println(coach.getLastName());
		// close the context
		context.close();
	}

}
