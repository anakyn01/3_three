package intel2023;
/*
 * i=0
a[0]�� a[1] 4�� 7���� �����Ƿ� �ƹ� �ϵ� �Ͼ�� �ʽ��ϴ�
a[0]�� a[2] 4�� 1���� 4�� 1���� ũ�Ƿ� ���� ���� �ٲ۴� {1,7,4,2}
a[0]�� a[3] 1�� 2 1�� 2���� �����Ƿ� �ƹ��ϵ� �Ͼ�� �ʽ��ϴ�
i=1
i=2
j�� i+1���� �����ؼ� �迭 ������ Ž���մϴ�
i=2�϶� �񱳵Ǵ� ����
7�� 4
*/

public class Main2 {
//a�� ������������ �����ϴ� �������� �˰����� ������ ��
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
