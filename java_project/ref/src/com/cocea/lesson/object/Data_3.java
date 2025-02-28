public class Data_3 {
    
    public static void main(String[] args) {
        System.out.println("형변환은 기본 데이터 유형의 값을 다른 유형에 할당하는 것을 말합니다");

        //확장 캐스팅
        int nums = 9;
        double myDouble = nums;

        System.out.println(nums); //9
        System.out.println(myDouble); //9.0

        //수동 캐스팅 큰것 -> 작은것
        double newDouble = 9.999d;
        int small = (int)newDouble;//한번더 선언을 해줬기 때문에 수동캐스팅

        System.out.println(newDouble);
        System.out.println(small);
    }
}
/*
자바데이터 유형은 두가지 그룹
- 기본데이터 유형 - byte, short, int, long, float
- 기본이 아닌 데이터 유형 - 배열 및 클래스 등

타입캐스팅[C,python,C#]
- 와이드닝 캐스팅 (자동)=> 작은것에서 큰것으로
byte -> short -> char -> int -> long -> float -> double

- 수동캐스팅 => 큰것에서 작은것으로
double -> float -> long -> int -> char -> short -> byte
 */