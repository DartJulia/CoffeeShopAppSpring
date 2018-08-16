package com.coffeeapp.CoffeeShopApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping
	public ModelAndView indexPage() {
		return new ModelAndView("index", "temp", "");
	}

	@RequestMapping("/register")
	public String testPage() { // Only will show static page
		return "register"; // String methods in the controller class return the view
	}

	@RequestMapping("username")
	public ModelAndView formData(@RequestParam("firstName") String fName, @RequestParam("lastName") String lName,
			@RequestParam("email") String email, @RequestParam("pNum") String pNum,
			@RequestParam("password") String password, @RequestParam(defaultValue = "false") boolean news) {
		return new ModelAndView("summary", "personInfo", fName);
	}
	
}
