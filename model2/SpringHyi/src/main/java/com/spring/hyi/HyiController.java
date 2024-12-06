package com.spring.hyi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;//자바와 ui를 사용


@Controller//어노테이션[다른 프로그램에게 유용한 정보를 제공하기위해 사용하는  주석
//프로젝트를 관리하는 콘트롤러로 임명시킴 기능을 수행하도록 하는 기술
public class HyiController {
	

	@GetMapping(value="/")//웹에서 라우팅 할때 사용
	public String home() {
		return "home";
	}
	
	//create 주소가 GET방식으로 입력되었을때 sub/create에 경로의 뷰를 보여준다
	//ModelAndView 객체를 생성해서 객체형식으로 리턴
	//@GetMapping과 @PostMapping을 같이 사용 
	@GetMapping(value="/create")
	public ModelAndView create() {
		return new ModelAndView("sub/create");
	}
	
	
	
	
	
	
	
	
	
	
	

}
