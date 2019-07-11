package com.sethi.aayush.spring_core_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("prototype")
//Default Bean Id would be tennisCoachAnnotation
public class TennisCoachAnnotation implements CoachAnnotation {

	private FortuneServiceAnnotation fortune;

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	// Preferred to make code more readable
	// Not really required if there is only one constructor in the class
	// So program will work even if @Autowired is commented out.
	/*
	 * As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
	 * no longer necessary if the target bean only defines one constructor to begin
	 * with. However, if several constructors are available, at least one must be
	 * annotated to teach the container which one to use.
	 */
	@Autowired
	// @Qualifier("randomFortuneServiceAnnotation")
	public TennisCoachAnnotation(@Qualifier("randomFortuneServiceAnnotation") FortuneServiceAnnotation fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

	// Won't be called as class scope = prototype, so it is useless, for singleton
	// method it will be called.
	@PreDestroy
	public void justBeforeComplete() {
		System.out.println("TennisCoachAnnotation : justBeforeComplete");
	}

	@PostConstruct
	public void justAfterStarting() {
		System.out.println("TennisCoachAnnotation : justAfterStarting");
	}
}
