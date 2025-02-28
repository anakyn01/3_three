package com.spring.hyi.sub;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private static long nextId = 0;//초기화로 0을 가지고 있음
	
	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {//이메일 리턴
		return map.get(email);
	}
	
	public void insert(Member member) {//insert함수가 매개로 맴버클래스를 가져와서 그중에 세터를 가져와
		//순번에 역활을 하는 nextId를 1씩 증가
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
    public void update(Member member) {
        map.put(member.getEmail(), member);
    }
	
	
	
	
	
	
}
