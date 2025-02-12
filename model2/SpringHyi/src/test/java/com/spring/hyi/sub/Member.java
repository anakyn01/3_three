package com.spring.hyi.sub;

import java.time.LocalDateTime;

public class Member {

    private Long id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime registerDateTime;
	
	//생성자
    public Member(Long id, String email, String password, String name,
            LocalDateTime registerDateTime) {
            this.id = id;
            this.email = email;
            this.password = password;
            this.name = name;
            this.registerDateTime = registerDateTime;
        }
	
//getter
	public Long getId() {return id;}
	public String getEmail() {return email;}
	public String getPassword() {return password;}
	public String getName() {return name;}
	public LocalDateTime getRegisterDateTime() {return registerDateTime;}

	//setter
	public void setId(Long id) {this.id = id;}
	public void setEmail(String email) {this.email = email;}
	public void setPassword(String password) {this.password = password;}
	public void setName(String name) {this.name = name;}
	public void setRegisterDateTime(LocalDateTime registerDateTime) {
		this.registerDateTime = registerDateTime;
	}
	
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			throw new WrongIdPasswordException();
		}
		this.password = newPassword;
	}
	
	
	
}
