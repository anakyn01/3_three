/*변수 : 숫자 문자와 같은 데이터 값을 저장하기위한 컨테이너
int : 소수점이 없는 정수수
float : 부동 소수점
char : 'a' 단일 문자
정의하고 값을 지정할수 있다
*/
#include <stdio.h>

int main(){
int myNum = 15;
float myfloatNum = 5.99;
char myLetter = 'D';
int newNum = 20;

    printf("%d\n", myNum);//형식 지정자를 사용하지 않아서 이벤트가 발생하지 않음
    printf("%f\n", myfloatNum);
    printf("%c\n", myLetter);
    printf("\n내가 가진돈은 :%d", newNum);

//값을 변경
int change = 15;
change = 10;
printf("%d\n", change);

//한변수의 값을 다른변수에 할당합니다
int one = 1;
int two = 2;
one = two;

printf("%d", one);//2

//여러변수 선언
int x =5, y=7, z = 50;
printf("%d", x + y +z);


    return 0;
}
/*
형식 지정자
- 함수와 함께 사용되어 printf()컴파일러에게 변수가 저장하는 데이터 유형을 알려줘야 합니다
- 기본적으로 변수 값의 플레이스홀더이다
- 예를 들어 숫자를 출력하려면 "%d" 숫자
 */