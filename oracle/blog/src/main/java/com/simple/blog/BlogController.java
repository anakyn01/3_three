package com.simple.blog;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.blog.service.BlogService;

@Controller
public class BlogController {
	
	@Autowired
	BlogService blogService;

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/create")public String create() {return "/create";}	
	@PostMapping("/create")public String postCreate(@RequestParam Map<String, Object>map) {
int blogContSeq = this.blogService.create(map);
return "redirect:/read/" + String.valueOf(blogContSeq);
	}
	
}
