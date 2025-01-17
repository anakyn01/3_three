/*
enum 열거형
상수(변경할수 없는 값)그룹을 나타내는 특수한 유형
대문자를 사용하는것이 필수는 아니지만 관행이다
enumerrations
*/
#include <stdio.h>

enum Level{
    LOW, MEDIUM, HIGH
};
enum New {
    one = 1, two, three
};

int main(){
    enum Level myVar = MEDIUM;
    printf("%d\n", myVar);

    enum New myNum = two;
printf("%d\n", myNum);

    return 0;
}