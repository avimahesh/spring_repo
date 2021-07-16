package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/student")
	public ModelAndView studentDet(@RequestParam("studName")String sName) {
		
		ModelAndView mv = new ModelAndView();
		System.out.println("StudentController: studentDet");
		
		mv.addObject("sName", sName);
		mv.setViewName("student");
		return mv;
	}
}
