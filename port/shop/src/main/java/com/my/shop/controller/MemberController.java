package com.my.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	//개발자 입장에서 페이지를 진입할때 터미널에서 작성해논 메세지가 보임
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@GetMapping("/signup")// member/signup
	public void getSignup() throws Exception{
		logger.info("사인업 진입");
	}
}
