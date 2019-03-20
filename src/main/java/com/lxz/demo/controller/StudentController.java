package com.lxz.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxz.demo.bean.StrudentInfo;

@Controller
@RequestMapping("/studentinfo/")
public class StudentController {

	@RequestMapping("index")
	public String index(Model model){
		StrudentInfo strudentInfo = new StrudentInfo();
		strudentInfo.setId(2888932);
		strudentInfo.setName("luxiangzheng");
		model.addAttribute("student",strudentInfo);
		List <StrudentInfo> students = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			StrudentInfo strudentInfo2 = new StrudentInfo();
			strudentInfo2.setId(22);
			strudentInfo2.setName("lu");
			students.add(strudentInfo2);
		}
		model.addAttribute("students", students);
		Map<String,Object> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", strudentInfo.getName()+"luxianghnzeg");
		model.addAttribute("map",map);
		return "index";
	}
}
