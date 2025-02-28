package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Mapping_6 {

	public static void main(String[] args) {
		
int[] intArray = {1,2,3,4,5};

IntStream intStream = Arrays.stream(intArray);
intStream.asDoubleStream().forEach(d -> System.out.println(d));
/*
���� 1,2,3 �� �Ǽ��� 
*/
//boxed()=> ���ø� ����Ŭ���� 
intStream = Arrays.stream(intArray);
intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
		
		
//��Ʈ���� ��Ҹ� �ٸ� ��ҷ� ��ȯ�ϴ� �߰� ó�����
//���θ޼ҵ�� mapXxx(), asDoubleStream(), asLongStream,..���
List<St> studentList = new ArrayList<>();
studentList.add(new St("��", 0));
studentList.add(new St("��", 100));
studentList.add(new St("�Ե�", 20));

//st�� score�� ��Ʈ������ ��ȯ
studentList.stream().mapToInt(s -> s.getScore()).forEach(score -> System.out.println(score));
	}

}
