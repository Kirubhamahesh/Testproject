package com.kce;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controllerclass {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String dorating(ModelMap model) {
		
			model.addAttribute("message","kirubha welcomes");
			return "welcome";
	}
}
