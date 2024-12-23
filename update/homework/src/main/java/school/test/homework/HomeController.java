package school.test.homework;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import school.test.homework.service.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	@PostMapping("/create")
	public ModelAndView createPost(@RequestParam Map<String, Object>map) {
		
		ModelAndView mav = new ModelAndView();
		
		String bno = this.homeService.create(map);
		if (bno == null) {
			mav.setViewName("redirect:/create");
		} else {
			mav.setViewName("redirect:/detail?bno=" + bno);
		}
		
		return mav;
	} 
	
}
