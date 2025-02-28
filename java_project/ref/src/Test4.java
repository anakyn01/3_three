
public class Test4 {

	public static void main(String [] args) {
		int num = 5;
		int count = num++;//6
		int result = ++count;//7
		String str = num == count ? num < result ? "Arg" : "BOL" : "CHL";
		System.out.println(str);
	}
}
