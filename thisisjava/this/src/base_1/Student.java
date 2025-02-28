package base_1;

public class Student {
	
	private int no;
	private String name;
	
	//������
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {return no;}
	public String getName() {return name;}

	public void setNo(int no) {this.no = no;}
	public void setName(String name) {this.name = name;}
	
	@Override//�������Ͽ� �л���ȣ�� �̸��ؽ��ڵ带 ���� ���ο� �ؽ��ڵ带 �����ϱ����� ��ȣ�� �̸��� ������ ������ �ؽ��ڵ尡 ������
	public int hashCode() {
int hashCode = no + name.hashCode();
return hashCode;
	}

	@Override
	public boolean equals(Object obj) {//Student��ü���� Ȯ���ϰ� �л���ȣ�� �̸��� ������ true
if(obj instanceof Student target) {
	if(no == target.getNo() && name.equals(target.getName())) {
		//������ ��ȣ�� �̸��� ������
		return true;
	}
}
return false;
	}
}
/*
��ü �ؽ��ڵ� : ��ü�� �ĺ��ϴ� ������ ���Ѵ�
- Object�� hashCode()�޼ҵ�� ��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 �����ϱ� ������
��ü���� �ٸ��������� �����Ѵ� 
- hashCode()�޼ҵ��� �뵵�� equals()�޼ҵ�� ����ѵ� 
�ΰ�ü�� ���������� ���Ҷ� �ַ� ����Ѵ�

*/
