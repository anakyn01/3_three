package com.spring.hyi;

import java.util.ArrayList;
import java.util.List;

import com.spring.hyi.sub.Board;

public class Collection {

	public static void main(String[] args) {
		
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		//객체에 내용추가
		list.add(new Board("제목1", "내용 1", "글쓴이1"));
		list.add(new Board("제목2", "내용 2", "글쓴이2"));
		list.add(new Board("제목3", "내용 3", "글쓴이3"));
		list.add(new Board("제목4", "내용 4", "글쓴이4"));
		list.add(new Board("제목5", "내용 5", "글쓴이5"));
		
		//저장된 총 객체 수를 얻음
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println(); //여백 출력
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();
		
		//모든 객체를 하나씩 가져오기
		for(int i=0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		}
		System.out.println();
		
		//객체 삭제 2번 인덱스를 삭제하면 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 제거 할수 잇음
		list.remove(2);
		list.remove(2);
		
		//삭제한 리스트 다시 출력해보기
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		}
/*
ArrayList
컬렉션에서 가장 많이 사용하는 컬렉션 
객체를 추가하면 내부 배열에 객체가 저장된다
일반 배열과의 차이점은 ArrayList는 제한없이 객체를 추가할수 있다
list컬렉션은 객체 차제를 저장하는 것이 아니라 객체의 번지를 저장한다
동일한 객체를 중복저장할수 있는데 이경우에는 동일한 번지가 저장된다
null또한 저장이 가능하다

ArrayList컬렉션은 아래와 같이 생성할수 있다
List<E> list = new ArrayList<E>(); E에 지정된 타입의 객체만 저장
List<E> list = new ArrayList<>(); E에 지정된 타입의 객체만 저장 앞에서 선언하면 뒤에서 생략할수 있음

List list = new ArrayList(); 모든 타입의 객체를 저장

ArrayList컬렉션에 객체를 추가하면 인덱스 0번부터 차례대로 저장된다
특정 인덱스의 객체를 제거하면 앞으로 당겨지고 특정인덱스 객체를 삽입하면 1씩 밀려난다 

따라서 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList를 사용하는건 바람직하지 않다
그래서 나온것이 롬복에 빌더패턴 대신에 이런경우라면 LinkedList를 사용하는 것이 좋다

List컬렉션
- 객체를 인덱스로 관리하기 때문에 객체를 저장하면 인덱스가  부여되고 인덱스로 객체를  검색, 
삭제 할수 있는 기능을 제공

객체추가 : boolean add[주어진 객체를 맨 끝에 추가], 
void add[주어진 인덱스에 객체를 추가], 
set[주어진 인덱스의 객체를 새로운 객체로 바꿈]

객체검색 : boolean contains[주어진 객체가 저장되어 있는지 여부를 확인], 
get[주어진 인덱스에 저장된 객체를 리턴], 
isEmpty[컬렉션이 비어 있는지 조사], 
int size[저장 되어 있는 전체 객체수를 리턴]

객체삭제 :
 void clear[저장된 모든 객체를 삭제], 
 remove[주어진 인덱스에 저장된 객체를 삭제], 
 boolean remove[주어진 객체를 삭제]
*/		

		
String collection = "자바는 널리 알려져 있는 자료구조 객체들을 효율적으로 추가, 삭제, 검색\n"+
"할수 있도록 관련된 인터페이스와 크래스들을 java.util패키지에 포함 시켜 놓았다\n"+
"이를 통틀어 컬렉션 프레임 워크라 한다\n"+
"컬렉션 프레임 워크는 몇 가지 인터페이스를 통해서 다양한 클래스를 이용할수 있도록  설계 되어 있다\n"+
"주요 인터페이스로 는 List, Set, Map 있다\n"+
"1) List = ArrayList, Vector, LinkedList [순서를 유지하고 저장, 중복 저장 가능]\n"+
"2) Set = HashSet, TreeSet [순서를 유지하지 않음, 중복저장을 허용하지 않음]\n"+
"3) Map = HashMap, Hashtable, TreeMap, Properties[키와 값으로 구성된 엔트리, 키는 중복 저장 안됨]";
	}

}
