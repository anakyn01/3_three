package base_1;

public class Sys_6 {

	public static void main(String[] args) {
	try {
int value = Integer.parseInt("1oo");//�Ľ� ���ڸ� ������Ʈurl�� ���ڷ� ǥ���ϴ°��� �ƴ϶� ���ڿ�
	//}catch(NumberFormatException e) {
	}catch(Exception e) {
		/*System.err.println("[���� ����]");
		System.err.println(e.getMessage());*/
		e.printStackTrace();
	}
	}
}
/*
�ʵ�
out : �ֿܼ� ���� ���
err : �ֿܼ� ���� ���
in : Ű���� �Է�

�޼ҵ�
exit() : ���μ��� ����
currentTimeMillis() : ���� �ð��� �и��� ������ long������ ����
nanoTime() : ���� �ð��� ������ ������ long������ ����
getProperty() : �ü���� ����� ��������
getenv() : �ü���� ȯ�溯�� ����

JVM : �ڹ����α׷��� �ü���󿡼� �ٷ� ����Ǵ°��� �ƴ϶� �ڹٰ���ӽ�
�׷��� �ü���� ��� ����� �ڹ� �ڵ�� ���� �����ϱ�� �����
java.lang ��Ű���� ���ϴ� SystemŬ������ ����Ѵ�
 SystemŬ����
 - ���α׷� ����
 - Ű���� �Է�
 - �ܼ�(�����)���
 - ���� �ð� �б�
 - �ý��� ������Ƽ �б�
*/
