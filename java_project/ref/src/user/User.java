package user;

public class User {
	
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	//getter(setter설정된 값을 리턴)
	public String getUserID() {return userID;}
	public String getUserPassword() {return userPassword;}
	public String getUserName() {return userName;}
	public String getUserGender() {return userGender;}
	public String getUserEmail() {return userEmail;}
	
	
	//setter 값을 세팅
	public void setUserID(String userID) {this.userID = userID;}
	public void setUserPassword(String userPassword) {this.userPassword = userPassword;}
	public void setUserName(String userName) {this.userName = userName;}
	public void setUserGender(String userGender) {this.userGender = userGender;}
	public void setUserEmail(String userEmail) {this.userEmail = userEmail;}
	
	
	
/*회원가입을 할경우 유저는 UI에서 가입을 하고 자바클래스 접근제어자(private)에 필드와
테이블에 필드가 일치해야만 회원가입에 성공
접근제어자는 선언된 클래스내에서만 엑세스 할수 있다
setter => 값을 세팅
getter => 세팅된 값을 리턴

java Modifiers 수정자
클래스 속성 메서드 및 생성자에 대한 엑세스 수준을 설정하는데 사용됩니다

수정자는 두가지 그룹으로 나누어 집니다
- 엑세스 수정자 : 엑세스 수준을 제어합니다
1) 클래스의 경우 public 또는 default
2) 속성 메서드 및 생성자의 경우에는 
public, private, default, protected

- 비엑세스 수정자 : 엑세스 수준을 제어하지 않지만 다른 기능을 제공합니다
final, static, abstract, synchronized
*/
}
