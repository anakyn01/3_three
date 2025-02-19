package com.my.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	//카테고리별 상품리스트
	@GetMapping("/list")
	public void getList()throws Exception{
		logger.info("소비자 페이지 진입");
	}
}
