package com.spring.hyi;

import java.util.*;

public class SET {

	public static void main(String[] args) {
		
	Set<String> set = new HashSet<>();
	
	//객체 저장
	set.add("Java");
	set.add("JDBC");
	set.add("JSP");
	set.add("Java");
	set.add("Spring");
	
	int size = set.size();
	System.out.println("총 객체 수: " + size);
		
/*
Set컬렉션 중에서 가장 많이 사용되는 것이 HashSet입니다
Set<E> set = new HashSet<E>();
Set<E> set = new HashSet<>();
Set set = new HashSet(); 모든 타입

문자열을 HashSet에 저장할경우 같은 문자열을 갖는  String 객체는 동등한 객체로 간주한다
같은 문자열이면 hashCode()의 리턴값이 같고 equals()의 리턴값이 true가 나오기 때문이다

객체추가 : boolean add() : 주어진 객체를 성공적으로 저장하면 true를 리턴하고
중복 객체면 false를 리턴

객체검색 : 
boolean contains(Object to) : 주어진 객체가 저장되어 있는지 여부
isEmpty() : 컬렉션이 비어 있는지 조사
Iterator<> iterator() : 저장되어 있는 객체를 한번씩 가져오는 반복자 리턴
int size() : 저장되어 있는 전체 객체수를 리턴

객체삭제 :
void clear() : 저장된 모든 객체를 삭제
boolean remove(Object o) : 주어진 객체를 삭제
*/		
	
	String set2 ="List컬렉션은 저장 순서를 유지하지만, Set컬렉션은 저장 순서가 유지 되지 않는다\n"+
	"또한 객체를 중복해서 저장할수 없고, 하나의 null만 저장할수 있다\n"+
	"수학의 집합에 비유될수 있다\n"+
	"집합은 순서와 상관이 없고 중복이 허용되지 않는다\n"+
	"구슬 주머니와도 같다. 동일한 구술을 두개 넣을수 없고 들어갈때 (저장) 나올때(찾을)때의 순서가 다를수 있기 때문이다\n"+
	"Set컬렉션에는 HashSet, LinkedHashSet, TreeSet등이 있다\n"+
	"인덱스로 관리하지 않기 때문에 인덱스를 매개값으로 갖는 메소드가 없다";
	System.out.println(set2);
	
	
	}

}
