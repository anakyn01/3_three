package intel2023;
/*
 * i=0
a[0]과 a[1] 4와 7보다 작으므로 아무 일도 일어나지 않습니다
a[0]과 a[2] 4와 1보다 4는 1보다 크므로 둘의 값을 바꾼다 {1,7,4,2}
a[0]과 a[3] 1과 2 1은 2보다 작으므로 아무일도 일어나지 않습니다
i=1
i=2
j는 i+1부터 시작해서 배열 끝까지 탐색합니다
i=2일때 비교되는 값은
7과 4
*/

public class Main2 {
//a를 오름차순으로 정렬하는 버블정렬 알고리즘을 구현한 예
	public static void main(String[] args) {
int[] a = {4,7,1,2};
for(int i=0; i<3; i++) {
	for(int j=i+1; j < 4; j++) {
		if(a[i] > a[j]) {
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
	}
}
for(int i=0; i<4; i++) {
	System.out.print(a[i] + "a");
}

	}

}
