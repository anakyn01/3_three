package bbs;

public class Bbs {

	private int bbsID;//글을 쓸대 순번
	private String bbsTitle;//제목
	private String userID;//세션으로 로그인한 글을쓰는 id
	private String bbsDate;//글을 쓰는 시간
	private String bbsContent;//글에 내용
	private int bbsAvailable;//삭제 방법중에 하나인 글에 유효성을 1 잡고 0일경우 거짓이므로 리스트에 출력이 되지 않는다
	
	//getter
	public int getBbsID() {return bbsID;}
	public String getBbsTitle() {return bbsTitle;}
	public String getUserID() {return userID;}
	public String getBbsDate() {return bbsDate;}
	public String getBbsContent() {return bbsContent;}
	public int getBbsAvailable() {return bbsAvailable;}
	//setter
public void setBbsID(int bbsID) {this.bbsID = bbsID;}
	public void setBbsTitle(String bbsTitle) {this.bbsTitle = bbsTitle;}
	public void setUserID(String userID) {this.userID = userID;}
	public void setBbsDate(String bbsDate) {this.bbsDate = bbsDate;}
	public void setBbsContent(String bbsContent) {this.bbsContent = bbsContent;}
	public void setBbsAvailable(int bbsAvailable) {this.bbsAvailable = bbsAvailable;}
	
	
}
