package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Paralle_2 {
/*
������
- ���α׷� ������ ����Ǵ� �������� �۾� ����
- ��Ƽ�������� �����Ͽ� ���������尡 ���ÿ� ����ɼ� �ֵ��� �ϸ� �ϳ��� �����۾��� ���ķ� ó���Ҽ� �ְ����ش�
- �����带 ����¹� ������ Ŭ���� ���, Runnabel �������̽�, ����ȭ ��..
*/
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("ȫ");//ȫ�� ó���ϴ� ������ ��Ī
		list.add("��");
		list.add("��");
		//����ó��
		Stream<String> paralleStream = list.parallelStream();//���Ľ�Ʈ�� ���
		paralleStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});

	}

}
