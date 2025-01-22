package base_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
/*@Data: @Getter,@Setter,@ToString,@EqualsAndHashCode,@RequiredArgsConstructor
를 합쳐놓은 */
@NoArgsConstructor//기본(매개변수가 없는)생성자를 포함
@AllArgsConstructor//모든 필드를 초기화 시키는 생성자
public class Mem {

	private String id;
	@NonNull private String name;
//final과 @NonNull의 차이점은 
//final 초기화된 필드는 변경할수 없다(setter가 만들어 지지 않음)
//@NonNull은 null이 아닌 다른값으로 setter를 통해 변경할수 있다
	private int age;
	
}
