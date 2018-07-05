package com.tss.services.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tss.services.services.FileDownloadFromServer;

@Controller
@RequestMapping(value="/service")
public class ServerController {
	
	@RequestMapping(value = "/getByService", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		new FileDownloadFromServer().fileDownload();
		return "Registration";

	}
}
