package generic;



public class Course {

//��� ����� ��� ������
public static void registerCourse1(Applicant<?> applicant) {
	System.out.println(applicant.kind.getClass().getSimpleName()+"��(��) �ڽ�1 �� �����");
}

//�л��� ��� ����
public static void registerCourse2(Applicant<? extends Student> applicant) {
	System.out.println(applicant.kind.getClass().getSimpleName()+"��(��) �ڽ�2 �� �����");
}


//������ �� �Ϲ��θ� ��� ����
public static void registerCourse3(Applicant<? super Worker> applicant) {
	System.out.println(applicant.kind.getClass().getSimpleName()+"��(��) �ڽ�3 �� �����");
}
}
