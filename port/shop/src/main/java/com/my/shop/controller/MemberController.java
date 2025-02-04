package com.my.shop.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.shop.service.MemberService;
import com.my.shop.vo.MemberVO;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Inject
	MemberService service;//실제 비즈니스로직이 흐르는 서비스를 불러옴
	
	//보안을 위해 관리자도 모르게 패스워드 인코더
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@Bean
	BCryptPasswordEncoder passEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	

	//개발자 입장에서 페이지를 진입할때 터미널에서 작성해논 메세지가 보임
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@GetMapping("/signup")// member/signup
	public void getSignup() throws Exception{
		logger.info("사인업 진입");
	}
	@PostMapping("/signup")
	public String postSignup(MemberVO vo)throws Exception{
		logger.info("회원가입 기능");
		
		//암호 암호화
		String inputPass = vo.getUserPass();
		String pass = passEncoder.encode(inputPass);
		vo.setUserPass(pass);
		
		String inputPass2 = vo.getUserPassRe();
		String pass2 = passEncoder.encode(inputPass2);
		vo.setUserPass(pass2);
		
		
		
		
		
		
		
		service.signup(vo);
		return "redirect:/";
	}
	
	@GetMapping("/signin")// member/signup
	public void getSignin() throws Exception{
		logger.info("로그인 진입");
	}
	
	
}
