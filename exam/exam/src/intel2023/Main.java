package intel2023;

public class Main {

	public static void main(String[] args) {
int x = 1;
System.out.println(!(x>0));//
System.out.println((x!=0) || (x>0));//
System.out.println(x << 2);
System.out.println(x & 2);
System.out.println(x %= 3);
	}

}
/*
&= (비트 and대입 연산자) :변수에 대해 비트 wise AND연산을 수행한후 결과를 그변수에 대입
int a = 5 0101
a &= 3; 0011

|= (비트 or 대입 연산자) : 변수에 대해 비트 wise OR연산을 수행한후에 결과를 그변수에 대입
^= (비트 or 대입 연산자) : 변수에 대해 비트 wise XOR연사을 수행한후 결과를 결과를 
XOR 연산은 두비트가 다를 때1, 같을때 0이 되는 연산입니다 
>>= (비트 오른쪽 시프트 대입 연산자) : 오른쪽 시프트는 비트를 오른쪽으로 이동시키며
이동한 자리는 부호비트(음수의 경우 1, 양수의 경우 0)로 채워진다
int a = 8; 1000
a >>= 2; 2비트 오른쪽으로 시프트
System.out.println(a) 2(1000 >> 2 = 0010)

<<= (비트 왼쪽 시프트 대입 연산자) : 
변수에 대해 비트 wise왼쪽 시프트 연산을 수행한후 결과를 그변수에 대입합니다
왼쪽 시트프는 비트를 왼쪽으로 이동시키며 이동한 자리는 0으로 채워집니자


13 / 2 = 6 나머지 1
6 / 2 = 3 나머지 0
3 / 2 = 1 나머지 1
1 / 2 = 0 나머지 1






*/
