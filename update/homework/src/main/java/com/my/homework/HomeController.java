package com.my.homework;

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

import com.my.homework.dto.HomeEditRequestVO;
import com.my.homework.dto.HomeListRequestVO;
import com.my.homework.dto.HomeListResponseVO;
import com.my.homework.service.HomeService;
/*

 */


@Controller//컨트롤러 선언
@MapperScan("com.my.homework.mapper")//mapper경로 가져오기.
public class HomeController {
	@Autowired //의존성 주입.
	HomeService homeService; //HomeService 타입의 필드를 선언. 이 필드에는 HomeService 빈이 주입
	
	@GetMapping("/") //1)경로매핑
	public String home() {//public class method(parameter)
		return "home"; 
	}
	//create
	@GetMapping("/create")//1)경로매핑
	public String create() {//public class method(parameter)
		return "create";
	}
	@PostMapping("/create")//1)경로매핑
	public String postCreate(@RequestParam Map<String, Object>map) {
	//2)HTTP 요청 파라미터를 Map<String, Object> 형태로 받아옴. 이 map은 키-값 쌍으로, 키는 파라미터 이름이고 값은 해당 파라미터의 값
		int blogContSeq = this.homeService.create(map);
		//3)homeService의 create 메서드를 호출하여, 요청 파라미터(map)를 사용해 새로운 블로그 게시글을 생성하고 그 고유 식별자가 int blogContSeq의 값
		return "redirect:/read/" + String.valueOf(blogContSeq);
		//4)생성된 게시글을 보여주는 페이지로 리다이렉트해
	}
	
	//read
	@GetMapping("/read/{blogContSeq}")//1)경로 매핑 => url에서 /read/ 뒤에 오는 번호({blogContSeq})에 따라 이 메서드가 호출되도록 함.
	public String getRead(@PathVariable("blogContSeq")int blogContSeq,Model model) {//Model 객체로, 뷰에 데이터를 전달하는 역할
		//2)경로 변수 {blogContSeq}의 값을 blogContSeq 변수로 전달 
		Map<String, Object> blogCont = this.homeService.read(blogContSeq);
		//3)homeService의 read 메서드를 호출해 blogContSeq에 해당하는 블로그 게시글의 데이터를 가져옴. 이 데이터는 Map<String, Object> 형태로 반환
		model.addAttribute("blogCont", blogCont); 
		//4)가져온 데이터를 model 객체에 "blogCont"(키 여기선 string) blogCont(데이터 객체)라는 이름으로 추가. 이렇게 하면 뷰에서 이 데이터를 사용할 수 있음.
		return "/read";//5)/read라는 이름의 뷰를 반환
	}
	
	//edit
	@GetMapping("/edit/{blogContSeq}") //1)경로 매핑 => url에서 /edit/ 뒤에 오는 번호({blogContSeq})에 따라 이 메서드가 호출되도록 함.
	public ModelAndView getEdit(@PathVariable("blogContSeq")int blogContSeq) {//ModelAndView: 이 객체는 모델 데이터와 뷰 이름을 함께 다룰 수 있음.
	//2)URL 경로에서 {blogContSeq} 부분의 값을 blogContSeq 변수로 가져옴.
		ModelAndView mav = new ModelAndView("/edit");
	//3)ModelAndView 객체를 생성하고 기본 뷰 이름을 /edit으로 설정
		Map<String, Object>blogCont = this.homeService.read(blogContSeq);
	//4)homeService를 사용하여 blogContSeq에 해당하는 블로그 글 데이터를 조회. 조회된 데이터는 Map<String, Object> 형태로 반환
		if (blogCont == null) {//5-1)만약 해당 블로그 글이 없으면, 
			mav.setViewName("redirect:/list"); //5-2)/list 페이지로 리다이렉트.
			return mav;
		}
		mav.addObject("blogCont",blogCont);//6)가져온 데이터를 mav에 추가. 이렇게 하면 뷰에서 이 데이터를 사용할 수 있음.
		return mav; //7)최종적으로 ModelAndView 객체를 반환해. 여기에는 설정된 뷰와 모델 데이터가 포함
	}
	@PutMapping("/edit/{blogContSeq}")//1)/edit/{blogContSeq} 경로로 들어오는 HTTP PUT 요청을 이 메서드가 처리하도록 매핑
	public String putEdit(HomeEditRequestVO homeEditRequestVO) {
		//2)이 메서드는 HomeEditRequestVO 객체를 매개변수로 받는다. 이 객체는 수정할 블로그 게시글의 데이터를 담고 있음
		boolean isSuccessEdit = this.homeService.edit(homeEditRequestVO);
		//3)homeService의 edit 메서드를 호출하여 homeEditRequestVO에 담긴 데이터를 기반으로 블로그 게시글을 수정
		if(isSuccessEdit) {//4-1)성공
			return "redirect:/edit/"+String.valueOf(homeEditRequestVO.getBlogContSeq());
		}
		return "redirect:/list";//4-2)실패
	}
	
	//delete
	@DeleteMapping("/delete")//1)/delete 경로로 들어오는 HTTP DELETE 요청을 이 메서드가 처리하도록 매핑
	public String delete(int blogContSeq) { //2)blogContSeq라는 매개변수를 받아서 특정 블로그 게시글을 삭제하는 기능을 가진 메소드
		this.homeService.delete(blogContSeq);//3) homeService의 delete 메서드를 호출하여 blogContSeq에 해당하는 블로그 게시글을 삭제
		return "redirect:/list";
    }
	//list
	@GetMapping("/list")//1)"/list" URL로 들어오는 GET 요청을 처리
	public String list(HomeListRequestVO homeListRequestVO, Model model) {//2)이 메서드는 GET 요청을 처리하고 요청 파라미터로 HomeListRequestVO 객체와 Model 객체를 받음.
		//HomeListRequestVO: 클라이언트로부터 전달받은 요청 데이터를 담는 객체
		//Model: 뷰(view)로 데이터를 전달하기 위해 사용되는 객체
		model.addAttribute("homeListRequestVO", homeListRequestVO);
		//3) model 객체에 homeListRequestVO를 "homeListRequestVO"라는 이름으로 추가. 이 데이터는 뷰에서 사용될 수 있음.
		List<HomeListResponseVO> homeListResponseVOList = this.homeService.list(homeListRequestVO);
//4)homeService의 list 메서드를 호출해 HomeListRequestVO를 인수로 전달 후 결과로 얻은 HomeListResponseVO 객체의 리스트를 homeListResponseVOList에 저장
		//homeService.list(homeListRequestVO): 서비스 계층의 메서드를 호출하여 데이터베이스나 다른 소스로부터 데이터를 가져옵
		model.addAttribute("homeListResponseVOList", homeListResponseVOList);
		//5)model 객체에 homeListResponseVOList를 "homeListResponseVOList"라는 이름으로 추가. 이 데이터도 뷰에서 사용될 수 있음.
		return "/list";//6)위 사항들을 처리하고 list주소로 리턴
	}
	
}
