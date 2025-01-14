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
import com.my.homework.servcie.HomeService;
/*
객체 지향 개념 : 실세계의 개체를 속성과 메서드가 결합한 형태의 객체로 표현하는 기법
객체지향 구성요소
class: 
- 특정 객체내에 있는 변수와 메서드를 정의하는 일종의 틀
- 객체 지향 프로그래밍에서 데이터를 추상화하는 단위
- 하나 이상의 유사한 객체들을 묶어서 하나의 공통된 특성을 표현
- 속성은 변수의 형태로, 행위는 메서드의 형태로 선언

Object:
- 물리적 추상적으로 자신과 다른 것을 식별 가능한 대상
- 클래스에서 정의한것을 토대로 메모리에 할당
- 객체마다 각각의 상태와 식별성을 가짐

Method:
- 클래스로 부터 생성된 객체를 사용하는 방법
- 객체가 메시지를 받아 실행해야할 구체적인 연산
- 전통적 시스템의 함수(function) 또는 프로시저(procedure)에 해당하는 연산기능

Message :
- 객체간에 상호작용을 하기위한 수단
- 객체에게 어떤 행위를 하도록 지시하는 방법
- 객체간의 상호작용은 메시지를 통해 이루어짐
- 메시지는 객체에서 객체로 전달

instance:
- 객체지향 기법에서 클래스를 통해 만든 실제의 실형 객체
- 클래스에 속한 각각의 객체
- 실제 메모리에 할당


property:
- 한클래스 내에 속한 객체들이 가지고 있는 데이터 값들을 단위별로 정의
- 성질,분류,식별,수량, 현재 상태등에 대한 표현값

2) 객체지향 기법
캡슐화 : 서로 연관된 데이터와 함수를 함께 묶어 외부와 경계를 만들고 인터페이스만 밖으로 드러내는 기법
결합도가 낮아지고 재사용성이 용이

상속성 : 하위 클래스에서 재정의 업시 물려받아 사용하는 기법
다형성
오버로딩[타입을 다르게 하여 이름은 똑같이 사용하는 기법], 
오버라이딩[하위 클래스에서 원래 클래스를 무시하고 재정의]

추상화 : 공통성질을 추출
정보은닉 : 코드 내부 데이터와 메서드를 숨기고 공개 인터페이스에서만 접근이 가능하도록 하는 코드보안기술
관계성 : 두개 이상의 엔티티 형에서 데이터를 참조하는 관계를 나타내는 기법
종류로는
연관화 : is-member-of 클래스와 객체의 참조 및 이용관계
같은 계층에 속하는 클래스들 사이의 상오 의존성을 보여주는 비계층적 관계성을 나타냄

집단화 : is part of, part-whole 관계
관련 있는 여러개의 객체를 묶어 한개의 상위 객체를 만드는 특징
일반화와 다르게 상위 클래스의 성질들이 하위 클래스로 상속되지는 않는다

분류화 : is-instance-of 공통된 속성에 의해 정의된 객체 구성원들의 인스턴스
일반화 : is-a 클래스간의 개년적인 포함관계
특수화 : is-a 특성들을 상속받으면서 하위 클래스에서 나름대로 수정을 가하고 자신의 고유한 특성을 갖는 관계

객체지향 설계원칙 SOLID
단일 책임의 원칙 : 하나의 목적을 위해서 생성되고 클래스가 제공하는 모든 서비스는 하나의 책임을 수행하는 집중'
객체지향 프로그래밍의 5원칙중 나머지 4원칙의 기초원칙

개방 폐쇄 원칙 : 소트프웨어의 구성요소(컴포넌트, 클래스, 모듈, 함수)는 확장에는 열려있고 변경에는 닫혀있어야 한다
리스코프 치환의 법칙 : 서브타입(상속받은 하위 클래스)은 어디서나 자신의 기반타입(상위 클래스로)교체할수 있어야 한다는 원칙 
인터페이스 분리의 원칙 : 자신이 사용하지 않는 인터페이스는 구현하지 말아야 한다는 원칙 
객체설계시 특정기능에 대한 인터페이스는 그기능과 상관없는 부분이 변해도 영향을 받디 말아야 한다는 원칙
의존성 역전의 원칙 : 어떤 클래스를 참조해서 사용하는 경우에 그 클래스를 직접 참초하는 것이 아니라
그 대상의 상위 요소인 추상클래스 나 인터페이스를 참조하라는 원칙

애자일 : 절차보다는 사람이 중심이 되어 변화에 유연하고 신속하게 적응 하면서 효율적으로 시스템을 개발할수 있는 신속 적응형
개발 기간이 짧고 신속하며 폭포수 모형에 대비되는 방법론

xp, 스크럼, 린
*/


@Controller
@MapperScan("com.my.homework.mapper")
public class HomeController {
	

	@Autowired//싱글턴 패턴 : 여러차레 호출되도 실제로 생성되는 객체는 하나 최조 생성이후에 최초의 생성자가 생성한 객체를 리턴
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
	
	
	//list
	@GetMapping("/list")//GET요청을 처리
	public String list(HomeListRequestVO homeListRequestVO, Model model) {
	//메서드 서명에 매개변수로 homeListRequestVO와 model 뷰(데이터를 전달하는데 사용)
		model.addAttribute("homeListRequestVO", homeListRequestVO);
		//homeListRequestVO객체를 모델에 추가하여 뷰내에서(jsp또는 html)엑세스를 할수 있도록 합니다
		List<HomeListResponseVO> homeListResponseVOList = this.homeService.list(homeListRequestVO);
		//요청떼이터에따라 목록을 가져오는 메서드를 호출
		model.addAttribute("homeListResponseVOList", homeListResponseVOList);
		//homeListResponseVOList를 모델에 추가하여 뷰에서 사용할수 있도록 합니다
		return "/list";
		//위에 사항들을 list라는 주소로 리턴
	}
	
	

	
	
	
	
	
	
	
	
}
