package com.sethi.aayush.spring_core_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoachAnnotation implements CoachAnnotation {

	@Value("#{'${foo.fortuneArray}'.split(',')}")
	private String[] fortuneData;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Value("${foo.firstName}")
	private String firstName;
	@Value("${foo.lastName}")
	private String lastName;

	@Override
	public String getDailyWorkout() {
		return "This is Swimming daily workout";
	}

	@Override
	public String getDailyFortune() {
		Double random = Math.random() * 5;
		return fortuneData[random.intValue()];
	}

	@PreDestroy
	public void justBeforeComplete() {
		System.out.println("SwimCoachAnnotation : justBeforeComplete");
	}

	@PostConstruct
	public void justAfterStarting() {
		System.out.println("SwimCoachAnnotation : justAfterStarting");
	}
}
