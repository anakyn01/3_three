package stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Intro {

	public static void main(String[] args) {
	
//Set �÷���
	Set<String> set = new HashSet<>();
	set.add("one");
	set.add("tw");
	set.add("t");
	
	//Stream�� �̿��� ��� �ݺ�ó��
	Stream<String> stream = set.stream(); //��Ʈ�� ���
	stream.forEach(nums -> System.out.println(nums));
	//foreach�� ���ٷ� ���ó��
/*
����ó��(Sequential Processing) �۾��� ���������� �ϳ��� ó���ϴ� ��� �ϳ��� �۾��� �Ϸ�Ǿ������ ó���Ǵ� ���
����ó��(Parallel Processing) �����۾��� ���ÿ� ó���մϴ� �۾��� �������� ������� ������ ���ÿ� ����˴ϴ�

���� �ݺ��� : �ݸ� ��Ʈ���� ���ó�� ����� �÷��� ���η� ���Խ��� ��Ҹ� �ݺ�ó�� �����Ͽ� ó���� �մϴ�
��Ƽ�ھ� CPU�� �ִ��� Ȱ���ϱ� ���ؼ� ��ҵ��� �й���� �����۾��� �Ҽ� �ִ�

�ܺ� �ݺ��� : for���� Iterator�� �÷����� ��Ҹ� �÷��� �ٱ��ʿ��� ������ ó�� �ְ� �޴°� ��
ȿ�������� ��Ҹ� �ݺ���ų�� �ִ� ������ �ִ�
*/
String stm = "Java8 ���� �߰��� ����� ���ٸ� Ȱ���� �迭�� �÷����� �����ϰ� ó���Ҽ� �ִ� �Լ���"
+ "��Ʈ���̶�� �� ���Ǵ� �������� �帧 �� �ǹ��ϰ� �������� �����Ͽ� ���ϴ� ����� ���͸��ϰ� ������"
+ "����� ����ϴ�"
+ "��Ʈ���� ��ҵ��� �ϳ��� �귯���鼭 ó���ȴٴ� �ǹ̸� ������ �ֽ��ϴ�"
+ "List<String> list = ...; for(int i=0; i <list.size(); i++){}"
+ "Stream<String> stream = list.stream();"
+ "stream.forEach( item ->);"
+ "�̷� �帧�Դϴ�"
+ "stream�� iterator�� ����� �ݺ��������� �Ʒ��� ���� �������� ������ �ֽ��ϴ�"
+ "1) ���� �ݺ����̹Ƿ� ó���ӵ��� ������ ����ó���� ȿ�����̴�"
+ "2) ���ٽ����� �پ��� ��� ó���� �Ҽ� �ִ�"
+ "3) �߰�ó���� ����ó���� �����ϵ��� ������������ �����Ҽ� �ִ�";

	}

}
