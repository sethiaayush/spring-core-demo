package com.sethi.aayush.spring_core_annotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneServiceAnnotation implements FortuneServiceAnnotation {

	@Override
	public String getFortune() {
		return "This is database fortune service";
	}

}
