package com.res.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //스프링부트에게 이 클래스가 엔티티클래스임을 선언 JPA ORM(Object Relation Mapping)
//데이터베이스 테이블과 1:1매핑
@Data//롬복에 어노테이션으로 자바빈즈 getter, setter, toString, equals, hashCode를 자동으로 생성
@Builder//객체를 생성할때 빌더패턴으로 생성할수 있게 해줍니다
@NoArgsConstructor
@AllArgsConstructor//클래스의 모든 필드값을 파라미터로 받는 생성자를 자동으로 생성합니다
public class Test {
	
	@Id//데이터 베이스에 행에대한 유일 식별자 pk(primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bbsId;
	
	@Column(length = 200)
	private String title;
	
	@Column(length = 200)
	private String content;
	
	@Column(length = 100)
	private Integer price;
	
	@CreationTimestamp
	private LocalDateTime insertDateTime;
	
	
	
	
	
	
	
	
	
	
	

}