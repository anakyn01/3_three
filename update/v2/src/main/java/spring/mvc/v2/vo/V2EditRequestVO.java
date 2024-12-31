package spring.mvc.v2.vo;

public class V2EditRequestVO {

   //맴버변수 => 특정객체와 연결된 변수 클래스변수, 인스턴스 변수 객체가 가지고 있는 속성과 기능을 그객체의 맴버라 한다
   //이중 속성은 맴버변수라 칭하고 기능은 메소드라 칭함
   private int blogContSeq;
   private String title;
   private String contBdy;
   
   //getter
   public int getBlogContSeq() {return blogContSeq;}
   public String getTitle() {return title;}
   public String getContBdy() {return contBdy;}
   
   //setter
   public void setBlogContSeq(int blogContSeq) {this.blogContSeq = blogContSeq;}
   public void setTitle(String title) {this.title = title;}
   public void setContBdy(String contBdy) {this.contBdy = contBdy;}
   
   
}

/*VO(value object)
값의 이름과 타입을 미리 정의해서 사용하는 방법.
코드만 보고 내용물을 파악할 수 있는 장점, 코드를 많이 써야하므로 
프로젝트를 하다 원리원칙을 중요하게 여기는 AA,PM을 만나면 반드시 VO를 사용하라는 지침을 받음.
PM(project manager):모든 관리업무를 책임지는 사람
PL(project leader):pm을 도와서 프로젝트의 leading을 담당,개발,관리능력,고급기술 등을 관리
AA(application architect):공통로직, 개발표준, 프레임워크 등 공통업무 설계자
TA(technical architect): os web was db설치등 하드웨어, 네트워크 구축
DA(data architect): 데이터 표준,구조,품질,마이그레이션 등 db설계자
QA(quality Assurance):산출물과 소스코드에 대한 품질을 보증하는 담당자
BA(business architect):기술적 관점이 아닌 비즈니스 관점의 프로세스 설계자
개발자(Developer):프로젝트의 최하단에서 실제 개발을 진행하는 사람
*/
//Map
//굉장히 유연해서 변경에 강함. 그러나 무슨 값이 있는지 실행 전에는 아무도 모름.
