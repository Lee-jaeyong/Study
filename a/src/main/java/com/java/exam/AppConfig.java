package com.java.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppConfig {
	
	@Autowired
	MyBeanImpl bean;
	
	public String a() {
		return bean.a();
	}
}