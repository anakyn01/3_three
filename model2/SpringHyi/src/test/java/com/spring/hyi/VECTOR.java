package com.spring.hyi;

import java.util.List;
import java.util.Vector;

import com.spring.hyi.sub.Board;

public class VECTOR{

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();//벡터 컬렉션 생성
		//List<Board> list = new ArrayList<>();
/*어레이 리스트는 두 스레드가 동시에 add()메소드를 호출할수 있기 때문에 경합이 발생하여 결국은 
 * 정확한 연산이 되지 않는다*/		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1; i<=1000; i++) {
	list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));				
				}
			}
		};
		
		//작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1001; i<=2000; i++) {
	list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));				
				}
			}
		};
		
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될때 까지 메인 스레드를 기다리게 함
		try {
		threadA.join();
		threadB.join();
		}catch(Exception e) {			
		}
		
		
		//저장된 총 객체수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		
		
		/*VECTOR thread = new VECTOR();//1)객체로 만듬
		//실행
		thread.start();
		System.out.println("이코드는 스레드 외부에서");
		
		String vector = "arraylist와 동일한 내부 구조를 가지고 있다\n"+
				"다른점은 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에\n "+
			"Vector()메소드를 실행할수 없습니다\n"+
			"그렇기 때문에 멀티스레드 환경에서 안전하게 객체를 추가 또는 삭제할수 있다\n";
		String thread2 = "스레드를 만드는 방법은 두가지가 있습니다 Thead클래스로 확장하고 해당 메서드를 재정의 한다";
		System.out.println(vector);
		System.out.println(thread2);
	}
	public void run() {
		System.out.println("이코드는 스레드로 실행 합니다");
	}*/
	}
}
