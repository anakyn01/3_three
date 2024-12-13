package com.spring.hyi.service;

import java.util.List;
import java.util.Map;

public interface BookService {

	String create(Map<String, Object> map);//create메소드 시그니처

	Map<String, Object> detail(Map<String, Object> map);//read메소드 시그니처

	boolean edit(Map<String, Object> map);//update 메소드 시그니처

	boolean remove(Map<String, Object> map);

	List<Map<String, Object>> list(Map<String, Object> map);//list 시그니처



}
