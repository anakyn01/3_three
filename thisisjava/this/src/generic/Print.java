package generic;

class Boxing<T> {
	
	public T content;
	
	//Box�� ���빰�� ������ ��
	public boolean compare(Boxing<T> other) {
		boolean result = content.equals(other.content);
		//Object�� equals()�޼ҵ�� content �ʵ尪 ��
		return result;
	}
}

public class Print{
	public static void main(String[] args) {
		Boxing<String> box1 = new Boxing<>();
		box1.content = "100";
		
		Boxing<String> box2 = new Boxing<>();
		box2.content = "100";
		
		boolean rs = box1.compare(box2); //�� ��ü�� ��
		System.out.println("����� " + rs);
	}

}
