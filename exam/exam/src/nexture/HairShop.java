package nexture;

public class HairShop {

	public static void main(String[] args) {
int[] cus1 = {0, 2, 4};
int[] cus2 = {0, 1, 3};
ServiceMenu visitor1 = new Visitor("±è¹®¼ö", 29, cus1);
ServiceMenu visitor2 = new Visitor("±èÃ¶¼ö", 18, cus2);
System.out.println(visitor1.calculator());
System.out.println(visitor2.calculator());
	}

}
