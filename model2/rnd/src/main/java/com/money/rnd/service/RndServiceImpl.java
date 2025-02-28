package com.money.rnd.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.rnd.dao.RndDAO;

@Service//비즈니스 로직을 처리하는 계층
public class RndServiceImpl implements RndService{
	
	@Autowired
	RndDAO rndDAO;
	//서비스 클래스는 비즈니스 클래스가 위치하는곳 스프링 MVC구조에서 서비스 클래스는 컨트롤러와 DAO를 연결하는 역활을 한다

	@Override //메서드를 사용하여 데이터베이스에 새 레코드를 만드는 메서드
	public String create(Map<String, Object> map) {//데이터베이스에 삽입된 데이터 키, 값)쌍으로 포함할것을 의미
		int affectRowCount = this.rndDAO.insert(map);
		//데이터베이스에 값을 this.rndDAO.insert(map) 삽입작업을 수행하고 작업의 영향을 받는 행 수를 리턴
		//그결과는 affectRowCount변수에 저장된다
		if(affectRowCount == 1) {//하나의 행이 데이터베이스에 들어갔는지 확인(성공한 경우)
			return map.get("rnd_id").toString();//insert가 성공하면 연관된 값을 리턴
		}
		//실패할 경우
		return null;
	}
	
	//read
	@Override//이 매서드가 슈퍼클래스 또는 인터페이스의 메서드를 오버라이드하고 있음을 컴파일러에 알려줌
	public Map<String, Object> detail (Map<String, Object> map){
		return this.rndDAO.selectDetail(map);
		/*
		selectDetail이줄은 객체에서 메서드를 호출해서 rndDAO[데이터 엑세스]입력을 전달합니다
		서비스는 DAO를 호출한 결과를 바로 리턴하는 일만한다
		*/
	}
	
	//수정은 입력과 다르게 pk를 가져오거나 하는 절차가 필요없다 그저 1개의 행이 제대로 영향을 받았는지 검사한다
	@Override
	public boolean edit(Map<String, Object> map) {
		int affectRowCount = this.rndDAO.update(map);
		return affectRowCount == 1;
	}
	
	//삭제
	@Override
	public boolean remove(Map<String, Object> map) {
		int affectRowCount = this.rndDAO.delete(map);
		return affectRowCount == 1;
	}
	
	
	//list
	@Override
	public List<Map<String, Object>>list(Map<String, Object>map){
		return this.rndDAO.selectList(map);
	}
	
	
	
	
	
	
	
	
	
	
}
