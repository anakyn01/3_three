package stream;

public class Student {

	private String name;
	private int score;
	
	//������
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
}
/*
- �߰� ó���� ����ó�� -
��Ʈ���� �ϳ� �̻� ����ɼ� �ִ� �̸� ��Ʈ�� ���������� �̶�� �Ѵ�
��)
�÷���,�迭 �߰�ó��(�������� ��Ʈ��, ���͸� �߰� ��Ʈ��, ���� �߰� ��Ʈ��) ����ó��(����ó��)���
�������� ��Ʈ���� ����ó�� �߰� ��Ʈ������ ����ó���� ���ؼ� ��Ҹ� �ɷ����ų�(���͸�) ��Ҹ� ��ȯ��Ű�ų� (����)

����ó���� �߰�ó������ ������ ��ҵ��� �ݺ��ϰų� ����(ī����, ����, ���)�۾��� �����Ѵ�

Student ��ü�� ��ҷ� ������ �÷��ǿ��� Student��Ʈ���� ���
�߰�ó���� ���ؼ� score��Ʈ������ ��ȯ���� 

���� ����ó����  score����� ���ϴ� ������ ��Ÿ���ϴ�

���ǻ����� �������� ����ó���� �ؾ��Ѵ�
*/
