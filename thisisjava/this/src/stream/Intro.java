package stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Intro {

	public static void main(String[] args) {
	
//Set 컬렉션
	Set<String> set = new HashSet<>();
	set.add("one");
	set.add("tw");
	set.add("t");
	
	//Stream을 이용한 요소 반복처리
	Stream<String> stream = set.stream(); //스트림 얻기
	stream.forEach(nums -> System.out.println(nums));
	//foreach와 람다로 출력처리
/*
직렬처리(Sequential Processing) 작업을 순차적으로 하나씩 처리하는 방법 하나의 작업이 완료되어야지만 처리되는 방법
병럴처리(Parallel Processing) 여러작업을 동시에 처리합니다 작업을 여러개의 스레드로 나누어 동시에 실행됩니다

내부 반복자 : 반면 스트림은 요소처리 방법을 컬렉션 내부로 주입시켜 요소를 반복처리 전달하여 처리만 합니다
멀티코어 CPU를 최대한 활용하기 위해서 요소들을 분배시켜 병렬작업을 할수 있다

외부 반복자 : for문과 Iterator는 컬렉션의 요소를 컬렉션 바깥쪽에서 가져와 처리 주고 받는게 됨
효율적으로 요소를 반복시킬수 있는 장점이 있다
*/
String stm = "Java8 부터 추가된 기술로 람다를 활용해 배열과 컬렉션을 간단하게 처리할수 있는 함수형"
+ "스트림이라는 용어에 정의는 데이터의 흐름 을 의미하고 여러개를 조합하여 원하는 결과를 필터링하고 가공된"
+ "결과를 얻습니다"
+ "스트림은 요소들이 하나씩 흘러가면서 처리된다는 의미를 가지고 있습니다"
+ "List<String> list = ...; for(int i=0; i <list.size(); i++){}"
+ "Stream<String> stream = list.stream();"
+ "stream.forEach( item ->);"
+ "이런 흐름입니다"
+ "stream은 iterator와 비슷한 반복자이지만 아래와 같은 차이점을 가지고 있습니다"
+ "1) 내부 반복자이므로 처리속도가 빠르고 병렬처리에 효율적이다"
+ "2) 람다식으로 다양한 요소 처리를 할수 있다"
+ "3) 중간처리와 최종처리를 수행하도록 파이프라인을 형성할수 있다";

	}

}
