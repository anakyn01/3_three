package thread_4;

public class Sync_6 {

	public static void main(String[] args) {
Calculator calculator = new Calculator();

User1Thread user1Thread = new User1Thread();
user1Thread.setCaculator(calculator);
user1Thread.start();
//User1Thread Calculator����ȭ �޼ҵ��� setMemory1()�� �����ϴ� ���� Calculator��ü�� ��ٴ�

//2�� �Ͻ������Ŀ� ����� �����Ǹ� ��μ� User2Thread ����ȭ ����� �����Ѵ�
User2Thread user2Thread = new User2Thread();
user2Thread.setCaculator(calculator);
user2Thread.start();

	}

}
/*
 * 
public synchonized void method(){
}
����ȭ �޼ҵ带 �����ϴ� ��� ��ü�� ����� �Ͼ�� 
�޼ҵ� ������ ������ ����� Ǯ����
�޼ҵ� ��ü�� �ƴ� �Ϻ� ������ �����Ҷ��� ��ü ����� �ɰ� ������ 
 
�޼��� (){
synchronized(������ü){
}
}


������ ����ȭ(����)
������� �ϳ��� ��ü�� �����ؼ� �۾��Ѵ�
�ٸ� �����忡 ���ؼ� ��ü ���� �����Ͱ� ����ɼ� �ִ�
��� ��ü 
ó���� 100�� ���������ϰ� 2�ʰ� �Ͻ����� ���¸� ������
�׵��ȿ� �ٸ������尡 �ʵ尪�� 50���� �����Ѵ�
2�ʰ� ������ memory�ʵ��� ���� ����ϸ� ������ 50�� ���´�
�׷��� �̷��� �ϸ� ����� �����Ͱ� ���ư�������
������� ������� ��ü�� �ٸ� �����尡 �����Ҽ� ������ ������ �۾��� ������ ����
��ü�� ����� �ɾ��ش�
�̸� ���ؼ� ����ȭ(synchronized) �޼ҵ�� ����� �����Ѵ�

��ü ���ο� ����ȭ �޼ҵ�� ����ȭ ����� �������� �ִٸ� �����尡 �̵��߿� �ϳ��� 
�����Ҷ� �ٸ� ������� �ش�޼ҵ�� �����̰� ����ȭ �޼ҵ� �� ��ϵ� �����Ҽ� ����
�Ϲ� �żҵ�� �����մϴ�
*/
