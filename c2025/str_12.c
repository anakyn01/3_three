#include <stdio.h>
//구조체 선언
struct myStructure{
    int myNum;
    char myLetter;
};
struct Student{
    char name[50];//이름 
    int age;//나이 
    float grade;//학점
};
void myVoid(){
    printf("시마이 !");
}

int main(){
    myVoid();
    //s1 구조체 변수를 설정
    struct myStructure s1;
    struct Student student1;
    //s1 멤버에 값을 할당
    s1.myNum = 13;//구조체 맴버에 엑세스를 하려면 .을 사용
    s1.myLetter = 'B';
    student1.age=20;
    student1.grade=3.5;
    snprintf(student1.name, sizeof(student1.name), "홍길동");
    /*
    snprintf : 문자열에 데이터 포멧을하고 쓰는데 사용되며 대상 버퍼가 오버런 되지 않도록 합니다
    (대상버퍼, 버퍼크기, 포멧, 문자열, 추가인수 등 최대 4개의 매개변수를 사용)
    sizeof(student1.name) => this 배열의 크기이며 배열의 보유할수 있는 것보다 많은 데이터는 쓰지 않도록 합니다
    홍길동 => student1.name
    */
    //인쇄 구조체의 맴버 출력력
    printf(" 나의 숫자는 : %d\n", s1.myNum);
    printf(" 나의 문자는 : %c\n", s1.myLetter);
    printf("name : %s\n", student1.name);
    //종료
    return 0;
}





/*
구조체(structs) => 여러관련 변수를 한 곳으로 그룹화 하는 방법
구조의 각 변수는 구조의 멤버로 알려져 있습니다
배열과 달리 구조체는 다양한 데이터 유형(int, float, char등)을 포함할수 있습니다
타입이 다른 변수를 group
키워드 struct를 사용

c언어에서 구조체를 사용하는 이유는 관련된 데이터를 그룹화 하여 코드의 가독성과 관리효율성을 높일수 있다
*/