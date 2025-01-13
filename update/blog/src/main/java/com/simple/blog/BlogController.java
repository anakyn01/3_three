package com.simple.blog;

import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.simple.blog.dto.BlogEditRequestVO;
import com.simple.blog.service.BlogService;

@Controller
@MapperScan("com.spring.blog.mapper")
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
	
	//read
	@GetMapping(value="/read/{blogContSeq}")
	public String getRead(@PathVariable("blogContSeq")int blogContSeq, Model model) {
		Map<String, Object> blogCont = this.blogService.read(blogContSeq);
		model.addAttribute("blogCont", blogCont);
		return "/read";
	}
	
	//edit 1) 기존 글 불러오기
	@GetMapping("/edit/{blogContSeq}")
	public ModelAndView getEdit(@PathVariable("blogContSeq")int blogContSeq) {
		ModelAndView mav = new ModelAndView("/edit");
		Map<String, Object> blogCont = this.blogService.read(blogContSeq);
		if(blogCont == null) {
			mav.setViewName("redirect:/list");
			return mav;
		}
		mav.addObject("blogCont",blogCont);
		return mav;
	}
	
	//edit 2) httpMethod
	@PutMapping("/edit/{blogContSeq}")
	public String putEdit(BlogEditRequestVO blogEditRequestVO) {
		boolean isSuccessEdit = this.blogService.edit(blogEditRequestVO);
		if(isSuccessEdit) {
			return "redirect:/edit/" + String.valueOf(blogEditRequestVO.getBlogContSeq());
		}
		return "redirect:/list";
	}
	
	//delete
	@DeleteMapping(value="/delete")
	public String delete(int blogContSeq) {
		this.blogService.delete(blogContSeq);
		return "redirect:/list";
	}
	
	
	
	
	
}
