package base_1;

public class Exit_8 {

public static void main(String[] args) {
long time1 = System.nanoTime();
int sum = 0;
for (int w =1; w <= 1000000; w++) {
	sum += w;
}
long time2 = System.nanoTime();
System.out.println("1 ~���� 1000000������ ��: " + sum);
System.out.println("��꿡 " + (time2 - time1) + " �����ʰ� �ҿ�Ǿ����ϴ�");

//����ð� �б� system Ŭ������ currentTimeMillis(), nanoTime() �޼ҵ�� 1970�� 1�� 1�� 0�ú��� �����ؼ� ������� ����� �ð��� �����Ѵ�
//long currentTimeMillis 1/1000 �� ������ ����� �ð��� ����
//long nanoTime() 1/10 9 �� ������ ����� �ð��� ����
//���α׷�ó�� �ð��� �����Ѵ�
		
		//i�� 5�϶� �����Ѵ�
for(int q=0; q<10; q++) {
	//q�� �ٷ�
	System.out.println(q);
	if (q == 5) {
		System.out.println("���μ��� ���� ����");
		System.exit(0);
	}
}
		
/*�ü���� �������� ���α׷��� ���μ����� �����Ѵ�
�ڹٸ� �����ϸ� JVM���μ����� �����ǰ� 
�����μ����� main()�޼ҵ带 ȣ���Ѵ�
���� ���μ����� ���� �����ϰ� ������ exit(int status)�޼ҵ带 ����Ѵ�
int status���� ���°�
���������� ��� 0,������ ����� 1,�Ǵ� -1�� �ִ°��� �����̴�

�׷��� �ڹ�17���� ���̻� ������ ����
*/

	}

}
