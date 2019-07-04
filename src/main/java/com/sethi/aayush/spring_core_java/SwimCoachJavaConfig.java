package com.sethi.aayush.spring_core_java;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoachJavaConfig implements CoachJavaConfig {
	private FortuneServiceJavaConfig fortuneService;

	@Value("${foo.firstName}")
	private String firstName;

	@Value("${foo.lastName}")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public SwimCoachJavaConfig(FortuneServiceJavaConfig fortuneService) {
		this.fortuneService = fortuneService;
	}
}
