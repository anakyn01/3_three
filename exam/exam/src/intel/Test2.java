package intel;

public class Test2 {
	public static void main(String args[]) {
		int a =0, ss=0;//1씩 증가하는 값을 저장합니다
		while(true) {//무한루프를 의미합니다
			if(ss >100) break;//100보다 커질때 브레이크명령어로 종료
			++a;
			ss += a;
			//매 반복에서 a는 1씩 증가하고 ss는 a의 값을 누적해서 더한다
		}
		System.out.println(a+ss);
	}
}
/*
a = 1
ss = 0+1 =1
a = 2
ss = 1+2 =3
a = 3
ss = 3+3 =6
a = 4
ss = 6+4 =10
a = 5
ss = 10+5 =15
a = 6
ss = 15+6 =21
a = 7
ss = 21+7 =28
a = 8
ss = 28+8 =36
a = 9
ss = 36+9 =45
a = 10
ss = 45+10 =55
11번째 반복:

a = 11

ss = 55 + 11 = 66

12번째 반복:

a = 12

ss = 66 + 12 = 78

13번째 반복:

a = 13

ss = 78 + 13 = 91

14번째 반복:

a = 14

ss = 91 + 14 = 105
 */
