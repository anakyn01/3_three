package nexture;

public class Visitor extends ServiceMenu{
	String name;
	int age, total;
	Visitor(String name, int age, int[] service) {
super();//�θ� Ŭ������ �����ڳ� �ż��带 ȣ���Ҷ� ����ϴ� Ű����
//�ַ� ��Ӱ��迡�� �ڽ� Ŭ������ �θ� Ŭ������ ����� �����Ҷ�
this.name = name; this.age = age;
int[] menu = {super.cut, super.color, super.perm, super.shampoo, super.massage};
int total = 0;
for(int i:service) {
	total += menu[i];
}
this.total = total;
	}

	@Override
	public String calculator() {
		String result = "";
		if (age <= 18) {
			total -= total/10;
			result = name + "���� ��꼭 : " + total + "��(10%����)";
		}else {
			result = name + "���� ��꼭 : " + total + "��";
		}		
		return result;
	}
	
}
