package base_1;

public class Service {

	@PrintAnno
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnno("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnno(value="*", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
