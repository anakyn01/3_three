package thread_4;

public class SumThread extends Thread{

	private long sum;

	public long getSum() {//��ȯ
		return sum;
	}

	public void setSum(long sum) {//�����ϰ�
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<= 100; i++) {
			sum += i;
		}
	}
	
	
}
