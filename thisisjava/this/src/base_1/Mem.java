package base_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
/*@Data: @Getter,@Setter,@ToString,@EqualsAndHashCode,@RequiredArgsConstructor
�� ���ĳ��� */
@NoArgsConstructor//�⺻(�Ű������� ����)�����ڸ� ����
@AllArgsConstructor//��� �ʵ带 �ʱ�ȭ ��Ű�� ������
public class Mem {

	private String id;
	@NonNull private String name;
//final�� @NonNull�� �������� 
//final �ʱ�ȭ�� �ʵ�� �����Ҽ� ����(setter�� ����� ���� ����)
//@NonNull�� null�� �ƴ� �ٸ������� setter�� ���� �����Ҽ� �ִ�
	private int age;
	
}
