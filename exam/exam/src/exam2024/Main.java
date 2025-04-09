package exam2024;

public class Main {

	public static void main(String[] args) {
		int sum = 0;//변수 초기값이 0
		try {
			func();//함수를 실행
		}catch(NullPointerException e) {
			sum = sum + 1; //0+1 = 1
		}catch(Exception e) {
			sum = sum + 10;
		}finally {//결과에 상관없이 보장받는 
			sum = sum  + 100;
		}
		System.out.print(sum);

	}
	
	static void func() throws Exception{//throw 키워드는 예외를 명시적으로 발생시키기 위해 사용됩니다
		//만든사람이 의도적으로 예외를 던질때 사용합니다
		throw new NullPointerException();
	}
	//내가 강제적으로 NullPointerException()을 발생시킨다
	//예외를 발생시켜서 func()매서드를 빠져나오고 try블록도 벗어납니다
	//예외가 발생했기때문에 첫번째 catch 블록이 실행됩니다
	
	/*
	MVP 포인트
	1) 함수가 널포인트익셉션을 강제로 던지기 때문에 첫번째 캐치블록이 실행됩니다
	2) finally 블록은 예외 여부와 상관없이 반드시 실행된다
	3) 최종적으로 1 + 100 = 101이 되어 화면에 101이 출력됩니다
	*/
	
	
	

}
