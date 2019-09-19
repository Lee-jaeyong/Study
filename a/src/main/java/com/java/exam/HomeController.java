package com.java.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	MyBeanImpl sd;
	
	@Autowired
	main a;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		
		String b = sd.getB();
		
		System.out.println(b);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		mav.addObject("a",b);
		
		return mav;
	}
	
}
