package com.spring.ljh.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //해당 클래스가 데이터 접근 계층의 구현체임을 명시
public class BookDao {

   //create
   @Autowired //필요한 의존 객체 타입에 해당하는 빈을 찾아 주입
   SqlSessionTemplate sqlSessionTemplate;
   
   public int insert(Map<String, Object> map) {
      return this.sqlSessionTemplate.insert("book.insert", map);
   }
   
   //read
   /*
   Map<String, Object>는 제너릭을 사용하여 구성된 자료형
   제네릭
   - 데이터 타입을 일반화 한다
   - 데이터의 타입을 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 말함
   - 파라미터 타입이나 리턴타입에 대한 정의를 외부로 미룬다
   - 컴파일 시에 미리 지정하는 방법으로 타입검사를 해버리면 객체타입의 안정성을 높일수 있고
   - 반환값에 대한 타입 변환 검사에 들어가는 노력을 줄일수 있습니다
   
   selectOne
   - 데이터를 하나만 가져올때 사용한다
   - 만약 쿼리 결과 행수가 0이면 selectOne메소드는 null을 리턴
   - 쿼리결과가 여러개 이면 TooManyResultException예외를 던진다
   */
   public Map<String, Object> selectDetail (Map<String, Object> map){
      return this.sqlSessionTemplate.selectOne("book.select_detail", map);
   }
   
   
   
   
   
   
   
   
   
}
