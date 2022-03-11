package QCT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	/*********************************
	 * Welcome
	 ********************************/
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String welcomePage(Model model) {
		return "index";
	}
}