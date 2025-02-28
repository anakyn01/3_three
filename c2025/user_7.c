//사용자 입력 scanf() 아래에서 사용자가 입력한 숫자를 출력합니다
#include <stdio.h>
int main(){

    int myNum;
    char mychar;
printf(" 숫자나 문자열을 입력하세요: %c\n");

scanf("%d", &myNum, &mychar);
printf(" your character is: %c\n", mychar);
printf(" your number is : %d\n", myNum);

 return 0;//end
}