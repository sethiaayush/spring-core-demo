package com.sethi.aayush.spring_core_java;

public class SadFortuneServiceJavaConfig implements FortuneServiceJavaConfig {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
