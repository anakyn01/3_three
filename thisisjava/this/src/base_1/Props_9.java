package base_1;

import java.util.Properties;
import java.util.Set;

public class Props_9 {

	public static void main(String[] args) {
//�ü���� ����� �������
String osName = System.getProperty("os.name");
String userName = System.getProperty("user.name");
String userHome = System.getProperty("user.home");
System.out.println(osName);
System.out.println(userName);
System.out.println(userHome);

//�ڹٹ����� cpu�� ĳ���� ���ڵ�, �ڹ�Ŭ���� �н��� ���
Properties props = System.getProperties();
Set keys = props.keySet();

for(Object objkey : keys) {
	String key = (String) objkey;
	String value = System.getProperty(key);
	System.out.printf("%-40s:  %s\n", key, value);
	//%-40s ���ڿ��� 40���� ���̷� ����, ������ ���Ĵ�ſ� �������� %s\n
}

	}

}
/*
�ý��� ������Ƽ [�ڹٰ� ���۵ɶ� �ڵ� �����Ǵ� �ý����� �Ӽ�]�б�
java.specification.version
java.home : jdk���丮 ���
os.name
user.home : ����� �̸�
user.dir : ���� ���丮 ���
*/
