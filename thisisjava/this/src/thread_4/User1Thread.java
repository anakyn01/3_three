package thread_4;

public class User1Thread extends Thread{
	
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");//������ �̸� ����
	}
	
	//�ܺο��� ������ü�� Calculator�� �޾Ƽ� �ʵ忡 ����
	public void setCaculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(100); //����ȭ �޼ҵ� ȣ��
	}

}
