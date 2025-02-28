package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Mapping_6 {

	public static void main(String[] args) {
		
int[] intArray = {1,2,3,4,5};

IntStream intStream = Arrays.stream(intArray);
intStream.asDoubleStream().forEach(d -> System.out.println(d));
/*
정수 1,2,3 를 실수로 
*/
//boxed()=> 원시를 래퍼클래스 
intStream = Arrays.stream(intArray);
intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
		
		
//스트림의 요소를 다른 요소로 변환하는 중간 처리기능
//메핑메소드는 mapXxx(), asDoubleStream(), asLongStream,..등등
List<St> studentList = new ArrayList<>();
studentList.add(new St("나", 0));
studentList.add(new St("너", 100));
studentList.add(new St("님들", 20));

//st에 score를 스트림으로 변환
studentList.stream().mapToInt(s -> s.getScore()).forEach(score -> System.out.println(score));
	}

}
