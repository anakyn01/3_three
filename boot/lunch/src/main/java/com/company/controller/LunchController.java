package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LunchController {

	@GetMapping("/test/create")//jsp와 다르게 spring 은 라우팅 url만 가져오는것 겟매핑
	public String create() {
		return "test/create";
	}
}
