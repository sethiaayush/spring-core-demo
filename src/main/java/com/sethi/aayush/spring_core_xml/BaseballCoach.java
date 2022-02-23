package com.sethi.aayush.spring_core_xml;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "BaseballCoach" + fortuneService.getFortune();
	}

	// add a init-method
	// It can be public, private or protected, it can be reached anyway as it is
	// invoked using reflection.
	// You can neither capture the return type nor pass any argument, so it is
	// generally kept void
	// For argument to tested, check the commented code below with the same name.
	public void doMyStartupStuff() {
		System.out.println("BaseballCoach : inside method doMyStartupStuff");
	}

	public void doMyStartupStuff(String test) {
		System.out.println("BaseballCoach : inside method doMyStartupStuff::test");
	}

	// add a destroy-method
	public void doMyCleanupStuff() {
		System.out.println("BaseballCoach : inside method doMyCleanupStuff");
	}

	public void doMyPrototypeStartupStuff() {
		System.out.println("BaseballCoach : inside method doMyPrototypeStartupStuff");
	}

	public void doMyPrototypeCleanupStuff() {
		System.out.println("BaseballCoach : inside method doMyPrototypeCleanupStuff");
	}

}
