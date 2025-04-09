package intel;

public class Test5 {

	public static void main(String[] args) {
int a[][] = new int[3][3];//2차원 배열생성
init(a);//배열을 초기화
data(a);//배열에 값을 입력
print(a);//배열을 출력
	}
	static void init(int a[][]) {
		for(int i=0; i < 3; i++)//행반복
			for(int j=0; j<3; j++)//열반복
				a[i][j]=0;//배열의 모든 값을 0으로 초기화
	}
	static void data(int a[][]) {
		int v=1;//값을 1로 초기화
		for(int i=0; i<3; i++)
			for(int j=1; j<3; j++)
				a[i][j]=v++;
	}
	static void print(int a[][]) {
		for(int i=0; i < 3; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]==0)
					System.out.printf(" ");
				else
					System.out.printf("%d", a[i][j]);
			}
			System.out.println();
		}
	}
	
	//123 45 6
	
	
	
	

}
