package base_1;

import java.lang.reflect.Method;

public class Ano_14 {

	public static void main(String[] args) throws Exception {
		Method[] declaredMthods = Service.class.getDeclaredMethods();
		for(Method method : declaredMthods) {
			//����Ʈ ������̼� ���
		PrintAnno printAnno = method.getAnnotation(PrintAnno.class);
		//���������� �̿��ؼ� �����
		printLine(printAnno);//�޼ҵ带 ������ ����
		
		//�޼ҵ� ȣ�� invoke �ַ� ���÷����� ����Ҷ� �ż��带 ȣ���ϴµ� ���
		//�ڹ��� ���÷��� API�� ����ϸ� ��Ÿ�ӽÿ� Ŭ������ �ż��� , �ʵ�, ������ ���� ��������  ��ȸ�ϰ� ����Ҽ� �ִ�
		method.invoke(new Service());
		
		//���� ������ �̿��ؼ� �� ���
		printLine(printAnno);
		}
	}

	private static void printLine(PrintAnno printAnno) {
		if(printAnno != null) {//���� �Ѵٸ�
			//number �Ӽ��� ���
			int number = printAnno.number();
			for (int q=0; q < number; q++) {
				//value �Ӽ��� ���
				String value = printAnno.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
/*������̼� �ּ� = ������̼��� Ȱ���ϸ鼭 �ڵ忡 ���� �پ��ش�
������̼� 3���� �뵵 
- �����Ͻ� ����ϴ� ���� ���� @Override �����Ϸ��� �޼ҵ� ������ �˻縦 �ϵ��� ����
- ���� ���� �ڵ带 �ڵ����� �����Ҷ� ����ϴ� ��������
- Ư������� ó���Ҷ� ����ϴ� ��������
- ������̼��� �Ӽ�(Ÿ�԰� �̸�)�� ������ �ִ�

������̼� ���� ���
�ڹٿ��� ������̼��� �������� 
�׷��ٸ� � ��� ���������� ������ ������ Ŭ������ ������ �Ұ��� �޼ҵ忡 �����Ұ�����
�����Ҽ� �մ� ����� ElementType���� ����� ����

������̼� ������å
source ������ �Ҷ� ����, �����ϵ� �Ŀ� ���ŵ�
class �޸𸮸� �ε��Ҷ� ����, �޸𸮷� �ε����Ŀ� ���ŵ�
runtime �����Ҷ� ���� ���������




*/
