package spring.mvc.v2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.v2.service.V2Service;

@Controller
public class V2Controller {
	
	@Autowired
	V2Service v2Service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/create")
	public String create() {return "/create";}
	@PostMapping("/create")
	public String postCreate(@RequestParam Map<String, Object> map) {
		int blogContSeq = this.v2Service.create(map);
		return "redirect:/read/" + String.valueOf(blogContSeq);
	}
	
	
	@GetMapping("/read/{blogContSeq}")
	//@PathVariable 경로변수를 메서드 매개변수에 바인딩
	public String getRead(@PathVariable("blogContSeq")int blogContSeq, Model model) {
		//서비스의 메소드를 호출하여 데이터를 가져옵니다
		Map<String, Object> blogCont = this.v2Service.read(blogContSeq);
		//모델에 뷰에 전달할 값을 설정 합니다
		model.addAttribute("blogCont",blogCont);
		return "/read";
		//Model model => 뷰에 데이터를 전달하는 객체 컨트롤러나 서비스에서 뭔가 처리를 하고 난후에 뷰를 통해 표시를 해줘야 하는 경우가 많다
		//이때 뷰에 데이터를 전달하는 방법중에 하나가 모델을ㅇ 사용하는 것이다
	}
	
	
	
	
	
	
	
	
}
