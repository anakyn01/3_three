package generic;


public class WildEnd {//���׸��̶� ���� Ÿ���� ���س��ų� ���� ���� �ʾ����� ����Ѵ�

	public static void main(String[] args) {
		//��� ����� ��û ����
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

		//�л��� ��û ����
		//Course.registerCourse2(new Applicant<Person>(new Person())); (x)
		//Course.registerCourse2(new Applicant<Worker>(new Worker())); (x)
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
			
		//������ �� �Ϲ��θ� ��û ����
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<Student>(new Student())); 		(x)
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); 	(x)
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); 	(x)
	}

}
