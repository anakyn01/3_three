package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PipeLine_3 {//asList ���Ŭ������ �Ϻ��̸� �迭�� ������� ��ȯ�ϴµ� ����մϴ�
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("������", 90),
			new Student("�ռ���", 95),
			new Student("����", 55)
		);
		
		/* ��� 1
		Stream<Student> studentStream = list.stream();
		//�߰�ó�� (�л� ��ü�� ������ ����)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		//mapToInt() ��ü�� int������ �����Ͽ� IntStream���� ��ȯ�մϴ�
		//Student ��ü�� getScore()�޼ҵ��� ���ϰ����� ����
		//����ó��(�������)
		double avg = scoreStream.average().getAsDouble();*/
		
		//��� 2 �޼ҵ� ü�̴��� ����ϸ� ���� �����ϰ� �ڵ带 �ۼ��Ҽ� �ִ�
double avg = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
//��Ʈ�� �������������� �����Ҷ� �������� ���������ο� �ǳ��� ����ó���κ��� �־�� �Ѵ� �װ��� ���ٸ� �߰�ó����Ʈ���� �������� �ʴ´�
//$("#p1").css("color", "red").slideUp(2000).slideDown(2000);
		
		
		System.out.println("��� ���� : " + avg + "������ ����� �ФФФФ�");
		
	}

}
