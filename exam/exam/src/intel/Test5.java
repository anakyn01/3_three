package intel;

public class Test5 {

	public static void main(String[] args) {
int a[][] = new int[3][3];//2���� �迭����
init(a);//�迭�� �ʱ�ȭ
data(a);//�迭�� ���� �Է�
print(a);//�迭�� ���
	}
	static void init(int a[][]) {
		for(int i=0; i < 3; i++)//��ݺ�
			for(int j=0; j<3; j++)//���ݺ�
				a[i][j]=0;//�迭�� ��� ���� 0���� �ʱ�ȭ
	}
	static void data(int a[][]) {
		int v=1;//���� 1�� �ʱ�ȭ
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
