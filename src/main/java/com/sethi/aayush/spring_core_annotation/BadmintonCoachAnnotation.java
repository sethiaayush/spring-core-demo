package com.sethi.aayush.spring_core_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoachAnnotation implements CoachAnnotation {

	@Autowired
	@Qualifier("databaseFortuneServiceAnnotation")
	private FortuneServiceAnnotation fortuneService;

	@Override
	public String getDailyWorkout() {

		return "Practice footwork movement";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
