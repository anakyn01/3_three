package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMap_7 {
	
	public static void main(String[] args) {
		
//문장 스트림을 단어 스트림으로 변환
List<String> list1 = new ArrayList<>();
list1.add("나는 가수다");
list1.add("난 관중");
list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
System.out.println();

//숫자 목록 숫자스트림으로 변환
List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
list2.stream().flatMapToInt(data -> {String[] strArr = data.split(",");
int[] intArr = new int[strArr.length];
for(int i=0; i < strArr.length; i++) {
	intArr[i] = Integer.parseInt(strArr[i].trim());
}
return Arrays.stream(intArr);
}).forEach(number -> System.out.println(number));
	}

}
/*
flatMapXxx()메소드는 하나의 요소를 복수개의 요소들로 변환한 새로운 스트림을 리턴
A요소는 ,A1,A2요소로 변환하고 B요소를 B1, B2
위에서 문장 스트림 단어스트림으로 변환하고 문자열 숫자 목록 스트림을 숫자스트림
*/
