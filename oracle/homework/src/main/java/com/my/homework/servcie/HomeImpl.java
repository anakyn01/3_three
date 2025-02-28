package com.my.homework.servcie;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.homework.dao.HomeDAO;
import com.my.homework.dto.HomeEditRequestVO;
import com.my.homework.dto.HomeListRequestVO;
import com.my.homework.dto.HomeListResponseVO;
import com.my.homework.mapper.BlogMapper;

@Service
public class HomeImpl implements HomeService{

	private HomeDAO homeDAO;
	private BlogMapper blogMapper;
	
	@Autowired
	public HomeImpl(HomeDAO homeDAO, BlogMapper blogMapper) {
		this.homeDAO = homeDAO;
		this.blogMapper = blogMapper;
	}

	@Override
	public int create(Map<String, Object> map) {
		int seq = this.homeDAO.insert(map);
		return seq;
	}
	


	@Override //read
	public Map<String, Object> read(int blogContSeq) {
		Map<String, Object> blogCont = this.homeDAO.selectOne(blogContSeq);
		return blogCont;
	}
	
	//edit 항목을 업데이트하고 업데이트가 성공했는지 여부에 따라 부울값을 리턴하는 메서드
	@Override
	public boolean edit(HomeEditRequestVO homeEditRequestVO) {
		int affectRowsCount = this.homeDAO.update(homeEditRequestVO);
		//데이터베이스에서 업데이트 작업을 수행하기 위해 호출합니다
		//update메서드는 업데이트 쿼리의 영향을 받는 행수를 나타내는 정수를 반환하는 것으로 가정합니다
		return affectRowsCount > 0;
	}
	
	@Override 
	//list 해당 메서드가 슈퍼클래스의 매서드를 재정의하거나 인터페이스의 추상 메서드를 구현한다는 것을 나타냅니다
	public List<HomeListResponseVO> list(HomeListRequestVO homeListRequestVO){//메서드에 서명
		//List<HomeListResponseVO> 응답형식을 나타내는 객체목록
		//list 메서드 이름
		//HomeListRequestVO homeListRequestVO 인수
		List<HomeListResponseVO> result = this.blogMapper.selectList(homeListRequestVO);
		//결과라는 변수는 셀렉트리스트를 호출하고 
		return result;
		//호출자에게 리턴
	}
	
	@Override//delete
	public boolean delete(int blogContSeq) {
		return this.blogMapper.delete(blogContSeq) > 0;
	}
	
	
	
	
	
	
	
	

}