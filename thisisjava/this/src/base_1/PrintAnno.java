package base_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})//������ �޼���
@Retention(RetentionPolicy.RUNTIME)//������å ��Ÿ��
public @interface PrintAnno {

	String value() default "-";//���� �⺻�� -
	int number() default 15;//��� Ƚ��
}
