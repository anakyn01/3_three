package exam2024;
/*
싱글턴 패턴 : 오직 하나만 존재하도록 보장하는 디자인 패턴...
주로 어플리케이션에 공유 자원 (데이터 베이스 연결, 로그 기록)

얼핏보면 3일것 같지만 ..4번 카운트 햇기에 4임
*/
class Connection{
	private static Connection _inst = null;
	//Connection 클래스의 인스턴스를 저장하는 정적 변수 
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
