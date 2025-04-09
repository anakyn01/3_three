package intel;

public class Test3 {
//두수 a와b의 최대공약수를 구하는것
	public static void main(String[] args) {
int a=26, b=91, g=0;
int c = a < b ? a:b;//a와 b중 작은값으로 초기화
for (int i=1; i <c; i++) {//i는 1부터 25까지 반복합니다
	if(a%i==0 && b%i==0)
		g=i;
}
System.out.println(g);
//1,13인데 두수의 공약수중에 가장 큰값이 출력됩니다
	}

}
