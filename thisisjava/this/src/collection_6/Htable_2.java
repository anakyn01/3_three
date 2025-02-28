package collection_6;

import java.util.Hashtable;
import java.util.Map;

public class Htable_2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		//������ ����
		Thread threadA = new Thread() {
@Override
public void run() {
//��Ʈ�� 1000�� �߰�
	for(int i=1; i <= 1000; i++) {
map.put(String.valueOf(i), i);
//��ü�� �⺻ ������ Ÿ���� ���� ���ڿ��� ��ȯ�ϴ� �ż��� toString()�޼���� ��������� NullpointException�� 
//�߻���Ű�� �ʰ� null�̶�� ���ڿ��� ����
}}};
		
Thread threadB = new Thread() {
@Override
public void run() {
	for(int i=1001; i <= 2000; i++) {
		map.put(String.valueOf(i), i);		
}}};

//������ ����
threadA.start(); threadB.start();

//�۾� ��������� ��� ����ɶ� ���� ���ν����带 ��ٸ�����
try {
threadA.join();
threadB.join();
}catch(Exception e) {}



//����� �� �Ѱ��� ���
int size = map.size();
System.out.println("�� ��Ʈ���� ��: " +size);
System.out.println();

	}
}
/*
Hashtable
- HashMap�� ������ ������ ������ �ִ�.
- �������� ����ȭ��(synchronized)�޼ҵ�� �����Ǿ� �ֱ� ������
��Ƽ�����尡 ���ÿ� hashtable�޼ҵ���� �����Ҽ� ����
���� ��Ƽ ������ȯ�濡���� �����ϰ� ��ü�� �߰�, �����Ҽ� �ִ�
*/
