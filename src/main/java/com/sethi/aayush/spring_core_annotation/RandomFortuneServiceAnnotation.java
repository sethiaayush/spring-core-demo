package com.sethi.aayush.spring_core_annotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceAnnotation implements FortuneServiceAnnotation {

	@Override
	public String getFortune() {
		return "This is Random Fortune Service, Your Fortune is in danger";
	}

}
