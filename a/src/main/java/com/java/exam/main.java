package com.java.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class main {

	@Autowired
	MyBeanImpl my;

	public String s() {
		return my.a();
	}
}
