package base_1;

import java.lang.reflect.Method;

public class Ano_14 {

	public static void main(String[] args) throws Exception {
		Method[] declaredMthods = Service.class.getDeclaredMethods();
		for(Method method : declaredMthods) {
			//프린트 어노테이션 얻기
		PrintAnno printAnno = method.getAnnotation(PrintAnno.class);
		//설정정보를 이용해서 선출력
		printLine(printAnno);//메소드를 만들지 않음
		
		//메소드 호출 invoke 주로 리플렉션을 사용할때 매서드를 호출하는데 사용
		//자바의 리플렉션 API를 사용하면 런타임시에 클래스의 매서드 , 필드, 생성자 등을 동적으로  조회하고 사용할수 있다
		method.invoke(new Service());
		
		//설정 정보를 이용해서 선 출력
		printLine(printAnno);
		}
	}

	private static void printLine(PrintAnno printAnno) {
		if(printAnno != null) {//존재 한다면
			//number 속성값 얻기
			int number = printAnno.number();
			for (int q=0; q < number; q++) {
				//value 속성값 얻기
				String value = printAnno.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
/*어노테이션 주석 = 어노테이션을 활용하면서 코드에 량을 줄어준다
어노테이션 3가지 용도 
- 컴파일시 사용하는 정보 전달 @Override 컴파일러가 메소드 재정의 검사를 하도록 설정
- 빌드 툴이 코드를 자동으로 생성할때 사용하는 정보전달
- 특정기능을 처리할때 사용하는 정보전달
- 어노테이션은 속성(타입과 이름)을 가질수 있다

어노테이션 적용 대상
자바에서 어노테이션은 설정정보 
그렇다면 어떤 대상에 설정정보를 적용할 것인지 클래스에 적용을 할건지 메소드에 적용할것인지
적용할수 잇는 대상의 ElementType열거 상수로 정의

어노테이션 유지정책
source 컴파일 할때 적용, 컴파일된 후에 제거됨
class 메모리를 로딩할때 적용, 메모리로 로딩된후에 제거됨
runtime 실행할때 적용 계속유지됨




*/
