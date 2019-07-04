package com.sethi.aayush.spring_core_annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceAnnotation implements FortuneServiceAnnotation {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
