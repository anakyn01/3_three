package base_1;

public class Lombok_5 {

	public static void main(String[] args) {


	}

}
/*
@NoArgConstructor : 기본(매개변수가 없는)생성자를 포함
@AllArgsConstructor : 모든 필드를 초기화 시키는 생성자
@RequiredArgsConstructor : 
- 기본적으로 매개변수가 없는 생성자를 포함
- 만약 final또는 @NonNull이 붙은 필드가 있다면 이필드를 초기화 시키는 생성자를 포함
@Getter 
@Setter
@EqualsAndHashCode : equals()와 hashCode()메소드를 포함
@ToString : toString()
@Data: @Getter,@Setter,@ToString,@EqualsAndHashCode,@RequiredArgsConstructor
를 합쳐놓은 

단점은
@Data id필드도 setter가 생성되기 때문에 안정성을 보장 받을수 없고
@RequiredArgsConstructor 생성자의 파라미터순서를 선언 순서에 따라 변형한다
오류가 발생하지 않아 아무런 문제가 없어 보이지만 실제로 입력된 값이 바뀌어 들어가는 상황이 발생한다

*/
//jdk에 포함된 표준라이브러리는 아니지만 개발자들이 즐겨쓰는 자동 코드 생성 라이브러리 이다
//레코드와 차이점은 필드가 final이 아니고 자바빈즈에 getter와 setter를 자동으로 생성