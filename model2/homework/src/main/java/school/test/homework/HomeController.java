package school.test.homework;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import school.test.homework.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/create")
	public String create() {//create 함수는 views에서 create.jsp
		return "create";
	}
	@PostMapping("/create")
	public ModelAndView createPost(@RequestParam Map<String, Object>map) {
		
		ModelAndView mav = new ModelAndView();

		String bno = this.homeService.create(map);
		if (bno == null) {
			mav.setViewName("redirect:/create");
		}else {
			mav.setViewName("redirect:/detail?Bno=" + bno);
		}
		
		return mav;
	}
	
	//read
	@GetMapping("/detail")
	public ModelAndView detail(@RequestParam Map<String, Object>map) {
		Map<String, Object> detailMap = this.homeService.detail(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		String Bno = map.get("Bno").toString();
		mav.addObject("Bno",Bno);
		mav.setViewName("/detail");
		return mav;
	}
	
	
	
	
	
	
}
