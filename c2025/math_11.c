/*
숫자에 대한 수학적 작업을 수행할때 수학 함수 목록을 사용한다
 */
#include <stdio.h>
#include <math.h>
#include <stdlib.h>//표준 라이브러리(abs, atof, atoi)
#include <ctype.h> //분류하고 수정하는데 필요한 기능을

int main(){
    printf("%f", sqrt(16));
    //올림과 내림
    printf("%f", ceil(1.4));//올림
    printf("%f", floor(1.4));//내림
    printf("%f", pow(4, 3));// 4 X 4 X 4

    //절대값
    int value = abs(-5);
    printf("%d", value);

    //isalnum() 문자가 영숫자(문자 또는 숫자)인지 확인할때
char c = 'A';
if(isalnum(c)){
    printf("%c is alpha..", c);
}else{
    printf("%c is not alpha..", c);
}

    return 0;
}