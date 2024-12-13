package com.spring.ljh.service;

import java.util.Map;

public interface BookService {

   String create(Map<String, Object> map);//create메소드 시그니처

   Map<String, Object> detail(Map<String, Object> map);//read메소드 시그니처

}
