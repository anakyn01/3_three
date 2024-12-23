package com.money.rnd.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository//해당 클래스가 데이터 접근 계층의 구현제임을 명시적으로 표현
/*
어노테이션 자바소스코드에 추가하여 사용할수 있는 메타데이터의 일종 클래스파일에 임베디드되어
컴파일러에 의해 생성된후 자바 가상머신에 포함되어 작동한다
@Bean => 빈을 등록하는 어노테이션
@Component => 컴포넌트 스캔을 통해서 감지되어 Bean이 등록될 후보 클래스를 명시 메서드가 아닌 클래스 단위에 붙이는 어노테이션
@Controller => view를 리턴하기 위함, Data를 리턴
@RestController => Controller + ResponseBody
@ControllerAdvice[콘트롤러 클래스가 공유하는 공통로직을 정의할때 사용],
@RestControllerAdvice[다양한 예외처리중에 권장 되는 방법]
@Service : 비즈니스 로직을 처리하는 계층
@Repository : DB관련 로직을 처리하는 계층
@Configuration : @Bean을 붙인 메서드들을 Bean으로 등록할수 있는 어노테이션
@RequestMapping : 요청에 대한 URL 매핑하는 어노테이션
@RequestParam : Http요청 파라미터값을 편리하게 사용하게 해주는
@RequestBody : 서버에서 클라이언트로 응답 데이터를 전송하기 위해
@RequestHeader : 웹 request header에 바운딩 된 데이터
@PathVariable : URL에 변수를 이용할수 있게 해준다
@GetMapping("/{memberId}")
public String pv(@PathVariable("memberId") String memberId)

@RequsetPart multipart/form-data의 데이터를 받는데 특화된 어노테이션
@Autowired : 의존성 주입[두 객체간의 관계를 결정해주는 디자인 패턴]하는 어노테이션
*/
public class RndDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("rnd.insert", map);
		//마이바티스 메서드 호출 rnd.insert 매핑된 sql문의 식별자
		//두번째 인수 map sql쿼리에 전달되는 데이터 레코드의 필드
	}
	/*클래스 외부에서 접근할수 있고
	int insert 는  insert작업에 영향을 받는 행수를 리턴
	인수로 Map<String, Object> map 사용하고
	insert쿼리에 데이터를 전달 하는데 사용되고 맵의 키는 열의 이름을 나타내고 
	값은 해당열에 삽입할 해당 데이터를 나타냅니다
	*/
	
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("rnd.select_detail", map);
/*
Map<String, Object> => 레코드 세트
map => SQL쿼리에 전달하는데 사용
this.sqlSessionTemplate => SQL쿼리를 실행하고 결과를 얻는 MyBatis
selectOne => 단일 레코드를 반환하거나 발견되지 null
rnd.select_detail => 실행될 SQL문의 id이다
*/		
	}
	
	//update 다오에서 한일은 sql 문을 정의함
	public int update(Map<String, Object>map) {
		//첫번째 파라미터는 쿼리 ID, 두번째 파라미터는 쿼리 파라미터 반환값은 영향받은 행에 수
		return this.sqlSessionTemplate.update("rnd.update", map);
	}
	
	//delete
	public int delete(Map<String, Object>map) {
		//첫번째 파라미터는 쿼리 ID, 두번째 파라미터는 쿼리 파라미터 반환값은 영향받은 행에 수
		return this.sqlSessionTemplate.delete("rnd.delete", map);
	}
	
	//list
	public List<Map<String, Object>> selectList(Map<String, Object>map){
		return this.sqlSessionTemplate.selectList("rnd.select_list", map);
	}
	

}
/*
Data Access Object => db 데이터에 접근하기 위한 객체
DB에 접근하기 위한 로직을 분리하기 위해 사용한다

Data Transfer Object 계층간(Controller, view, Business Layer)의 데이터 교환을 위한 java Bean
DTO는 로직을 가지지 않는 데이터 객체이고 getter, setter메소드만 가진 클래스를 의미한다

Value Object => Read-only(불변 클래스)속성을 가진 오브젝트 따라서 getter기능만 존재한다

DTO는 인스턴스 개념이라면 VO는 리터럴(데이터 값 그 자체) 개념이다
*/
