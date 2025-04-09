package exam20246;

public class TestCo {
//자바에서 ^비트 XOR(배타적 논리합)연산자를 나타냅니다 
//두숫자에 비트 단위에서 비교를 수행하여 두비트가 다를때만 결과가 1 같을때는 0이 됩니다
//같은 1 ^ 1 = 0  0 ^ 1 = 1
	public static void main(String[] args) {
int a=3, b=4, c=3, d=5;
if((a == 2 | a == c) & !(c>d) & (1==b  | a == b+c)) {
	if(7 == b ^ c != a) {
		System.out.println(a);
	}else {
		System.out.println(b);
	}
}else {
	a = c + d;
	if(7 == c ^ d != a) {
		System.out.println(a);
	}else {
		System.out.println(d);
	}
}
	}

}
