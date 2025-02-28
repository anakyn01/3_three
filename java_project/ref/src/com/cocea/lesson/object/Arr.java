package com.cocea.lesson.object;

import java.util.ArrayList;//ctrl + shift + O
//java.util(��Ű��) ArrayList(Ŭ����)


public class Arr {

	public static void main(String[] args) {
		/*
		내장 어레이
		- import x
		- 자바유틸어레이와 다른점
		- 비어져 있는것에 추가하는것이 아니라 값을 정해놓고 해줌
		
		*///내장일때 값이 한정적으로 정해져 있을때 상극 새로추가되거나 변동이 많은 리스트는 효율적이지 않음
		String[] car = {"one","two","three","four"};
		
		//외장일때 
		ArrayList<String> Car = new ArrayList<String>();//객체생성 => 값을 무한정으로 담을수 있음
		
		
		
		
		//어레이명 nums 값 1,2,3,4 타입을 원시값 int 에러가 발생 래퍼클래스인 Integer
		//래퍼클래스 원시값에 객체형 byte Byte , long Long
		ArrayList<Integer> nums = new ArrayList<Integer>();//1)객체생성
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		System.out.println(nums);
		
		ArrayList<String> score = new ArrayList<String>();
		score.add("황영일 0점");//1
		score.add("이주행 90점");//2
		score.add("김동건 80점");//3
		
		//일반적인 for문으로 반복할경우
		for(int w = 0; w < score.size(); w++) { //0123
			System.out.println(score.get(w));
		}
		
		//어레이 배열[황영일 0점,이주행 90점] inline
		//리스트 block
		//syntax for(String  지정하는 임의의변수 : 커맨드)
		for (String q : score) {
			System.out.println(q);
		}
		
		System.out.println("----------------------");
		//for each를 사용하지 않을경우
		System.out.println(score.get(0));
		System.out.println(score.get(1));
		System.out.println(score.get(2));
		
		
		ArrayList<String> bbs = new ArrayList<String>();
		bbs.add("글쓴이");
		bbs.add("제목");
		bbs.add("내용");
		//실수로 누락시켯을때
		bbs.add(0, "번호");
		//지정하는 항목에 엑세스 form action="데이터를 받는 장소"
		//새롭게 쓰는것 post 이미 존재하는 항목을 리턴시킬때 get
		//접근제어자 한정자 새로만드는것 setter, getter(기존에 있는걸 리턴)
		
		System.out.println(bbs);
		//두번째 항목에 엑세스 할때
		System.out.println(bbs.get(1));//bbs어레이리스트에 두번째 항목 엑세스
		//몇개의 요소가 있는지 ? size란 갯수를 의미함
		System.out.println(bbs.size());
		
		
		ArrayList<String> cars = new ArrayList<String>();
		//
		cars.add("차1");//0
		cars.add("차2");//1 index번호 를 사용
		cars.add("차3");//2
		//4번으로 차4
		cars.add(3,"차4");//3
		//항목을 변경할때는 set을 사용한다 주의사항 일을 두번하지 않으려면 출력하기전에 변경
		cars.set(0, "car one");
		//하나의 항목을 제거하려면 remove사용
		cars.remove(2);
		
		System.out.println(cars); 
		
		//너 지워버린다
		cars.clear();
		System.out.println(cars);//[]
		
		
		
		
		
		
String TheArray ="����Ʈ�� ���鶧 ���\n"+
"�Ϲ� ���� ��̿� �ٸ��� �ڹ���ƿ ��̴� �迭�� ũ�⸦ �����Ҽ� ����\n"+
"�������� �߰� �Ҷ��� add�� �����\n"+
"�׸� ������ => get �ε��� ��ȣ\n"+
"�׸񺯰� => set()\n"+
"�׸����� => remove()n"+
"�������� => clear()\n"+
"ũ�⸦ �����Ҽ� ������ �˾ƺ��� ���� => size()\n"+
"for-each�� �ݺ��Ҽ� ����\n"+
"���� Ŭ������ ����Ҽ� ����(���ð��� ��ü��)";
	}

}
