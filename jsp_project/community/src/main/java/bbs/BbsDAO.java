package bbs;

import java.sql.Connection;//연결
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;//결과
import java.util.ArrayList;//내장 어레이객체는 값을 정하고 사용 외장 어레이 값을 정해지지 않은곳에 사용

public class BbsDAO {
	
	private Connection conn;
	private ResultSet rs;
	
	public BbsDAO() {
		try {
		//변수 dbURL, dbID, dbPassword설정
		String dbURL = "jdbc:mysql://localhost:3306/board";
		String dbID = "root";
		String dbPassword = "1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//작성일자 메소드 현재시간을 알아서 가져와야 합니다 시간에 따라서 글에 순번이 매겨집니다
	public String getDate() {//public void를 사용할때는 getDate() 주로 테스트 할때
		String sql = "select now()";//현재시간 선택 오라클 사용할때와 명령이 다름
		 try {
			PreparedStatement pstmt = conn.prepareStatement(sql);//sql문 대기 및 설정
			rs = pstmt.executeQuery();
			if(rs.next()) {//다음 데이터로 한칸이동한다 => 데이터가 존재한다면
			return rs.getString(1);	
			}
//기존에 있던 것을 리턴할때 executeQuery(), 세팅할때(쓰기,수정,삭제),,,,,, executeUpdate()
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return ""; //데이터 베이스 오류
	}
	
	//게시글 번호 부여 메소드 => 가장상위의 게시글 번호 13 그게시글 번호의 1을 더한값을 새로 작성되는 게시글의 새번호로 구한다
	//bno, idx, bbsId 어센딩 마지막에 쓴글이 밑으로 내려옴 1234567 디센딩 최초에 쓴글이 마지막
	public int getNext() {
		String sql = "select bbsID from bbs order by bbsID desc";//현재 게시글을 내림차순으로 조회하여 가장 마지막 글의 번호를 구한다
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;//데이터 베이스 오류
	}
	
	//list
	public ArrayList<Bbs> getList(){
		String sql = "select * from bbs order by bbsID desc";
		ArrayList<Bbs> list = new ArrayList<Bbs>();
		//<Bbs>결과타입을 정해놓고 하는것을 제너릭이라고 한다
		//가변형 데이터를 담기위한 어레이 객체 리스트를 생성
		
		//여기부터
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
			Bbs bbs = new Bbs();//객체 열고
			bbs.setBbsID(rs.getInt(1));
			bbs.setBbsTitle(rs.getString(2));
			bbs.setUserID(rs.getString(3));
			bbs.setBbsDate(rs.getString(4));
			bbs.setBbsContent(rs.getString(5));
			bbs.setBbsAvailable(rs.getInt(6));
			list.add(bbs);//데이터 담아서 리턴하고
			}
		}catch (Exception e) {
			e.printStackTrace();
		}//위 밑까지는 데이터를 담고 bbs에 
		
		return list;//어레이 객체에 bbs객체를 담아서 리턴
	}
	
	//데이터를 가져오기위해서 열쇠 생성자 클래스명칭과 동일 이벤트가 발생할때마다 편안하게 사용하기 위함
	//인스턴스 객체를 생성하고 초기화하는 특별한 메서드
	/*
	class Polygon{
		constructor(){
		this.name = 'polygon';
		}
	}
	*/
	//글쓰기 메소드 실질적으로 유저가 쓸수 영역만 매개변수[자동이 아닌 수동]화 시켜서 사용
	public int write(String bbsTitle, String userID, String bbsContent) {
		String sql = "insert into bbs values(?,?,?,?,?,?)";
		/*
		 insert into 테이블명 (컬럼1, 컬럼2, 컬럼3) values (값1, 값2, 값3) fm
insert into 테이블명 values (값1, 값2, 값3)
		 */
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext());//사용자가 글을 쓸때마다 내가 몇번째로 쓰는지 예측할수 없기에 자동증가 메소드
			pstmt.setString(2, bbsTitle);//글의 제목
			pstmt.setString(3, userID);//회원가입으로 회원이 된후 로그인하면 세션에서 체크
			pstmt.setString(4, getDate());//글쓴 시간(위에서 함수로 만듬)
			pstmt.setString(5, bbsContent);//글의 내용
			pstmt.setInt(6, 1);//글의 유효번호 삭제하면 0으로 바껴서 데이터베이스엔 남지만 리스트에선 보이지 않는다
			return pstmt.executeUpdate();//결과값 전송
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -1;//데이터베이스 오류(mysql에 디비가 만들어지지 않앗거나 테이블이 존재하지 않음 jdbc장치 드라이버 빌드패스 하지 않음, 접근제어자에 필드명과 다들때)
	}
	
	

}