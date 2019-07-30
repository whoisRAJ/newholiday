package com.holidaylist.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Datadisp")
public class Database {


	//public ModelAndView helloWorld() {
 
		//String message = "<br><div style='text-align:center;'>"
			//	+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		//return new ModelAndView("welcome", "message", message);
	//}
		@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		return "Datadisp";
		}
	
}

