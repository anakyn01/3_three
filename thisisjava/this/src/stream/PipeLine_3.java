package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PipeLine_3 {//asList 어레이클래스의 일부이며 배열을 목록으로 변환하는데 사용합니다
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("김정현", 90),
			new Student("손성현", 95),
			new Student("동수", 55)
		);
		
		/* 방법 1
		Stream<Student> studentStream = list.stream();
		//중간처리 (학생 객체를 점수로 매핑)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		//mapToInt() 객체를 int값으로 매핑하여 IntStream으로 변환합니다
		//Student 객체를 getScore()메소드의 리턴값으로 매핑
		//최종처리(평균점수)
		double avg = scoreStream.average().getAsDouble();*/
		
		//방법 2 메소드 체이닝을 사용하면 좀더 간략하게 코드를 작성할수 있다
double avg = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
//스트림 파이프라인으로 구성할때 주의점은 파이프라인에 맨끝에 최종처리부분이 있어야 한다 그것이 없다면 중간처리스트림이 동작하지 않는다
//$("#p1").css("color", "red").slideUp(2000).slideDown(2000);
		
		
		System.out.println("평균 점수 : " + avg + "동수가 평균을 ㅠㅠㅠㅠㅠ");
		
	}

}
