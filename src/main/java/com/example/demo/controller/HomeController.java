package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// 未加入@ResponseBody用来返回数据给页面
	@RequestMapping("/index")
	public String index(HttpServletRequest request,Model model) {
		return "admin/index";
	}

	// 未加入@ResponseBody用来返回数据给页面
	@RequestMapping("/home")
	public String home(Model model) {
		return "admin/home";
	}

}
