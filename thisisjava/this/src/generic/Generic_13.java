package generic;

class Box{//boxŬ������ ������ Box�� ���� ���빰�� content�ʵ带 �����Ϸ��� �Ҷ� Ÿ���� ��������?
//BOx�� �پ��� ���빰�� �����ϱ� ���� Ư��Ŭ���� Ÿ������ �����Ҽ� ���� �׷��� ������Ʈ Ÿ������ �����Ѵ�
	public  Object content;
	//Object Ÿ���� ��� Ŭ������ �ֻ��� �θ� Ŭ�����̴�
	//�׷��� ������ ��� ��ü�� �θ� Ÿ���� Object�� �ڵ� Ÿ�Ժ�ȯ�� �ǹǷ� 
	//content �ʵ忡�� � ��ü�� ������ �����ϴ�.
}
class Page<T>{//���ǿ� ���׸��� �����Ҷ� ���ĺ� A ~Z���� ��� ����ص� �������
	public T content2;
}
class Re<A>{
	public A year;
}

public class Generic_13 {
	
	
	public static void main(String args[]) {
		Page<String> page = new Page<>();
		page.content2 = "�ȳ��ϼ���....";
		String content2 = page.content2;
		//Ŀ�ǵ�� �ʵ���� �����ϸ� ȥ���� �´�..
		
		Re<Integer> year = new Re<>();
		year.year = 2025;
		int newYear = year.year;
		
		Box box = new Box();
		//Box�ȿ� ���빰�� ������ content�� ObjectŸ���̹Ƿ� ���ü ���ԵǾ� �ִ����� �𸥴�
		//�Ʒ��� ����ó�� ���빰�� String Ÿ���̶�� ���� Ÿ�Ժ�ȯ�� ���� ��´�
		String content = (String)box.content;
		/*�׷��� � ���빰�� ����Ǿ��ִ��� �𸥴ٰ� �����Ҷ� instanceof�����ڷ� Ÿ���� �����Ҽ� ������
		��� ������ Ŭ������ ������� ���縦 �Ҽ� ���� �׷��� Object Ÿ������ content�ʵ带 �����ϴ°��� 
		���� ����� �ƴϴ�
		Box�� �����ϱ����� �츮�� ���빰�� ������ �˰��ִ�
		�׷��� Box�� �����Ҷ� ������ ���빰�� Ÿ���� �̸� �˷��ָ� ������ ���Եǰ� ������ � Ÿ������
		�������� �˰Եȴ� �̰��� ���׸��̴�
	    ���׸��̶� �������� �ʴ� Ÿ���� �Ķ���ͷ� ó���ϰ� ���� ����Ҷ� �Ķ���͸� ��ü���� Ÿ������ 
	    ��ü��Ű�� ���	
	
		*/
	}
}
