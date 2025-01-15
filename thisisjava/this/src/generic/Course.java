package generic;



public class Course {

//모든 사람이 등록 가능함
public static void registerCourse1(Applicant<?> applicant) {
	System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) 코스1 을 등록함");
}

//학생만 등록 가능
public static void registerCourse2(Applicant<? extends Student> applicant) {
	System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) 코스2 을 등록함");
}


//직장인 및 일반인만 등록 가능
public static void registerCourse3(Applicant<? super Worker> applicant) {
	System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) 코스3 을 등록함");
}
}
