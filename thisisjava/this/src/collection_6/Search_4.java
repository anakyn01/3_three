package collection_6;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Search_4 {

	public static void main(String[] args) {
		// �˻������ ��ȭ��Ų �÷���
TreeSet<Integer> scores = new TreeSet<>(); //sort

//integer ��ü����
scores.add(87); scores.add(98); scores.add(75); scores.add(95);
scores.add(80);

//���ĵ� ��ü�� �ϳ��� ��������
for(Integer s: scores) {
	System.out.print(s + " ");
}
System.out.println("\n");

//Ư�� ���� �˻��ϱ�
System.out.println(" ���� ���� ���� : " + scores.first());
System.out.println(" ���� ���� ���� : " + scores.last());
System.out.println(" 95�� ���� �Ʒ� ���� : " + scores.lower(95));
System.out.println(" 95�� ���� ���� ���� : " + scores.higher(95));
System.out.println(" 95���̰ų� �ٷ� �Ʒ� ���� : " + scores.floor(95));
System.out.println(" 85���̰ų� �ٷ� ���� ���� : " + scores.ceiling(85));

scores.add(73);

//�Ϲ����� �Խ��ǿ� �������� �׷��� Ŭ���̾�Ʈ�� �䱸���� ����Ʈ���� ��ư�� Ŭ���Ҷ� ���� �������� ����
//��������
NavigableSet<Integer> descendingScores = scores.descendingSet();
for(Integer s: descendingScores) {
System.out.println(s);	
}

/*
TreeSet[����Ʈ�� binary tree]�� TreeMap
���� Ʈ���� �������� ��� node{element, child}�� Ʈ�����·� ����� ������ 
�ϳ��� ��忡�� �����ؼ� �� ��忡 �ִ� 2���� ��带 �����Ҽ� �ִ� ������ ������ �ִ�

TreeSet�� ��ü�� �����ϸ�
�θ����� ��ü�� ���ؼ� �������� ���� �ڽĳ�� 
�������� ������ �ڽ� ��忡 �����Ѵ�

����Ÿ�� E first() : ���� ���� ��ü�� ����
����Ÿ�� E last() : ���� ���� ��ü�� ����
����Ÿ�� E lower(E e) : �־��� ��ü���� �ٷ� �Ʒ��� ����
����Ÿ�� E higher(E e) : �־��� ��ü���� �ٷ� ���� ����
����Ÿ�� E floor(E e) : ������ ��ü�� ������ ���� ���� ���ٸ� �־��� ��ü�� �ٷ� �Ʒ� ��ü�� ����
����Ÿ�� E ceiling(E e) : ������ ��ü�� ������ ���� ���� ���ٸ� �־��� ��ü�� �ٷ� �� ��ü�� ����
����Ÿ�� E pollFirst() : ���� ���� ��ü�� �������� �÷��ǿ� ����
����Ÿ�� E pollLast() : ���� ���� ��ü�� �������� �÷��ǿ� ����
Iterator<E> desecendingIterator() : ������������ ���ĵ� Iterator�� ����
NavigableSet<E> desecendingSet() : ������������ ���ĵ� 
NavigableSet(SortedSet�� Ȯ��[�⺻������ ���ĵ� ����(set)�� 
�����ϴµ� ����Ư���� ���Ҿ� Ư����Ҹ����̳� �ڷ� �̵��ϴ� ���])�� ����










*/		

	}

}
