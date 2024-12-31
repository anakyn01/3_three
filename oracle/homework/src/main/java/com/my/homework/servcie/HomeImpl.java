package com.my.homework.servcie;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.homework.dao.HomeDAO;

@Service
public class HomeImpl implements HomeService{

	private HomeDAO homeDAO;
	
	@Autowired
	public HomeImpl(HomeDAO homeDAO) {
		this.homeDAO = homeDAO;
	}

	@Override
	public int create(Map<String, Object> map) {
		int seq = this.homeDAO.insert(map);
		return seq;
	}

}