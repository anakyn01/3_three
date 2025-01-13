package generic;

class Box{//box클래스를 선언함 Box에 넣을 내용물로 content필드를 선언하려고 할때 타입을 뭘로할지?
//BOx는 다양한 내용물을 저장하기 위해 특정클래스 타입으로 선언할수 없다 그래서 오브젝트 타입으로 선언한다
	public  Object content;
	//Object 타입은 모든 클래스의 최상위 부모 클래스이다
	//그렇기 때문에 모든 객체는 부모 타입인 Object로 자동 타입변환이 되므로 
	//content 필드에는 어떤 객체든 대입이 가능하다.
}
class Page<T>{//임의에 제네릭을 생성할때 알파벳 A ~Z까지 어떤걸 사용해도 상관없다
	public T content2;
}
class Re<A>{
	public A year;
}

public class Generic_13 {
	
	
	public static void main(String args[]) {
		Page<String> page = new Page<>();
		page.content2 = "안녕하세요....";
		String content2 = page.content2;
		//커맨드와 필드명이 동일하면 혼동이 온다..
		
		Re<Integer> year = new Re<>();
		year.year = 2025;
		int newYear = year.year;
		
		Box box = new Box();
		//Box안에 내용물을 얻을때 content는 Object타입이므로 어떤객체 대입되어 있는지를 모른다
		//아래에 예시처럼 내용물이 String 타입이라면 강제 타입변환을 거쳐 얻는다
		String content = (String)box.content;
		/*그러나 어떤 내용물이 저장되어있는지 모른다고 가정할때 instanceof연산자로 타입을 조사할수 있지만
		모든 종류의 클래스를 대상으로 조사를 할수 없다 그래서 Object 타입으로 content필드를 선언하는것은 
		좋은 방법이 아니다
		Box를 생성하기전에 우리는 내용물을 넣을지 알고있다
		그래서 Box를 생성할때 저장할 내용물의 타입을 미리 알려주면 무엇이 대입되고 읽을때 어떤 타입으로
		제공할지 알게된다 이것이 제네릭이다
	    제네릭이란 결정되지 않는 타입을 파라미터로 처리하고 실제 사용할때 파라미터를 구체적인 타입으로 
	    대체시키는 기능	
	
		*/
	}
}
