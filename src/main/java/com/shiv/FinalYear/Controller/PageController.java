package com.shiv.FinalYear.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class PageController {
	
	@GetMapping("/")
	public String home(Model model)
	{
		//sending data to view
		model.addAttribute("name","shiv");
		System.out.println("home page controller");
		return "home";
		
	}
	
	@GetMapping("/about")
	public String about(Model model)
	{
		System.out.println("about page controller");
		return "about";
		
	}
	
	@GetMapping("/services")
	public String service(Model model)
	{
		System.out.println("service page controller");
		return "service";
		
	}

	@GetMapping("/contact")
	public String contact(Model model)
	{
		System.out.println("contact page controller");
		return "contact";
		
	}

	@GetMapping("/login")
	public String login()
	{
		System.out.println("login page controller");
		return "login";
		
	}

	@GetMapping("/register")
	public String register()
	{
		System.out.println("register page controller");
		return "register";
		
	}

}
