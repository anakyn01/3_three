package exam2024;
/*
�̱��� ���� : ���� �ϳ��� �����ϵ��� �����ϴ� ������ ����...
�ַ� ���ø����̼ǿ� ���� �ڿ� (������ ���̽� ����, �α� ���)

���ͺ��� 3�ϰ� ������ ..4�� ī��Ʈ �ޱ⿡ 4��
*/
class Connection{
	private static Connection _inst = null;
	//Connection Ŭ������ �ν��Ͻ��� �����ϴ� ���� ���� 
	private int count = 0;
	
	static public Connection get() {
		if(_inst == null) {
			_inst = new Connection();
			return _inst;
		}
		return _inst;
	}
	
	public void count() {
		count++;
	}
	public int getCount() {
		return count;
	}
}

public class J2024 {

	public static void main(String[] args) {
	Connection conn1 = Connection.get();conn1.count();
	Connection conn2 = Connection.get();conn2.count();
	Connection conn3 = Connection.get();conn3.count();
	
	conn1.count(); System.out.println(conn1.getCount());
	}

}
