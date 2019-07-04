package com.sethi.aayush.spring_core_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune service
	@Bean
	public FortuneServiceJavaConfig sadFortunerService() {
		return new SadFortuneServiceJavaConfig();
	}

	// define bean for our swimCoachJavaConfig and inject dependency
	@Bean
	public CoachJavaConfig swimCoach() {
		return new SwimCoachJavaConfig(sadFortunerService());
	}
}
