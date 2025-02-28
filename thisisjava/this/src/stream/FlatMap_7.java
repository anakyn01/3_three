package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMap_7 {
	
	public static void main(String[] args) {
		
//���� ��Ʈ���� �ܾ� ��Ʈ������ ��ȯ
List<String> list1 = new ArrayList<>();
list1.add("���� ������");
list1.add("�� ����");
list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
System.out.println();

//���� ��� ���ڽ�Ʈ������ ��ȯ
List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
list2.stream().flatMapToInt(data -> {String[] strArr = data.split(",");
int[] intArr = new int[strArr.length];
for(int i=0; i < strArr.length; i++) {
	intArr[i] = Integer.parseInt(strArr[i].trim());
}
return Arrays.stream(intArr);
}).forEach(number -> System.out.println(number));
	}

}
/*
flatMapXxx()�޼ҵ�� �ϳ��� ��Ҹ� �������� ��ҵ�� ��ȯ�� ���ο� ��Ʈ���� ����
A��Ҵ� ,A1,A2��ҷ� ��ȯ�ϰ� B��Ҹ� B1, B2
������ ���� ��Ʈ�� �ܾƮ������ ��ȯ�ϰ� ���ڿ� ���� ��� ��Ʈ���� ���ڽ�Ʈ��
*/
