package base_1;

import java.util.HashSet;

public class HashCodeEx_2 {

	public static void main(String[] args) {
		
		
HashSet hashSet = new HashSet(); //헤시셋 컬렉션 생성
Student s4 = new Student(3, "홍길동");
hashSet.add(s4);
System.out.println("저장된 객체수 : " + hashSet.size());


Student s5 = new Student(3, "홍길동");
hashSet.add(s5);
System.out.println("저장된 객체수 : " + hashSet.size());

Student s6 = new Student(4, "홍길동");
hashSet.add(s6);
System.out.println("저장된 객체수 : " + hashSet.size());
//중복객체를 저장하지 않음		
		
		
		
Student s1 = new Student(1, "홍길동");
Student s2 = new Student(1, "홍길동");
Student s3 = new Student(2, "감자깡");
//해시코드가 동일한지 검사
if(s1.hashCode() == s2.hashCode()) {//해시코드가 동일한지 검사
	if(s1.equals(s2)) {
		System.out.println("동등 객체입니다");
	}else {
		System.out.println("데이터가 다르므로 동등 객체가 아닙니다");
		
	}
	
}else {
	System.out.println("해시코드가 다르므로 동등 객체가 아닙니다");
	//데이터  no + name을 리턴한 
}

	}

}
