package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Paralle_2 {
/*
스레드
- 프로그램 내에서 실행되는 독립적인 작업 단위
- 멀티스레딩을 지원하여 여러스레드가 동시에 실행될수 있도록 하며 하나의 여러작업을 병렬로 처리할수 있게해준다
- 스레드를 만드는법 스레드 클래스 상속, Runnabel 인터페이스, 동기화 등..
*/
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("홍");//홍을 처리하는 스레드 명칭
		list.add("길");
		list.add("동");
		//병렬처리
		Stream<String> paralleStream = list.parallelStream();//병렬스트림 얻기
		paralleStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});

	}

}
