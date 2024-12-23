package com.money.rnd;

import java.util.List;
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
	RndService rndService;//서비스를 호출하기 위해서 의존성 주입

	@GetMapping(value="/")
	//어노테이션 Get, PostMapping은 스프링버전이 4이상일때 실행가능
	public String home() {
		//함수 홈() {리턴  home.jsp경로를 찾아서 리턴
		return "home";
	}
	
	@GetMapping(value="/list2")
	public String list() {
		return "rnd/list";//rnd폴더안에서 list.jsp출력
	}
	
	@GetMapping(value="/create")//url
	public String create() {
		return "rnd/create";
	}
	//기능
	@PostMapping(value="/create")
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		String rndId = this.rndService.create(map);
		if (rndId == null) {
			mav.setViewName("redirect:/create");
		}else {
			mav.setViewName("redirect:/detail?rndId=" + rndId);
		}
		
		return mav;
	}
	
	//디테일
	@GetMapping("/detail")//url경로를 매서드 매핑합니다
	public ModelAndView detail(@RequestParam Map<String, Object>map) {
		//@RequestParam 쿼리매개변수(url에서 바인딩) 예를 들어 요청 /detail?rndId=1 치면 map에 포함됨
		Map<String, Object> detailMap = this.rndService.detail(map);
		//이 메서드가 rndService.detail(map)호출되고 세부정보가 들어 있는 맵을 리턴
		ModelAndView mav = new ModelAndView();
		//모델앤드뷰 객체 생성 이객체는 모델(데이터) 뷰(jsp또는 html파일)을 전달
		mav.addObject("data", detailMap);
		//detailMap("data" ${data}
		String rndId = map.get("rndId").toString();
		mav.addObject("rndId", rndId);//rndId를 검색
		mav.setViewName("/rnd/detail");//요청을 처리한후 사용할 뷰를 설정
		return mav;//ModelAndView 리턴
	}	
	@GetMapping(value="/update")//수정화면은 입력화면 + 상세화면
	public ModelAndView update(@RequestParam Map<String, Object> map) {
		Map<String, Object> detailMap = this.rndService.detail(map);
		//글을 수정하기 위한 첫번째 조건으로 수정할 글을 불러온다
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		mav.setViewName("/rnd/update");
		return mav;
	}
	@PostMapping(value="/update")
	public ModelAndView updatePost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		boolean isUpdateSuccess = this.rndService.edit(map);
		if(isUpdateSuccess) {
			String rndId = map.get("rndId").toString();
			mav.setViewName("redirect://rnd/detail?rndId=" + rndId);
		}else {
			mav = this.update(map);
		}
		return mav;
	}
	
	//delete
	@PostMapping("/delete")
	public ModelAndView deletePost(@RequestParam Map<String, Object>map) {
		ModelAndView mav = new ModelAndView();
		//삭제가 성공했는지 확인한다
		boolean isDeleteSuccess = this.rndService.remove(map);
		if(isDeleteSuccess) {
		mav.setViewName("redirect:/list");
		}else {
		String rndId = map.get("rndId").toString();
		mav.setViewName("redirect:/detail?rndId="+ rndId);
		}
		return mav;
	}
	
	@GetMapping("/list")
	public ModelAndView list(@RequestParam Map<String, Object> map) {
		List<Map<String, Object>> list = this.rndService.list(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", list);
		mav.setViewName("/rnd/list");
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
