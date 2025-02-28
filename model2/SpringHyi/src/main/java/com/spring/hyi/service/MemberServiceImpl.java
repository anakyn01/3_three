package com.spring.hyi.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hyi.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public String join(Map<String, Object> map) {
	    int affectRowCount = this.memberDAO.join(map);
	    if (affectRowCount ==  1) {
	        return map.get("userId").toString();
	    }
	    return null;

	}
	
}
