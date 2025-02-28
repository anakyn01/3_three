package stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_5 {

	public static int sum;        
	
	public static void main(String[] args) throws Exception{
	Path path = Paths.get(Array_5.class.getResource("data.txt").toURI());
	Stream<String> stream = Files.lines(path, Charset.defaultCharset());
	stream.forEach(line -> System.out.println(line));
	stream.close();
		
		IntStream plus = IntStream.rangeClosed(1, 100);
		plus.forEach(a -> sum += a);
		System.out.println("���� " + sum);
/*
���ڹ����� ��Ʈ�� ���
IntStream�Ǵ�  LongStream�� ���� �޼ҵ��� 
range()�� rangeClosed()�޼ҵ带 �̿��ϸ� Ư�� ������ ������Ʈ���� ��´�
ù��° �Ű����� ���ۼ�, �ι�° �Ű����� ����..
������ �������� ������ range()
�������� ������ rangeClosed()�� ����մϴ�
(int , int)
*/		
		
		
		
		
		
		// �迭�� ���� ��Ʈ�� ���
String[] strArray = {"ȫ","��","��"};
Stream<String> strStream = Arrays.stream(strArray);
strStream.forEach(allprint -> System.out.print(allprint + " ,"));
System.out.println();

int[] intArray = {1,2,3,4,5};
IntStream intStream = Arrays.stream(intArray);
intStream.forEach(n -> System.out.print(n + ","));
System.out.println();
	}

}
