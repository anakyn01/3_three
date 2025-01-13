package com.my.homework;

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
import com.my.homework.servcie.HomeService;

@Controller
@MapperScan("com.my.homework.mapper")
public class HomeController {
	

	@Autowired
	HomeService homeService;
	
	@GetMapping(value = "/")
	public String home() {		
		return "home";
	}
	
	//
	@GetMapping(value="/create")
	public String getCreate() {
		return "create";
	}
	
	//create ���옣硫붿꽌��?
	@PostMapping(value="/create")
	public String postCreate(@RequestParam Map<String, Object> map) {
		//@RequestParam(�슂泥��뿉 紐⑤�? ?��?��?�� 留ㅺ컻蹂��?�� �삉�뒗 �뼇�떇 留ㅺ컻蹂��?��?���? 諛붿?���뵫) Map<String, Object> map
		//Map<String(�궎), Object(媛�)> �씠?���? 媛곴컖�?�� 媛쒕?��?���쑝濡� 吏��젙�븯吏� �븡?�� 留ㅺ컻蹂��?��?���? �닔�떊�븯�뒗�뜲 ��?�슜��?�땲�떎
		int blogContSeq = this.homeService.create(map);//�닽�옄 
		//create留ㅼ꽌�뱶瑜�? �샇?��?���??�� 留ㅺ컻蹂��?��?���? �룷�븿�븯�뒗 homeService?���? �쟾�떖��?�땲�떎 �씠留ㅼ꽌�뱶�?�� 寃뚯?��?��?��?�� 留뚮뱾�?�� �뜲�씠�꽣踰좎?���뒪 ���옣�븯?�� �깉濡� 留뚮�? 寃뚯?��?��?��?�� �떆���뒪 id?���? 諛섑?���븯�뒗 �뿭�솢�쓣 ��?�땲�떎
		return "redirect:/read/" + String.valueOf(blogContSeq);
	}
	//조회 read
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
	
	@PutMapping(value="/edit/{blogContSeq}")//에뮬레이터로 put을 사용하고 html _method로 
	public String putEdit(HomeEditRequestVO homeEditRequestVO) {
		boolean isSuccessEdit = this.homeService.edit(homeEditRequestVO);
		
		if(isSuccessEdit) {//true
			return "redirect:/read/" + String.valueOf(homeEditRequestVO.getBlogContSeq());
		}
		return "redirect:/list";//false
		
	}//<input type="hidden" name="_method" value="put"/>이속성이 html에 없으면 안된다
	
	
	//delete
	@DeleteMapping("/delete")
	public String delete(int blogContSeq) {
		this.homeService.delete(blogContSeq);
		return "redirect:/list";
	}
	
	
	

	
	
	
	
	
	
	
	
}
