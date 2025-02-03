package collection_6;

import java.util.Hashtable;
import java.util.Map;

public class Htable_2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		//스레드 생성
		Thread threadA = new Thread() {
@Override
public void run() {
//엔트리 1000개 추가
	for(int i=1; i <= 1000; i++) {
map.put(String.valueOf(i), i);
//객체나 기본 데이터 타입의 값을 문자열로 변환하는 매서드 toString()메서드와 비슷하지만 NullpointException을 
//발생시키지 않고 null이라는 문자열을 리턴
}}};
		
Thread threadB = new Thread() {
@Override
public void run() {
	for(int i=1001; i <= 2000; i++) {
		map.put(String.valueOf(i), i);		
}}};

//스레드 실행
threadA.start(); threadB.start();

//작업 스레드들이 모두 종료될때 까지 메인스레드를 기다리게함
try {
threadA.join();
threadB.join();
}catch(Exception e) {}



//저장된 값 총갯수 얻기
int size = map.size();
System.out.println("총 엔트리의 수: " +size);
System.out.println();

	}
}
/*
Hashtable
- HashMap과 동일한 구조를 가지고 있다.
- 차이점은 동기화된(synchronized)메소드로 구성되어 있기 때문에
멀티스레드가 동시에 hashtable메소드들을 실행할수 없다
따라서 멀티 스레드환경에서도 안전하게 객체를 추가, 삭제할수 있다
*/
