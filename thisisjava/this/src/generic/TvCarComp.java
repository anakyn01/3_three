package generic;

public class TvCarComp {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<>();
		//k�� Tv�� ��ü M�� ��Ʈ�����δ�ü
		
		//setter[���� �����ϰ�] �Ű����� �ݵ�� Tv�� String�� ������
		product1.setKind(new Tv());//tv���� �ֱ����ؼ� ��ü����
		product1.setModel("����Ʈ TV");
		
		//getter ���ϰ��� Tv�� String�� ��
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//�ڵ����� �����Ұ�� Product<K, String>
		Product<Car, String> product2 = new Product<>();
		//setter[���� �����ϰ�] �Ű����� �ݵ�� Car�� String�� ������
		product2.setKind(new Car());
		product2.setModel("SUV");
		
		//getter ���ϰ��� Car�� String�� ��
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
		
		
	}
	
}
