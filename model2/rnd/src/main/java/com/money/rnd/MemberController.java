package com.money.rnd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/member/join")
	public String join() {
		return "member/join";
	}
}
