public class Var_2 {
    
    public static void main(String[] hyi){
      int New; //어떤개발에서도 예약어는 사용하면 안됨
      //변수명을 만들때는 카멜케이스 또는 스네이크케이스
      String NewWord = "카멜케이스는 대문자와 소문자를 섞어서 사용";
      String Sneack_case_ggg = "언더바를 사용";
      New = 20;
      int myNum = 15;
      String name = "hwang";
      float myFloatNum = 5.99f;
      char myLetter = 'D';

      System.out.println(name);
      System.out.println(myLetter);

      //다중 변수 자바변수는 자바스크립트와 마찬가지로(let const)재선언 재할당 금지
      int x = 5; int y = 6; int z = 50;
      System.out.println(x + y + z);

      //똑같은 값은 변수명을 다르게 써서 사용할수 있음
      int q,w,e;
      q = w = e = 50;
      System.out.println(q+w+e);
    }
}
/*
변수는 데이터값을 저장하는 컨테이너
자바에 변수는 타입을 가진다
String : "Hell0"와 같은 텍스트를 말함
int : 소수점 없이 123이거나 -123과 같은 정수를 리턴
float : -19.99 또는 19.99
char : 'a' 'B'와 같은 단일 문자
boolean : 참 또는 거짓

원시값 : 더이상 단순화 될수 없는 값
 */