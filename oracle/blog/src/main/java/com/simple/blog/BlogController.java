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
@MapperScan("com.simple.blog.mapper")//bean 컴포넌트를 스캔못하면 
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
	
	//edit 1) 기존에 있는글 불러오기
	@GetMapping("/edit/{blogContSeq}")
	public ModelAndView getEdit(@PathVariable("blogContSeq")int blogContSeq) {
		//@PathVariable("blogContSeq") int blogContSeq여기에서 blogContSeq URL에서 추출되어 정수 매개변수로 메서드에 전달됩니다
		ModelAndView mav = new ModelAndView("/edit");
		//이 메서드는 뷰 이름으로 새객체를 만듭니다 이 뷰는 사용자가 게시물을 편집할수있는 페이지를 렌더링하는데 사용됩니다
		Map<String, Object> blogCont = this.blogService.read(blogContSeq);
		//주어진 시퀀스번호 (blogContSeq)게시물을 가져온다
		//서비스 게시물의 데이터 (제목, 내용)을 포함하는 맵을 리턴함 게시물이 없으면 null
		if(blogCont == null) {
			mav.setViewName("redirect:/list");
			return mav;
		}
		
		mav.addObject("blogCont",blogCont);
		//게시물이 발견되면 콘텐츠가 ModelAndView속성으로 객체에 추가됩니다
		//키는 "blogCont"이고 값은 blogCont이며 뷰에서 액세스 할수 있다 
		return mav;
		//ModelAndView 객체리턴
	}
	
	//edit httpMethodFilter
	@PutMapping("/edit/{blogContSeq}")
	public String putEdit(BlogEditRequestVO blogEditRequestVO) {
		boolean isSuccessEdit = this.blogService.edit(blogEditRequestVO);
		//isSuccessEdit 편집로직v2Service.edit(v2EditRequestVO)를 대입
		//편집이 성공했는지 여부를 나타내는 boolean값을 리턴
		if(isSuccessEdit) {
			return "redirect:/read/" + String.valueOf(blogEditRequestVO.getBlogContSeq());
			//게시물이 수정이 성공했을때 업데이트된 페이지로 리디렉션
		}//실패하면 목록 페이지로 리디렉션
		return "redirect:/list";
	}
	
	//delete 순번을 선택하여 모든 내용을 삭제하고 나서 리스트로 돌림
	@DeleteMapping(value="/delete")
	public String delete(int blogContSeq) {
		this.blogService.delete(blogContSeq);
		return "redirect:/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
