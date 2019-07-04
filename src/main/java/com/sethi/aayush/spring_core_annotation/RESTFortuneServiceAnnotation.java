package com.sethi.aayush.spring_core_annotation;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneServiceAnnotation implements FortuneServiceAnnotation {

	@Override
	public String getFortune() {
		return "This is REST Fortune Service";
	}

}
