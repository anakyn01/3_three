package thread_4;

public class User2Thread extends Thread{
	
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");//������ �̸� ����
	}
	
	//�ܺο��� ������ü�� Calculator�� �޾Ƽ� �ʵ忡 ����
	public void setCaculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50); //����ȭ �޼ҵ� ȣ��
	}

}
