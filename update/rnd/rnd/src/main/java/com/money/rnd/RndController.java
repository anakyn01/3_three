package com.money.rnd;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.money.rnd.service.RndService;

@Controller

public class RndController {
	
	@Autowired
	RndService rndService;// 서비스를 호출하기 위해서 의존성 주입

	@GetMapping(value="/") // 어노테이션 Get, PostMapping은 스프링 버전이 4.0 이상일때 사용가능
	public String home() { //함수 홈() {리턴 home.jsp 경로를 찾아서 리턴
		return "home";
	}
	
	@GetMapping(value="/list")
	public String list() {
		return "rnd/list"; //rnd 폴더 안에서 list.jsp 출력
	}
	
	@GetMapping(value="/create")//url
	public String create() {
		return "rnd/create"; //rnd 폴더 안에서 create.jsp 출력
	}
	//기능
	@PostMapping(value="/create")
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		String rndId = this.rndService.create(map);
		if(rndId == null) {
			mav.setViewName("redirect:/create");
		}else {
			mav.setViewName("redirect:/detail?rndId=" +rndId);
		}
		return mav;
	}
	
	
	
	@GetMapping(value="/update")
	public String update() {
		return "rnd/update"; //rnd 폴더 안에서 update.jsp 출력
	}
}
