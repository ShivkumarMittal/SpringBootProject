package com.shiv.FinalYear.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class PageController {
	
	@GetMapping("/home")
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

}
