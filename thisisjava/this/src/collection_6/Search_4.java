package collection_6;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Search_4 {

	public static void main(String[] args) {
		// 검색기능을 강화시킨 컬렉션
TreeSet<Integer> scores = new TreeSet<>(); //sort

//integer 객체저장
scores.add(87); scores.add(98); scores.add(75); scores.add(95);
scores.add(80);

//정렬된 객체를 하나씩 가져오기
for(Integer s: scores) {
	System.out.print(s + " ");
}
System.out.println("\n");

//특정 값을 검색하기
System.out.println(" 가장 낮은 점수 : " + scores.first());
System.out.println(" 가장 높은 점수 : " + scores.last());
System.out.println(" 95점 보다 아래 점수 : " + scores.lower(95));
System.out.println(" 95점 보다 위에 점수 : " + scores.higher(95));
System.out.println(" 95점이거나 바로 아래 점수 : " + scores.floor(95));
System.out.println(" 85점이거나 바로 위의 점수 : " + scores.ceiling(85));

scores.add(73);

//일반적인 게시판에 내림차순 그런데 클라이언트의 요구사항 리스트에서 버튼을 클릭할때 오름 차순으로 정렬
//내림차순
NavigableSet<Integer> descendingScores = scores.descendingSet();
for(Integer s: descendingScores) {
System.out.println(s);	
}

/*
TreeSet[이진트리 binary tree]과 TreeMap
이진 트리는 여러개의 노드 node{element, child}가 트리형태로 연결된 구조로 
하나의 노드에서 시작해서 각 노드에 최대 2개의 노드를 연결할수 있는 구조를 가지고 있다

TreeSet에 객체를 저장하면
부모노드의 객체와 비교해서 낮은것은 왼쪽 자식노드 
높은것은 오른쪽 자식 노드에 저장한다

리턴타입 E first() : 제일 낮은 객체를 리턴
리턴타입 E last() : 제일 높은 객체를 리턴
리턴타입 E lower(E e) : 주어진 객체보다 바로 아래를 리턴
리턴타입 E higher(E e) : 주어진 객체보다 바로 위를 리턴
리턴타입 E floor(E e) : 동등한 객체가 있으면 리턴 만약 없다면 주어진 객체의 바로 아래 객체를 리턴
리턴타입 E ceiling(E e) : 동등한 객체가 있으면 리턴 만약 없다면 주어진 객체의 바로 위 객체를 리턴
리턴타입 E pollFirst() : 제일 낮은 객체를 꺼내오고 컬렉션에 제거
리턴타입 E pollLast() : 제일 높은 객체를 꺼내오고 컬렉션에 제거
Iterator<E> desecendingIterator() : 내림차순으로 정렬된 Iterator를 리턴
NavigableSet<E> desecendingSet() : 내림차순으로 정렬된 
NavigableSet(SortedSet을 확장[기본적으로 정렬된 집합(set)를 
제공하는데 집합특성과 더불어 특정요소를앞이나 뒤로 이동하는 기능])을 리턴










*/		

	}

}
