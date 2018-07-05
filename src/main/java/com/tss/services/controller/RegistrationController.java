package com.tss.services.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tss.services.model.User;

@Controller
@RequestMapping(value = "/register")
public class RegistrationController {
 
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "Registration";

	}*/
	
	@RequestMapping(value = "/xyzFn", method = RequestMethod.GET)
	public String xyz(ModelMap model) {

		model.addAttribute("message", "XYXYX");
		return "Registration1";

	}
	
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
    	System.out.println("Started getting the request...");
        User userForm = new User();    
        model.put("userForm", userForm);
         
        List<String> professionList = new ArrayList<>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
        System.out.println("Started getting the request...");
        return "Registration";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         System.out.println("......Executing post method......");
        // for testing purpose:
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        System.out.println("email: " + user.getEmail());
        System.out.println("birth date: " + user.getBirthDate());
        System.out.println("profession: " + user.getProfession());
         
        return "RegistrationSuccess";
    }
}
