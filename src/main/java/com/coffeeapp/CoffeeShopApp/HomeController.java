package com.coffeeapp.CoffeeShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeapp.CoffeeShopApp.dao.CoffeeUsersDao;

@Controller
public class HomeController {

	@Autowired
	CoffeeUsersDao dao;

	@RequestMapping("/")
	public ModelAndView indexPage() {

		return new ModelAndView("index", "items", dao.showItems());
	}

	@RequestMapping("/register")
	public String testPage() { // Only will show static page
		return "register"; // String methods in the controller class return the view
	}

	@RequestMapping("username")
	public ModelAndView formData(@RequestParam("firstName") String fName, @RequestParam("lastName") String lName,
			@RequestParam("email") String email, @RequestParam("pNum") String pNum,
			@RequestParam("password") String password, @RequestParam(defaultValue = "false") boolean news) {
		dao.insertUser(fName, lName, email, pNum, password, news);
		return new ModelAndView("summary", "personInfo", fName);
	}
	

}
