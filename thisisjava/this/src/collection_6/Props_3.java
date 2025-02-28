package collection_6;

import java.util.Properties;

public class Props_3 {

	public static void main(String[] args) throws Exception{
		//Properties �÷��� ����
Properties properties = new Properties();
//������ ��� 1:1 ������ �ǳʶ� ����� ���ͳݿ��� ĥ�� �̱��̴� �����̴� ���� ������ 
properties.load(Props_3.class.getResourceAsStream("pro.properties"));

//�ڹٺ��� = ������ ���� ������ ��� (java beans �Ǵ� ������Ʈ [Dont Reapeat Your self])
//�־��� Ű�� ���� ���� �б�
String driver = properties.getProperty("driver");
String url = properties.getProperty("url");
String username = properties.getProperty("username");
String password = properties.getProperty("password");
String admin = properties.getProperty("admin");

//���� ���
System.out.println("driver : " + driver);
System.out.println("url : " + url);
System.out.println("username : " + username);
System.out.println("password : " + password);
System.out.println("admin : " + admin);






	}
	
}
