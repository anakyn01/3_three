package com.money.rnd.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //?��?�� ?��?��?���? ?��?��?�� ?���? 계층?�� 구현?��?��?�� 명시?��?���? ?��?�� 
/*
?��?��?��?��?�� ?��바소?��코드?�� 추�??��?�� ?��?��?�� ?�� ?��?�� 메�??��?��?��?�� ?���? ?��?��?�� ?��?��?�� ?��베디?��?��?��
컴파?��?��?�� ?��?�� ?��?��?�� ?�� ?���? �??��머신?�� ?��?��?��?�� ?��?��?��?��
@Bean => 빈을 ?��록하?�� ?��?��?��?��?��
@Component => 컴포?��?�� ?��캔을 ?��?��?�� 감�??��?�� Bean?�� ?��록될 ?���? ?��?��?���? 명시 메소?���? ?��?�� ?��?��?�� ?��?��?�� 붙이?��
@Controller => view�? 리턴?���? ?��?��, Data�? 리턴
@RestController => Controller + ReponseBody
@ControllerAdvice [콘트롤러 ?��?��?���? 공유?��?�� 공통로직?�� ?��?��?�� ?�� ?��?��] 
@RestControllerAdvice [?��?��?�� ?��?��처리 중에 권장?��?�� 방법]
@Service => 비�??��?�� 로직?�� 처리?��?�� 계층
@Respository => DB �??�� 로직?�� 처리?��?�� 계층
@Configuration => @Bean?�� 붙인 메소?��?��?�� Bean?���? ?��록할 ?�� ?��?�� ?��?��?��?��?��
@RequestMapping => ?���??�� ???�� URL 맵핑?�� ?��?�� ?��?��?��?��?��
@RequestParam => HTTP ?���? ?��?��미터값을 ?��리하�? ?��?��?���? ?��주는
@RequestBody => ?��버에?�� ?��?��?��?��?�� ?��?�� ?��?��?���? ?��?��?���? ?��?�� 
@RequestHeader => ?�� request header?�� 바운?�� ?�� ?��?��?��
@PathVariable => URL?�� �??���? ?��?��?�� ?�� ?���? ?��?��
@GetMapping("/{memberId}")
public String pv(@PathVariable("memberId") String memberId)
@RequestPart => multipart/form-data ?�� ?��?��?���? 받는?�� ?��?��?�� ?��?��?��?��?��
@Autowired => ?��존성 주입 [?�� 객체간의 �?계�?? 결정?��주는 ?��?��?�� ?��?��]?��?�� ?��?��?��?��?��

*/
public class RndDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("rnd.insert", map);
		//마이바티?�� 메소?�� ?���? rnd.insert 맵핑?�� sql 문의 ?��별자
		//?��번째 ?��?�� map sql 쿼리?�� ?��?��?��?�� ?��?��?�� ?��코드?�� ?��?��
	}
	/*?��?��?�� ?���??��?�� ?��근할 ?�� ?���?
	int insert?�� insert ?��?��?�� ?��?��?�� 받는 ?��?���? 리턴
	?��?���? Map<String, Object> map ?��?��?���?
	insert 쿼리?�� ?��?��?���? ?��?��?��?��?�� ?��?��?���? 맵의 ?��?�� ?��?�� ?��름을 ?��???���?
	값�? ?��?��?��?�� ?��?��?�� ?��?�� ?��?��?���? ?��???��?��?��
	*/
}
/*
Data Acess Object => db ?��?��?��?�� ?��근하�? ?��?�� 객체
DB?�� ?��근하�? ?��?�� 로직?�� 분리?���? ?��?�� ?��?��?��?��

Data Transfer Object 계층�? (Controller, view, Business Layer)?�� ?��?��?�� 교환?�� ?��?�� java Bean
DTO?�� 로직?�� �?�?�? ?��?�� ?��?��?�� 객체?���? getter, setter 메소?���? �?�? ?��?��?���? ?��미한?��

Value Object => Read-only(불�? ?��?��?��) ?��?��?�� �?�? ?��브젝?�� ?��?��?�� getter 기능�? 존재

DTO?�� ?��?��?��?�� 개념?��?���? VO?�� 리터?��(?��?��?�� �? �? ?���?) 개념?��?��
*/