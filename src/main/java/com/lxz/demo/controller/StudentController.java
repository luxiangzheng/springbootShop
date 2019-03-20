package com.lxz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studentinfo/")
public class StudentController {

	@RequestMapping("index")
	public String index(Model model){
		model.addAttribute("str","asdfhwej");
		return "index";
	}
}
