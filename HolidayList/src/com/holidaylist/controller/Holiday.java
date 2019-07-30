package com.holidaylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class Holiday {


	//public ModelAndView helloWorld() {
 
		//String message = "<br><div style='text-align:center;'>"
			//	+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		//return new ModelAndView("welcome", "message", message);
	//}
		@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		String heading = "HOLIDAY CALENDAR";
		String result1 = "HUBSTACK COMPETENCY CENTER";
		String result2 = "BANGALORE";
 
		//String credit = "Demo by <a href='https://crunchify.com'>Crunchify</a>. Click <a href='https://crunchify.com/category/java-tutorials/'>here</a> for more than 350 Java Examples.";
 
		// you can add any Collection Objects to ModelMap
		// including JSON, String, Array, Map, List, etc...
		model.addAttribute("heading", heading);
		model.addAttribute("result1", result1);
		model.addAttribute("result2", result2);
	//	model.addAttribute("credit", credit);
		return "welcome";
		}
	
}

