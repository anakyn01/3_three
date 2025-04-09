package com.next.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")//http://localhost/
	public String home() {//공공의 문자타입 함수 홈은 
		return "home";//views폴더안에 들어있는 경로에 맞는 home.jsp
	}
}
