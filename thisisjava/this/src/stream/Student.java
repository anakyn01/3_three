package stream;

public class Student {

	private String name;
	private int score;
	
	//생성자
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
}
/*
- 중간 처리와 최종처리 -
스트림은 하나 이상 연결될수 있다 이를 스트림 파이프라인 이라고 한다
예)
컬렉션,배열 중간처리(오리지널 스트림, 필터링 중간 스트림, 매핑 중간 스트림) 최종처리(집계처리)결과
오리지널 스트림과 집계처리 중간 스트림들은 최종처리를 위해서 요소를 걸러내거나(필터링) 요소를 변환시키거나 (매핑)

최종처리는 중간처리에서 정제된 요소들을 반복하거나 집계(카운팅, 총합, 평균)작업을 수행한다

Student 객체를 요소로 가지는 컬렉션에서 Student스트림을 얻고
중간처리를 통해서 score스트림으로 변환한후 

최종 집계처리로  score평균을 구하는 과정을 나타냅니다

주의사항은 마지막에 최종처리를 해야한다
*/
