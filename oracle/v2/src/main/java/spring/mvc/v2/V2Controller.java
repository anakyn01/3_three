package spring.mvc.v2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.v2.service.V2Service;
import spring.mvc.v2.vo.V2EditRequestVO;

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
	//@PathVariable 경로변수를 메서드 매개변수에 바인딩(성격을 부여함) 
	public String getRead(@PathVariable("blogContSeq")int blogContSeq, Model model) {
		//서비스의 메서드를 호출하여 데이터를 가져옵니다 / = : 할당연산자
		Map<String, Object> blogCont = this.v2Service.read(blogContSeq);
		//모델의 뷰에 전달할 값을 설정
		model.addAttribute("blogCont", blogCont);
		return "/read";
		//Model model => 뷰에 데이터를 전달하는 객체 컨트롤러나 서비스에서 뭔가 처리를 하고 난 후에 뷰를 통해 표시해줘하는 경우가 많다
		//이때 뷰에 데이터를 전달하는 방법중에 하나가 모델을 사용하는 것이다.
	}
	
	//수정을 하려고 하면 read로 GetMapping으로 수정할 글을 불러오고 그리고 그 글에 에디트를 함 
	@GetMapping(value="/edit/{blogContSeq}")
	public ModelAndView getEdit(@PathVariable("blogContSeq") int blogContSeq) {
		//@PathVariable("blogContSeq") int blogContSeq 여기에서 blogContSeq URL에서 추출되어 정수 매개변수로 메서드에 전달됩니다.
		
	ModelAndView mav = new ModelAndView("/edit");
	//이 메서드는 뷰 이름으로 새 객체를 만듭니다. 이 뷰는 사용자가 게시물을 편집할수 있는 페이지를 렌더링하는데 사용됩니다.
	Map<String, Object> blogCont = this.v2Service.read(blogContSeq);
	//주어진 시퀀스 번호 (blogContSeq)게시물을 가져온다
	//서비스 게시물의 데이터 (제목, 내용을 포함하는 맵을 리턴함 게시물이 없으면 null
	if(blogCont == null) {
		mav.setViewName("redirect:/list");
		return mav;
	}
	mav.addObject("blogCont", blogCont); //게시물이 발견되면 컨텐츠가 ModelAndView 속성으로 객체에 추가됩니다.
	//키는 "blogCont"이고 값은 blogCont이면 뷰에서 액세스 할 수 있다
	return mav; //ModelAndView 객체리턴
	}
	
	   //edit httpMethodFilter
	   @PutMapping("/edit/{blogContSeq}")
	   public String putEdit(V2EditRequestVO v2EditRequestVO) {
	      boolean isSuccessEdit = this.v2Service.edit(v2EditRequestVO);
	      //isSuccessEdit 편집로직v2Service.edit(v2EditRequestVO)를 대입
	      //편집이 성공했는지 여부를 나타내는 boolean값을 리턴
	      if(isSuccessEdit) {
	         return "redirect:/edit/" + String.valueOf(v2EditRequestVO.getBlogContSeq());
	         //게시물이 수정이 성공했을때 업데이트된 페이지로 리디렉션
	      }//실패하면 목록 페이지로 리디렉션
	      return "redirect:/list";
	   }

	
	
	
}
