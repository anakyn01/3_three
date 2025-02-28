package spring.mvc.v2;

import java.util.List;
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

import spring.mvc.v2.service.V2Service;
import spring.mvc.v2.vo.V2EditRequestVO;
import spring.mvc.v2.vo.V2ListRequestVO;
import spring.mvc.v2.vo.V2ListResponseVO;

@Controller
@MapperScan("spring.mvc.v2.mapper")
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
	
	//수정을 할려고 하면 read로 GetMapping 으로 수정할 글을 불러오고 그리고 그글에 에디트를 함
	@GetMapping(value="/edit/{blogContSeq}")
	public ModelAndView getEdit(@PathVariable("blogContSeq") int blogContSeq) {
	//@PathVariable("blogContSeq") int blogContSeq여기에서 blogContSeq URL에서 추출되어 정수 매개변수로 메서드에 전달됩니다
		
	ModelAndView mav = new ModelAndView("/edit");
	//이 메서드는 뷰 이름으로 새객체를 만듭니다 이 뷰는 사용자가 게시물을 편집할수있는 페이지를 렌더링하는데 사용됩니다
	Map<String, Object> blogCont = this.v2Service.read(blogContSeq);
	//주어진 시퀀스번호 (blogContSeq)게시물을 가져온다
	//서비스 게시물의 데이터 (제목, 내용)을 포함하는 맵을 리턴함 게시물이 없으면 null
	if(blogCont == null) {
		mav.setViewName("redirect:/list");
		return mav;
	}
	mav.addObject("blogCont",blogCont);//게시물이 발견되면 콘텐츠가 ModelAndView속성으로 객체에 추가됩니다
	//키는 "blogCont"이고 값은 blogCont이며 뷰에서 액세스 할수 있다 
	return mav;//ModelAndView 객체리턴
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
	
	//delete
	@DeleteMapping("/delete")
	public String delete(int blogContSeq) {
		this.v2Service.delete(blogContSeq);
		return "redirect:/list";
	}
	
	//list
	//뷰의 이름 Thymeleaf또는 jsp페이지를 리턴한다
	//두개의 매개변수 V2ListRequestVO(검색또는 필터기준) Model에 속성을 추가하여 뷰템플릿에서 사용할수 있도록 하는 객체
	@GetMapping("/list")//http get요청을 URL과 함께 /list매서드에 매핑합니다 사용자가 이 url에 방문하면 이 메서드가 호출됩니다
	public String list(V2ListRequestVO v2ListRequestVO, Model model) {
model.addAttribute("v2ListRequestVO", v2ListRequestVO);
List<V2ListResponseVO> v2ListResponseVOList = this.v2Service.list(v2ListRequestVO);
model.addAttribute("v2ListResponseVOList", v2ListResponseVOList);
return "/list";
	}
	//list()메서드를 호출하여 항목 목록[v2ListRequestVO]을 가져오기 위해 v2Service를 전달합니다
	//모델에 객체가 추가됨
	/*
	서블릿 => 자바기반에서 웹 애플리케이션에서 서버 측에서 실행되는 프로그램
	웹서버나 애플리케이션 서버에서 클라이언트(일반적으로 웹 브라우저)의 요청을 처리하고 그에 맞는 응답을 리턴하는 역활 
	HTTP요청과 응답처리 => 서블릿은 doGet(), doPost() 등의 메서드를 통해서 HTTP요청을 처리합니다 
	주로 GET요청과 POST요청을 처리하는 매서드가 사용됩니다
	컨테이너 기반 실행 : 서블릿 컨테이너라고 불리는 환경에서 실행됩니다
	이컨테이너는 서블릿의 생명주기를 관리하고 요청을 서블릿에 전달하는 역활을 한다
	요청과 HttpServletRequest 응답객체 HttpServletResponse를 사용합니다
	
	1) 인스턴스화 : 처음 요청될때 서블릿 클래스가 인스턴스화 된다
	2) 초기화(init() 메서드) : 인스턴스 생성된후 초기화 작업을 수행 
	3) 서비스(service() ) : 요청이 올때마다 service()호출되어 처리
	4) 소멸 (destroy()) : 서블릿이 더이상 필요하지 않을때 예를 해제
	
	reactjs
	라이프 사이클
	마운팅, 갱신, 언마운팅
	*/
	
	
	
	
	
	
	
	
}
