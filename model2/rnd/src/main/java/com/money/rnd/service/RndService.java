package com.money.rnd.service;

import java.util.List;
import java.util.Map;

public interface RndService {

	String create(Map<String, Object> map);//create시그니처

	Map<String, Object> detail(Map<String, Object> map);//read에 시그니처

	boolean edit(Map<String, Object> map);//update 시그니처

	boolean remove(Map<String, Object> map);//delete시그니처

	List<Map<String, Object>> list(Map<String, Object> map);

}
