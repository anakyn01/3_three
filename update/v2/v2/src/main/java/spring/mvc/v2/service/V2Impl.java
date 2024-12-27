package spring.mvc.v2.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.v2.dao.V2DAO;

@Service
public class V2Impl implements V2Service {
	
	private V2DAO v2DAO;
	
	@Autowired
	public V2Impl(V2DAO v2DAO) {
		this.v2DAO = v2DAO;
	}
	
	//쓰기
	@Override
	public int create(Map<String, Object>map) {
		int seq = this.v2DAO.insert(map);
		return seq;
	}
	
	//read
	@Override//이매서드가 슈퍼클래스나 인터페이스 매서드를 오버라이드 한다
	//데이터를 검색하여 형태를 리턴하도록 함 ap<String, Object>
	//Map<String, Object> Map키가 a String Object유형은 맵의 값이 어떤 유형이든 될수 있을을 시사한다
	//read(int blogContSeq) 게시물에 대한 식별자
	public Map<String, Object> read(int blogContSeq){
		Map<String, Object> blogCont = this.v2DAO.selectOne(blogContSeq);
		//v2DAO.selectOne(blogContSeq); 매개변수를 전달해서 객체 selectOne에 메소드를 호출합니다
		return blogCont;//데이터 베이스에서 검색한 데이터가 포함된 맵을 리턴합니다
	}
	
	

}
