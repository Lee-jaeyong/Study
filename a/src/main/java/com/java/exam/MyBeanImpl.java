package com.java.exam;

import org.springframework.stereotype.Component;

@Component
public class MyBeanImpl {
	private String b = "gdsa";
	
	public String a() {
		return "��dsadsadsa���";
	}
	
	public String getB() {
		return b;
	}
}
