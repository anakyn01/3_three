package school.test.homework.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.test.homework.dao.HomeDAO;

@Service
public class HomeImpl implements HomeService{
	
	@Autowired
	HomeDAO homeDAO;
	
	@Override
	public String create(Map<String, Object> map) {
		int affectRowCount = this.homeDAO.insert(map);
		if(affectRowCount == 1) {
			return map.get("bno").toString();
		}
		return null;
	}
	
	//read
	@Override
	public Map<String, Object> detail(Map<String, Object> map){
		return this.homeDAO.selectDetail(map);
	}
	//서비스는 DAO를 호출한 결과를 바로 리턴하는 일만 한다.
	
	
	
	
	
	
	

}
