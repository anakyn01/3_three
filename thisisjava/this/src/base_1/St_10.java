package base_1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class St_10 {

	public static void main(String[] args) throws Exception {
String data3 = "������&�ռ���,��ȣ��";
String[] arr = data3.split("&|,");
for(String token: arr) {
	System.out.println(token);
}

String data4 = "������/�ռ���/��ȣ��";
StringTokenizer st = new StringTokenizer(data4, "/");
while (st.hasMoreTokens()) {
	String token1 =st.nextToken();
	System.out.println(token1);
}
		
		String data2 = new StringBuilder().append(" �̹Ǵϴ�").insert(0, "�ڹ�").delete(3,4).toString();
System.out.println(data2);


		
		
String data = "�ڹ�";

//byte�迭 UTF-8
byte[] arr1 = data.getBytes();
System.out.println("arr1: " + Arrays.toString(arr1));

//���ڵ�
String str1 = new String(arr1);
System.out.println("str1: " + str1);

//byte�迭 EUC-KR
byte[] arr2 = data.getBytes("EUC-KR");
System.out.println("arr2: " + Arrays.toString(arr2));

//���ڵ� EUC-KR
String str2 = new String(arr2, "EUC-KR");
System.out.println("str2: " + str2);

	}

}
/*
���ڿ� Ŭ����
StringBuilder : ȿ������ ���ڿ� ���� ����� �ʿ��Ҷ� ���
String�� ���� ���ڿ��� �����Ҽ� ���� ABC ABCDEF
������ ABC�� ������ �÷��ͷ� ������
ABCDEF��� ���ο� ��ü�� ������ �׷��� ȿ���� ����
���� ���ڿ� ������ �ȴٸ�
String���� StringBuilder�� ����ϴ� ���� ����
.append() : ���ڿ��� ���� �߰�
.insert() : ������ġ�� �߰�
.delete() : �Ϻλ���
.replace() : �Ϻ� ��ü
.toString() : �ϼ��� ���ڿ��� ����


String : ���ڿ��� ���� �����Ҷ� ���
���ڿ� ���ͷ�(literal[Ư�� ���� ���������� ǥ���ϴ� ǥ���) �� �ڵ����� String��ü�� ����������
1.���� ���ͷ� 10, 3.14
2,���� ���ͷ� 'A'
3.���ڿ� ���ͷ� : "hello word"
4.�迭 ���ͷ� [1,2,3]
5.��ü ���ͷ� {key: 'value'} 
StringŬ������ �پ��� �����ڸ� �̿��ؼ� ���� ��ü�� �����Ҽ��� �ִ�
���α׷��� �����ϴ� ���� byte�迭�� ���ڿ��� ��ȯ�ϴ� ��찡 �����ִ�
��) ��Ʈ��ũ ������� ���� byte�迭�� ���� ���ڿ��� ��ȯ�ϴ� ���
�̶��� String �����ڷ� String��ü�� �����Ѵ�

�⺻ ���ڼ����� byte�迭�� ���ڵ��ؼ� String��ü�� ����
���ڵ� (����� �д� �����͸� ��ǻ�Ͱ� �����Ҽ� �ִ� ����)
���ڵ� (����� ���� �Ҽ� �ִ� ���·� ..)

String str = new String(byte[] bytes);

Ư�� ���ڼ����� byte�迭�� ���ڵ��ؼ� String��ü�� ����
String str = new String(byte[] bytes, String CharsetName);



StringTokenizer : �����ڷ� ����� ���ڿ��� �и��Ҷ� ���
*/
