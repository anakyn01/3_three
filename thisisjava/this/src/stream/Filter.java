package stream;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		// 아래에서 중복된 이름을 제거하고 출력한다
List<String> list = new ArrayList<>();
list.add("홍길동"); list.add("신용재"); list.add("신용재"); list.add("신민철");
list.add("감자");

//1) 중복요소 제거
list.stream().distinct().forEach(n -> System.out.println(n));
System.out.println();

//2) 중복요소를 먼저제거하고 신으로 시작하는 요소만 필터링
list.stream().distinct().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
//startsWith 주어진 문자열로 시작하면 true, 그렇지 않으면 false를 리턴

	}

}
/*
요소 걸러내기(필터링)
- 필터링은 요소를 걸러내는 중간 처리기능이다
- 필터링 메소드에는 distinct()와 filter()메소드가 있습니다
- distict() : 요소의 중복제거
객체 스트림을 경우 equals()메소드의 리턴값이 true이면 동일한 요소로 판단합니다
IntStream, LongStream, DoubleStream과 같은 값을 경우 중복을 제거한다

filter() : 매개값으로 주어진 Predicate가 true를 리턴하는 요소만 필터링 한다

인터페이스          추상메소드                  설명
Predicate<T>     boolean test(T t)         객체 T를 조사
IntPredicate     boolean test(int value)   int값을  조사
LongPredicate    boolean test(long value)  long값을 조사
DoublePredicate  boolean test(double value)double값을 조사




*/
