package thread_4;

public class SumThread extends Thread{

	private long sum;

	public long getSum() {//반환
		return sum;
	}

	public void setSum(long sum) {//세팅하고
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<= 100; i++) {
			sum += i;
		}
	}
	
	
}
