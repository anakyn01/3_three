package exam2024;

//str�� �ߺ����ڸ� �����ϰ� ������ ������ä�� ���� ���ڸ� �������� ����ϴ°�
public class St {
	public static String rf(String str, int index, boolean[] seen) {
		if(index < 0) return "";
//-1�̵Ǹ� ���ڿ��� ���Ͻ��� ��͸� ����
		char c = str.charAt(index);//���ڿ��� Ư�� �ε����� ��ġ�ϴ� �����ڵ� ���Ϲ��ڸ� ����
		//���ڰ� ��� (at) �ִ����� �˷��ִ� �Լ�
//�־��� ���ڿ����� ���� �ε����� �ش��ϴ� ���ڸ� �����ɴϴ�
		String result = rf(str, index-1, seen);//����¡
/* ���� �ε����� �����Ҷ�, �迭�� ������ �ε����� ����Ҷ�*/
//���� �ε������� �ϳ� ���� �ε����� ��� ȣ���Ͽ� ��������� �����´�
		if(!seen[c]) {// 2 2 2 2 2 �ߺ����� ������� ���繮�ڸ� �տ� �߰��ؼ� ����
			seen[c] = true;
			return c + result;
			//�ߺ��� ��� ���� ����� ����
		}
		return result;//��Ȳ�� �°� ����
	}
	

	public static void main(String[] args) {
		String str = "abacabcd"; //abcd
		int length = str.length();//8
		boolean[] seen = new boolean[256];//seen�迭�� ���̰� 256���� ����
		System.out.print(rf(str, length-1, seen));

	}
	
}
