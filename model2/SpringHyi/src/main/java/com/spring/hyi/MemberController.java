package com.spring.hyi;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.hyi.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/member/join")
	public String join() {
		return "/member/join";
	}
	@PostMapping("/member/join")
	public ModelAndView createPost(@RequestParam Map<String, Object> map){
	    ModelAndView mav = new ModelAndView();

	    String userId = this.memberService.join(map);
	    if (userId == null) {
	        mav.setViewName("redirect:/member/join");
	    }else {
	        mav.setViewName("redirect:/member/mypage?userId=" + userId); 
	    }  

	    return mav;
	}
}




