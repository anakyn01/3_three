package base_1;

public class Lombok_5 {

	public static void main(String[] args) {


	}

}
/*
@NoArgConstructor : �⺻(�Ű������� ����)�����ڸ� ����
@AllArgsConstructor : ��� �ʵ带 �ʱ�ȭ ��Ű�� ������
@RequiredArgsConstructor : 
- �⺻������ �Ű������� ���� �����ڸ� ����
- ���� final�Ǵ� @NonNull�� ���� �ʵ尡 �ִٸ� ���ʵ带 �ʱ�ȭ ��Ű�� �����ڸ� ����
@Getter 
@Setter
@EqualsAndHashCode : equals()�� hashCode()�޼ҵ带 ����
@ToString : toString()
@Data: @Getter,@Setter,@ToString,@EqualsAndHashCode,@RequiredArgsConstructor
�� ���ĳ��� 

������
@Data id�ʵ嵵 setter�� �����Ǳ� ������ �������� ���� ������ ����
@RequiredArgsConstructor �������� �Ķ���ͼ����� ���� ������ ���� �����Ѵ�
������ �߻����� �ʾ� �ƹ��� ������ ���� �������� ������ �Էµ� ���� �ٲ�� ���� ��Ȳ�� �߻��Ѵ�

*/
//jdk�� ���Ե� ǥ�ض��̺귯���� �ƴ����� �����ڵ��� ��ܾ��� �ڵ� �ڵ� ���� ���̺귯�� �̴�
//���ڵ�� �������� �ʵ尡 final�� �ƴϰ� �ڹٺ�� getter�� setter�� �ڵ����� ����