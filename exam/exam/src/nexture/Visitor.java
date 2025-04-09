package nexture;

public class Visitor extends ServiceMenu{
	String name;
	int age, total;
	Visitor(String name, int age, int[] service) {
super();//부모 클래스의 생성자나 매서드를 호출할때 사용하는 키워드
//주로 상속관계에서 자식 클래스가 부모 클래스의 기능을 재사용할때
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
			result = name + "님의 계산서 : " + total + "원(10%할인)";
		}else {
			result = name + "님의 계산서 : " + total + "원";
		}		
		return result;
	}
	
}
