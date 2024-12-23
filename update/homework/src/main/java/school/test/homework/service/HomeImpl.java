package school.test.homework.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.test.homework.dao.HomeDAO;

@Service 
public class HomeImpl implements HomeService {

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
}
