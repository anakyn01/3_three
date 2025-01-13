package generic;

class Boxing<T> {
	
	public T content;
	
	//Box의 내용물이 같은지 비교
	public boolean compare(Boxing<T> other) {
		boolean result = content.equals(other.content);
		//Object의 equals()메소드로 content 필드값 비교
		return result;
	}
}

public class Print{
	public static void main(String[] args) {
		Boxing<String> box1 = new Boxing<>();
		box1.content = "100";
		
		Boxing<String> box2 = new Boxing<>();
		box2.content = "100";
		
		boolean rs = box1.compare(box2); //두 객체를 비교
		System.out.println("결과는 " + rs);
	}

}
