package exam2024;

public class Str {
	
	static void func(String[] m, int n) {//함수 
		for (int i=1; i <n; i++) {//시작이 1 정해진 길이보다 작을때까지 개별출력
			if(m[i-1].equals(m[i])) {//두 문자열이 같은지를 비교합니다
				System.out.print("O");//같으면  O를 출력
			}else {
				System.out.print("N");//다르면 N을 출력
			}
/*
equals()매서드 
== 연산자는 객체의 참조값(주소)를 비교하지만 equals()는 문자열의 내용을 비교합니다
*/
		}
		for (String mo : m) {//each any 배열M의 문자열을 하나씩 출력합니다
			System.out.print(mo);
		}		
	}
	

	public static void main(String[] hyi) {
		String[] m = new String[3];
		m[0] = "A";//O
		m[1] = "A";//O
		m[2] = new String("A");
		func(m, 3);

	}

}
