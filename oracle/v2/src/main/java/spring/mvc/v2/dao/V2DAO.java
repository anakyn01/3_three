package spring.mvc.v2.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.v2.vo.V2EditRequestVO;

//data access object 데이터에 접근하는 객체 매퍼XML에서 작성한 쿼리를 실행시키기 위해 작성하기 때문에  매퍼 xml과 한상입니다
@Repository
public class V2DAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;//클래스에 멤버변수 선언
	
	//삽입 작업을 수행하고 시퀀스값 (seq_blg_cont)이 값이 생성되어서 map에 추가 되었는지를 확인합니다
	//추가된 경우에 생성된 시퀀스값을 리턴하고 그렇지 않으면 실패를 나타내는 -1를 반환합니다
	public int insert(Map<String, Object> map) {
		int result = this.sqlSessionTemplate.insert("TB_BLG_CONT.insert", map);
		if (result > 0 && map.containsKey("seq_blg_cont")) {
			return (int) map.get("seq_blg_cont");
		}
		return -1;
	}
	
	//read
	public Map<String, Object> selectOne(int blogContSeq){//매개변수를 blogContSeq로 사용
		//여기서 사용한 blogContSeq를 기반으로 데이터베이스에서 하나의 레코드를 검색한다
		//Map<String, Object> 이쿼리에 결과가 키가 문자열이고 값이 객체인 맵이 될것으로 예상해준다
		return this.sqlSessionTemplate.selectOne("TB_BLG_CONT.selectOne", blogContSeq);
		//데이터베이스와 상호작용을 해주는 마이바티스
	}
	
	//update
	public int update(V2EditRequestVO v2EditRequestVO) {
		return this.sqlSessionTemplate.update("TB_BLG_CONT.update", v2EditRequestVO);
	}
	
	
	
	
	
}
