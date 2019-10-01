package com.java.exam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.exam.student.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	MyBeanImpl sd;

	@Autowired
	main a;

	@Autowired
	AppConfig app;

	@Autowired
	BinaryCopEx copy;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {

		String str = request.getParameter("file1");
		copy.copyFile(str, "C:\\Users\\304ST023\\git\\Study\\a\\src\\main\\java\\com\\java\\1.txt");

		System.out.println(str);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");

		return mav;
	}

	@RequestMapping(value = "/copy", method = RequestMethod.GET)
	public ModelAndView copy() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("d");

		return mav;
	}

	@RequestMapping(value = "/serializable", method = RequestMethod.GET)
	public ModelAndView serializable() throws Exception {

		Student s1 = new Student("이재용","14731060","융합소프트웨어 학과");
		Student.doSerialiazable(s1, "냉동인간.std");
		
		Student s2 = (Student) Student.undoSerializable("냉동인간.std");
		
		System.out.println(s2.getName());
		
		ModelAndView mav = new ModelAndView();

		return mav;
	}

}
