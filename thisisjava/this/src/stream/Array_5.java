package stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_5 {

	public static int sum;        
	
	public static void main(String[] args) throws Exception{
	Path path = Paths.get(Array_5.class.getResource("data.txt").toURI());
	Stream<String> stream = Files.lines(path, Charset.defaultCharset());
	stream.forEach(line -> System.out.println(line));
	stream.close();
		
		IntStream plus = IntStream.rangeClosed(1, 100);
		plus.forEach(a -> sum += a);
		System.out.println("총합 " + sum);
/*
숫자범위로 스트림 얻기
IntStream또는  LongStream의 정적 메소드인 
range()와 rangeClosed()메소드를 이용하면 특정 범위에 정수스트림을 얻는다
첫번째 매개값은 시작수, 두번째 매개값은 끝수..
끝수를 포함하지 않으면 range()
포함하지 않으면 rangeClosed()를 사용합니다
(int , int)
*/		
		
		
		
		
		
		// 배열로 부터 스트림 얻기
String[] strArray = {"홍","길","동"};
Stream<String> strStream = Arrays.stream(strArray);
strStream.forEach(allprint -> System.out.print(allprint + " ,"));
System.out.println();

int[] intArray = {1,2,3,4,5};
IntStream intStream = Arrays.stream(intArray);
intStream.forEach(n -> System.out.print(n + ","));
System.out.println();
	}

}
