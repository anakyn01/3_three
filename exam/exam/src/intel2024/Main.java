package intel2024;

public class Main {

	public static void main(String[] args) {
		int result = sum(10);
System.out.println(result);
	}
	
	//ÇÔ¼ö
	public static int sum(int k) {
		if(k > 0) {
			return k + sum(k-1);//10 + 9 + 8 + 7 + 6 +5 +4+3+2+1
		}else {
			return 0;
		}
	}

}
