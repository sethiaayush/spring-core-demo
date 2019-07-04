package com.sethi.aayush.spring_core_xml;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach" + fortuneService.getFortune();
	}

}
