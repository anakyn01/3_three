package base_1;

public class ToStringEx_3 {

	public static void main(String[] args) {
	
    //��ü�� ������ insert
	SmartPhone mySamsung = new SmartPhone("�Ｚ����", "�ȵ���̵�");	
	SmartPhone myApple = new SmartPhone("����", "ios");	
	
	//�ٸ������� ��ü�� �����Ͽ� toString
	String strObj = myApple.toString();
	System.out.println(strObj);
	
	System.out.println(mySamsung);
// Object�� toString()�޼ҵ�� ��ü�� ���������� �����Ѵ� ��ü�� ���������� ��ü�� ���ڿ��� ǥ���Ѱ�
// �⺻������ Object�� toString()�޼ҵ�� 'Ŭ������@16�����ؽ��ڵ�� ������ ���ڿ��� �����Ѵ�
// ���� ��� DateŬ������ ���� ��¥�� �ð��� , StringŬ������ ����� ���ڿ��� �����ϵ���
// toString()�޼ҵ带 �������ϰ� �ִ�

	}

}
