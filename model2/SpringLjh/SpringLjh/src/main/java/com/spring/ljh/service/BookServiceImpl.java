package com.spring.ljh.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ljh.dao.BookDao;

//서비스 클래스는 비즈니스 클래스가 위치한곳 스프링 mvc에서 서비스 클래스는 컨트롤러와 DAO를 연결하는 역활을 한다

@Service//클라이언트의 요청에 대한 비즈니스 로직을 수행하는 컴포넌트
public class BookServiceImpl implements BookService {

   @Autowired
   BookDao bookDao;
   
   //오버로딩 오버라이드는 클래스를 재정의 
   @Override //상위 인터페이스에서 정의된것을 재정의 한다는 것 이클립스에서는 상위 인터페이스에 메소드 
   //시그니처가 없을 경우 자동으로 시그니처를 만들어 주는 기능이 있다
   //affectRowCount는 한개에 행이 제대로 실행되는지 아닌지를 검사
   public String create(Map<String, Object> map) {
      int affectRowCount = this.bookDao.insert(map);
      if(affectRowCount == 1) {
         return map.get("book_id").toString();
      }
      return null;
   }
   
   @Override
   public Map<String, Object> detail( Map<String, Object> map){
      return this.bookDao.selectDetail(map);
   }
   
   
   
   
   
   
   
}
