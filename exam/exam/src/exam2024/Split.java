package exam2024;

public class Split {

	public static void main(String[] args) {
String str = "ITISTESTSTRING";//012345678910111213
String[] result = str.split("T");//T를 구분자로 사용한다는 의미
System.out.print(result[3]);
System.out.print(result[7]);
	}

}
