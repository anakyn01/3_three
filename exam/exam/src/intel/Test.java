package intel;

public class Test {
	public static void main(String args[]) {
		int x =1, T_x=0, t_x=0;//변수초기화
		T_x = (x >= 0) ? x:-x;
		if(x >= 0)
			t_x = x;
		else
			t_x = -x;
		System.out.println(T_x + " " + t_x);
	}
}
