package com.kgs.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JSPController {

	@RequestMapping({"/", "/welcome"})
	public String welcomePage(Model model, @RequestParam(value="name", required=false, defaultValue="Spring Boot!") String name) {
		model.addAttribute("name", name);
		return "welcome";
	}
}
