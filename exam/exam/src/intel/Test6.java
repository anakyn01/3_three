package intel;

public class Test6 {

	public static void main(String[] args) {
int[] a = new int[8];
int i =0, n=11; //i는 배열의 인덱스를 추적하기 위해 0으로 초기화 됩니다
while(n>0) {
	a[i++] = n %2;
	n /= 2;
}/*
n을 2로 나누고 그나머지 배열에 저장합니다
이때 n % 2는 현재비트값을 저장하고 n /= 2는 숫자를 반으로 나누어 이진수 변환을 
계속합니다
n = 11 => 11 * 2 = 1
n = 5 => 5 % 2 = 1,
n = 2 => 2 % 2 = 0,
n = 1 => 1 % 2 = 1, 이후 n은 0이되어 푸프가 종료됩니다
11010000
*/
for(i=7; i>=0; i--)
 System.out.printf("%d", a[i]);
	}
//숫자n을 이진수로 변환하고 그이진수를 배열에 저장한후에 배열을 거꾸로 출력합니다
}
