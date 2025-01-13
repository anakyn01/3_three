package com.my.homework.controller;

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

import com.my.homework.dto.HomeEditRequestVO;
import com.my.homework.service.HomeService;

@Controller
@MapperScan("com.my.homework.mapper")
public class HomeController {

	@Autowired
	private HomeService homeService; //�떎�젣 鍮꾩쫰�땲�뒪 濡쒖쭅�쓣 �샇異쒗븯�젮怨� 醫낆냽�꽦�쓣 二�
	
	@GetMapping(value="/")
		public String home() {
			return "home";
	}
	
	@GetMapping(value="/create")
		public String create() {
			return "/create";
}
	//create ���옣硫붿꽌�뱶
	@PostMapping(value="/create")
	public String postCreate(@RequestParam Map<String, Object>map) {
		//@RequestParam(�슂泥��뿉 紐⑤뱺 荑쇰━ 留ㅺ컻蹂��닔 �삉�뒗 �뼇�떇 留ㅺ컻蹂��닔瑜� 諛붿씤�뵫) Map<String, Object>map
		// Map<String(�궎), Object(媛�)> �씠瑜� 媛곴컖�쓣 媛쒕퀎�쟻�쑝濡� 吏��젙�븯吏� �븡怨� 留ㅺ컻蹂��닔瑜� �닔�떊�븯�뒗�뜲 �쑀�슜�븯�떎
		int blogContSeq = this.homeService.create(map); //�닽�옄
		// create 硫붿꽌�뱶瑜� �샇異쒗븯怨� 留ㅺ컻蹂��닔瑜� �룷�븿�븯�뒗 homeService瑜� �쟾�떖
		// �씠 硫붿꽌�뱶�뒗 寃뚯떆臾쇱쓣 留뚮뱾怨� �뜲�씠�꽣踰좎씠�뒪 ���옣�븯怨� �깉濡쒕쭔�뱺 寃뚯떆臾쇱쓽
		// �떆���뒪 id瑜� 諛섑솚�븯�뒗 �뿭�븷�쓣 �븳�떎
		return "redirect:/read/" + String.valueOf(blogContSeq);
	}

	
	// 議고쉶 read
	@GetMapping(value="/read/{blogContSeq}")
	public String getRead(@PathVariable("blogContSeq") int blogContSeq, Model model) {
		Map<String, Object> blogCont = this.homeService.read(blogContSeq);
		model.addAttribute("blogCont", blogCont);
		return "/read";
	}
	
	//edit
	@GetMapping(value = "/edit/{blogContSeq}")
	public ModelAndView getEdit(@PathVariable("blogContSeq") int blogContSeq) {
		//1)객체 생성
		ModelAndView mav = new ModelAndView("/edit");
		//2)blogCont변수에 서비스 read를 대입
		Map<String, Object> blogCont = this.homeService.read(blogContSeq);
		//3)변수에 대한 조건 설정
		if (blogCont == null) {
			mav.setViewName("redirect:/list");
			return mav;
		}
		mav.addObject("blogCont",blogCont);
		return mav;
	}
	
	@PutMapping(value="/edit/{blogContSeq}") // �뿉裕щ젅�씠�꽣濡� put�쓣 �궗�슜�븯怨� html_method濡�
	public String putEdit(HomeEditRequestVO homeEditRequestVO) {
		boolean isSuccessEdit = this.homeService.edit(homeEditRequestVO);
	
		if(isSuccessEdit) {
			return "redirect:/edit/" + String.valueOf(homeEditRequestVO.getBlogContSeq());
		}
		return "redirect:/list"; //false
	} // <input type="hidden" name= "_method" value
	
	
	//delete
	@DeleteMapping(value="/delete")
	public String delete(int blogContSeq) {
		this.homeService.delete(blogContSeq);
		return "redirect:/list";
	}
}
