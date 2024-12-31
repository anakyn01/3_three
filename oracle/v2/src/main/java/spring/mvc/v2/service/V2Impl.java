package spring.mvc.v2.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.v2.dao.V2DAO;
import spring.mvc.v2.vo.V2EditRequestVO;

@Service
public class V2Impl implements V2Service {
	private V2DAO v2DAO;
	
	@Autowired
	public V2Impl(V2DAO v2DAO) {
		this.v2DAO = v2DAO;
	}
	//쓰기
	@Override
	public int create(Map<String, Object> map) {
		int seq = this.v2DAO.insert(map);
		return seq;
	}
	
	//READ
	@Override //이 메서드가 슈퍼클래스나 인터페이스 메서드를 오버라이드 함 
	//데이터를 검색하여 형태를 리턴하도록 함 Map <String, Object>
	//Map <String, Object> Map키가 a String Object유형은 맵의 값이 어떤 유형이든 될 수 있음을 시사한다 
	//read(int blogContSeq) 게시물에 대한 식별자
	public Map<String, Object> read(int blogContSeq){
		Map<String, Object> blogCont = this.v2DAO.selectOne(blogContSeq);
		//V2DAO.selectOne(blogContSeq); 매개변수를 전달해서 객체 selectOne에 메소드를 호출합니다.
		return blogCont; //데이터베이스에서 검색한 데이터가 포함된 맵을 리턴시킴
	}
	
	//update
	@Override //게시물을 업데이트하고 영향을 받은 행 수를 기준으로 업데이트가 성공했는지 여부를 나타내는 부울값을 반환하는 메서드
	public boolean edit(V2EditRequestVO v2EditRequestVO) {
		//dao를 통한 업데이트
		int affectRowsCount = this.v2DAO.update(v2EditRequestVO);
		return affectRowsCount > 0;
		// 0보다 큰 경우 affectRowsCount 적어도 하나의 행이 성공적으로 업데이트 되었음을 나타냄
		//반대로 0인 경우 = 업데이트가 실패했거나 변경할 필요가 없음을 의미
	}

}
