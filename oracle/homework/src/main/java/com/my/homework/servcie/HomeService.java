package com.my.homework.servcie;

import java.util.*;

import com.my.homework.dto.HomeEditRequestVO;

public interface HomeService {

	int create(Map<String, Object> map);
	
	//read 메소드 시그니처
	Map<String, Object> read (int blogContSeq);
	
	//edit
	boolean edit(HomeEditRequestVO homeEditRequestVO);

	//delete 메소드 시그니처
	boolean delete(int blogContSeq);

	

	
}
