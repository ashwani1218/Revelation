package com.debie.Revelation.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("/home");
		return modelAndView;
	}
	
}
