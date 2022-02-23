package com.sethi.aayush.spring_core_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerDefaultBeanIdAnnotationCoach implements CoachAnnotation {

	private FortuneServiceAnnotation fortune;
	private FortuneServiceAnnotation secondFortune;

	public String getSecondFortune() {
		System.out.println("SoccerDefaultBeanIdAnnotationCoach : Inside getSecondFortune");
		return secondFortune.getFortune();
	}

	@Autowired
	@Qualifier("RESTFortuneServiceAnnotation")
	public void someUselessFortuneSetting(FortuneServiceAnnotation secondFortune) {
		System.out.println("SoccerDefaultBeanIdAnnotationCoach : Inside someUselessFortuneSetting");
		this.secondFortune = secondFortune;
	}

	// define a default constructor
	public SoccerDefaultBeanIdAnnotationCoach() {
		System.out.println("SoccerDefaultBeanIdAnnotationCoach : Inside default constructor");
	}

	@Autowired
	@Qualifier("happyFortuneServiceAnnotation")
	public void setFortune(FortuneServiceAnnotation fortune) {
		System.out.println("SoccerDefaultBeanIdAnnotationCoach : Inside setDailyFortune");
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Perform Agility Ladders";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
