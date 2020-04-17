package com.webbco.RentalApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	ModelAndView modelView = new ModelAndView();
	
	
	
	@GetMapping("/home")
	public ModelAndView home() {
		modelView.setViewName("home");
		modelView.addObject("hello", "hello");
		modelView.addObject("hello1", "eric");

		return modelView;
	}
	
	@GetMapping("/")
	public ModelAndView helloWorld() {
		modelView.setViewName("home");
		modelView.addObject("hello1", "Jose");
		
		return modelView;

	}
}
