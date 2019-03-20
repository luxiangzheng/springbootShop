package com.lxz.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxz.demo.bean.StrudentInfo;

@RestController
@RequestMapping("/")
public class IndexController {

	//restcontroller不会把下面的字符串匹配视图，而是解析成json
	@RequestMapping("index")
	public String index(){
		return "springBoot";
	}
	@RequestMapping("student/{id}/{name}")
	public StrudentInfo show(@PathVariable Integer id,@PathVariable String name){

		StrudentInfo strudentInfo = new StrudentInfo();
		strudentInfo.setId(id);
		strudentInfo.setName(name);
		return strudentInfo;
		
	}
}
