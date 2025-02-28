package base_1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class St_10 {

	public static void main(String[] args) throws Exception {
String data3 = "김정현&손성현,김호준";
String[] arr = data3.split("&|,");
for(String token: arr) {
	System.out.println(token);
}

String data4 = "김정현/손성현/김호준";
StringTokenizer st = new StringTokenizer(data4, "/");
while (st.hasMoreTokens()) {
	String token1 =st.nextToken();
	System.out.println(token1);
}
		
		String data2 = new StringBuilder().append(" 이므니다").insert(0, "자바").delete(3,4).toString();
System.out.println(data2);


		
		
String data = "자바";

//byte배열 UTF-8
byte[] arr1 = data.getBytes();
System.out.println("arr1: " + Arrays.toString(arr1));

//디코딩
String str1 = new String(arr1);
System.out.println("str1: " + str1);

//byte배열 EUC-KR
byte[] arr2 = data.getBytes("EUC-KR");
System.out.println("arr2: " + Arrays.toString(arr2));

//디코딩 EUC-KR
String str2 = new String(arr2, "EUC-KR");
System.out.println("str2: " + str2);

	}

}
/*
문자열 클래스
StringBuilder : 효율적인 문자열 조작 기능이 필요할때 사용
String은 내부 문자열을 수정할수 없다 ABC ABCDEF
기존에 ABC를 가비지 컬렉터로 보내고
ABCDEF라는 새로운 개체를 생성함 그래서 효율성 제로
잦은 문자열 변경이 된다면
String보다 StringBuilder를 사용하는 것이 좋다
.append() : 문자열에 끝에 추가
.insert() : 지정위치에 추가
.delete() : 일부삭제
.replace() : 일부 대체
.toString() : 완성된 문자열을 리턴


String : 문자열을 저장 조작할때 사용
문자열 리터럴(literal[특정 값을 직접적으로 표현하는 표기법) 은 자동으로 String객체로 생성되지만
1.숫자 리터럴 10, 3.14
2,문자 리터럴 'A'
3.문자열 리터럴 : "hello word"
4.배열 리터럴 [1,2,3]
5.객체 리터럴 {key: 'value'} 
String클래스의 다양한 생성자를 이용해서 직접 객체를 생성할수도 있다
프로그램을 개발하다 보면 byte배열을 문자열로 변환하는 경우가 종종있다
예) 네트워크 통신으로 얻은 byte배열을 원래 문자열로 변환하는 경우
이때는 String 생성자로 String객체를 생성한다

기본 문자셋으로 byte배열을 디코딩해서 String객체로 생성
인코딩 (사람이 읽는 데이터를 컴퓨터가 이해할수 있는 형식)
디코딩 (사람이 이해 할수 있는 형태로 ..)

String str = new String(byte[] bytes);

특정 문자셋으로 byte배열을 디코딩해서 String객체로 생성
String str = new String(byte[] bytes, String CharsetName);



StringTokenizer : 구분자로 연결된 문자열을 분리할때 사용
*/
