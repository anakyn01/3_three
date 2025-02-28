package stream;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		// �Ʒ����� �ߺ��� �̸��� �����ϰ� ����Ѵ�
List<String> list = new ArrayList<>();
list.add("ȫ�浿"); list.add("�ſ���"); list.add("�ſ���"); list.add("�Ź�ö");
list.add("����");

//1) �ߺ���� ����
list.stream().distinct().forEach(n -> System.out.println(n));
System.out.println();

//2) �ߺ���Ҹ� ���������ϰ� ������ �����ϴ� ��Ҹ� ���͸�
list.stream().distinct().filter(n -> n.startsWith("��")).forEach(n -> System.out.println(n));
//startsWith �־��� ���ڿ��� �����ϸ� true, �׷��� ������ false�� ����

	}

}
/*
��� �ɷ�����(���͸�)
- ���͸��� ��Ҹ� �ɷ����� �߰� ó������̴�
- ���͸� �޼ҵ忡�� distinct()�� filter()�޼ҵ尡 �ֽ��ϴ�
- distict() : ����� �ߺ�����
��ü ��Ʈ���� ��� equals()�޼ҵ��� ���ϰ��� true�̸� ������ ��ҷ� �Ǵ��մϴ�
IntStream, LongStream, DoubleStream�� ���� ���� ��� �ߺ��� �����Ѵ�

filter() : �Ű������� �־��� Predicate�� true�� �����ϴ� ��Ҹ� ���͸� �Ѵ�

�������̽�          �߻�޼ҵ�                  ����
Predicate<T>     boolean test(T t)         ��ü T�� ����
IntPredicate     boolean test(int value)   int����  ����
LongPredicate    boolean test(long value)  long���� ����
DoublePredicate  boolean test(double value)double���� ����




*/
