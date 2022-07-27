package qct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	/*********************************
	 * Home
	 ********************************/
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String homePage(Model model) {
		return "Home";
	}

	/*********************************
	 * Home
	 ********************************/
	@RequestMapping(value = {"/privacyPolicy" }, method = RequestMethod.GET)
	public String policyPage(Model model) {
		return "PrivacyPolicy";
	}
}