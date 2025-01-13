package com.my.homework.service;

import java.util.Map;

import com.my.homework.dto.HomeEditRequestVO;



public interface HomeService {

	int create(Map<String, Object> map);

	//read 메소드 시그니처
	Map<String, Object> read (int blogContSeq);
	
	//delete 메소드 시그니처
	boolean delete(int blogContSeq);
	
	// edit 메소드 시그니처
	boolean edit(HomeEditRequestVO homeEditRequestVO);


}
