package base_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})//적용대상 메서드
@Retention(RetentionPolicy.RUNTIME)//유지정책 런타임
public @interface PrintAnno {

	String value() default "-";//선의 기본값 -
	int number() default 15;//출력 횟수
}
