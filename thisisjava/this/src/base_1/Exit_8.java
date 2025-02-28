package base_1;

public class Exit_8 {

public static void main(String[] args) {
long time1 = System.nanoTime();
int sum = 0;
for (int w =1; w <= 1000000; w++) {
	sum += w;
}
long time2 = System.nanoTime();
System.out.println("1 ~부터 1000000까지의 합: " + sum);
System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다");

//진행시간 읽기 system 클래스의 currentTimeMillis(), nanoTime() 메소드는 1970년 1월 1일 0시부터 시작해서 현재까지 진행된 시간을 리턴한다
//long currentTimeMillis 1/1000 초 단위로 진행된 시간을 리턴
//long nanoTime() 1/10 9 초 단위로 진행된 시간을 리턴
//프로그램처리 시간을 측정한다
		
		//i가 5일때 종료한다
for(int q=0; q<10; q++) {
	//q값 줄력
	System.out.println(q);
	if (q == 5) {
		System.out.println("프로세스 강제 종료");
		System.exit(0);
	}
}
		
/*운영체제는 실해중인 프로그램을 프로세스로 관리한다
자바를 실행하면 JVM프로세스가 생성되고 
이프로세스가 main()메소드를 호출한다
만약 프로세스를 강제 종료하고 싶으면 exit(int status)메소드를 사용한다
int status종료 상태값
정상종료일 경우 0,비정상 종료는 1,또는 -1로 주는것이 관례이다

그런데 자바17부터 더이상 사용되지 않음
*/

	}

}
