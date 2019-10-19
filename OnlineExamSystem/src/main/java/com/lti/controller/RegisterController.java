package com.lti.controller;


import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.User;
import com.lti.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	@RequestMapping(path="/register.lti",method=RequestMethod.POST)//acts as doPost() in servlet
	// Approach 1
	//public String register(HttpServletRequest request,Map model) 
	//for servlet based approach request.getParameter()
	
	// Approach 2
	//useful when form has less input fields
	//public String register(@RequestParam("email") String email,Map model){
	
	// Approach 3
	//Spring can automatically store the data coming along
	//with the request in an Object for us
	//take input as object
	public String register(User user, Map model){	
		
		registerService.register(user);
		model.put("message", "Registered Successfully!");
		
		return "confirmation.jsp";
	} 
	
	@RequestMapping(path="/fetch.lti")
	public String fetchByEmail(@RequestParam("email") String email,Map model){
		User user = registerService.fetchByEmail(email);
		model.put("user", user);
		
		return "display.jsp";
	}
}
