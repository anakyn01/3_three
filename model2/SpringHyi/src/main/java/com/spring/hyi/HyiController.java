package com.spring.hyi;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;//자바와 ui를 사용

import com.spring.hyi.service.BookService;


@Controller//어노테이션[다른 프로그램에게 유용한 정보를 제공하기위해 사용하는  주석
//프로젝트를 관리하는 콘트롤러로 임명시킴 기능을 수행하도록 하는 기술
public class HyiController {
	//입력기능 서비스를 호출하기 위해 서비스 빈(컴포넌트)언제든 재사용 가능 을 추가한다
	@Autowired
	BookService bookService;

	@GetMapping(value="/")//웹에서 라우팅 할때 사용
	public String home() {
		return "home";
	}
	
	//create 주소가 GET방식으로 입력되었을때 sub/create에 경로의 뷰를 보여준다
	//ModelAndView 객체를 생성해서 객체형식으로 리턴
	//@GetMapping과 @PostMapping을 같이 사용 
	@GetMapping(value="/create")
	public ModelAndView create() {
		return new ModelAndView("sub/create");
	}
	
	//쓰기 ModelAndView =>모델 객체로 url과 모델을 리턴시키는 메소드
	//@RequestMapping(value="/create", method = RequestMethod.POST)
	//@RequestParam HTTP의 쿼리스트링이나 폼데이터를 메소드의 파라미터로 바인딩할때 사용
	//바인딩 프로그램의 어떤 기본단위가 가질수 있는 구성요소의 구체적인 값 성격을 확정하는것을 말함
	@PostMapping(value="/create")//스프링 버전이 3.점 때이면 사용불가능
	public ModelAndView createPost(@RequestParam Map<String, Object>map) {
	//1)객체 정의
	ModelAndView mav = new ModelAndView();
	//2)변수에 서비스를 대입
	String bookId = this.bookService.create(map);
	//3)정상적이라면 실행시키고 뷰페이지를 리턴 그렇지 않으면 글을 쓰는 상태로 돌림
	if (bookId == null) {//정상적인게 아니라면 원래 글을 쓰는 화면으로 돌리고
		mav.setViewName("redirect:/create");
	}else {
		//mav.setViewName("redirect:/detail?bookId="+bookId);
		mav.setViewName("redirect:/list");
	}
	return mav;
	}	
	
	//read @RequestParam => 쿼리스트링 파라미터를 읽고 파라미터를 GET,POST를 동일한 방법으로 읽을수 있게 한다
	/*
	ModelAndView(String viewName) => 응답할 뷰 이름을 설정
	addObject(String name, Object value) => 뷰에 전달할 값을 설정
	addAllObject(Map values) => view에 전달할 값을 Map에 name-value로 저장하여 한번에 설정	
	*/
	@GetMapping(value="/detail")
	public ModelAndView detail(@RequestParam Map<String, Object> map) {
		Map<String, Object> detailMap = this.bookService.detail(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		String bookId = map.get("bookId").toString();
		mav.addObject("bookId", bookId);
		mav.setViewName("/sub/detail");
	    return mav;
	}
    

	
	
	/*쓰기 프로세스
	1)마이바티스 태그생성
	2)콘트롤러 @GetMapping url생성
	3)dao생성 autowired로 sql세션 테플릿
	4)실제비즈니스 로직이 흐르는 서비스를 생성
	5)콘트롤러에서 서비스 오토와이어드
	6)서비스를 콘트롤러에서 실행
	 * */
	
	/*쿼리 스트링
	예를 들어
	/sample/test?a=1&b=2
	url : /sample/test
	쿼리스트링 : ?a=1&b=2
	쿼리스트링에 시작 : ?
	쿼리스트링에 항목 구분 : &
	쿼리스트링에 항목들 : a = 1, b=2
	URI :/sample/test?a=1&b=2
	URI에 포괄적인 개념이 url
	*/
	
	//edit 수정할수 있는 화면을 만든다 브라우저에서 /update?bookId=2접속하면 수정화면이 나온다
	@GetMapping(value="/update")
	//@RequestParam => 쿼리스트링 파라미터를 읽고 파라미터를 GET,POST를 동일한 방법으로 읽을수 있게 한다
	public ModelAndView update(@RequestParam Map<String, Object>map) {
		Map<String, Object> detailMap = this.bookService.detail(map);
		//위에서 사용한 글이 써진 디테일맵을 불러온다
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		mav.setViewName("/sub/update");
		return mav;
	}//수정화면은 입력화면 + 상세화면 데이터는 상세화면 서비스에서 가지고 오고 뷰는 입력화면을 복사한다
	
	/*
	수정화면에서 수정 기능으로 보내주는 파라미터는 총 4개 이다
	- 하나는 GET파라미터로 전달되는 bookId
	- 나머지 세개는 form 태그로 전달받은 title,category.price
	
	스프링은 http메소드가 get인지post인지 상관하지 않고 무조건 파라미터를 넣어준다
	map안에는 4개 데이터가 들어있다
	{
	"bookId":2, "title":"제목수정", "category":"emdemd", "price":"10000"
	}
	*/
	@PostMapping(value="/update")	
	public ModelAndView updatePost(@RequestParam Map<String, Object>map) {
		ModelAndView mav = new ModelAndView();
		
		boolean isUpdateSuccess = this.bookService.edit(map);
		if(isUpdateSuccess) {
			String bookId = map.get("bookId").toString();
			mav.setViewName("redirect:/detail?bookId=" + bookId);
		}else {
			mav = this.update(map);
		}
		return mav;
	}
	
	@PostMapping(value="/delete")
	public ModelAndView deletePost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		//삭제가 성공했는지 확인한다
		boolean isDeleteSuccess = this.bookService.remove(map);
		if(isDeleteSuccess) {//삭제가 성공한다면 
			mav.setViewName("redirect:/list");
			//상세페이지가 없어지므로 목록으로 리다이렉트
		}else {//삭제가 실패한다면 다시 삭제를 시도한 상세페이지로 돌아간다
		String bookId = map.get("bookId").toString();
		mav.setViewName("redirect:/detail?bookId=" + bookId);
		}
		return mav;
	}
	
	//list
	@GetMapping(value="/list")
	public ModelAndView list(@RequestParam Map<String, Object> map) {
		//목록을 데이터 베이스에서 가지고 온다
		List<Map<String, Object>> list = this.bookService.list(map);
		//데이터를 뷰에 전달할수 있게 mav 객체에 넣는다
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", list);
		//검색을 위한 구문추가
		if(map.containsKey("keyword")) {//파라미터가 잇다면
		mav.addObject("keyword", map.get("keyword"));
		//뷰에 키워드를 전달한다
		}
		/*
		목록 페이지에는 keyword HTTP파라미터가 있을수도 있고 없을 수도 있다 
		따라서 파라미터가 있는지를 검사한다
		*/
		
		mav.setViewName("/sub/list");
		return mav;
	}
	
	
	
	

}
